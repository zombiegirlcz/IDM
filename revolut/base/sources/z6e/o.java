package z6e;

import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountId f319752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f319753x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ProductAccountId productAccountId, r rVar, Continuation continuation) {
        super(2, continuation);
        this.f319752w = productAccountId;
        this.f319753x = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.f319752w, this.f319753x, continuation);
        oVar.v = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((Subaccount) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Subaccount subaccount = (Subaccount) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (subaccount.b()) {
                return new go.g(new Data(null, new ProductAccountNotFoundException(p.a.p("Product account with id:", this.f319752w.f89729a, " is inactive")), false, 5, null), 2);
            }
            x6e.i iVar = this.f319753x.f319758b;
            this.v = null;
            this.u = 1;
            obj2 = ((x6e.o) iVar).a(subaccount, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return (Flow) obj2;
    }
}
