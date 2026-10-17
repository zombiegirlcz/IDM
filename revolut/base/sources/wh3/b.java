package wh3;

import ael.s;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutParams;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pi3.h;
import vx9.v;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CheckoutParams f297365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f297366x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, CheckoutParams checkoutParams, s sVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f297365w = checkoutParams;
        this.f297366x = sVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f297365w, this.f297366x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        CheckoutParams checkoutParams = this.f297365w;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            di3.k kVar = iVar.f297378l;
            AccountId f65852c = checkoutParams.getF65852c();
            this.u = 1;
            if (kVar.a(f65852c, checkoutParams, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        boolean z = checkoutParams instanceof CheckoutParams.CardOrder;
        s sVar = this.f297366x;
        if (z) {
            CheckoutParams.CardOrder cardOrder = (CheckoutParams.CardOrder) checkoutParams;
            h hVar = cardOrder.f65851b;
            if (hVar != null) {
                AccountId accountId = cardOrder.f65852c;
                v vVar = new v(iVar, 14, checkoutParams, sVar);
                iVar.getClass();
                iVar.T2(new h(0, iVar, accountId, hVar, vVar, (Continuation) null), new yi5.b(27));
            } else {
                iVar.getClass();
                iVar.T2(new d(iVar, cardOrder, null, sVar, null), new yi5.b(27));
            }
        } else {
            if (!(checkoutParams instanceof CheckoutParams.Plan)) {
                throw new NoWhenBranchMatchedException();
            }
            h hVar2 = ((CheckoutParams.Plan) checkoutParams).f65853a;
            iVar.getClass();
            iVar.T2(new h(0, iVar, AccountId.Personal.f51414a, hVar2, sVar, (Continuation) null), new yi5.b(27));
        }
        return Unit.f186387a;
    }
}
