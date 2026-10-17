package qwc;

import qtc.v;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f249849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f249850b;

    static {
        int[] iArr = new int[pwc.h.values().length];
        try {
            iArr[pwc.h.CARD_AND_CACHE_WITHDRAWALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pwc.h.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pwc.h.TRANSFERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pwc.h.CARD_PAYMENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f249849a = iArr;
        int[] iArr2 = new int[v.values().length];
        try {
            iArr2[v.SPENDING_HABITS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[v.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f249850b = iArr2;
    }
}
