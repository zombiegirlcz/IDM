package org.joda.time.tz;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class ZoneInfoCompiler {
    static final Map<String, Integer> DOW_LOOKUP;
    static final Map<String, Integer> MONTH_LOOKUP;
    static Chronology cLenientISO;
    static DateTimeOfYear cStartOfYear;
    static final Set<String> RULE_LOOKUP = expand("rule", "r");
    static final Set<String> ZONE_LOOKUP = expand("zone", "z");
    static final Set<String> LINK_LOOKUP = expand("link", "l");
    static final Set<String> MIN_YEAR_LOOKUP = expand("minimum", "mi");
    static final Set<String> MAX_YEAR_LOOKUP = expand("maximum", "ma");
    static final Set<String> ONLY_YEAR_LOOKUP = expand("only", "o");
    private Map<String, RuleSet> iRuleSets = new HashMap();
    private List<Zone> iZones = new ArrayList();
    private List<String> iGoodLinks = new ArrayList();
    private List<String> iBackLinks = new ArrayList();

    public static class RuleSet {
        private List<Rule> iRules;

        public RuleSet(Rule rule) {
            ArrayList arrayList = new ArrayList();
            this.iRules = arrayList;
            arrayList.add(rule);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, int i, String str) {
            int iMin = 0;
            for (int i2 = 0; i2 < this.iRules.size(); i2++) {
                int i3 = this.iRules.get(i2).iSaveMillis;
                if (i3 < 0) {
                    iMin = Math.min(iMin, i3);
                }
            }
            if (iMin < 0) {
                if (ZoneInfoLogger.verbose()) {
                    System.out.println("Fixed negative save values for rule '" + this.iRules.get(0).iName + "'");
                }
                i += iMin;
                int iIndexOf = str.indexOf("/");
                if (iIndexOf > 0) {
                    str = str.substring(iIndexOf + 1) + "/" + str.substring(0, iIndexOf);
                }
            }
            dateTimeZoneBuilder.setStandardOffset(i);
            if (iMin < 0) {
                new Rule(this.iRules.get(0)).addRecurring(dateTimeZoneBuilder, i, iMin, str);
            }
            for (int i5 = 0; i5 < this.iRules.size(); i5++) {
                this.iRules.get(i5).addRecurring(dateTimeZoneBuilder, i, iMin, str);
            }
        }

        public void addRule(Rule rule) {
            if (!rule.iName.equals(this.iRules.get(0).iName)) {
                throw new IllegalArgumentException("Rule name mismatch");
            }
            this.iRules.add(rule);
        }
    }

    public static class Zone {
        public final String iFormat;
        public final String iName;
        private Zone iNext;
        public final int iOffsetMillis;
        public final String iRules;
        public final DateTimeOfYear iUntilDateTimeOfYear;
        public final int iUntilYear;

        public Zone(StringTokenizer stringTokenizer) {
            this(stringTokenizer.nextToken(), stringTokenizer);
        }

        public void addToBuilder(DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            addToBuilder(this, dateTimeZoneBuilder, map);
        }

        public void chain(StringTokenizer stringTokenizer) {
            Zone zone = this.iNext;
            if (zone != null) {
                zone.chain(stringTokenizer);
            } else {
                this.iNext = new Zone(this.iName, stringTokenizer);
            }
        }

        public String toString() {
            String str = "[Zone]\nName: " + this.iName + "\nOffsetMillis: " + this.iOffsetMillis + "\nRules: " + this.iRules + "\nFormat: " + this.iFormat + "\nUntilYear: " + this.iUntilYear + "\n" + this.iUntilDateTimeOfYear;
            if (this.iNext == null) {
                return str;
            }
            StringBuilder sbL = a.l(str, "...\n");
            sbL.append(this.iNext.toString());
            return sbL.toString();
        }

        private Zone(String str, StringTokenizer stringTokenizer) {
            int i;
            this.iName = str.intern();
            this.iOffsetMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iRules = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iFormat = stringTokenizer.nextToken().intern();
            DateTimeOfYear startOfYear = ZoneInfoCompiler.getStartOfYear();
            if (stringTokenizer.hasMoreTokens()) {
                i = Integer.parseInt(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    startOfYear = new DateTimeOfYear(stringTokenizer);
                }
            } else {
                i = Integer.MAX_VALUE;
            }
            this.iUntilYear = i;
            this.iUntilDateTimeOfYear = startOfYear;
        }

        private static void addToBuilder(Zone zone, DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            while (zone != null) {
                String str = zone.iRules;
                if (str == null) {
                    dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                    dateTimeZoneBuilder.setFixedSavings(zone.iFormat, 0);
                } else {
                    try {
                        int time = ZoneInfoCompiler.parseTime(str);
                        dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                        dateTimeZoneBuilder.setFixedSavings(zone.iFormat, time);
                    } catch (Exception unused) {
                        RuleSet ruleSet = map.get(zone.iRules);
                        if (ruleSet == null) {
                            throw new IllegalArgumentException("Rules not found: " + zone.iRules);
                        }
                        ruleSet.addRecurring(dateTimeZoneBuilder, zone.iOffsetMillis, zone.iFormat);
                    }
                }
                int i = zone.iUntilYear;
                if (i == Integer.MAX_VALUE) {
                    return;
                }
                zone.iUntilDateTimeOfYear.addCutover(dateTimeZoneBuilder, i);
                zone = zone.iNext;
            }
        }
    }

    static {
        HashMap map = new HashMap();
        MONTH_LOOKUP = map;
        put(expand("january", "ja"), 1, map);
        put(expand("february", "f"), 2, map);
        put(expand("march", "mar"), 3, map);
        put(expand("april", "ap"), 4, map);
        put(expand("may", "may"), 5, map);
        put(expand("june", "jun"), 6, map);
        put(expand("july", "jul"), 7, map);
        put(expand("august", "au"), 8, map);
        put(expand("september", "s"), 9, map);
        put(expand("october", "o"), 10, map);
        put(expand("november", "n"), 11, map);
        put(expand("december", "d"), 12, map);
        HashMap map2 = new HashMap();
        DOW_LOOKUP = map2;
        put(expand("monday", "m"), 1, map2);
        put(expand("tuesday", "tu"), 2, map2);
        put(expand("wednesday", "w"), 3, map2);
        put(expand("thursday", "th"), 4, map2);
        put(expand("friday", "f"), 5, map2);
        put(expand("saturday", "sa"), 6, map2);
        put(expand("sunday", "su"), 7, map2);
    }

    private static Set<String> expand(String str, String str2) {
        HashSet hashSet = new HashSet();
        while (!str.equals(str2)) {
            hashSet.add(str);
            str = str.substring(0, str.length() - 1);
        }
        hashSet.add(str);
        return hashSet;
    }

    public static Chronology getLenientISOChronology() {
        if (cLenientISO == null) {
            cLenientISO = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        }
        return cLenientISO;
    }

    public static DateTimeOfYear getStartOfYear() {
        if (cStartOfYear == null) {
            cStartOfYear = new DateTimeOfYear();
        }
        return cStartOfYear;
    }

    public static void main(String[] strArr) throws Exception {
        if (strArr.length == 0) {
            printUsage();
            return;
        }
        File file = null;
        int i = 0;
        File file2 = null;
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= strArr.length) {
                break;
            }
            if ("-src".equals(strArr[i2])) {
                i2++;
                if (i2 >= strArr.length) {
                    printUsage();
                    return;
                }
                file = new File(strArr[i2]);
            } else if ("-dst".equals(strArr[i2])) {
                i2++;
                if (i2 >= strArr.length) {
                    printUsage();
                    return;
                }
                file2 = new File(strArr[i2]);
            } else if ("-verbose".equals(strArr[i2])) {
                z = true;
            } else if ("-?".equals(strArr[i2])) {
                printUsage();
                return;
            }
            i2++;
        }
        if (i2 >= strArr.length) {
            printUsage();
            return;
        }
        File[] fileArr = new File[strArr.length - i2];
        while (i2 < strArr.length) {
            fileArr[i] = file == null ? new File(strArr[i2]) : new File(file, strArr[i2]);
            i2++;
            i++;
        }
        ZoneInfoLogger.set(z);
        new ZoneInfoCompiler().compile(file2, fileArr);
    }

    public static int parseDayOfWeek(String str) {
        Integer num = DOW_LOOKUP.get(str.toLowerCase(Locale.ENGLISH));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Unknown day-of-week: ".concat(str));
    }

    public static int parseMonth(String str) {
        Integer num = MONTH_LOOKUP.get(str.toLowerCase(Locale.ENGLISH));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Unknown month: ".concat(str));
    }

    public static String parseOptional(String str) {
        if (str.equals("-")) {
            return null;
        }
        return str;
    }

    public static int parseTime(String str) {
        if (str.equals("-")) {
            return 0;
        }
        DateTimeFormatter dateTimeFormatterHourMinuteSecondFraction = ISODateTimeFormat.hourMinuteSecondFraction();
        MutableDateTime mutableDateTime = new MutableDateTime(0L, getLenientISOChronology());
        boolean zStartsWith = str.startsWith("-");
        if (dateTimeFormatterHourMinuteSecondFraction.parseInto(mutableDateTime, str, zStartsWith ? 1 : 0) == (~(zStartsWith ? 1 : 0))) {
            throw new IllegalArgumentException(str);
        }
        int millis = (int) mutableDateTime.getMillis();
        return zStartsWith ? -millis : millis;
    }

    public static int parseYear(String str, int i) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (MIN_YEAR_LOOKUP.contains(lowerCase)) {
            return Integer.MIN_VALUE;
        }
        if (MAX_YEAR_LOOKUP.contains(lowerCase)) {
            return Integer.MAX_VALUE;
        }
        return ONLY_YEAR_LOOKUP.contains(lowerCase) ? i : Integer.parseInt(str);
    }

    public static char parseZoneChar(char c2) {
        if (c2 != 'G') {
            if (c2 != 'S') {
                if (c2 != 'U' && c2 != 'Z' && c2 != 'g') {
                    if (c2 != 's') {
                        if (c2 != 'u' && c2 != 'z') {
                            return 'w';
                        }
                    }
                }
            }
            return 's';
        }
        return 'u';
    }

    private static void printUsage() {
        System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        System.out.println("where possible options include:");
        System.out.println("  -src <directory>    Specify where to read source files");
        System.out.println("  -dst <directory>    Specify where to write generated files");
        System.out.println("  -verbose            Output verbosely (default false)");
    }

    private static void put(Set<String> set, int i, Map<String, Integer> map) {
        Iterator<String> it8 = set.iterator();
        while (it8.hasNext()) {
            map.put(it8.next(), Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        r5 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 2050);
        r3 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 1850);
        r1 = r13.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0108, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010a, code lost:
    
        if (r1 < 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010c, code lost:
    
        r7 = r18.previousTransition(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        if (r7 == r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0116, code lost:
    
        if (r7 >= r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        r5 = ((java.lang.Long) r13.get(r1)).longValue() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0128, code lost:
    
        if (r5 == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012a, code lost:
    
        java.lang.System.out.println("*r* Error in " + r18.getID() + " " + new org.joda.time.DateTime(r7, org.joda.time.chrono.ISOChronology.getInstanceUTC()) + " != " + new org.joda.time.DateTime(r5, org.joda.time.chrono.ISOChronology.getInstanceUTC()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0161, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0162, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0164, code lost:
    
        return r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean test(java.lang.String r17, org.joda.time.DateTimeZone r18) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.ZoneInfoCompiler.test(java.lang.String, org.joda.time.DateTimeZone):boolean");
    }

    private void writeZone(File file, DateTimeZoneBuilder dateTimeZoneBuilder, DateTimeZone dateTimeZone) throws IOException {
        if (ZoneInfoLogger.verbose()) {
            System.out.println("Writing " + dateTimeZone.getID());
        }
        File file2 = new File(file, dateTimeZone.getID());
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            dateTimeZoneBuilder.writeTo(dateTimeZone.getID(), fileOutputStream);
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(file2);
            DateTimeZone from = DateTimeZoneBuilder.readFrom(fileInputStream, dateTimeZone.getID());
            fileInputStream.close();
            if (dateTimeZone.equals(from)) {
                return;
            }
            System.out.println("*e* Error in " + dateTimeZone.getID() + ": Didn't read properly from file");
        } catch (Throwable th10) {
            fileOutputStream.close();
            throw th10;
        }
    }

    public static void writeZoneInfoMap(DataOutputStream dataOutputStream, Map<String, DateTimeZone> map) throws IOException {
        if (dataOutputStream == null) {
            throw new IllegalArgumentException("DataOutputStream must not be null.");
        }
        HashMap map2 = new HashMap(map.size());
        TreeMap treeMap = new TreeMap();
        short s2 = 0;
        for (Map.Entry<String, DateTimeZone> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!map2.containsKey(key)) {
                Short shValueOf = Short.valueOf(s2);
                map2.put(key, shValueOf);
                treeMap.put(shValueOf, key);
                s2 = (short) (s2 + 1);
                if (s2 == Short.MAX_VALUE) {
                    throw new InternalError("Too many time zone ids");
                }
            }
            String id10 = entry.getValue().getID();
            if (!map2.containsKey(id10)) {
                Short shValueOf2 = Short.valueOf(s2);
                map2.put(id10, shValueOf2);
                treeMap.put(shValueOf2, id10);
                s2 = (short) (s2 + 1);
                if (s2 == Short.MAX_VALUE) {
                    throw new InternalError("Too many time zone ids");
                }
            }
        }
        dataOutputStream.writeShort(treeMap.size());
        Iterator it8 = treeMap.values().iterator();
        while (it8.hasNext()) {
            dataOutputStream.writeUTF((String) it8.next());
        }
        dataOutputStream.writeShort(map.size());
        for (Map.Entry<String, DateTimeZone> entry2 : map.entrySet()) {
            dataOutputStream.writeShort(((Short) map2.get(entry2.getKey())).shortValue());
            dataOutputStream.writeShort(((Short) map2.get(entry2.getValue().getID())).shortValue());
        }
    }

    public Map<String, DateTimeZone> compile(File file, File[] fileArr) throws Throwable {
        if (fileArr != null) {
            for (int i = 0; i < fileArr.length; i++) {
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileArr[i]));
                    try {
                        parseDataFile(bufferedReader2, "backward".equals(fileArr[i].getName()));
                        bufferedReader2.close();
                    } catch (Throwable th10) {
                        th = th10;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (Throwable th11) {
                    th = th11;
                }
            }
        }
        if (file != null) {
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Destination directory doesn't exist and cannot be created: " + file);
            }
            if (!file.isDirectory()) {
                throw new IOException("Destination is not a directory: " + file);
            }
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        System.out.println("Writing zoneinfo files");
        for (int i2 = 0; i2 < this.iZones.size(); i2++) {
            Zone zone = this.iZones.get(i2);
            DateTimeZoneBuilder dateTimeZoneBuilder = new DateTimeZoneBuilder();
            zone.addToBuilder(dateTimeZoneBuilder, this.iRuleSets);
            DateTimeZone dateTimeZone = dateTimeZoneBuilder.toDateTimeZone(zone.iName, true);
            if (test(dateTimeZone.getID(), dateTimeZone)) {
                treeMap.put(dateTimeZone.getID(), dateTimeZone);
                treeMap2.put(dateTimeZone.getID(), zone);
                if (file != null) {
                    writeZone(file, dateTimeZoneBuilder, dateTimeZone);
                }
            }
        }
        for (int i3 = 0; i3 < this.iGoodLinks.size(); i3 += 2) {
            String str = this.iGoodLinks.get(i3);
            String str2 = this.iGoodLinks.get(i3 + 1);
            Zone zone2 = (Zone) treeMap2.get(str);
            if (zone2 == null) {
                System.out.println(j6.a.s("Cannot find source zone '", str, "' to link alias '", str2, "' to"));
            } else {
                DateTimeZoneBuilder dateTimeZoneBuilder2 = new DateTimeZoneBuilder();
                zone2.addToBuilder(dateTimeZoneBuilder2, this.iRuleSets);
                DateTimeZone dateTimeZone2 = dateTimeZoneBuilder2.toDateTimeZone(str2, true);
                if (test(dateTimeZone2.getID(), dateTimeZone2)) {
                    treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                    if (file != null) {
                        writeZone(file, dateTimeZoneBuilder2, dateTimeZone2);
                    }
                }
                treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                if (ZoneInfoLogger.verbose()) {
                    System.out.println(j6.a.s("Good link: ", str2, " -> ", str, " revived"));
                }
            }
        }
        for (int i5 = 0; i5 < 2; i5++) {
            for (int i6 = 0; i6 < this.iBackLinks.size(); i6 += 2) {
                String str3 = this.iBackLinks.get(i6);
                String str4 = this.iBackLinks.get(i6 + 1);
                DateTimeZone dateTimeZone3 = (DateTimeZone) treeMap.get(str3);
                if (dateTimeZone3 != null) {
                    treeMap.put(str4, dateTimeZone3);
                    if (ZoneInfoLogger.verbose()) {
                        PrintStream printStream = System.out;
                        StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Back link: ", str4, " -> ");
                        sbX.append(dateTimeZone3.getID());
                        printStream.println(sbX.toString());
                    }
                } else if (i5 > 0) {
                    System.out.println(j6.a.s("Cannot find time zone '", str3, "' to link alias '", str4, "' to"));
                }
            }
        }
        if (file == null) {
            return treeMap;
        }
        System.out.println("Writing ZoneInfoMap");
        File file2 = new File(file, "ZoneInfoMap");
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file2));
        try {
            TreeMap treeMap3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            treeMap3.putAll(treeMap);
            writeZoneInfoMap(dataOutputStream, treeMap3);
            return treeMap;
        } finally {
            dataOutputStream.close();
        }
    }

    public void parseDataFile(BufferedReader bufferedReader, boolean z) throws IOException {
        while (true) {
            Zone zone = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    if (zone != null) {
                        this.iZones.add(zone);
                        return;
                    }
                    return;
                }
                String strTrim = line.trim();
                if (strTrim.length() != 0 && strTrim.charAt(0) != '#') {
                    int iIndexOf = line.indexOf(35);
                    if (iIndexOf >= 0) {
                        line = line.substring(0, iIndexOf);
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(line, " \f\r\t\u000b");
                    if (!Character.isWhitespace(line.charAt(0)) || !stringTokenizer.hasMoreTokens()) {
                        if (zone != null) {
                            this.iZones.add(zone);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            String lowerCase = stringTokenizer.nextToken().toLowerCase(Locale.ENGLISH);
                            if (RULE_LOOKUP.contains(lowerCase)) {
                                Rule rule = new Rule(stringTokenizer);
                                RuleSet ruleSet = this.iRuleSets.get(rule.iName);
                                if (ruleSet == null) {
                                    this.iRuleSets.put(rule.iName, new RuleSet(rule));
                                } else {
                                    ruleSet.addRule(rule);
                                }
                            } else if (ZONE_LOOKUP.contains(lowerCase)) {
                                if (stringTokenizer.countTokens() < 4) {
                                    throw new IllegalArgumentException("Attempting to create a Zone from an incomplete tokenizer");
                                }
                                zone = new Zone(stringTokenizer);
                            } else if (LINK_LOOKUP.contains(lowerCase)) {
                                String strNextToken = stringTokenizer.nextToken();
                                String strNextToken2 = stringTokenizer.nextToken();
                                if (strNextToken2.equals("WET") || strNextToken2.equals("CET") || strNextToken2.equals("EET")) {
                                    this.iGoodLinks.add(strNextToken);
                                    this.iGoodLinks.add(strNextToken2);
                                } else if (strNextToken2.equals("MET")) {
                                    this.iBackLinks.add("CET");
                                    this.iBackLinks.add(strNextToken2);
                                } else if (z || strNextToken2.equals("US/Pacific-New") || strNextToken2.startsWith("Etc/") || strNextToken2.equals("GMT")) {
                                    this.iBackLinks.add(strNextToken);
                                    this.iBackLinks.add(strNextToken2);
                                } else {
                                    this.iGoodLinks.add(strNextToken);
                                    this.iGoodLinks.add(strNextToken2);
                                }
                            } else {
                                System.out.println("Unknown line: ".concat(line));
                            }
                        }
                    } else if (zone != null) {
                        zone.chain(stringTokenizer);
                    }
                }
            }
        }
    }

    public static class DateTimeOfYear {
        public final boolean iAdvanceDayOfWeek;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final int iMillisOfDay;
        public final int iMonthOfYear;
        public final char iZoneChar;

        public DateTimeOfYear() {
            this.iMonthOfYear = 1;
            this.iDayOfMonth = 1;
            this.iDayOfWeek = 0;
            this.iAdvanceDayOfWeek = false;
            this.iMillisOfDay = 0;
            this.iZoneChar = 'w';
        }

        public void addCutover(DateTimeZoneBuilder dateTimeZoneBuilder, int i) {
            dateTimeZoneBuilder.addCutover(i, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str, int i, int i2, int i3) {
            dateTimeZoneBuilder.addRecurringSavings(str, i, i2, i3, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public String toString() {
            return "MonthOfYear: " + this.iMonthOfYear + "\nDayOfMonth: " + this.iDayOfMonth + "\nDayOfWeek: " + this.iDayOfWeek + "\nAdvanceDayOfWeek: " + this.iAdvanceDayOfWeek + "\nMillisOfDay: " + this.iMillisOfDay + "\nZoneChar: " + this.iZoneChar + "\n";
        }

        public DateTimeOfYear(StringTokenizer stringTokenizer) {
            int i;
            int i2;
            boolean z;
            int dayOfWeek;
            LocalDate localDatePlusDays;
            int i3 = 1;
            int time = 0;
            char zoneChar = 'w';
            if (stringTokenizer.hasMoreTokens()) {
                int month = ZoneInfoCompiler.parseMonth(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    if (strNextToken.toLowerCase(Locale.ENGLISH).startsWith("last")) {
                        z = false;
                        dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(4));
                        i = -1;
                    } else {
                        try {
                            i = Integer.parseInt(strNextToken);
                            dayOfWeek = 0;
                            z = false;
                        } catch (NumberFormatException unused) {
                            int iIndexOf = strNextToken.indexOf(">=");
                            if (iIndexOf > 0) {
                                int i5 = Integer.parseInt(strNextToken.substring(iIndexOf + 2));
                                dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(0, iIndexOf));
                                i = i5;
                                z = true;
                            } else {
                                int iIndexOf2 = strNextToken.indexOf("<=");
                                if (iIndexOf2 > 0) {
                                    int i6 = Integer.parseInt(strNextToken.substring(iIndexOf2 + 2));
                                    dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(0, iIndexOf2));
                                    i = i6;
                                    z = false;
                                } else {
                                    throw new IllegalArgumentException(strNextToken);
                                }
                            }
                        }
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        String strNextToken2 = stringTokenizer.nextToken();
                        zoneChar = ZoneInfoCompiler.parseZoneChar(strNextToken2.charAt(strNextToken2.length() - 1));
                        if (!strNextToken2.equals("24:00")) {
                            time = ZoneInfoCompiler.parseTime(strNextToken2);
                        } else if (month == 12 && i == 31) {
                            time = ZoneInfoCompiler.parseTime("23:59:59.999");
                        } else {
                            if (i == -1) {
                                localDatePlusDays = new LocalDate(2001, month, 1).plusMonths(1);
                            } else {
                                localDatePlusDays = new LocalDate(2001, month, i).plusDays(1);
                            }
                            boolean z3 = (i == -1 || dayOfWeek == 0) ? false : true;
                            int monthOfYear = localDatePlusDays.getMonthOfYear();
                            int dayOfMonth = localDatePlusDays.getDayOfMonth();
                            dayOfWeek = dayOfWeek != 0 ? (dayOfWeek % 7) + 1 : dayOfWeek;
                            z = z3;
                            i3 = monthOfYear;
                            i = dayOfMonth;
                            i2 = time;
                            time = dayOfWeek;
                        }
                        i3 = month;
                        i2 = time;
                        time = dayOfWeek;
                    } else {
                        i3 = month;
                        i2 = time;
                        time = dayOfWeek;
                    }
                } else {
                    i = 1;
                    i2 = 0;
                    z = false;
                    i3 = month;
                }
            } else {
                i = 1;
                i2 = 0;
                z = false;
            }
            this.iMonthOfYear = i3;
            this.iDayOfMonth = i;
            this.iDayOfWeek = time;
            this.iAdvanceDayOfWeek = z;
            this.iMillisOfDay = i2;
            this.iZoneChar = zoneChar;
        }
    }

    public static class Rule {
        public final DateTimeOfYear iDateTimeOfYear;
        public final int iFromYear;
        public final String iLetterS;
        public final String iName;
        public final int iSaveMillis;
        public final int iToYear;
        public final String iType;

        public Rule(StringTokenizer stringTokenizer) {
            if (stringTokenizer.countTokens() < 6) {
                throw new IllegalArgumentException("Attempting to create a Rule from an incomplete tokenizer");
            }
            this.iName = stringTokenizer.nextToken().intern();
            int year = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), 0);
            this.iFromYear = year;
            int year2 = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), year);
            this.iToYear = year2;
            if (year2 < year) {
                throw new IllegalArgumentException();
            }
            this.iType = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iDateTimeOfYear = new DateTimeOfYear(stringTokenizer);
            this.iSaveMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iLetterS = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
        }

        public static String formatName(String str, int i, int i2, String str2) {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf > 0) {
                return i2 == 0 ? str.substring(0, iIndexOf).intern() : str.substring(iIndexOf + 1).intern();
            }
            int iIndexOf2 = str.indexOf("%s");
            if (iIndexOf2 < 0) {
                return str.equals("%z") ? i2 == 0 ? formatOffset(i).intern() : formatOffset(i + i2).intern() : str;
            }
            String strSubstring = str.substring(0, iIndexOf2);
            String strSubstring2 = str.substring(iIndexOf2 + 2);
            StringBuilder sbS = p.a.s(strSubstring);
            if (str2 == null) {
                str2 = "";
            }
            sbS.append(str2);
            sbS.append(strSubstring2);
            return sbS.toString().intern();
        }

        private static String formatOffset(int i) {
            String str = i < 0 ? "-" : "+";
            int iAbs = Math.abs(i) / 1000;
            int i2 = iAbs / DateTimeConstants.SECONDS_PER_HOUR;
            int i3 = (iAbs / 60) % 60;
            int i5 = iAbs % 60;
            if (i5 != 0) {
                StringBuilder sbS = p.a.s(str);
                sbS.append(twoDigitString(i2));
                sbS.append(twoDigitString(i3));
                sbS.append(twoDigitString(i5));
                return sbS.toString();
            }
            if (i3 == 0) {
                StringBuilder sbS2 = p.a.s(str);
                sbS2.append(twoDigitString(i2));
                return sbS2.toString();
            }
            StringBuilder sbS3 = p.a.s(str);
            sbS3.append(twoDigitString(i2));
            sbS3.append(twoDigitString(i3));
            return sbS3.toString();
        }

        private static String twoDigitString(int i) {
            return Integer.toString(i + 100).substring(1);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, int i, int i2, String str) {
            int i3 = this.iSaveMillis + (-i2);
            this.iDateTimeOfYear.addRecurring(dateTimeZoneBuilder, formatName(str, i, i3, this.iLetterS), i3, this.iFromYear, this.iToYear);
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder("[Rule]\nName: ");
            sb6.append(this.iName);
            sb6.append("\nFromYear: ");
            sb6.append(this.iFromYear);
            sb6.append("\nToYear: ");
            sb6.append(this.iToYear);
            sb6.append("\nType: ");
            sb6.append(this.iType);
            sb6.append("\n");
            sb6.append(this.iDateTimeOfYear);
            sb6.append("SaveMillis: ");
            sb6.append(this.iSaveMillis);
            sb6.append("\nLetterS: ");
            return a.i(sb6, this.iLetterS, "\n");
        }

        public Rule(Rule rule) {
            this.iName = rule.iName;
            this.iFromYear = 1800;
            this.iToYear = rule.iFromYear;
            this.iType = null;
            this.iDateTimeOfYear = rule.iDateTimeOfYear;
            this.iSaveMillis = 0;
            this.iLetterS = rule.iLetterS;
        }
    }
}
