package xnb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f307344b;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.IAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.MMF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.MULTI_TYPES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f307343a = iArr;
        int[] iArr2 = new int[ncd.h.values().length];
        try {
            iArr2[ncd.h.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ncd.h.PERSONAL_UNDER_18.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ncd.h.BUSINESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ncd.h.YOUTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ncd.h.PERSONAL_JOINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f307344b = iArr2;
    }
}
