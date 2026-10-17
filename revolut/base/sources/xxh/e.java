package xxh;

import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CryptoOrderDetailsInputData.StopLimitInputData f309530n;
    public final p0i.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final txh.c f309531p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CryptoOrderDetailsInputData.StopLimitInputData inputData, u2i.d cryptoOrderPriceDialogFactory, mre.c termsNavigationFactory, p0i.b fxOrderInteractor, txh.c dialogControllerProvider) {
        super(cryptoOrderPriceDialogFactory, termsNavigationFactory);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoOrderPriceDialogFactory, "cryptoOrderPriceDialogFactory");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(dialogControllerProvider, "dialogControllerProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderPriceDialogFactory, "cryptoOrderPriceDialogFactory");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f309530n = inputData;
        this.o = fxOrderInteractor;
        this.f309531p = dialogControllerProvider;
    }

    @Override // uxh.l
    public final String b3() {
        return this.f309530n.f96661a.getF72134a().f72138b;
    }

    @Override // uxh.l
    public final n0i.a c3(Object obj2) {
        if (obj2 instanceof n0i.a) {
            return (n0i.a) obj2;
        }
        return null;
    }

    @Override // uxh.l
    public final boolean d3() {
        return true;
    }

    @Override // uxh.l
    public final boolean e3() {
        return false;
    }
}
