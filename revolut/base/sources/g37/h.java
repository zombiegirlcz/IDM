package g37;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.TaxHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TaxHubScreen taxHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.R2();
        Object obj3 = model.k;
        com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e eVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e) rVarE3;
        eVar.getClass();
        if (Intrinsics.f(obj3, j37.c.f170980a)) {
            eVar.f74295w.a();
        } else if (Intrinsics.f(obj3, j37.d.f170981a)) {
            eVar.I2();
        } else if (Intrinsics.f(obj3, j37.g.f170983a)) {
            eVar.f74296x.a();
        }
        return Unit.f186387a;
    }
}
