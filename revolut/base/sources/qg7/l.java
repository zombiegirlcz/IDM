package qg7;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f245679a;

    static {
        int[] iArr = new int[ug7.c.values().length];
        try {
            iArr[ug7.c.CLAIM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ug7.c.REJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ug7.c.SHARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ug7.c.GO_TO_ACCOUNT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ug7.c.QUIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ug7.c.RELOAD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f245679a = iArr;
    }
}
