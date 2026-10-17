package org.joda.time.tz;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes13.dex */
public class CachedDateTimeZone extends DateTimeZone {
    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 5472298452022250685L;
    private final transient Info[] iInfoCache;
    private final DateTimeZone iZone;

    public static final class Info {
        private String iNameKey;
        Info iNextInfo;
        public final long iPeriodStart;
        public final DateTimeZone iZoneRef;
        private int iOffset = Integer.MIN_VALUE;
        private int iStandardOffset = Integer.MIN_VALUE;

        public Info(DateTimeZone dateTimeZone, long j2) {
            this.iPeriodStart = j2;
            this.iZoneRef = dateTimeZone;
        }

        public String getNameKey(long j2) {
            Info info = this.iNextInfo;
            if (info != null && j2 >= info.iPeriodStart) {
                return info.getNameKey(j2);
            }
            if (this.iNameKey == null) {
                this.iNameKey = this.iZoneRef.getNameKey(this.iPeriodStart);
            }
            return this.iNameKey;
        }

        public int getOffset(long j2) {
            Info info = this.iNextInfo;
            if (info != null && j2 >= info.iPeriodStart) {
                return info.getOffset(j2);
            }
            if (this.iOffset == Integer.MIN_VALUE) {
                this.iOffset = this.iZoneRef.getOffset(this.iPeriodStart);
            }
            return this.iOffset;
        }

        public int getStandardOffset(long j2) {
            Info info = this.iNextInfo;
            if (info != null && j2 >= info.iPeriodStart) {
                return info.getStandardOffset(j2);
            }
            if (this.iStandardOffset == Integer.MIN_VALUE) {
                this.iStandardOffset = this.iZoneRef.getStandardOffset(this.iPeriodStart);
            }
            return this.iStandardOffset;
        }
    }

    static {
        Integer integer;
        int i;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i = 512;
        } else {
            int i2 = 0;
            for (int iIntValue = integer.intValue() - 1; iIntValue > 0; iIntValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        cInfoCacheMask = i - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.getID());
        this.iInfoCache = new Info[cInfoCacheMask + 1];
        this.iZone = dateTimeZone;
    }

    private Info createInfo(long j2) {
        long j3 = j2 & (-4294967296L);
        Info info = new Info(this.iZone, j3);
        long j5 = BodyPartID.bodyIdMax | j3;
        Info info2 = info;
        while (true) {
            long jNextTransition = this.iZone.nextTransition(j3);
            if (jNextTransition == j3 || jNextTransition > j5) {
                break;
            }
            Info info3 = new Info(this.iZone, jNextTransition);
            info2.iNextInfo = info3;
            info2 = info3;
            j3 = jNextTransition;
        }
        return info;
    }

    public static CachedDateTimeZone forZone(DateTimeZone dateTimeZone) {
        return dateTimeZone instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZone : new CachedDateTimeZone(dateTimeZone);
    }

    private Info getInfo(long j2) {
        int i = (int) (j2 >> 32);
        Info[] infoArr = this.iInfoCache;
        int i2 = cInfoCacheMask & i;
        Info info = infoArr[i2];
        if (info != null && ((int) (info.iPeriodStart >> 32)) == i) {
            return info;
        }
        Info infoCreateInfo = createInfo(j2);
        infoArr[i2] = infoCreateInfo;
        return infoCreateInfo;
    }

    @Override // org.joda.time.DateTimeZone
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj2).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j2) {
        return getInfo(j2).getNameKey(j2);
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j2) {
        return getInfo(j2).getOffset(j2);
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j2) {
        return getInfo(j2).getStandardOffset(j2);
    }

    public DateTimeZone getUncachedZone() {
        return this.iZone;
    }

    @Override // org.joda.time.DateTimeZone
    public int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public boolean isFixed() {
        return this.iZone.isFixed();
    }

    @Override // org.joda.time.DateTimeZone
    public long nextTransition(long j2) {
        return this.iZone.nextTransition(j2);
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j2) {
        return this.iZone.previousTransition(j2);
    }
}
