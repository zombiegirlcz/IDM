package gxi;

import a83.o0;
import axi.l;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.api.AirportLoungesApi$Toggles;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$CheckoutPrice;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData;
import gxi.b;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import u6c.t;
import vkm.j2;
import w6c.k;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f147750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f147751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f147752n;
    public o7.d o;

    public g(d checkoutRevPayInteractor, t productEntryPoint, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(checkoutRevPayInteractor, "checkoutRevPayInteractor");
        Intrinsics.checkNotNullParameter(productEntryPoint, "productEntryPoint");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f147750l = checkoutRevPayInteractor;
        this.f147751m = productEntryPoint;
        this.f147752n = featureToggleInteractor;
    }

    @Override // yji.n
    public final void D2() {
        if (((jte.d) this.f147752n).c(AirportLoungesApi$Toggles.AirportLoungesAny2Any.f98909c)) {
            Continuation continuation = null;
            n.j2(this, c8g.a.D(xam.a.h(new f(this, continuation, 0), nim.a.v(((com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) e3().f222642b).D.B(new ax9.a(9)), new ax9.a(10)))), null, new f(this, continuation, 1), 3);
            n.j2(this, zi0.c.w(xam.a.h(new f(this, continuation, 2), new t38.e(((com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) e3().f222642b).D.B(new ax9.a(8)), 24, nim.a.v(((com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) e3().f222642b).D.B(new ax9.a(9)), new ax9.a(10)), new o0(3, 7, null)))), null, new f(this, continuation, 3), 3);
        }
    }

    @Override // gxi.c
    public final ViewController Z2(CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData breakdownData) {
        Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
        Quote quote = breakdownData.f99072b.f99068a;
        if (quote == null) {
            throw new IllegalStateException("CheckoutRevPayControllerModelExtension: quote is missing when the exchange breakdown dialog is requested to be opened");
        }
        return o2(new k(new PaymentBreakdownControllerDescriptor$InputData(quote, breakdownData.f99072b.f99070c, w6c.j.EXCHANGE, new PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Default(breakdownData.f99071a, null))));
    }

    @Override // gxi.c
    public final ViewController b3(dj0.d originalPrice) {
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        e eVar = (e) ((l) ((j2) ((com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) e3().f222642b).D.f22677a).getValue()).f10955h.getContent();
        ViewController viewControllerO2 = o2(new w6c.i(new PayWithAnyControllerDescriptor$InputData(this.f147751m, originalPrice, eVar != null ? eVar.f147748a : null, null, null, null, null, null, null, false, 2040)));
        gwe.d block = new gwe.d(this, 5);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        return viewControllerO2;
    }

    @Override // gxi.c
    public final b c3() {
        e eVar = (e) ((l) ((j2) ((com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) e3().f222642b).D.f22677a).getValue()).f10955h.getContent();
        if (eVar == null) {
            throw new IllegalStateException("CheckoutRevPayControllerModelExtension: User pocket is missing in screen model state, can not proceed to purchase");
        }
        CheckoutRevPayControllerExtensionContract$CheckoutPrice checkoutRevPayControllerExtensionContract$CheckoutPrice = (CheckoutRevPayControllerExtensionContract$CheckoutPrice) ((l) ((j2) ((com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) e3().f222642b).D.f22677a).getValue()).i.getContent();
        if (checkoutRevPayControllerExtensionContract$CheckoutPrice == null) {
            throw new IllegalStateException("CheckoutRevPayControllerModelExtension: Checkout price is null in screen model state, can not proceed to purchase");
        }
        dj0.d dVar = checkoutRevPayControllerExtensionContract$CheckoutPrice.f99069b;
        return s.c(eVar, dVar) ? b.a.f147747a : new a(dVar);
    }

    @Override // gxi.c
    public final void d3(o7.d stateDelegate) {
        Intrinsics.checkNotNullParameter(stateDelegate, "stateDelegate");
        this.o = stateDelegate;
    }

    public final o7.d e3() {
        o7.d dVar = this.o;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("StateDelegate must be set in ControllerModel#onCreated");
    }
}
