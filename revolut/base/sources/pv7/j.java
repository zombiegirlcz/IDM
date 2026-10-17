package pv7;

import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InsuranceDetailsLayoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = insuranceDetailsLayoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((HighlightTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HighlightTileDelegate.Model model = (HighlightTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.d();
        com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b bVar = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b) qVarE3;
        bVar.J2(model.i, model.f52438a);
        return Unit.f186387a;
    }
}
