package ael;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3607a;

    static {
        int[] iArr = new int[cfl.v.values().length];
        try {
            iArr[cfl.v.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cfl.v.ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cfl.v.REMEDIATION_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cfl.v.ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[cfl.v.OFFBOARDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[cfl.v.DISABLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[cfl.v.OFFBOARDED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f3607a = iArr;
    }
}
