package com.revolut.feature.apm.payto.impl.screen.topup.flow;

import com.revolut.feature.apm.payto.impl.screen.topup.flow.PayToTopupFlowContract$Step;
import dj0.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import skm.e0;
import skm.p0;
import vb2.f;
import wo2.l;
import xg6.b0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f62762w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f62762w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f62762w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        f fVar = this.f62762w;
        if (i == 0) {
            o.b(obj2);
            b0 b0Var = bVar.f62763p;
            String str = fVar.f287363a;
            d dVar = bVar.o.f62759a;
            this.u = 1;
            b0Var.getClass();
            l lVar = new l(b0Var, str, dVar, null, 9);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, lVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(bVar, bVar.f62764q, new PayToTopupFlowContract$Step.CompleteAuthorization(fVar.f287363a), true, null, false, 12);
        return Unit.f186387a;
    }
}
