package yca;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f312600b;

    static {
        int[] iArr = new int[gp.a.values().length];
        try {
            iArr[gp.a.BRAZILIAN_PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gp.a.CPF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gp.a.CNPJ.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f312599a = iArr;
        int[] iArr2 = new int[g8a.t.values().length];
        try {
            iArr2[g8a.t.SEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[g8a.t.ADD_TRUSTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f312600b = iArr2;
    }
}
