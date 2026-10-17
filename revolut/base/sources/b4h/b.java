package b4h;

import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import e7l.f;
import gim.i;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vrl.m;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f12373w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xi0.b bVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f12373w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f12373w, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f fVar = (f) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        LinkedHashSet linkedHashSet = fVar.M;
        xi0.b bVar = this.v;
        if (!linkedHashSet.contains(bVar.f306286a) && !fVar.T.contains(bVar)) {
            return zi0.c.i(z2h.e.f319085a);
        }
        c cVar = this.f12373w;
        return nim.a.v(((m) cVar.f12374a).f(new InvestOrdersParams.OrdersByCurrency(bVar, null, null, 26), w4l.i.f294643c), new as9.a(cVar, bVar, 28));
    }
}
