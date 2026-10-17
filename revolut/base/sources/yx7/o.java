package yx7;

import zw7.l1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f317593a;

    static {
        int[] iArr = new int[l1.values().length];
        try {
            iArr[l1.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l1.PAYMENT_OVERDUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l1.ADDRESS_NOT_SUPPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f317593a = iArr;
    }
}
