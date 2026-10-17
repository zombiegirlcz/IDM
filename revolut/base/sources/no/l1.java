package no;

import android.content.Intent;
import grl.m5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Intent f217812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m5 f217813x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Intent intent, m5 m5Var, Continuation continuation, m1 m1Var) {
        super(2, continuation);
        this.v = m1Var;
        this.f217812w = intent;
        this.f217813x = m5Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l1(this.f217812w, this.f217813x, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        m1 m1Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            com.revolut.analytics.tracking.v3.g gVar = new com.revolut.analytics.tracking.v3.g(this.f217812w, this.f217813x, null, m1Var);
            skm.p0 p0Var = skm.p0.f264001a;
            obj2 = skm.e0.J(zkm.o.f323119a.e, gVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ho.e eVar = (ho.e) obj2;
        if (eVar == null) {
            return Unit.f186387a;
        }
        ((ho.t) m1Var.e.get()).e2(eVar);
        return Unit.f186387a;
    }
}
