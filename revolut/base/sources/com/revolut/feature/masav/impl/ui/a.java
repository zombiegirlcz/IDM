package com.revolut.feature.masav.impl.ui;

import com.revolut.feature.masav.impl.model.DirectDebitData;
import com.revolut.feature.masav.impl.ui.MasavDirectDebitsFlowContract$Step;
import gim.i;
import io3.d;
import io3.j;
import io3.l;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rea.m;
import wsg.n;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ c u;
    public final /* synthetic */ DirectDebitData v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, DirectDebitData directDebitData, Continuation continuation) {
        super(1, continuation);
        this.u = cVar;
        this.v = directDebitData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.u;
        m mVar = cVar.f78107p;
        xi0.a aVar2 = xi0.b.Companion;
        aVar2.getClass();
        xi0.b bVar = xi0.b.f306283w;
        String ccy = bVar.f306286a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(ccy, "ccy");
        n nVar = mVar.f253579b;
        aVar2.getClass();
        d dVarB = osg.b.b(nVar, xi0.a.a(ccy), l.CURRENT, io3.i.INTERNAL, j.PERSONAL, 4);
        if (dVarB == null) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("No pocket for currency ", bVar.f306286a));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            h.D2(cVar.f78109r);
        } else {
            h.t2(cVar, cVar.f78109r, new MasavDirectDebitsFlowContract$Step.Review(this.v, dVarB), true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
