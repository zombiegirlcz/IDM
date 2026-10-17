package job;

import ipa.h;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f176919a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.SAVINGS_ACCOUNT_BALANCE_UPDATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.SAVINGS_ACCOUNT_UPDATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f176919a = iArr;
    }
}
