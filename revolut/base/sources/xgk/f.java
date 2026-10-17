package xgk;

import lha.l;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f305771a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.KYC_NOT_PASSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.PLAN_PRIVACY_CONFLICT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.DIFFERENT_MARKETS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.APP_VERSION_NOT_SUPPORTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l.REQUIRES_HIGHER_TIER_PLAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l.ALREADY_PART_OF_FAMILY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[l.FORBIDDEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f305771a = iArr;
    }
}
