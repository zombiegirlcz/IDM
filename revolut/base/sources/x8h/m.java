package x8h;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements tzg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.i f303361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f303362b;

    public m(ybl.i productGroupAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        this.f303361a = productGroupAvailabilityInteractor;
        TradingProductCode[] elements = {TradingProductCode.EUEtcs.f105287a, TradingProductCode.GBEtcs.f105292a, TradingProductCode.EUEtns.f105288a, TradingProductCode.GBEtns.f105293a, TradingProductCode.EUCryptoEtns.f105286a, TradingProductCode.GBCryptoEtns.f105291a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f303362b = kotlin.collections.d.y0(elements);
    }

    public final jhi.b a() {
        return mo3.a.e(b(), new zk1.p(12), new x48.a(14));
    }

    public final cxe.u b() {
        return nim.a.A(nim.a.v(((ael.h0) this.f303361a).b(cfl.p.ETF), new d(this, 5)), new h(1));
    }
}
