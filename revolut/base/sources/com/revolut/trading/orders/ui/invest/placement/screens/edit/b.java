package com.revolut.trading.orders.ui.invest.placement.screens.edit;

import cli.y;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$ModalStep;
import cul.p0;
import e7l.g;
import gim.i;
import ijj.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.t0;
import w4l.h;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e eVar = this.v;
        y yVar = eVar.m0;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            ik3.c cVar = (ik3.c) eVar.f106920h0;
            cVar.getClass();
            g.b configType = g.b.f123407a;
            Intrinsics.checkNotNullParameter(configType, "configType");
            h loadingStrategy = h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            ik3.g gVar = (ik3.g) cVar.f161878a;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(configType, "configType");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            jhi.b bVarG = mo3.a.g(nim.a.u(new a2c.c(2, 28, null), u0.m(u0.i(rd0.e.b(nim.a.w(gVar.f161888g.d(configType, loadingStrategy), new p(9))), new t0(yVar.B(new p0(9)), 1), nim.a.v(e.Z2(eVar), new p0(10))), u0.m(new t0(yVar.B(new p0(11)), 1), eVar.T2()))), null, new ct6.o(18), 1);
            this.u = 1;
            obj2 = q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        oki.h.v2(eVar.f106922n0, (InvestOrderEditScreenContract$ModalStep.SourcePocketPicker) obj2, ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
