package yxh;

import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import myh.j;
import vkm.j2;
import vkm.q;
import yji.n;
import yk6.m;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CryptoOrderDetailsInputData.TpslInputData f317698n;
    public final p0i.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final txh.c f317699p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f317700q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CryptoOrderDetailsInputData.TpslInputData inputData, u2i.d cryptoOrderPriceDialogFactory, mre.c termsNavigationFactory, p0i.b fxOrderInteractor, txh.c dialogControllerProvider) {
        super(cryptoOrderPriceDialogFactory, termsNavigationFactory);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoOrderPriceDialogFactory, "cryptoOrderPriceDialogFactory");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(dialogControllerProvider, "dialogControllerProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderPriceDialogFactory, "cryptoOrderPriceDialogFactory");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f317698n = inputData;
        this.o = fxOrderInteractor;
        this.f317699p = dialogControllerProvider;
        this.f317700q = q.c(j.TAKE_PROFIT);
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, this.f317700q, null, new m(this, (Continuation) null, 29), 3);
    }

    @Override // uxh.l
    public final String b3() {
        wd6.h hVar;
        int i = c.f317697a[((j) this.f317700q.getValue()).ordinal()];
        if (i == 1) {
            hVar = wd6.h.TAKE_PROFIT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = wd6.h.STOP_LOSS;
        }
        CryptoOrderDetailsInputData.TpslInputData tpslInputData = this.f317698n;
        ExchangeOrderInfo f72134a = tpslInputData.f96662a.getF72134a();
        ExchangeOrderInfo f72135b = tpslInputData.f96662a.getF72135b();
        if (f72134a.f72139c != hVar) {
            f72134a = (f72135b != null ? f72135b.f72139c : null) == hVar ? f72135b : null;
        }
        if (f72134a != null) {
            return f72134a.f72138b;
        }
        return null;
    }

    @Override // uxh.l
    public final n0i.a c3(Object obj2) {
        return new n0i.a(wd6.h.TAKE_PROFIT_STOP_LOSS, wd6.e.SELL, true, null);
    }

    @Override // uxh.l
    public final boolean d3() {
        return false;
    }

    @Override // uxh.l
    public final boolean e3() {
        return true;
    }
}
