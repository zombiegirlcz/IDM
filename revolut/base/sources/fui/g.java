package fui;

import a83.o0;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.api.AsftApi$Toggles$AsftAny2Any;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$CheckoutPrice;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData;
import cui.l;
import cui.s;
import fui.b;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import u6c.t;
import vkm.j2;
import w6c.k;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f138219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f138220m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f138221n;
    public o7.d o;

    public g(d checkoutRevPayInteractor, t productEntryPoint, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(checkoutRevPayInteractor, "checkoutRevPayInteractor");
        Intrinsics.checkNotNullParameter(productEntryPoint, "productEntryPoint");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f138219l = checkoutRevPayInteractor;
        this.f138220m = productEntryPoint;
        this.f138221n = featureToggleInteractor;
    }

    @Override // yji.n
    public final void D2() {
        if (((jte.d) this.f138221n).c(AsftApi$Toggles$AsftAny2Any.f98705c)) {
            Continuation continuation = null;
            n.j2(this, c8g.a.D(xam.a.h(new f(this, continuation, 0), nim.a.v(((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) e3().f222642b).z.B(new s(0)), new s(1)))), null, new f(this, continuation, 1), 3);
            n.j2(this, zi0.c.w(xam.a.h(new f(this, continuation, 2), new t38.e(((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) e3().f222642b).z.B(new s(2)), 24, nim.a.v(((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) e3().f222642b).z.B(new s(0)), new s(1)), new o0(3, 5, continuation)))), null, new f(this, continuation, 3), 3);
        }
    }

    @Override // fui.c
    public final ViewController Z2(CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData breakdownData) {
        Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
        Quote quote = breakdownData.f98827b.f98823a;
        if (quote == null) {
            throw new IllegalStateException("CheckoutRevPayControllerModelExtension: quote is missing when the exchange breakdown dialog is requested to be opened");
        }
        return o2(new k(new PaymentBreakdownControllerDescriptor$InputData(quote, breakdownData.f98827b.f98825c, w6c.j.EXCHANGE, new PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Default(breakdownData.f98826a, null))));
    }

    @Override // fui.c
    public final ViewController b3(dj0.d originalPrice) {
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        e eVar = (e) ((l) ((j2) ((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) e3().f222642b).z.f22677a).getValue()).f.getContent();
        ViewController viewControllerO2 = o2(new w6c.i(new PayWithAnyControllerDescriptor$InputData(this.f138220m, originalPrice, eVar != null ? eVar.f138217a : null, null, null, null, null, null, null, false, 2040)));
        fs2.k block = new fs2.k(this, 6);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        return viewControllerO2;
    }

    @Override // fui.c
    public final b c3() {
        e eVar = (e) ((l) ((j2) ((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) e3().f222642b).z.f22677a).getValue()).f.getContent();
        if (eVar == null) {
            throw new IllegalStateException("CheckoutRevPayControllerModelExtension: User pocket is missing in screen model state, can not proceed to purchase");
        }
        CheckoutRevPayControllerExtensionContract$CheckoutPrice checkoutRevPayControllerExtensionContract$CheckoutPrice = (CheckoutRevPayControllerExtensionContract$CheckoutPrice) ((l) ((j2) ((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) e3().f222642b).z.f22677a).getValue()).f109010g.getContent();
        if (checkoutRevPayControllerExtensionContract$CheckoutPrice == null) {
            throw new IllegalStateException("CheckoutRevPayControllerModelExtension: Checkout price is null in screen model state, can not proceed to purchase");
        }
        dj0.d dVar = checkoutRevPayControllerExtensionContract$CheckoutPrice.f98824b;
        return q.c(eVar, dVar) ? b.a.f138216a : new a(dVar);
    }

    @Override // fui.c
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
