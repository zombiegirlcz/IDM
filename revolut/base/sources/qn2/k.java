package qn2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f247861a;

    static {
        int[] iArr = new int[rn2.n.values().length];
        try {
            iArr[rn2.n.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rn2.n.IBAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rn2.n.DATE_INPUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[rn2.n.PHONE_NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[rn2.n.DROPDOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f247861a = iArr;
    }
}
