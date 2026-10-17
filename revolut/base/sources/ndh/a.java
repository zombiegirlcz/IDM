package ndh;

import p5d.f;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f214367a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f214367a = iArr;
    }
}
