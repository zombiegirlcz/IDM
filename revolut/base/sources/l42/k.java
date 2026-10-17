package l42;

import c12.o0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192045a;

    static {
        int[] iArr = new int[o0.values().length];
        try {
            iArr[o0.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o0.ACCEPT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o0.DECLINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f192045a = iArr;
    }
}
