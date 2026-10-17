package l6i;

import ncd.g;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192411a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.SAVINGS_DEPOSITS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SAVINGS_FIXED_TERM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.SAVINGS_MMF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f192411a = iArr;
    }
}
