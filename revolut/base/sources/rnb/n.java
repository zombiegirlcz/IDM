package rnb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f255569a;

    static {
        int[] iArr = new int[ncd.h.values().length];
        try {
            iArr[ncd.h.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ncd.h.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ncd.h.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ncd.h.PERSONAL_UNDER_18.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ncd.h.BUSINESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f255569a = iArr;
    }
}
