package lkf;

import tof.x1;
import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f196407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f196408b;

    static {
        int[] iArr = new int[x1.values().length];
        try {
            iArr[x1.UPI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f196407a = iArr;
        int[] iArr2 = new int[y6.values().length];
        try {
            iArr2[y6.ALIPAY_PLUS_PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[y6.IRIS_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[y6.WERO_PAYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f196408b = iArr2;
    }
}
