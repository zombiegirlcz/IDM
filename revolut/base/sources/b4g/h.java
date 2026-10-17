package b4g;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import s7g.h2;
import yhm.m;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        j jVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = (h2) jVar.f12340c.T2("TRAVEL_FLIGHTS_BOOKINGS_STORAGE", wim.z.d(kotlin.jvm.internal.o0.b(h2.class)));
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (objA instanceof yhm.n) {
                    return null;
                }
                return objA;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.f12339b.remove("TRAVEL_FLIGHTS_BOOKINGS");
                try {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    jVar.f12340c.I0("TRAVEL_FLIGHTS_BOOKINGS_STORAGE");
                    break;
                } catch (Throwable th11) {
                    m.Companion companion4 = yhm.m.INSTANCE;
                    yhm.o.a(th11);
                }
                return Unit.f186387a;
        }
    }
}
