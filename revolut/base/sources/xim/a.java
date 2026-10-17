package xim;

import wim.t;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306434a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.INVARIANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f306434a = iArr;
    }
}
