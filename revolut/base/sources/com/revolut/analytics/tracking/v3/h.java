package com.revolut.analytics.tracking.v3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kp0.m;
import no.q1;
import no.r1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ r1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ txl.e f50328w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r1 r1Var, txl.e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = r1Var;
        this.f50328w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f50328w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            r1 r1Var = this.v;
            m mVar = new m(r1Var, this.f50328w, 17);
            this.u = 1;
            q1 q1Var = new q1(r1Var, mVar, null);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, q1Var, this);
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
        return Unit.f186387a;
    }
}
