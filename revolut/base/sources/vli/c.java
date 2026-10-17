package vli;

import lhi.s;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290452a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f290452a = iArr;
    }
}
