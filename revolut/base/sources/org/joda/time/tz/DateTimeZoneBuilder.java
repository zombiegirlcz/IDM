package org.joda.time.tz;

import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes13.dex */
public class DateTimeZoneBuilder {
    private final ArrayList<RuleSet> iRuleSets = new ArrayList<>(10);

    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final Recurrence iEndRecurrence;
        final int iStandardOffset;
        final Recurrence iStartRecurrence;

        public DSTZone(String str, int i, Recurrence recurrence, Recurrence recurrence2) {
            super(str);
            this.iStandardOffset = i;
            this.iStartRecurrence = recurrence;
            this.iEndRecurrence = recurrence2;
        }

        private Recurrence findMatchingRecurrence(long j2) {
            long next;
            int i = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j2, i, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                next = j2;
            }
            try {
                j2 = recurrence2.next(j2, i, recurrence.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j2 ? recurrence : recurrence2;
        }

        public static DSTZone readFrom(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.readMillis(dataInput), Recurrence.readFrom(dataInput), Recurrence.readFrom(dataInput));
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 instanceof DSTZone) {
                DSTZone dSTZone = (DSTZone) obj2;
                if (getID().equals(dSTZone.getID()) && this.iStandardOffset == dSTZone.iStandardOffset && this.iStartRecurrence.equals(dSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dSTZone.iEndRecurrence)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j2) {
            return findMatchingRecurrence(j2).getNameKey();
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j2) {
            return this.iStandardOffset + findMatchingRecurrence(j2).getSaveMillis();
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j2) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.iStandardOffset), this.iStartRecurrence, this.iEndRecurrence});
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j2) {
            long next;
            int i = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j2, i, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            if (j2 > 0 && next < 0) {
                next = j2;
            }
            try {
                long next2 = recurrence2.next(j2, i, recurrence.getSaveMillis());
                if (j2 <= 0 || next2 >= 0) {
                    j2 = next2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j2 ? j2 : next;
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j2) {
            long jPrevious;
            long j3 = j2 + 1;
            int i = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                jPrevious = recurrence.previous(j3, i, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            if (j3 < 0 && jPrevious > 0) {
                jPrevious = j3;
            }
            try {
                long jPrevious2 = recurrence2.previous(j3, i, recurrence.getSaveMillis());
                if (j3 >= 0 || jPrevious2 <= 0) {
                    j3 = jPrevious2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jPrevious <= j3) {
                jPrevious = j3;
            }
            return jPrevious - 1;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffset);
            this.iStartRecurrence.writeTo(dataOutput);
            this.iEndRecurrence.writeTo(dataOutput);
        }
    }

    public static final class OfYear {
        final boolean iAdvance;
        final int iDayOfMonth;
        final int iDayOfWeek;
        final int iMillisOfDay;
        final char iMode;
        final int iMonthOfYear;

        public OfYear(char c2, int i, int i2, int i3, boolean z, int i5) {
            if (c2 != 'u' && c2 != 'w' && c2 != 's') {
                throw new IllegalArgumentException(a.j(c2, "Unknown mode: "));
            }
            this.iMode = c2;
            this.iMonthOfYear = i;
            this.iDayOfMonth = i2;
            this.iDayOfWeek = i3;
            this.iAdvance = z;
            this.iMillisOfDay = i5;
        }

        public static OfYear readFrom(DataInput dataInput) throws IOException {
            return new OfYear((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        private long setDayOfMonth(Chronology chronology, long j2) {
            if (this.iDayOfMonth >= 0) {
                return chronology.dayOfMonth().set(j2, this.iDayOfMonth);
            }
            return chronology.dayOfMonth().add(chronology.monthOfYear().add(chronology.dayOfMonth().set(j2, 1), 1), this.iDayOfMonth);
        }

        private long setDayOfMonthNext(Chronology chronology, long j2) {
            try {
                return setDayOfMonth(chronology, j2);
            } catch (IllegalArgumentException e) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e;
                }
                while (!chronology.year().isLeap(j2)) {
                    j2 = chronology.year().add(j2, 1);
                }
                return setDayOfMonth(chronology, j2);
            }
        }

        private long setDayOfMonthPrevious(Chronology chronology, long j2) {
            try {
                return setDayOfMonth(chronology, j2);
            } catch (IllegalArgumentException e) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e;
                }
                while (!chronology.year().isLeap(j2)) {
                    j2 = chronology.year().add(j2, -1);
                }
                return setDayOfMonth(chronology, j2);
            }
        }

        private long setDayOfWeek(Chronology chronology, long j2) {
            int i = this.iDayOfWeek - chronology.dayOfWeek().get(j2);
            if (i == 0) {
                return j2;
            }
            if (this.iAdvance) {
                if (i < 0) {
                    i += 7;
                }
            } else if (i > 0) {
                i -= 7;
            }
            return chronology.dayOfWeek().add(j2, i);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 instanceof OfYear) {
                OfYear ofYear = (OfYear) obj2;
                if (this.iMode == ofYear.iMode && this.iMonthOfYear == ofYear.iMonthOfYear && this.iDayOfMonth == ofYear.iDayOfMonth && this.iDayOfWeek == ofYear.iDayOfWeek && this.iAdvance == ofYear.iAdvance && this.iMillisOfDay == ofYear.iMillisOfDay) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Character.valueOf(this.iMode), Integer.valueOf(this.iMonthOfYear), Integer.valueOf(this.iDayOfMonth), Integer.valueOf(this.iDayOfWeek), Boolean.valueOf(this.iAdvance), Integer.valueOf(this.iMillisOfDay)});
        }

        public long next(long j2, int i, int i2) {
            char c2 = this.iMode;
            if (c2 == 'w') {
                i += i2;
            } else if (c2 != 's') {
                i = 0;
            }
            long j3 = i;
            long j5 = j2 + j3;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j5, this.iMonthOfYear), 0), Math.min(this.iMillisOfDay, 86399999)));
            if (this.iDayOfWeek != 0) {
                dayOfMonthNext = setDayOfWeek(instanceUTC, dayOfMonthNext);
                if (dayOfMonthNext <= j5) {
                    dayOfMonthNext = setDayOfWeek(instanceUTC, setDayOfMonthNext(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthNext, 1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthNext <= j5) {
                dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.year().add(dayOfMonthNext, 1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthNext, 0), this.iMillisOfDay) - j3;
        }

        public long previous(long j2, int i, int i2) {
            char c2 = this.iMode;
            if (c2 == 'w') {
                i += i2;
            } else if (c2 != 's') {
                i = 0;
            }
            long j3 = i;
            long j5 = j2 + j3;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j5, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonthPrevious = setDayOfWeek(instanceUTC, dayOfMonthPrevious);
                if (dayOfMonthPrevious >= j5) {
                    dayOfMonthPrevious = setDayOfWeek(instanceUTC, setDayOfMonthPrevious(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthPrevious, -1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthPrevious >= j5) {
                dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.year().add(dayOfMonthPrevious, -1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthPrevious, 0), this.iMillisOfDay) - j3;
        }

        public long setInstant(int i, int i2, int i3) {
            char c2 = this.iMode;
            if (c2 == 'w') {
                i2 += i3;
            } else if (c2 != 's') {
                i2 = 0;
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonth = setDayOfMonth(instanceUTC, instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(instanceUTC.year().set(0L, i), this.iMonthOfYear), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonth = setDayOfWeek(instanceUTC, dayOfMonth);
            }
            return dayOfMonth - ((long) i2);
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder("[OfYear]\nMode: ");
            sb6.append(this.iMode);
            sb6.append("\nMonthOfYear: ");
            sb6.append(this.iMonthOfYear);
            sb6.append("\nDayOfMonth: ");
            sb6.append(this.iDayOfMonth);
            sb6.append("\nDayOfWeek: ");
            sb6.append(this.iDayOfWeek);
            sb6.append("\nAdvanceDayOfWeek: ");
            sb6.append(this.iAdvance);
            sb6.append("\nMillisOfDay: ");
            return j6.a.t(sb6, this.iMillisOfDay, '\n');
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(this.iMode);
            dataOutput.writeByte(this.iMonthOfYear);
            dataOutput.writeByte(this.iDayOfMonth);
            dataOutput.writeByte(this.iDayOfWeek);
            dataOutput.writeBoolean(this.iAdvance);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iMillisOfDay);
        }
    }

    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        public static PrecalculatedZone create(String str, boolean z, ArrayList<Transition> arrayList, DSTZone dSTZone) {
            DSTZone dSTZone2;
            long[] jArr;
            int[] iArr;
            int[] iArr2;
            int i;
            int size = arrayList.size();
            if (size == 0) {
                throw new IllegalArgumentException();
            }
            long[] jArr2 = new long[size];
            int[] iArr3 = new int[size];
            int[] iArr4 = new int[size];
            String[] strArr = new String[size];
            int i2 = 0;
            Transition transition = null;
            int i3 = 0;
            while (i3 < size) {
                Transition transition2 = arrayList.get(i3);
                if (!transition2.isTransitionFrom(transition)) {
                    throw new IllegalArgumentException(str);
                }
                jArr2[i3] = transition2.getMillis();
                iArr3[i3] = transition2.getWallOffset();
                iArr4[i3] = transition2.getStandardOffset();
                strArr[i3] = transition2.getNameKey();
                i3++;
                transition = transition2;
            }
            String[] strArr2 = new String[5];
            for (String[] strArr3 : new DateFormatSymbols(Locale.ENGLISH).getZoneStrings()) {
                if (strArr3 != null && strArr3.length == 5 && str.equals(strArr3[0])) {
                    strArr2 = strArr3;
                }
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            while (i2 < size - 1) {
                String str2 = strArr[i2];
                int i5 = i2 + 1;
                String str3 = strArr[i5];
                long j2 = iArr3[i2];
                int i6 = size;
                int i21 = i2;
                long j3 = iArr3[i5];
                long j5 = iArr4[i21];
                long j16 = iArr4[i5];
                Period period = new Period(jArr2[i21], jArr2[i5], PeriodType.yearMonthDay(), instanceUTC);
                ISOChronology iSOChronology = instanceUTC;
                if (j2 != j3 && j5 == j16 && str2.equals(str3) && period.getYears() == 0 && period.getMonths() > 4 && period.getMonths() < 8 && str2.equals(strArr2[2]) && str2.equals(strArr2[4])) {
                    if (ZoneInfoLogger.verbose()) {
                        System.out.println("Fixing duplicate name key - " + str3);
                        PrintStream printStream = System.out;
                        StringBuilder sb6 = new StringBuilder("     - ");
                        jArr = jArr2;
                        iArr = iArr3;
                        sb6.append(new DateTime(jArr[i21], iSOChronology));
                        sb6.append(" - ");
                        iArr2 = iArr4;
                        sb6.append(new DateTime(jArr[i5], iSOChronology));
                        printStream.println(sb6.toString());
                    } else {
                        jArr = jArr2;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    }
                    if (j2 > j3) {
                        strArr[i21] = str2.concat("-Summer").intern();
                    } else {
                        strArr[i5] = (str3 + "-Summer").intern();
                        i = i5;
                        i2 = i + 1;
                        instanceUTC = iSOChronology;
                        iArr4 = iArr2;
                        jArr2 = jArr;
                        iArr3 = iArr;
                        size = i6;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr3;
                    iArr2 = iArr4;
                }
                i = i21;
                i2 = i + 1;
                instanceUTC = iSOChronology;
                iArr4 = iArr2;
                jArr2 = jArr;
                iArr3 = iArr;
                size = i6;
            }
            long[] jArr3 = jArr2;
            int[] iArr5 = iArr3;
            int[] iArr6 = iArr4;
            if (dSTZone == null || !dSTZone.iStartRecurrence.getNameKey().equals(dSTZone.iEndRecurrence.getNameKey())) {
                dSTZone2 = dSTZone;
            } else {
                if (ZoneInfoLogger.verbose()) {
                    System.out.println("Fixing duplicate recurrent name key - " + dSTZone.iStartRecurrence.getNameKey());
                }
                dSTZone2 = dSTZone.iStartRecurrence.getSaveMillis() > 0 ? new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence.renameAppend("-Summer"), dSTZone.iEndRecurrence) : new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence, dSTZone.iEndRecurrence.renameAppend("-Summer"));
            }
            return new PrecalculatedZone(z ? str : "", jArr3, iArr5, iArr6, strArr, dSTZone2);
        }

        public static PrecalculatedZone readFrom(DataInput dataInput, String str) throws IOException {
            int unsignedByte;
            int unsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[unsignedShort];
            for (int i = 0; i < unsignedShort; i++) {
                strArr[i] = dataInput.readUTF();
            }
            int i2 = dataInput.readInt();
            long[] jArr = new long[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            String[] strArr2 = new String[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                jArr[i3] = DateTimeZoneBuilder.readMillis(dataInput);
                iArr[i3] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                iArr2[i3] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                if (unsignedShort < 256) {
                    try {
                        unsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    unsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i3] = strArr[unsignedByte];
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? DSTZone.readFrom(dataInput, str) : null);
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 instanceof PrecalculatedZone) {
                PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj2;
                if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                    DSTZone dSTZone = this.iTailZone;
                    DSTZone dSTZone2 = precalculatedZone.iTailZone;
                    if (dSTZone != null ? dSTZone.equals(dSTZone2) : dSTZone2 == null) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j2) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j2);
            if (iBinarySearch >= 0) {
                return this.iNameKeys[iBinarySearch];
            }
            int i = ~iBinarySearch;
            if (i < jArr.length) {
                return i > 0 ? this.iNameKeys[i - 1] : "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            return dSTZone == null ? this.iNameKeys[i - 1] : dSTZone.getNameKey(j2);
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j2) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j2);
            if (iBinarySearch >= 0) {
                return this.iWallOffsets[iBinarySearch];
            }
            int i = ~iBinarySearch;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iWallOffsets[i - 1] : dSTZone.getOffset(j2);
            }
            if (i > 0) {
                return this.iWallOffsets[i - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j2) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j2);
            if (iBinarySearch >= 0) {
                return this.iStandardOffsets[iBinarySearch];
            }
            int i = ~iBinarySearch;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iStandardOffsets[i - 1] : dSTZone.getStandardOffset(j2);
            }
            if (i > 0) {
                return this.iStandardOffsets[i - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int hashCode() {
            return getID().hashCode();
        }

        public boolean isCachable() {
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d = 0.0d;
            int i = 0;
            for (int i2 = 1; i2 < jArr.length; i2++) {
                long j2 = jArr[i2] - jArr[i2 - 1];
                if (j2 < 63158400000L) {
                    d += j2;
                    i++;
                }
            }
            return i > 0 && (d / ((double) i)) / 8.64E7d >= 25.0d;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j2) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j2);
            int i = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
            if (i < jArr.length) {
                return jArr[i];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j2;
            }
            long j3 = jArr[jArr.length - 1];
            if (j2 < j3) {
                j2 = j3;
            }
            return dSTZone.nextTransition(j2);
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j2) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j2);
            if (iBinarySearch < 0) {
                int i = ~iBinarySearch;
                if (i >= jArr.length) {
                    DSTZone dSTZone = this.iTailZone;
                    if (dSTZone != null) {
                        long jPreviousTransition = dSTZone.previousTransition(j2);
                        if (jPreviousTransition < j2) {
                            return jPreviousTransition;
                        }
                    }
                    long j3 = jArr[i - 1];
                    if (j3 > Long.MIN_VALUE) {
                        return j3 - 1;
                    }
                } else if (i > 0) {
                    long j5 = jArr[i - 1];
                    if (j5 > Long.MIN_VALUE) {
                        return j5 - 1;
                    }
                }
            } else if (j2 > Long.MIN_VALUE) {
                return j2 - 1;
            }
            return j2;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            int length = this.iTransitions.length;
            HashSet hashSet = new HashSet();
            for (int i = 0; i < length; i++) {
                hashSet.add(this.iNameKeys[i]);
            }
            int size = hashSet.size();
            if (size > 65535) {
                throw new UnsupportedOperationException("String pool is too large");
            }
            String[] strArr = new String[size];
            Iterator it8 = hashSet.iterator();
            int i2 = 0;
            while (it8.hasNext()) {
                strArr[i2] = (String) it8.next();
                i2++;
            }
            dataOutput.writeShort(size);
            for (int i3 = 0; i3 < size; i3++) {
                dataOutput.writeUTF(strArr[i3]);
            }
            dataOutput.writeInt(length);
            for (int i5 = 0; i5 < length; i5++) {
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iTransitions[i5]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iWallOffsets[i5]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffsets[i5]);
                String str = this.iNameKeys[i5];
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    if (!strArr[i6].equals(str)) {
                        i6++;
                    } else if (size < 256) {
                        dataOutput.writeByte(i6);
                    } else {
                        dataOutput.writeShort(i6);
                    }
                }
            }
            dataOutput.writeBoolean(this.iTailZone != null);
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                dSTZone.writeTo(dataOutput);
            }
        }
    }

    public static final class Recurrence {
        final String iNameKey;
        final OfYear iOfYear;
        final int iSaveMillis;

        public Recurrence(OfYear ofYear, String str, int i) {
            this.iOfYear = ofYear;
            this.iNameKey = str;
            this.iSaveMillis = i;
        }

        public static Recurrence readFrom(DataInput dataInput) throws IOException {
            return new Recurrence(OfYear.readFrom(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 instanceof Recurrence) {
                Recurrence recurrence = (Recurrence) obj2;
                if (this.iSaveMillis == recurrence.iSaveMillis && this.iNameKey.equals(recurrence.iNameKey) && this.iOfYear.equals(recurrence.iOfYear)) {
                    return true;
                }
            }
            return false;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public OfYear getOfYear() {
            return this.iOfYear;
        }

        public int getSaveMillis() {
            return this.iSaveMillis;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.iSaveMillis), this.iNameKey, this.iOfYear});
        }

        public long next(long j2, int i, int i2) {
            return this.iOfYear.next(j2, i, i2);
        }

        public long previous(long j2, int i, int i2) {
            return this.iOfYear.previous(j2, i, i2);
        }

        public Recurrence rename(String str) {
            return new Recurrence(this.iOfYear, str, this.iSaveMillis);
        }

        public Recurrence renameAppend(String str) {
            return rename((this.iNameKey + str).intern());
        }

        public String toString() {
            return this.iOfYear + " named " + this.iNameKey + " at " + this.iSaveMillis;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            this.iOfYear.writeTo(dataOutput);
            dataOutput.writeUTF(this.iNameKey);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iSaveMillis);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Rule {
        final int iFromYear;
        final Recurrence iRecurrence;
        final int iToYear;

        public Rule(Recurrence recurrence, int i, int i2) {
            this.iRecurrence = recurrence;
            this.iFromYear = i;
            this.iToYear = i2;
        }

        public int getFromYear() {
            return this.iFromYear;
        }

        public String getNameKey() {
            return this.iRecurrence.getNameKey();
        }

        public OfYear getOfYear() {
            return this.iRecurrence.getOfYear();
        }

        public int getSaveMillis() {
            return this.iRecurrence.getSaveMillis();
        }

        public int getToYear() {
            return this.iToYear;
        }

        public long next(long j2, int i, int i2) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            int i3 = i + i2;
            long next = this.iRecurrence.next(((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 ? Integer.MIN_VALUE : instanceUTC.year().get(((long) i3) + j2)) < this.iFromYear ? (instanceUTC.year().set(0L, this.iFromYear) - ((long) i3)) - 1 : j2, i, i2);
            return (next <= j2 || instanceUTC.year().get(((long) i3) + next) <= this.iToYear) ? next : j2;
        }

        public String toString() {
            return this.iFromYear + " to " + this.iToYear + " using " + this.iRecurrence;
        }
    }

    private boolean addTransition(ArrayList<Transition> arrayList, Transition transition) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(transition);
            return true;
        }
        int i = size - 1;
        Transition transition2 = arrayList.get(i);
        if (!transition.isTransitionFrom(transition2)) {
            return false;
        }
        if (transition.getMillis() + ((long) transition2.getWallOffset()) == transition2.getMillis() + ((long) (size >= 2 ? arrayList.get(size - 2).getWallOffset() : 0))) {
            return addTransition(arrayList, transition.withMillis(arrayList.remove(i).getMillis()));
        }
        arrayList.add(transition);
        return true;
    }

    private static DateTimeZone buildFixedZone(String str, String str2, int i, int i2) {
        return ("UTC".equals(str) && str.equals(str2) && i == 0 && i2 == 0) ? DateTimeZone.UTC : new FixedDateTimeZone(str, str2, i, i2);
    }

    private RuleSet getLastRuleSet() {
        DateTimeZoneBuilder dateTimeZoneBuilder;
        if (this.iRuleSets.size() == 0) {
            dateTimeZoneBuilder = this;
            dateTimeZoneBuilder.addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        } else {
            dateTimeZoneBuilder = this;
        }
        return (RuleSet) p.a.i(1, dateTimeZoneBuilder.iRuleSets);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DateTimeZone readFrom(InputStream inputStream, String str) throws IOException {
        return inputStream instanceof DataInput ? readFrom((DataInput) inputStream, str) : readFrom((DataInput) new DataInputStream(inputStream), str);
    }

    public static long readMillis(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j2;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i = unsignedByte2 >> 6;
        if (i == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j2 = 60000;
        } else if (i == 2) {
            unsignedByte = ((((long) unsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j2 = 1000;
        } else {
            if (i == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j2 = ComponentTracker.DEFAULT_TIMEOUT;
        }
        return unsignedByte * j2;
    }

    public static void writeMillis(DataOutput dataOutput, long j2) throws IOException {
        if (j2 % ComponentTracker.DEFAULT_TIMEOUT == 0) {
            long j3 = j2 / ComponentTracker.DEFAULT_TIMEOUT;
            if (((j3 << 58) >> 58) == j3) {
                dataOutput.writeByte((int) (j3 & 63));
                return;
            }
        }
        if (j2 % 60000 == 0) {
            long j5 = j2 / 60000;
            if (((j5 << 34) >> 34) == j5) {
                dataOutput.writeInt(((int) (1073741823 & j5)) | 1073741824);
                return;
            }
        }
        if (j2 % 1000 == 0) {
            long j16 = j2 / 1000;
            if (((j16 << 26) >> 26) == j16) {
                dataOutput.writeByte(((int) ((j16 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) j16);
                return;
            }
        }
        dataOutput.writeByte(j2 < 0 ? 255 : 192);
        dataOutput.writeLong(j2);
    }

    public DateTimeZoneBuilder addCutover(int i, char c2, int i2, int i3, int i5, boolean z, int i6) {
        if (this.iRuleSets.size() > 0) {
            ((RuleSet) p.a.i(1, this.iRuleSets)).setUpperLimit(i, new OfYear(c2, i2, i3, i5, z, i6));
        }
        this.iRuleSets.add(new RuleSet());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String str, int i, int i2, int i3, char c2, int i5, int i6, int i21, boolean z, int i22) {
        if (i2 <= i3) {
            getLastRuleSet().addRule(new Rule(new Recurrence(new OfYear(c2, i5, i6, i21, z, i22), str, i), i2, i3));
        }
        return this;
    }

    public DateTimeZoneBuilder setFixedSavings(String str, int i) {
        getLastRuleSet().setFixedSavings(str, i);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i) {
        getLastRuleSet().setStandardOffset(i);
        return this;
    }

    public DateTimeZone toDateTimeZone(String str, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        ArrayList<Transition> arrayList = new ArrayList<>();
        int size = this.iRuleSets.size();
        DSTZone dSTZoneBuildTailZone = null;
        long upperLimit = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            RuleSet ruleSet = this.iRuleSets.get(i);
            Transition transitionFirstTransition = ruleSet.firstTransition(upperLimit);
            if (transitionFirstTransition != null) {
                addTransition(arrayList, transitionFirstTransition);
                long millis = transitionFirstTransition.getMillis();
                int saveMillis = transitionFirstTransition.getSaveMillis();
                RuleSet ruleSet2 = new RuleSet(ruleSet);
                while (true) {
                    Transition transitionNextTransition = ruleSet2.nextTransition(millis, saveMillis);
                    if (transitionNextTransition == null || (addTransition(arrayList, transitionNextTransition) && dSTZoneBuildTailZone != null)) {
                        break;
                    }
                    long millis2 = transitionNextTransition.getMillis();
                    int saveMillis2 = transitionNextTransition.getSaveMillis();
                    if (dSTZoneBuildTailZone == null && i == size - 1) {
                        dSTZoneBuildTailZone = ruleSet2.buildTailZone(str);
                    }
                    saveMillis = saveMillis2;
                    millis = millis2;
                }
                upperLimit = ruleSet2.getUpperLimit(saveMillis);
            }
        }
        if (arrayList.size() == 0) {
            return dSTZoneBuildTailZone != null ? dSTZoneBuildTailZone : buildFixedZone(str, "UTC", 0, 0);
        }
        if (arrayList.size() == 1 && dSTZoneBuildTailZone == null) {
            Transition transition = arrayList.get(0);
            return buildFixedZone(str, transition.getNameKey(), transition.getWallOffset(), transition.getStandardOffset());
        }
        PrecalculatedZone precalculatedZoneCreate = PrecalculatedZone.create(str, z, arrayList, dSTZoneBuildTailZone);
        return precalculatedZoneCreate.isCachable() ? CachedDateTimeZone.forZone(precalculatedZoneCreate) : precalculatedZoneCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeTo(String str, OutputStream outputStream) throws IOException {
        if (outputStream instanceof DataOutput) {
            writeTo(str, (DataOutput) outputStream);
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeTo(str, (DataOutput) dataOutputStream);
        dataOutputStream.flush();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class RuleSet {
        private static final int YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(DateTimeUtils.currentTimeMillis()) + 100;
        private String iInitialNameKey;
        private int iInitialSaveMillis;
        private ArrayList<Rule> iRules;
        private int iStandardOffset;
        private OfYear iUpperOfYear;
        private int iUpperYear;

        public RuleSet() {
            this.iRules = new ArrayList<>(10);
            this.iUpperYear = Integer.MAX_VALUE;
        }

        public void addRule(Rule rule) {
            if (this.iRules.contains(rule)) {
                return;
            }
            this.iRules.add(rule);
        }

        public DSTZone buildTailZone(String str) {
            if (this.iRules.size() != 2) {
                return null;
            }
            Rule rule = this.iRules.get(0);
            Rule rule2 = this.iRules.get(1);
            if (rule.getToYear() == Integer.MAX_VALUE && rule2.getToYear() == Integer.MAX_VALUE) {
                return new DSTZone(str, this.iStandardOffset, rule.iRecurrence, rule2.iRecurrence);
            }
            return null;
        }

        public Transition firstTransition(long j2) {
            String str = this.iInitialNameKey;
            if (str != null) {
                int i = this.iStandardOffset;
                return new Transition(j2, str, i + this.iInitialSaveMillis, i);
            }
            ArrayList<Rule> arrayList = new ArrayList<>(this.iRules);
            long millis = Long.MIN_VALUE;
            int saveMillis = 0;
            Transition transition = null;
            while (true) {
                Transition transitionNextTransition = nextTransition(millis, saveMillis);
                if (transitionNextTransition == null) {
                    break;
                }
                millis = transitionNextTransition.getMillis();
                if (millis == j2) {
                    transition = new Transition(j2, transitionNextTransition);
                    break;
                }
                if (millis > j2) {
                    if (transition == null) {
                        Iterator<Rule> it8 = arrayList.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            Rule next = it8.next();
                            if (next.getSaveMillis() == 0) {
                                transition = new Transition(j2, next, this.iStandardOffset);
                                break;
                            }
                        }
                    }
                    if (transition == null) {
                        String nameKey = transitionNextTransition.getNameKey();
                        int i2 = this.iStandardOffset;
                        transition = new Transition(j2, nameKey, i2, i2);
                    }
                } else {
                    transition = new Transition(j2, transitionNextTransition);
                    saveMillis = transitionNextTransition.getSaveMillis();
                }
            }
            this.iRules = arrayList;
            return transition;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public long getUpperLimit(int i) {
            int i2 = this.iUpperYear;
            if (i2 == Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            return this.iUpperOfYear.setInstant(i2, this.iStandardOffset, i);
        }

        public Transition nextTransition(long j2, int i) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            Iterator<Rule> it8 = this.iRules.iterator();
            long j3 = Long.MAX_VALUE;
            Rule rule = null;
            while (it8.hasNext()) {
                Rule next = it8.next();
                long next2 = next.next(j2, this.iStandardOffset, i);
                if (next2 <= j2) {
                    it8.remove();
                } else if (next2 <= j3) {
                    rule = next;
                    j3 = next2;
                }
            }
            if (rule == null || instanceUTC.year().get(j3) >= YEAR_LIMIT) {
                return null;
            }
            int i2 = this.iUpperYear;
            if (i2 >= Integer.MAX_VALUE || j3 < this.iUpperOfYear.setInstant(i2, this.iStandardOffset, i)) {
                return new Transition(j3, rule, this.iStandardOffset);
            }
            return null;
        }

        public void setFixedSavings(String str, int i) {
            this.iInitialNameKey = str;
            this.iInitialSaveMillis = i;
        }

        public void setStandardOffset(int i) {
            this.iStandardOffset = i;
        }

        public void setUpperLimit(int i, OfYear ofYear) {
            this.iUpperYear = i;
            this.iUpperOfYear = ofYear;
        }

        public String toString() {
            return this.iInitialNameKey + " initial: " + this.iInitialSaveMillis + " std: " + this.iStandardOffset + " upper: " + this.iUpperYear + " " + this.iUpperOfYear + " " + this.iRules;
        }

        public RuleSet(RuleSet ruleSet) {
            this.iStandardOffset = ruleSet.iStandardOffset;
            this.iRules = new ArrayList<>(ruleSet.iRules);
            this.iInitialNameKey = ruleSet.iInitialNameKey;
            this.iInitialSaveMillis = ruleSet.iInitialSaveMillis;
            this.iUpperYear = ruleSet.iUpperYear;
            this.iUpperOfYear = ruleSet.iUpperOfYear;
        }
    }

    public static DateTimeZone readFrom(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(dataInput, str));
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return PrecalculatedZone.readFrom(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) readMillis(dataInput), (int) readMillis(dataInput));
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Transition {
        private final long iMillis;
        private final String iNameKey;
        private final int iStandardOffset;
        private final int iWallOffset;

        public Transition(long j2, Transition transition) {
            this.iMillis = j2;
            this.iNameKey = transition.iNameKey;
            this.iWallOffset = transition.iWallOffset;
            this.iStandardOffset = transition.iStandardOffset;
        }

        public long getMillis() {
            return this.iMillis;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public int getSaveMillis() {
            return this.iWallOffset - this.iStandardOffset;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public int getWallOffset() {
            return this.iWallOffset;
        }

        public boolean isTransitionFrom(Transition transition) {
            if (transition == null) {
                return true;
            }
            if (this.iMillis > transition.iMillis) {
                return (this.iWallOffset == transition.iWallOffset && this.iStandardOffset == transition.iStandardOffset && this.iNameKey.equals(transition.iNameKey)) ? false : true;
            }
            return false;
        }

        public String toString() {
            return new DateTime(this.iMillis, DateTimeZone.UTC) + " " + this.iStandardOffset + " " + this.iWallOffset;
        }

        public Transition withMillis(long j2) {
            return new Transition(j2, this.iNameKey, this.iWallOffset, this.iStandardOffset);
        }

        public Transition(long j2, Rule rule, int i) {
            this.iMillis = j2;
            this.iNameKey = rule.getNameKey();
            this.iWallOffset = rule.getSaveMillis() + i;
            this.iStandardOffset = i;
        }

        public Transition(long j2, String str, int i, int i2) {
            this.iMillis = j2;
            this.iNameKey = str;
            this.iWallOffset = i;
            this.iStandardOffset = i2;
        }
    }

    public void writeTo(String str, DataOutput dataOutput) throws IOException {
        DateTimeZone dateTimeZone = toDateTimeZone(str, false);
        if (dateTimeZone instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(dateTimeZone.getNameKey(0L));
            writeMillis(dataOutput, dateTimeZone.getOffset(0L));
            writeMillis(dataOutput, dateTimeZone.getStandardOffset(0L));
            return;
        }
        if (dateTimeZone instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            dateTimeZone = ((CachedDateTimeZone) dateTimeZone).getUncachedZone();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) dateTimeZone).writeTo(dataOutput);
    }
}
