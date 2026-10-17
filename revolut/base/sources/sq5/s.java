package sq5;

import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f265018a;

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
        f265018a = iArr;
    }
}
