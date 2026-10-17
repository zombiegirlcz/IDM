package jqd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f177697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f177698b;

    static {
        int[] iArr = new int[kq2.c.values().length];
        try {
            iArr[kq2.c.SHARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kq2.c.DEBTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f177697a = iArr;
        int[] iArr2 = new int[hzi.d.values().length];
        try {
            iArr2[hzi.d.SHARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[hzi.d.DEBTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f177698b = iArr2;
    }
}
