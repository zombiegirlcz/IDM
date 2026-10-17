package e94;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.hub.DebtsV2HubController;
import e94.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DebtsV2HubController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DebtsV2HubController debtsV2HubController, Continuation continuation) {
        super(2, continuation);
        this.v = debtsV2HubController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        Intrinsics.h(model);
        h hVar = (h) lVarE3;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (Intrinsics.f(model.f53228a, "LIST_ID_ADD_DEBT")) {
            hVar.C2(i.a.f123908a);
        } else if (obj3 instanceof qu3.e) {
            hVar.C2(new k((qu3.e) obj3));
        } else {
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
