package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results;

import cli.y;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.a;
import gim.i;
import hfg.k0;
import hfg.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb0.b0;
import lfg.g0;
import nhg.f0;
import skm.p0;
import vfg.r;
import vkm.j2;
import vkm.q;
import vkm.v1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f fVar = this.v;
        y yVar = fVar.u;
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean zD = iVar.d();
        a.b bVar = a.b.f94319a;
        if (zD && ((b) ((j2) yVar.f22677a).getValue()).f94326h.equals(bVar)) {
            fVar.H2(yVar, new f0(0));
            l request = new l(((k0) iVar.c()).f151859a, ((k0) iVar.c()).f151860b);
            r rVar = fVar.f94331q;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            g0 g0Var = rVar.f288635a;
            Intrinsics.checkNotNullParameter(request, "request");
            Continuation continuation = null;
            vkm.y yVar2 = new vkm.y(new v1(new b0(request, g0Var, continuation, 10)), new im2.b(3, 13, continuation));
            p0 p0Var = p0.f264001a;
            yji.l.a1(fVar, q.C(yVar2, elm.f.f127540b), new d(fVar, null), null, new e(fVar, null), 2);
        } else if (!iVar.d() && ((b) ((j2) yVar.f22677a).getValue()).f94326h.equals(bVar)) {
            fVar.H2(yVar, new f0(1));
        }
        return Unit.f186387a;
    }
}
