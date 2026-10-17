package vsd;

import io3.l;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f291764b;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.DEBIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f291763a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[l.SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[l.CREDIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f291764b = iArr2;
    }
}
