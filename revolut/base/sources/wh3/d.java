package wh3;

import ael.s;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.checkout.models.PreorderPlanResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CheckoutParams.CardOrder f297370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PreorderPlanResult f297371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f297372y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, CheckoutParams.CardOrder cardOrder, PreorderPlanResult preorderPlanResult, s sVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f297370w = cardOrder;
        this.f297371x = preorderPlanResult;
        this.f297372y = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f297370w, this.f297371x, this.f297372y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            s sVar = this.f297372y;
            i iVar = this.v;
            c cVar = new c(iVar, this.f297370w, this.f297371x, sVar, null);
            this.u = 1;
            if (iVar.Y2(this, cVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
