package cab;

import cli.y;
import com.revolut.feature.retail.goals.impl.ui.GoalsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GoalsController f22578w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(GoalsController goalsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22578w = goalsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f22578w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f22578w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GoalsController goalsController = this.f22578w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE3 = goalsController.R2();
                Intrinsics.h(itemId);
                com.revolut.feature.retail.goals.impl.ui.a aVar2 = (com.revolut.feature.retail.goals.impl.ui.a) eVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("GOALS_REMOVE_LIST_ID")) {
                    aVar2.l2(new l(aVar2, null, 0), new bwc.i(1, aVar2, com.revolut.feature.retail.goals.impl.ui.a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 10));
                }
                break;
            default:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE32 = goalsController.R2();
                String amount = charSequence.toString();
                com.revolut.feature.retail.goals.impl.ui.a aVar4 = (com.revolut.feature.retail.goals.impl.ui.a) eVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                y yVar = aVar4.f82659w;
                aVar4.H2(yVar, new amh.n(amount, v.l(aVar4.f82656r.b(amount, ((f) zi0.c.I(((g) ((j2) yVar.f22677a).getValue()).f22584c)).f22581c.f306286a) == 0 ? urf.g.f282312a : null), 2));
                break;
        }
        return Unit.f186387a;
    }
}
