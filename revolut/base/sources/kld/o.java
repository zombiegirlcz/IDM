package kld;

import akd.p;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f185434a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f185434a = iArr;
    }
}
