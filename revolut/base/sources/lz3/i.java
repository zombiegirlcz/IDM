package lz3;

import ft3.j1;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200925a;

    static {
        int[] iArr = new int[j1.values().length];
        try {
            iArr[j1.FIXED_TERM_CREDIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j1.CREDIT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f200925a = iArr;
    }
}
