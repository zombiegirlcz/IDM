package j33;

import e93.d0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f170956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f170957b;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.FRONT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f170956a = iArr;
        int[] iArr2 = new int[c90.b.values().length];
        try {
            iArr2[c90.b.MDPI.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c90.b.HDPI.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c90.b.XHDPI.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f170957b = iArr2;
    }
}
