package cui;

import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreenContract$ModalStep;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AsftCheckoutScreen f109006w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AsftCheckoutScreen asftCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109006w = asftCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f109006w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f109006w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AsftCheckoutScreen asftCheckoutScreen = this.f109006w;
        switch (i) {
            case 0:
                CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData breakdownData = (CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b bVar = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) asftCheckoutScreen.d();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
                oki.h.v2(bVar.A, new AsftCheckoutScreenContract$ModalStep.ExchangeBreakdown(breakdownData), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = asftCheckoutScreen.d();
                Intrinsics.h(clickData);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b bVar2 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) oVarE3;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof HyperTextClickData) {
                    HyperTextTarget hyperTextTarget = ((HyperTextClickData) obj3).f74762a;
                    if (hyperTextTarget instanceof HyperTextTarget.Link) {
                        x xVar = bVar2.f98811p;
                        String str = ((HyperTextTarget.Link) hyperTextTarget).f74757a;
                        Continuation continuation = null;
                        if (xVar.y1(str)) {
                            bVar2.l2(new cn0.d(bVar2, hyperTextTarget, continuation, 13), new yi5.b(26));
                        } else {
                            bVar2.C1(new ExternalDestination.Browser(str, null));
                        }
                    }
                } else {
                    r6.b.D("Parcel must be HyperTextClickData");
                }
                break;
        }
        return Unit.f186387a;
    }
}
