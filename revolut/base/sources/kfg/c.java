package kfg;

import hfg.i0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f183358a;

    static {
        int[] iArr = new int[i0.values().length];
        try {
            iArr[i0.PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i0.EARLIEST_DEPARTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i0.LATEST_DEPARTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f183358a = iArr;
    }
}
