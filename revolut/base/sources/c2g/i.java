package c2g;

import myf.c0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f20784b;

    static {
        int[] iArr = new int[x3g.b.values().length];
        try {
            iArr[x3g.b.FULL_REFUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x3g.b.PARTIAL_REFUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x3g.b.NO_REFUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f20783a = iArr;
        int[] iArr2 = new int[c0.values().length];
        try {
            iArr2[c0.DURATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c0.AGE_RESTRICTIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c0.TICKET_TYPE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f20784b = iArr2;
    }
}
