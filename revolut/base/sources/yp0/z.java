package yp0;

import aw0.v1;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f315761b;

    static {
        int[] iArr = new int[b0.values().length];
        try {
            iArr[b0.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b0.ON_SHIMMER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f315760a = iArr;
        int[] iArr2 = new int[v1.values().length];
        try {
            iArr2[v1.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[v1.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f315761b = iArr2;
    }
}
