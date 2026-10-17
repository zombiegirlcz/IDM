package bsl;

import bfl.g;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18218a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18218a = iArr;
    }
}
