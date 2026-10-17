package dmb;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.PickYourRateScreen;
import dcl.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PickYourRateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PickYourRateScreen pickYourRateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pickYourRateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        RowDelegate.Model model2 = (RowDelegate.Model) model.f53305b;
        o oVar = (o) iVarE3;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model2, "model");
        y yVar = oVar.u;
        f fVar = (f) ((g) ((j2) yVar.f22677a).getValue()).f115880a.getContent();
        if (fVar != null) {
            oVar.H2(yVar, new m0(fVar, model2, 27));
        }
        return Unit.f186387a;
    }
}
