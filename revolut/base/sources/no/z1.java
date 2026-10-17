package no;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class z1 extends gim.i implements Function2 {
    public uo.o0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.analytics.tracking.v3.k f217893w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f217894x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AnalyticsContext f217895y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.revolut.analytics.tracking.v3.k kVar, Object obj2, AnalyticsContext analyticsContext, Continuation continuation) {
        super(2, continuation);
        this.f217893w = kVar;
        this.f217894x = obj2;
        this.f217895y = analyticsContext;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z1(this.f217893w, this.f217894x, this.f217895y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        uo.o0 o0Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        Object obj3 = this.f217894x;
        com.revolut.analytics.tracking.v3.k kVar = this.f217893w;
        if (i == 0) {
            yhm.o.b(obj2);
            uo.o0 o0VarE = kVar.f50337c.e(obj3);
            mo.c cVar = kVar.f50335a;
            Class<?> cls = obj3.getClass();
            String str = o0VarE.f281497b;
            this.u = o0VarE;
            this.v = 1;
            Object objA = cVar.a(cls, str, this);
            if (objA == aVar) {
                return aVar;
            }
            o0Var = o0VarE;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0Var = this.u;
            yhm.o.b(obj2);
        }
        mo.e eVar = (mo.e) obj2;
        return new ho.h(o0Var.f281496a, ((uo.o) kVar.f50336b).e(obj3, null), this.f217895y, com.revolut.analytics.tracking.v3.k.a(kVar, obj3), eVar);
    }
}
