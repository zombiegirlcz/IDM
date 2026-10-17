package azg;

import iwg.c;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11458a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.TIME_WEIGHTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.MONEY_WEIGHTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.SIMPLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f11458a = iArr;
    }
}
