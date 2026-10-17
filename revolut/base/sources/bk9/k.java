package bk9;

import com.revolut.feature.pay_later.api.models.PayLaterPaymentMethod;
import zh9.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f16294b;

    static {
        int[] iArr = new int[PayLaterPaymentMethod.values().length];
        try {
            iArr[PayLaterPaymentMethod.DEBIT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PayLaterPaymentMethod.SINGLE_USE_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f16293a = iArr;
        int[] iArr2 = new int[w.values().length];
        try {
            iArr2[w.PAY_IN_30_DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[w.PAY_IN_3.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w.PAY_IN_6.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[w.PAY_IN_12.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f16294b = iArr2;
    }
}
