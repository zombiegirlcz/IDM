package ewc;

import cuc.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f130161b;

    static {
        int[] iArr = new int[bwc.d.values().length];
        try {
            iArr[bwc.d.INDIA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f130160a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.VOLUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[h.COUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[h.TRANSACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[h.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        f130161b = iArr2;
    }
}
