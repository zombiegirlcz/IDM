package i4k;

import f5j.r;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f158523b;

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
        f158522a = iArr;
        int[] iArr2 = new int[r.values().length];
        try {
            iArr2[r.CHEQUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f158523b = iArr2;
    }
}
