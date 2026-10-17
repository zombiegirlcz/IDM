package qwe;

import com.revolut.domain.models.topup.methods.TopupMethodType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f249892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f249893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f249894c;

    static {
        int[] iArr = new int[pi3.s.values().length];
        try {
            iArr[pi3.s.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pi3.s.PLAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f249892a = iArr;
        int[] iArr2 = new int[vye.c.values().length];
        try {
            iArr2[vye.c.GOOGLE_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[vye.c.UPI_APP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[vye.c.NET_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[vye.c.PAYNOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f249893b = iArr2;
        int[] iArr3 = new int[TopupMethodType.values().length];
        try {
            iArr3[TopupMethodType.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[TopupMethodType.GOOGLE_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[TopupMethodType.CHECKOUT_PREORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[TopupMethodType.UPI_APP.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[TopupMethodType.NET_BANKING.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[TopupMethodType.PAYNOW.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        f249894c = iArr3;
    }
}
