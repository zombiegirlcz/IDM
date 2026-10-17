package rkh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import jlh.p;
import jlh.r;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ybl.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ybl.g gVar = (ybl.g) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        p pVar = this.v.f254884b;
        boolean zC = gVar.c(cfl.p.BONDS, TradingAccountType.Gia.f105270a);
        boolean zA = gVar.a(v.k(cfl.p.PRIVATE_MARKETS, cfl.p.PRIVATE_BANK));
        ((jlh.v) pVar).getClass();
        Pair[] elements = {zA ? r.f175801l : r.k, r.e, r.f175798g, r.C, r.D, r.f175805q, r.z, r.A, zC ? r.f175797c : null, r.f175796b, zC ? r.f175800j : null, r.d, r.f175811y, r.f, r.f175808t, r.f175810x, r.f175809w, r.i, r.u, r.B, r.f175795a, r.E, r.f175799h, r.f175804p, r.v, r.f175807s, zC ? r.f175802m : null, zC ? r.o : null, zC ? r.f175803n : null, zC ? r.f175806r : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zi0.c.i(jlh.v.a(kotlin.collections.d.L(elements)));
    }
}
