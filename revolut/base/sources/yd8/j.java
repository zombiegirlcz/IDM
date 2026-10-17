package yd8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312648a;

    static {
        int[] iArr = new int[ij8.h.values().length];
        try {
            iArr[ij8.h.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ij8.h.LOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ij8.h.OFFBOARDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ij8.h.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ij8.h.CREATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f312648a = iArr;
    }
}
