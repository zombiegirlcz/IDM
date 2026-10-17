package ti6;

import com.revolut.domain.models.openbanking.PaymentFrequency;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f271423a;

    static {
        int[] iArr = new int[PaymentFrequency.values().length];
        try {
            iArr[PaymentFrequency.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentFrequency.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentFrequency.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f271423a = iArr;
    }
}
