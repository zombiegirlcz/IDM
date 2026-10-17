package ynb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f315400b;

    static {
        int[] iArr = new int[pcd.b.values().length];
        try {
            iArr[pcd.b.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pcd.b.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pcd.b.PERSONAL_UNDER_18.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pcd.b.YOUTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pcd.b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f315399a = iArr;
        int[] iArr2 = new int[sib.a.values().length];
        try {
            iArr2[sib.a.RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[sib.a.CATCH_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f315400b = iArr2;
    }
}
