package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.HashSet;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes13.dex */
public class ISODateTimeFormat {

    public static final class Constants {

        /* JADX INFO: renamed from: ye, reason: collision with root package name */
        private static final DateTimeFormatter f229013ye = yearElement();

        /* JADX INFO: renamed from: mye, reason: collision with root package name */
        private static final DateTimeFormatter f229002mye = monthElement();

        /* JADX INFO: renamed from: dme, reason: collision with root package name */
        private static final DateTimeFormatter f228993dme = dayOfMonthElement();

        /* JADX INFO: renamed from: we, reason: collision with root package name */
        private static final DateTimeFormatter f229009we = weekyearElement();

        /* JADX INFO: renamed from: wwe, reason: collision with root package name */
        private static final DateTimeFormatter f229012wwe = weekElement();
        private static final DateTimeFormatter dwe = dayOfWeekElement();

        /* JADX INFO: renamed from: dye, reason: collision with root package name */
        private static final DateTimeFormatter f228996dye = dayOfYearElement();

        /* JADX INFO: renamed from: hde, reason: collision with root package name */
        private static final DateTimeFormatter f228998hde = hourElement();

        /* JADX INFO: renamed from: mhe, reason: collision with root package name */
        private static final DateTimeFormatter f229001mhe = minuteElement();
        private static final DateTimeFormatter sme = secondElement();

        /* JADX INFO: renamed from: fse, reason: collision with root package name */
        private static final DateTimeFormatter f228997fse = fractionElement();

        /* JADX INFO: renamed from: ze, reason: collision with root package name */
        private static final DateTimeFormatter f229015ze = offsetElement();

        /* JADX INFO: renamed from: lte, reason: collision with root package name */
        private static final DateTimeFormatter f229000lte = literalTElement();

        /* JADX INFO: renamed from: ym, reason: collision with root package name */
        private static final DateTimeFormatter f229014ym = yearMonth();
        private static final DateTimeFormatter ymd = yearMonthDay();

        /* JADX INFO: renamed from: ww, reason: collision with root package name */
        private static final DateTimeFormatter f229010ww = weekyearWeek();

        /* JADX INFO: renamed from: wwd, reason: collision with root package name */
        private static final DateTimeFormatter f229011wwd = weekyearWeekDay();

        /* JADX INFO: renamed from: hm, reason: collision with root package name */
        private static final DateTimeFormatter f228999hm = hourMinute();
        private static final DateTimeFormatter hms = hourMinuteSecond();
        private static final DateTimeFormatter hmsl = hourMinuteSecondMillis();
        private static final DateTimeFormatter hmsf = hourMinuteSecondFraction();

        /* JADX INFO: renamed from: dh, reason: collision with root package name */
        private static final DateTimeFormatter f228991dh = dateHour();

        /* JADX INFO: renamed from: dhm, reason: collision with root package name */
        private static final DateTimeFormatter f228992dhm = dateHourMinute();
        private static final DateTimeFormatter dhms = dateHourMinuteSecond();
        private static final DateTimeFormatter dhmsl = dateHourMinuteSecondMillis();
        private static final DateTimeFormatter dhmsf = dateHourMinuteSecondFraction();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final DateTimeFormatter f229004t = time();

        /* JADX INFO: renamed from: tx, reason: collision with root package name */
        private static final DateTimeFormatter f229008tx = timeNoMillis();

        /* JADX INFO: renamed from: tt, reason: collision with root package name */
        private static final DateTimeFormatter f229007tt = tTime();
        private static final DateTimeFormatter ttx = tTimeNoMillis();
        private static final DateTimeFormatter dt = dateTime();
        private static final DateTimeFormatter dtx = dateTimeNoMillis();
        private static final DateTimeFormatter wdt = weekDateTime();
        private static final DateTimeFormatter wdtx = weekDateTimeNoMillis();

        /* JADX INFO: renamed from: od, reason: collision with root package name */
        private static final DateTimeFormatter f229003od = ordinalDate();
        private static final DateTimeFormatter odt = ordinalDateTime();
        private static final DateTimeFormatter odtx = ordinalDateTimeNoMillis();

        /* JADX INFO: renamed from: bd, reason: collision with root package name */
        private static final DateTimeFormatter f228988bd = basicDate();
        private static final DateTimeFormatter bt = basicTime();
        private static final DateTimeFormatter btx = basicTimeNoMillis();
        private static final DateTimeFormatter btt = basicTTime();
        private static final DateTimeFormatter bttx = basicTTimeNoMillis();
        private static final DateTimeFormatter bdt = basicDateTime();
        private static final DateTimeFormatter bdtx = basicDateTimeNoMillis();

        /* JADX INFO: renamed from: bod, reason: collision with root package name */
        private static final DateTimeFormatter f228989bod = basicOrdinalDate();
        private static final DateTimeFormatter bodt = basicOrdinalDateTime();
        private static final DateTimeFormatter bodtx = basicOrdinalDateTimeNoMillis();

        /* JADX INFO: renamed from: bwd, reason: collision with root package name */
        private static final DateTimeFormatter f228990bwd = basicWeekDate();
        private static final DateTimeFormatter bwdt = basicWeekDateTime();
        private static final DateTimeFormatter bwdtx = basicWeekDateTimeNoMillis();

        /* JADX INFO: renamed from: dpe, reason: collision with root package name */
        private static final DateTimeFormatter f228995dpe = dateElementParser();

        /* JADX INFO: renamed from: tpe, reason: collision with root package name */
        private static final DateTimeFormatter f229006tpe = timeElementParser();

        /* JADX INFO: renamed from: dp, reason: collision with root package name */
        private static final DateTimeFormatter f228994dp = dateParser();
        private static final DateTimeFormatter ldp = localDateParser();

        /* JADX INFO: renamed from: tp, reason: collision with root package name */
        private static final DateTimeFormatter f229005tp = timeParser();
        private static final DateTimeFormatter ltp = localTimeParser();
        private static final DateTimeFormatter dtp = dateTimeParser();
        private static final DateTimeFormatter dotp = dateOptionalTimeParser();
        private static final DateTimeFormatter ldotp = localDateOptionalTimeParser();

        private static DateTimeFormatter basicDate() {
            DateTimeFormatter dateTimeFormatter = f228988bd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicDateTime() {
            DateTimeFormatter dateTimeFormatter = bdt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicDate()).append(basicTTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bdtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicDate()).append(basicTTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDate() {
            DateTimeFormatter dateTimeFormatter = f228989bod;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.dayOfYear(), 3).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDateTime() {
            DateTimeFormatter dateTimeFormatter = bodt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bodtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTTime() {
            DateTimeFormatter dateTimeFormatter = btt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(basicTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bttx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(basicTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTime() {
            DateTimeFormatter dateTimeFormatter = bt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendLiteral(CoreConstants.DOT).appendFractionOfSecond(3, 9).appendTimeZoneOffset("Z", false, 2, 2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = btx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendTimeZoneOffset("Z", false, 2, 2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDate() {
            DateTimeFormatter dateTimeFormatter = f228990bwd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendWeekyear(4, 4).appendLiteral('W').appendFixedDecimal(DateTimeFieldType.weekOfWeekyear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfWeek(), 1).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDateTime() {
            DateTimeFormatter dateTimeFormatter = bwdt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bwdtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateElementParser() {
            DateTimeFormatter dateTimeFormatter = f228995dpe;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(yearElement()).appendOptional(new DateTimeFormatterBuilder().append(monthElement()).appendOptional(dayOfMonthElement().getParser()).toParser()).toParser(), new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).appendOptional(dayOfWeekElement().getParser()).toParser(), new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toParser()}).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHour() {
            DateTimeFormatter dateTimeFormatter = f228991dh;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(ISODateTimeFormat.hour()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinute() {
            DateTimeFormatter dateTimeFormatter = f228992dhm;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinute()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = dhms;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecond()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = dhmsf;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondFraction()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = dhmsl;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = dotp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').appendOptional(timeElementParser().getParser()).appendOptional(offsetElement().getParser()).toParser()).toFormatter();
        }

        private static DateTimeFormatter dateParser() {
            DateTimeFormatter dateTimeFormatter = f228994dp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(offsetElement()).toParser()).toFormatter();
        }

        private static DateTimeFormatter dateTime() {
            DateTimeFormatter dateTimeFormatter = dt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = dtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateTimeParser() {
            DateTimeFormatter dateTimeFormatter = dtp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).appendOptional(offsetElement().getParser()).toParser(), dateOptionalTimeParser().getParser()}).toFormatter();
        }

        private static DateTimeFormatter dayOfMonthElement() {
            DateTimeFormatter dateTimeFormatter = f228993dme;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DASH_CHAR).appendDayOfMonth(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dayOfWeekElement() {
            DateTimeFormatter dateTimeFormatter = dwe;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DASH_CHAR).appendDayOfWeek(1).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dayOfYearElement() {
            DateTimeFormatter dateTimeFormatter = f228996dye;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DASH_CHAR).appendDayOfYear(3).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter fractionElement() {
            DateTimeFormatter dateTimeFormatter = f228997fse;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DOT).appendFractionOfSecond(3, 9).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourElement() {
            DateTimeFormatter dateTimeFormatter = f228998hde;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendHourOfDay(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinute() {
            DateTimeFormatter dateTimeFormatter = f228999hm;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = hms;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = hmsf;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).append(fractionElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = hmsl;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).appendLiteral(CoreConstants.DOT).appendFractionOfSecond(3, 3).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter literalTElement() {
            DateTimeFormatter dateTimeFormatter = f229000lte;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('T').toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter localDateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = ldotp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).toParser()).toFormatter().withZoneUTC();
        }

        private static DateTimeFormatter localDateParser() {
            DateTimeFormatter dateTimeFormatter = ldp;
            return dateTimeFormatter == null ? dateElementParser().withZoneUTC() : dateTimeFormatter;
        }

        private static DateTimeFormatter localTimeParser() {
            DateTimeFormatter dateTimeFormatter = ltp;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).toFormatter().withZoneUTC() : dateTimeFormatter;
        }

        private static DateTimeFormatter minuteElement() {
            DateTimeFormatter dateTimeFormatter = f229001mhe;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral(CoreConstants.COLON_CHAR).appendMinuteOfHour(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter monthElement() {
            DateTimeFormatter dateTimeFormatter = f229002mye;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DASH_CHAR).appendMonthOfYear(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter offsetElement() {
            DateTimeFormatter dateTimeFormatter = f229015ze;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 4).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDate() {
            DateTimeFormatter dateTimeFormatter = f229003od;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDateTime() {
            DateTimeFormatter dateTimeFormatter = odt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ordinalDate()).append(tTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = odtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ordinalDate()).append(tTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter secondElement() {
            DateTimeFormatter dateTimeFormatter = sme;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral(CoreConstants.COLON_CHAR).appendSecondOfMinute(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter tTime() {
            DateTimeFormatter dateTimeFormatter = f229007tt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(time()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter tTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = ttx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(timeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter time() {
            DateTimeFormatter dateTimeFormatter = f229004t;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourMinuteSecondFraction()).append(offsetElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter timeElementParser() {
            DateTimeFormatter dateTimeFormatter = f229006tpe;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            DateTimeParser parser = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral(CoreConstants.DOT).toParser(), new DateTimeFormatterBuilder().appendLiteral(CoreConstants.COMMA_CHAR).toParser()}).toParser();
            return new DateTimeFormatterBuilder().append(hourElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(minuteElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(secondElement()).appendOptional(new DateTimeFormatterBuilder().append(parser).appendFractionOfSecond(1, 9).toParser()).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfMinute(1, 9).toParser(), null}).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfHour(1, 9).toParser(), null}).toFormatter();
        }

        private static DateTimeFormatter timeNoMillis() {
            DateTimeFormatter dateTimeFormatter = f229008tx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourMinuteSecond()).append(offsetElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter timeParser() {
            DateTimeFormatter dateTimeFormatter = f229005tp;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).appendOptional(offsetElement().getParser()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekDateTime() {
            DateTimeFormatter dateTimeFormatter = wdt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = wdtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekElement() {
            DateTimeFormatter dateTimeFormatter = f229012wwe;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral("-W").appendWeekOfWeekyear(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearElement() {
            DateTimeFormatter dateTimeFormatter = f229009we;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendWeekyear(4, 9).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearWeek() {
            DateTimeFormatter dateTimeFormatter = f229010ww;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearWeekDay() {
            DateTimeFormatter dateTimeFormatter = f229011wwd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).append(dayOfWeekElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter yearElement() {
            DateTimeFormatter dateTimeFormatter = f229013ye;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendYear(4, 9).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter yearMonth() {
            DateTimeFormatter dateTimeFormatter = f229014ym;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter yearMonthDay() {
            DateTimeFormatter dateTimeFormatter = ymd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).append(dayOfMonthElement()).toFormatter() : dateTimeFormatter;
        }
    }

    private static void appendSeparator(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        if (z) {
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
        }
    }

    public static DateTimeFormatter basicDate() {
        return Constants.f228988bd;
    }

    public static DateTimeFormatter basicDateTime() {
        return Constants.bdt;
    }

    public static DateTimeFormatter basicDateTimeNoMillis() {
        return Constants.bdtx;
    }

    public static DateTimeFormatter basicOrdinalDate() {
        return Constants.f228989bod;
    }

    public static DateTimeFormatter basicOrdinalDateTime() {
        return Constants.bodt;
    }

    public static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
        return Constants.bodtx;
    }

    public static DateTimeFormatter basicTTime() {
        return Constants.btt;
    }

    public static DateTimeFormatter basicTTimeNoMillis() {
        return Constants.bttx;
    }

    public static DateTimeFormatter basicTime() {
        return Constants.bt;
    }

    public static DateTimeFormatter basicTimeNoMillis() {
        return Constants.btx;
    }

    public static DateTimeFormatter basicWeekDate() {
        return Constants.f228990bwd;
    }

    public static DateTimeFormatter basicWeekDateTime() {
        return Constants.bwdt;
    }

    public static DateTimeFormatter basicWeekDateTimeNoMillis() {
        return Constants.bwdtx;
    }

    private static void checkNotStrictISO(Collection<DateTimeFieldType> collection, boolean z) {
        if (z) {
            throw new IllegalArgumentException("No valid ISO8601 format for fields: " + collection);
        }
    }

    public static DateTimeFormatter date() {
        return yearMonthDay();
    }

    private static boolean dateByMonth(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z3) {
        if (!collection.remove(DateTimeFieldType.year())) {
            if (!collection.remove(DateTimeFieldType.monthOfYear())) {
                if (collection.remove(DateTimeFieldType.dayOfMonth())) {
                    dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
                    dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
                    dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
                    dateTimeFormatterBuilder.appendDayOfMonth(2);
                }
                return false;
            }
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendMonthOfYear(2);
            if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfMonth(2);
            return false;
        }
        dateTimeFormatterBuilder.append(Constants.f229013ye);
        if (!collection.remove(DateTimeFieldType.monthOfYear())) {
            if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
                return true;
            }
            checkNotStrictISO(collection, z3);
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendDayOfMonth(2);
            return false;
        }
        if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendMonthOfYear(2);
            return true;
        }
        appendSeparator(dateTimeFormatterBuilder, z);
        dateTimeFormatterBuilder.appendMonthOfYear(2);
        appendSeparator(dateTimeFormatterBuilder, z);
        dateTimeFormatterBuilder.appendDayOfMonth(2);
        return false;
    }

    private static boolean dateByOrdinal(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z3) {
        if (!collection.remove(DateTimeFieldType.year())) {
            if (collection.remove(DateTimeFieldType.dayOfYear())) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
                dateTimeFormatterBuilder.appendDayOfYear(3);
            }
            return false;
        }
        dateTimeFormatterBuilder.append(Constants.f229013ye);
        if (!collection.remove(DateTimeFieldType.dayOfYear())) {
            return true;
        }
        appendSeparator(dateTimeFormatterBuilder, z);
        dateTimeFormatterBuilder.appendDayOfYear(3);
        return false;
    }

    private static boolean dateByWeek(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z3) {
        if (!collection.remove(DateTimeFieldType.weekyear())) {
            if (!collection.remove(DateTimeFieldType.weekOfWeekyear())) {
                if (collection.remove(DateTimeFieldType.dayOfWeek())) {
                    dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
                    dateTimeFormatterBuilder.appendLiteral('W');
                    dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
                    dateTimeFormatterBuilder.appendDayOfWeek(1);
                }
                return false;
            }
            dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            dateTimeFormatterBuilder.appendLiteral('W');
            dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
            if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfWeek(1);
            return false;
        }
        dateTimeFormatterBuilder.append(Constants.f229009we);
        if (collection.remove(DateTimeFieldType.weekOfWeekyear())) {
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendLiteral('W');
            dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
            if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfWeek(1);
            return false;
        }
        if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
            return true;
        }
        checkNotStrictISO(collection, z3);
        appendSeparator(dateTimeFormatterBuilder, z);
        dateTimeFormatterBuilder.appendLiteral('W');
        dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
        dateTimeFormatterBuilder.appendDayOfWeek(1);
        return false;
    }

    public static DateTimeFormatter dateElementParser() {
        return Constants.f228995dpe;
    }

    public static DateTimeFormatter dateHour() {
        return Constants.f228991dh;
    }

    public static DateTimeFormatter dateHourMinute() {
        return Constants.f228992dhm;
    }

    public static DateTimeFormatter dateHourMinuteSecond() {
        return Constants.dhms;
    }

    public static DateTimeFormatter dateHourMinuteSecondFraction() {
        return Constants.dhmsf;
    }

    public static DateTimeFormatter dateHourMinuteSecondMillis() {
        return Constants.dhmsl;
    }

    public static DateTimeFormatter dateOptionalTimeParser() {
        return Constants.dotp;
    }

    public static DateTimeFormatter dateParser() {
        return Constants.f228994dp;
    }

    public static DateTimeFormatter dateTime() {
        return Constants.dt;
    }

    public static DateTimeFormatter dateTimeNoMillis() {
        return Constants.dtx;
    }

    public static DateTimeFormatter dateTimeParser() {
        return Constants.dtp;
    }

    public static DateTimeFormatter forFields(Collection<DateTimeFieldType> collection, boolean z, boolean z3) {
        boolean zDateByWeek;
        boolean z4;
        boolean z6;
        boolean z11;
        boolean z12;
        if (collection == null || collection.size() == 0) {
            throw new IllegalArgumentException("The fields must not be null or empty");
        }
        HashSet hashSet = new HashSet(collection);
        int size = hashSet.size();
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        if (hashSet.contains(DateTimeFieldType.monthOfYear())) {
            zDateByWeek = dateByMonth(dateTimeFormatterBuilder, hashSet, z, z3);
        } else if (hashSet.contains(DateTimeFieldType.dayOfYear())) {
            zDateByWeek = dateByOrdinal(dateTimeFormatterBuilder, hashSet, z, z3);
        } else if (hashSet.contains(DateTimeFieldType.weekOfWeekyear())) {
            zDateByWeek = dateByWeek(dateTimeFormatterBuilder, hashSet, z, z3);
        } else if (hashSet.contains(DateTimeFieldType.dayOfMonth())) {
            zDateByWeek = dateByMonth(dateTimeFormatterBuilder, hashSet, z, z3);
        } else if (hashSet.contains(DateTimeFieldType.dayOfWeek())) {
            zDateByWeek = dateByWeek(dateTimeFormatterBuilder, hashSet, z, z3);
        } else {
            if (hashSet.remove(DateTimeFieldType.year())) {
                dateTimeFormatterBuilder.append(Constants.f229013ye);
            } else if (hashSet.remove(DateTimeFieldType.weekyear())) {
                dateTimeFormatterBuilder.append(Constants.f229009we);
            } else {
                zDateByWeek = false;
            }
            zDateByWeek = true;
        }
        if (hashSet.size() < size) {
            z4 = true;
            z12 = z3;
            z6 = zDateByWeek;
            z11 = z;
        } else {
            z4 = false;
            z6 = zDateByWeek;
            z11 = z;
            z12 = z3;
        }
        time(dateTimeFormatterBuilder, hashSet, z11, z12, z6, z4);
        if (dateTimeFormatterBuilder.canBuildFormatter()) {
            try {
                collection.retainAll(hashSet);
            } catch (UnsupportedOperationException unused) {
            }
            return dateTimeFormatterBuilder.toFormatter();
        }
        throw new IllegalArgumentException("No valid format for fields: " + collection);
    }

    public static DateTimeFormatter hour() {
        return Constants.f228998hde;
    }

    public static DateTimeFormatter hourMinute() {
        return Constants.f228999hm;
    }

    public static DateTimeFormatter hourMinuteSecond() {
        return Constants.hms;
    }

    public static DateTimeFormatter hourMinuteSecondFraction() {
        return Constants.hmsf;
    }

    public static DateTimeFormatter hourMinuteSecondMillis() {
        return Constants.hmsl;
    }

    public static DateTimeFormatter localDateOptionalTimeParser() {
        return Constants.ldotp;
    }

    public static DateTimeFormatter localDateParser() {
        return Constants.ldp;
    }

    public static DateTimeFormatter localTimeParser() {
        return Constants.ltp;
    }

    public static DateTimeFormatter ordinalDate() {
        return Constants.f229003od;
    }

    public static DateTimeFormatter ordinalDateTime() {
        return Constants.odt;
    }

    public static DateTimeFormatter ordinalDateTimeNoMillis() {
        return Constants.odtx;
    }

    public static DateTimeFormatter tTime() {
        return Constants.f229007tt;
    }

    public static DateTimeFormatter tTimeNoMillis() {
        return Constants.ttx;
    }

    private static void time(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z3, boolean z4, boolean z6) {
        boolean zRemove = collection.remove(DateTimeFieldType.hourOfDay());
        boolean zRemove2 = collection.remove(DateTimeFieldType.minuteOfHour());
        boolean zRemove3 = collection.remove(DateTimeFieldType.secondOfMinute());
        boolean zRemove4 = collection.remove(DateTimeFieldType.millisOfSecond());
        if (zRemove || zRemove2 || zRemove3 || zRemove4) {
            if (zRemove || zRemove2 || zRemove3 || zRemove4) {
                if (z3 && z4) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields because Date was reduced precision: " + collection);
                }
                if (z6) {
                    dateTimeFormatterBuilder.appendLiteral('T');
                }
            }
            if ((!zRemove || !zRemove2 || !zRemove3) && (!zRemove || zRemove3 || zRemove4)) {
                if (z3 && z6) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields because Time was truncated: " + collection);
                }
                if ((zRemove || ((!zRemove2 || !zRemove3) && ((!zRemove2 || zRemove4) && !zRemove3))) && z3) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields: " + collection);
                }
            }
            if (zRemove) {
                dateTimeFormatterBuilder.appendHourOfDay(2);
            } else if (zRemove2 || zRemove3 || zRemove4) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            }
            if (z && zRemove && zRemove2) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.COLON_CHAR);
            }
            if (zRemove2) {
                dateTimeFormatterBuilder.appendMinuteOfHour(2);
            } else if (zRemove3 || zRemove4) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            }
            if (z && zRemove2 && zRemove3) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.COLON_CHAR);
            }
            if (zRemove3) {
                dateTimeFormatterBuilder.appendSecondOfMinute(2);
            } else if (zRemove4) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DASH_CHAR);
            }
            if (zRemove4) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.DOT);
                dateTimeFormatterBuilder.appendMillisOfSecond(3);
            }
        }
    }

    public static DateTimeFormatter timeElementParser() {
        return Constants.f229006tpe;
    }

    public static DateTimeFormatter timeNoMillis() {
        return Constants.f229008tx;
    }

    public static DateTimeFormatter timeParser() {
        return Constants.f229005tp;
    }

    public static DateTimeFormatter weekDate() {
        return Constants.f229011wwd;
    }

    public static DateTimeFormatter weekDateTime() {
        return Constants.wdt;
    }

    public static DateTimeFormatter weekDateTimeNoMillis() {
        return Constants.wdtx;
    }

    public static DateTimeFormatter weekyear() {
        return Constants.f229009we;
    }

    public static DateTimeFormatter weekyearWeek() {
        return Constants.f229010ww;
    }

    public static DateTimeFormatter weekyearWeekDay() {
        return Constants.f229011wwd;
    }

    public static DateTimeFormatter year() {
        return Constants.f229013ye;
    }

    public static DateTimeFormatter yearMonth() {
        return Constants.f229014ym;
    }

    public static DateTimeFormatter yearMonthDay() {
        return Constants.ymd;
    }

    public static DateTimeFormatter time() {
        return Constants.f229004t;
    }
}
