package qwk;

import jel.y2;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f249961a;

    static {
        int[] iArr = new int[y2.values().length];
        try {
            iArr[y2.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y2.HOLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y2.SELL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f249961a = iArr;
    }
}
