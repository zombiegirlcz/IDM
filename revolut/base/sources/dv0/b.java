package dv0;

import aw0.ma;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f118012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f118013b;

    static {
        int[] iArr = new int[ma.values().length];
        try {
            iArr[ma.TIME_24H.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ma.TIME_12H.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f118012a = iArr;
        int[] iArr2 = new int[a.values().length];
        try {
            iArr2[a.AM.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a.PM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f118013b = iArr2;
    }
}
