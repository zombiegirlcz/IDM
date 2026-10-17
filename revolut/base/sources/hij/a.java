package hij;

import fij.m;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f152607a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.COUNTRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.REGIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.GLOBAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.ALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f152607a = iArr;
    }
}
