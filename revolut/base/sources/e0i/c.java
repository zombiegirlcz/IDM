package e0i;

import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121720a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f121720a = iArr;
    }
}
