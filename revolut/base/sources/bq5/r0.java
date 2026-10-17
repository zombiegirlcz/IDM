package bq5;

import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f17751c;

    static {
        int[] iArr = new int[CryptoAddressHostingProviderType.values().length];
        try {
            iArr[CryptoAddressHostingProviderType.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CryptoAddressHostingProviderType.EXCHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17749a = iArr;
        int[] iArr2 = new int[b0.values().length];
        try {
            iArr2[b0.CREATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b0.EDIT_LABEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b0.SUBMIT_RECIPIENT_DETAILS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f17750b = iArr2;
        int[] iArr3 = new int[wk5.i.values().length];
        try {
            iArr3[wk5.i.INDIVIDUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[wk5.i.COMPANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[wk5.i.USER.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f17751c = iArr3;
    }
}
