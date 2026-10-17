package xt;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f308732a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.MRZ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.MRZ_BACKUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.MRZ_MY_NUMBER_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.NO_MRZ.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f308732a = iArr;
    }
}
