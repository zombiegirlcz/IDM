package no;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class q1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ r1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function2 f217832w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.v = r1Var;
        this.f217832w = function2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q1(this.v, this.f217832w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        r1 r1Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            nfj.j2 j2Var = new nfj.j2(r1Var, null, 18);
            skm.p0 p0Var = skm.p0.f264001a;
            tkm.e eVar = zkm.o.f323119a.e;
            this.u = 1;
            obj2 = skm.e0.J(eVar, j2Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Pair pair = (Pair) obj2;
        ((ho.t) r1Var.f217836a.get()).e2((ho.n) this.f217832w.invoke((String) pair.f186385a, (AnalyticsProduct) pair.f186386b));
        return Unit.f186387a;
    }
}
