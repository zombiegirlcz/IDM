package w38;

import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProductAccountId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f294195w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ProductAccountId productAccountId, p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = productAccountId;
        this.f294195w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, this.f294195w, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((v38.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        v38.c cVar = (v38.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = cVar instanceof v38.a;
        ProductAccountId productAccountId = this.v;
        if (!z) {
            return new go.g(zi0.c.O(new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId.f89729a, " cannot be found in the Bereavement product!"))), 2);
        }
        n38.a aVar2 = ((v38.a) cVar).f285854a;
        p pVar = this.f294195w;
        return rd0.e.b(nim.a.w(((r38.l) pVar.f294201a).e(l38.a.c(aVar2), w4l.h.f294642c), new cia.b(productAccountId, pVar, 7)));
    }
}
