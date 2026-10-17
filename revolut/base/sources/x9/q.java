package x9;

import ch.qos.logback.core.CoreConstants;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes16.dex */
public final class q extends DateFormat {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f303520g = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f303521h;
    public static final String[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TimeZone f303522j;
    public static final Locale k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final SimpleDateFormat f303523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f303524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final GregorianCalendar f303525n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient TimeZone f303526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f303527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f303528c;
    public transient Calendar d;
    public transient DateFormat e;
    public final boolean f;

    static {
        try {
            f303521h = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            i = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            f303522j = timeZone;
            Locale locale = Locale.US;
            k = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            f303523l = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            f303524m = new q();
            f303525n = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th10) {
            throw new RuntimeException(th10);
        }
    }

    public q() {
        this.f = true;
        this.f303527b = k;
    }

    public static int b(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static int c(String str) {
        return (str.charAt(3) - '0') + ((str.charAt(2) - '0') * 10) + ((str.charAt(1) - '0') * 100) + ((str.charAt(0) - '0') * 1000);
    }

    public static void h(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 10;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 10;
        }
        stringBuffer.append((char) (i2 + 48));
    }

    public static void i(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i3 > 99) {
                stringBuffer.append(i3);
            } else {
                h(stringBuffer, i3);
            }
            i2 -= i3 * 100;
        }
        h(stringBuffer, i2);
    }

    public final Calendar a(TimeZone timeZone) {
        Calendar calendar = this.d;
        if (calendar == null) {
            calendar = (Calendar) f303525n.clone();
            this.d = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    @Override // java.text.DateFormat, java.text.Format
    public final Object clone() {
        return new q(this.f303526a, this.f303527b, this.f303528c, this.f);
    }

    public final Date e(String str) throws ParseException {
        String str2;
        int i2;
        int iB;
        int length = str.length();
        Calendar calendarA = a((this.f303526a == null || 'Z' == str.charAt(length + (-1))) ? f303522j : this.f303526a);
        calendarA.clear();
        int iCharAt = 0;
        if (length > 10) {
            Matcher matcher = f303521h.matcher(str);
            if (matcher.matches()) {
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i3 = iEnd - iStart;
                if (i3 > 1) {
                    int iB2 = b(iStart + 1, str) * DateTimeConstants.SECONDS_PER_HOUR;
                    if (i3 >= 5) {
                        iB2 += b(iEnd - 2, str) * 60;
                    }
                    calendarA.set(15, str.charAt(iStart) == '-' ? iB2 * (-1000) : iB2 * 1000);
                    calendarA.set(16, 0);
                }
                int iC = c(str);
                int iB3 = b(5, str) - 1;
                int iB4 = b(8, str);
                int iB5 = b(11, str);
                int iB6 = b(14, str);
                if (length <= 16 || str.charAt(16) != ':') {
                    i2 = iB4;
                    iB = 0;
                } else {
                    i2 = iB4;
                    iB = b(17, str);
                }
                calendarA.set(iC, iB3, i2, iB5, iB6, iB);
                int iStart2 = matcher.start(1);
                int i5 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i5 >= iEnd2) {
                    calendarA.set(14, 0);
                } else {
                    int i6 = iEnd2 - i5;
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3 && i6 > 9) {
                                    throw new ParseException(j6.a.s("Cannot parse date \"", str, "\": invalid fractional seconds '", matcher.group(1).substring(1), "'; can use at most 9 digits"), i5);
                                }
                                iCharAt = str.charAt(iStart2 + 3) - '0';
                            }
                            iCharAt += (str.charAt(iStart2 + 2) - '0') * 10;
                        }
                        iCharAt += (str.charAt(i5) - '0') * 100;
                    }
                    calendarA.set(14, iCharAt);
                }
                return calendarA.getTime();
            }
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        } else {
            if (f303520g.matcher(str).matches()) {
                calendarA.set(c(str), b(5, str) - 1, b(8, str), 0, 0, 0);
                calendarA.set(14, 0);
                return calendarA.getTime();
            }
            str2 = "yyyy-MM-dd";
        }
        Boolean bool = this.f303528c;
        StringBuilder sbM = v0.a.m("Cannot parse date \"", str, "\": while it seems to fit format '", str2, "', parsing fails (leniency? ");
        sbM.append(bool);
        sbM.append(")");
        throw new ParseException(sbM.toString(), 0);
    }

    @Override // java.text.DateFormat
    public final boolean equals(Object obj2) {
        return obj2 == this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if (r2 < 0) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Date f(java.lang.String r6, java.text.ParsePosition r7) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.q.f(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    @Override // java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.f303526a;
        if (timeZone == null) {
            timeZone = f303522j;
        }
        Calendar calendarA = a(timeZone);
        calendarA.setTime(date);
        int i2 = calendarA.get(1);
        if (calendarA.get(0) != 0) {
            if (i2 > 9999) {
                stringBuffer.append('+');
            }
            i(stringBuffer, i2);
        } else if (i2 == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append(CoreConstants.DASH_CHAR);
            i(stringBuffer, i2 - 1);
        }
        stringBuffer.append(CoreConstants.DASH_CHAR);
        h(stringBuffer, calendarA.get(2) + 1);
        stringBuffer.append(CoreConstants.DASH_CHAR);
        h(stringBuffer, calendarA.get(5));
        stringBuffer.append('T');
        h(stringBuffer, calendarA.get(11));
        stringBuffer.append(CoreConstants.COLON_CHAR);
        h(stringBuffer, calendarA.get(12));
        stringBuffer.append(CoreConstants.COLON_CHAR);
        h(stringBuffer, calendarA.get(13));
        stringBuffer.append(CoreConstants.DOT);
        int i3 = calendarA.get(14);
        int i5 = i3 / 100;
        if (i5 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i5 + 48));
            i3 -= i5 * 100;
        }
        h(stringBuffer, i3);
        int offset = timeZone.getOffset(calendarA.getTimeInMillis());
        boolean z = this.f;
        if (offset == 0) {
            if (z) {
                stringBuffer.append("+00:00");
                return stringBuffer;
            }
            stringBuffer.append("+0000");
            return stringBuffer;
        }
        int i6 = offset / DateTimeConstants.MILLIS_PER_MINUTE;
        int iAbs = Math.abs(i6 / 60);
        int iAbs2 = Math.abs(i6 % 60);
        stringBuffer.append(offset < 0 ? '-' : '+');
        h(stringBuffer, iAbs);
        if (z) {
            stringBuffer.append(CoreConstants.COLON_CHAR);
        }
        h(stringBuffer, iAbs2);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public final TimeZone getTimeZone() {
        return this.f303526a;
    }

    @Override // java.text.DateFormat
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.text.DateFormat
    public final boolean isLenient() {
        Boolean bool = this.f303528c;
        return bool == null || bool.booleanValue();
    }

    @Override // java.text.DateFormat
    public final Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateF = f(strTrim, parsePosition);
        if (dateF != null) {
            return dateF;
        }
        StringBuilder sb6 = new StringBuilder();
        for (String str2 : i) {
            if (sb6.length() > 0) {
                sb6.append("\", \"");
            } else {
                sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            sb6.append(str2);
        }
        sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        throw new ParseException(j6.a.s("Cannot parse date \"", strTrim, "\": not compatible with any of standard forms (", sb6.toString(), ")"), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public final void setLenient(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Boolean bool = this.f303528c;
        if (boolValueOf == bool || boolValueOf.equals(bool)) {
            return;
        }
        this.f303528c = boolValueOf;
        this.e = null;
    }

    @Override // java.text.DateFormat
    public final void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.f303526a)) {
            return;
        }
        this.e = null;
        this.f303526a = timeZone;
    }

    public final String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", q.class.getName(), this.f303526a, this.f303527b, this.f303528c);
    }

    public q(TimeZone timeZone, Locale locale, Boolean bool, boolean z) {
        this.f303526a = timeZone;
        this.f303527b = locale;
        this.f303528c = bool;
        this.f = z;
    }

    @Override // java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        try {
            return f(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
