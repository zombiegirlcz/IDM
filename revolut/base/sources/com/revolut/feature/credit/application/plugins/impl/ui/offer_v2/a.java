package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext;
import cv3.b0;
import cv3.y;
import cv3.z;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mf4.a0;
import mf4.h0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f68116w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a aVar, g gVar, String str, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
        this.v = gVar;
        this.f68116w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, this.v, this.f68116w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        z zVar = b0.Companion;
        nf4.f fVar = (nf4.f) this.u;
        String str = fVar.f214807a;
        zVar.getClass();
        y yVarA = z.a(str);
        int i = yVarA == null ? -1 : h0.f204860a[yVarA.ordinal()];
        g gVar = this.v;
        if (i == 1) {
            b0 b0Var = ((a0) gVar.f68151q).f204836g;
            fu3.c cVar = b0Var != null ? b0Var.e : null;
            if (cVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            j60.a aVar2 = gVar.f68153s;
            gVar.f68152r.getClass();
            aVar2.x(f64.a.a(cVar));
        } else if (i != 2) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "OfferV2FlowModel.kt", a0.d.r(fVar.f214807a, " is not supported for Calculator"), null, h0Var);
        } else {
            g.P2(gVar, new OfferV2FlowContract$OfferUpdateContext.Calculator(this.f68116w));
        }
        return Unit.f186387a;
    }
}
