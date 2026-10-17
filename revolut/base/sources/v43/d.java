package v43;

import h93.l0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f285935a;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.INDIA_LOCAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l0.INDIA_GLOBAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l0.BRAZIL_LOCAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l0.BRAZIL_GLOBAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l0.MEXICO_MCY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f285935a = iArr;
    }
}
