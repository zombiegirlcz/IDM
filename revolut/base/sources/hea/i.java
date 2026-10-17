package hea;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PocketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PocketDetailsScreen pocketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar2 = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) pVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        if (Intrinsics.f(str, "ID_ERROR_ITEM")) {
            aVar2.T.k(Unit.f186387a);
        } else if (Intrinsics.f(str, "ID_ITEM_EMPTY_STATE_ITEM")) {
            Object obj3 = model.k;
            Continuation continuation = null;
            dda.n nVar = obj3 instanceof dda.n ? (dda.n) obj3 : null;
            if (nVar != null) {
                dda.q qVar = nVar.f113190b;
                if (qVar instanceof dda.p) {
                    aVar2.C1(til.m.a(aVar2.K, new WorkflowConfiguration.CreateWorkflow(((dda.p) qVar).f113192a, null, 62), new r(aVar2, 0), 2));
                } else {
                    if (!(qVar instanceof dda.o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.n2(new h54.o(aVar2, ((dda.o) qVar).f113191a, continuation, 22), new whi.b(6));
                }
            }
        }
        return Unit.f186387a;
    }
}
