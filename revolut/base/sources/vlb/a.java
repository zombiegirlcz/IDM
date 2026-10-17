package vlb;

import ncd.g;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290309a;

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
        f290309a = iArr;
    }
}
