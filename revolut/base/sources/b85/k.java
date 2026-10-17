package b85;

import q35.d0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f13109b;

    static {
        int[] iArr = new int[b95.a.values().length];
        try {
            iArr[b95.a.PERSONAL_LOAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b95.a.REFINANCING_LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b95.a.MORTGAGE_LOAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f13108a = iArr;
        int[] iArr2 = new int[d0.values().length];
        try {
            iArr2[d0.Auto.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d0.Manual.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f13109b = iArr2;
    }
}
