package hu5;

import com.revolut.feature.crypto_investments.impl.data.network.CryptoTaxService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoTaxService f155562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl0.a f155563b;

    public e(CryptoTaxService cryptoTaxService, tl0.a wrapper) {
        Intrinsics.checkNotNullParameter(cryptoTaxService, "cryptoTaxService");
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        this.f155562a = cryptoTaxService;
        this.f155563b = wrapper;
    }
}
