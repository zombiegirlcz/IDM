package wm2;

import xjg.k;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298597a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.PREMIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f298597a = iArr;
    }
}
