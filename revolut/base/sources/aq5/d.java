package aq5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8262b;

    static {
        int[] iArr = new int[lo5.b.values().length];
        try {
            iArr[lo5.b.MY_WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lo5.b.SOMEONE_ELSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8261a = iArr;
        int[] iArr2 = new int[wk5.i.values().length];
        try {
            iArr2[wk5.i.INDIVIDUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wk5.i.COMPANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wk5.i.USER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[wk5.i.UNSET.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f8262b = iArr2;
    }
}
