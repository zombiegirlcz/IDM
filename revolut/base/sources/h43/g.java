package h43;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreen;
import h93.f0;
import ip0.qd0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ChooserScreen chooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        qd0 currentSelectedState = model.f53306c;
        RowDelegate.Model model2 = (RowDelegate.Model) model.f53305b;
        s sVar = (s) oVarE3;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(currentSelectedState, "currentSelectedState");
        Intrinsics.checkNotNullParameter(model2, "model");
        Object obj3 = model2.u;
        if (obj3 instanceof f0) {
            sVar.H2(sVar.B, new gvi.s(obj3, currentSelectedState, 19));
        }
        return Unit.f186387a;
    }
}
