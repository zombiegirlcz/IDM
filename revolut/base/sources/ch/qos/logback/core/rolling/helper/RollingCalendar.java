package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes16.dex */
public class RollingCalendar extends GregorianCalendar {
    static final TimeZone GMT_TIMEZONE = TimeZone.getTimeZone("GMT");
    private static final long serialVersionUID = -5937537740925066161L;
    String datePattern;
    PeriodicityType periodicityType;

    /* JADX INFO: renamed from: ch.qos.logback.core.rolling.helper.RollingCalendar$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType;

        static {
            int[] iArr = new int[PeriodicityType.values().length];
            $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType = iArr;
            try {
                iArr[PeriodicityType.TOP_OF_HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_MILLISECOND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_MINUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.HALF_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_MONTH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public RollingCalendar(String str) {
        this.periodicityType = PeriodicityType.ERRONEOUS;
        this.datePattern = str;
        this.periodicityType = computePeriodicityType();
    }

    private boolean collision(long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.datePattern, Locale.US);
        simpleDateFormat.setTimeZone(GMT_TIMEZONE);
        return simpleDateFormat.format(new Date(0L)).equals(simpleDateFormat.format(new Date(j2)));
    }

    public static int diffInMonths(long j2, long j3) {
        if (j2 > j3) {
            throw new IllegalArgumentException("startTime cannot be larger than endTime");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j3);
        return ((calendar2.get(1) - calendar.get(1)) * 12) + (calendar2.get(2) - calendar.get(2));
    }

    private static Date innerGetEndOfNextNthPeriod(Calendar calendar, PeriodicityType periodicityType, Date date, int i) {
        int i2;
        calendar.setTime(date);
        switch (AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[periodicityType.ordinal()]) {
            case 1:
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.add(11, i);
                return calendar.getTime();
            case 2:
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.add(5, i);
                return calendar.getTime();
            case 3:
                calendar.set(7, calendar.getFirstDayOfWeek());
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                i2 = 3;
                calendar.add(i2, i);
                return calendar.getTime();
            case 4:
                calendar.add(14, i);
                return calendar.getTime();
            case 5:
                calendar.set(14, 0);
                calendar.add(13, i);
                return calendar.getTime();
            case 6:
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.add(12, i);
                return calendar.getTime();
            case 7:
            default:
                throw new IllegalStateException("Unknown periodicity type.");
            case 8:
                calendar.set(5, 1);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                i2 = 2;
                calendar.add(i2, i);
                return calendar.getTime();
        }
    }

    private static Date innerGetEndOfThisPeriod(Calendar calendar, PeriodicityType periodicityType, Date date) {
        return innerGetEndOfNextNthPeriod(calendar, periodicityType, date, 1);
    }

    public PeriodicityType computePeriodicityType() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT_TIMEZONE, Locale.US);
        Date date = new Date(0L);
        if (this.datePattern != null) {
            for (PeriodicityType periodicityType : PeriodicityType.VALID_ORDERED_LIST) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.datePattern, Locale.US);
                simpleDateFormat.setTimeZone(GMT_TIMEZONE);
                String str = simpleDateFormat.format(date);
                String str2 = simpleDateFormat.format(innerGetEndOfThisPeriod(gregorianCalendar, periodicityType, date));
                if (str != null && str2 != null && !str.equals(str2)) {
                    return periodicityType;
                }
            }
        }
        return PeriodicityType.ERRONEOUS;
    }

    public Date getEndOfNextNthPeriod(Date date, int i) {
        return innerGetEndOfNextNthPeriod(this, this.periodicityType, date, i);
    }

    public Date getNextTriggeringDate(Date date) {
        return getEndOfNextNthPeriod(date, 1);
    }

    public PeriodicityType getPeriodicityType() {
        return this.periodicityType;
    }

    public long getStartOfCurrentPeriodWithGMTOffsetCorrection(long j2, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j2);
        Date endOfNextNthPeriod = getEndOfNextNthPeriod(calendar.getTime(), 0);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(endOfNextNthPeriod.getTime());
        return endOfNextNthPeriod.getTime() + ((long) (calendar2.get(16) + calendar2.get(15)));
    }

    public boolean isCollisionFree() {
        int i = AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[this.periodicityType.ordinal()];
        if (i == 1) {
            return !collision(43200000L);
        }
        if (i == 2) {
            return (collision(604800000L) || collision(2678400000L) || collision(31536000000L)) ? false : true;
        }
        if (i != 3) {
            return true;
        }
        return (collision(2937600000L) || collision(31622400000L)) ? false : true;
    }

    public long periodBarriersCrossed(long j2, long j3) {
        long j5;
        if (j2 > j3) {
            throw new IllegalArgumentException("Start cannot come before end");
        }
        long startOfCurrentPeriodWithGMTOffsetCorrection = getStartOfCurrentPeriodWithGMTOffsetCorrection(j3, getTimeZone()) - getStartOfCurrentPeriodWithGMTOffsetCorrection(j2, getTimeZone());
        switch (AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[this.periodicityType.ordinal()]) {
            case 1:
                j5 = CoreConstants.MILLIS_IN_ONE_HOUR;
                break;
            case 2:
                j5 = CoreConstants.MILLIS_IN_ONE_DAY;
                break;
            case 3:
                j5 = 604800000;
                break;
            case 4:
                return startOfCurrentPeriodWithGMTOffsetCorrection;
            case 5:
                j5 = 1000;
                break;
            case 6:
                j5 = 60000;
                break;
            case 7:
            default:
                throw new IllegalStateException("Unknown periodicity type.");
            case 8:
                return diffInMonths(j2, j3);
        }
        return startOfCurrentPeriodWithGMTOffsetCorrection / j5;
    }

    public void printPeriodicity(ContextAwareBase contextAwareBase) {
        String str;
        switch (AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[this.periodicityType.ordinal()]) {
            case 1:
                str = "Roll-over at the top of every hour.";
                break;
            case 2:
                str = "Roll-over at midnight.";
                break;
            case 3:
                str = "Rollover at the start of week.";
                break;
            case 4:
                str = "Roll-over every millisecond.";
                break;
            case 5:
                str = "Roll-over every second.";
                break;
            case 6:
                str = "Roll-over every minute.";
                break;
            case 7:
                str = "Roll-over at midday and midnight.";
                break;
            case 8:
                str = "Rollover at start of every month.";
                break;
            default:
                str = "Unknown periodicity.";
                break;
        }
        contextAwareBase.addInfo(str);
    }

    public RollingCalendar(String str, TimeZone timeZone, Locale locale) {
        super(timeZone, locale);
        this.periodicityType = PeriodicityType.ERRONEOUS;
        this.datePattern = str;
        this.periodicityType = computePeriodicityType();
    }
}
