package ep7;

import kl7.n0;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f128105a;

    static {
        int[] iArr = new int[n0.values().length];
        try {
            iArr[n0.DISQUALIFICATIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n0.CONVICTIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n0.REFUSED_CAR_INSURANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n0.INCREASED_EXCESS_AND_REDUCED_COVER_LEVEL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[n0.DRIVER_DISABILITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[n0.NO_OR_RECENT_RESIDENCY_IRELAND.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[n0.CURRENT_INSURANCE_EXPIRED_30_OR_MORE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f128105a = iArr;
    }
}
