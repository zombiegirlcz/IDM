package aae;

import aw0.n6;
import com.revolut.feature.subscriptions.impl.edit_subscription_end_date.EditSubscriptionEndDateController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import lw0.l;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EditSubscriptionEndDateController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(EditSubscriptionEndDateController editSubscriptionEndDateController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = editSubscriptionEndDateController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.v, continuation, 0);
            default:
                return new a(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EditSubscriptionEndDateController editSubscriptionEndDateController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarM3 = editSubscriptionEndDateController.R2();
                hVarM3.l2(new a1a.a(hVarM3, ((c) ((j2) hVarM3.f2818r.f22677a).getValue()).f2805a, null, 26), new yi5.b(26));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarM32 = editSubscriptionEndDateController.R2();
                c cVar = (c) ((j2) hVarM32.f2818r.f22677a).getValue();
                hVarM32.l2(new a1a.b(hVarM32, cVar.f2805a, cVar.f2806b, null, 15), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
