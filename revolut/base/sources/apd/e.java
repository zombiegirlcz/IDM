package apd;

import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import r10.t;
import zh9.u0;
import zhm.h0;
import zod.i0;
import zod.l0;
import zod.n0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vf0.h hVar = (vf0.h) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        List list = (List) hVar.f288433a;
        List list2 = (List) hVar.f288434b;
        xi0.b bVar = (xi0.b) hVar.f288435c;
        if (((yld.c) hVar.d) != yld.c.LINE_CHART) {
            n0 n0Var = new n0(list, list2, bVar, i0.f323998a, l0.f324007a, NetWorthAccount.Personal.f87455a);
            od0.i.Companion.getClass();
            return new go.g(zi0.c.P(od0.h.a(n0Var), false, null, 3), 2);
        }
        f fVar = this.v;
        dsd.f fVar2 = fVar.f;
        t tVar = fVar.e;
        amd.a aVar2 = ((jte.d) fVar.i).c(AnalyticsFeatureApi$Toggles.AnalyticsNewTotalWealthWidget.f87387c) ? amd.a.MONTH : amd.a.YEAR;
        return rd0.e.e(nim.a.A(nim.a.v(u0.m(tVar.l(aVar2, fVar2.b(yld.g.ASSET)), cj9.c.y(tVar.l(aVar2, fVar2.b(yld.g.LIABILITY)))), new a5b.b(fVar, list, list2, bVar, aVar2)), new c(fVar, list, list2, bVar)), h0.f322473a, new a35.k(3, 14, null));
    }
}
