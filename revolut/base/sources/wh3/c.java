package wh3;

import ael.s;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.checkout.models.PreorderPlanResult;
import com.revolut.feature.checkout.models.PreorderResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CheckoutParams.CardOrder f297367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PreorderPlanResult f297368x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f297369y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, CheckoutParams.CardOrder cardOrder, PreorderPlanResult preorderPlanResult, s sVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f297367w = cardOrder;
        this.f297368x = preorderPlanResult;
        this.f297369y = sVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f297367w, this.f297368x, this.f297369y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            di3.k kVar = this.v.f297378l;
            CheckoutParams.CardOrder cardOrder = this.f297367w;
            b93.f fVar = cardOrder.f65850a;
            AccountId accountId = cardOrder.f65852c;
            this.u = 1;
            obj2 = kVar.f(this.f297368x, fVar, accountId, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        this.f297369y.invoke((PreorderResult) obj2);
        return Unit.f186387a;
    }
}
