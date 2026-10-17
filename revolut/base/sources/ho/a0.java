package ho;

import com.revolut.retail.analytics.tracking.impl.AnalyticsFeatureToggles;
import com.revolut.tracking.v3.AnalyticEvent;
import ho.n;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ b0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f154140w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = b0Var;
        this.f154140w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a0(this.v, this.f154140w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            no.q qVar = this.v.f154146c;
            n.a event = (n.a) this.f154140w;
            this.u = 1;
            no.z zVar = (no.z) qVar;
            jo.c cVar = zVar.f217884c;
            od0.a aVar2 = od0.a.f224253a;
            Object obj3 = od0.a.f224255c.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            String strA = ((od0.c) obj3) == od0.c.INDIA ? jo.c.a() : zVar.f217882a.b(jo.c.a());
            AnalyticEvent protoEvent = ((uo.h) zVar.f217886h).c(event);
            d0 d0Var = zVar.f;
            d0Var.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(protoEvent, "protoEvent");
            CopyOnWriteArrayList copyOnWriteArrayList = r.f154192a;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(protoEvent, "protoEvent");
            if (od0.a.e()) {
                r.f154192a.add(new Pair(event, protoEvent));
            }
            if (od0.a.e()) {
                d0Var.f154154a.k(event);
            }
            if (((jte.d) zVar.f217883b.f98545a).c(AnalyticsFeatureToggles.AnalyticsDebugLogging.f98540a)) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "AqueductRepository", "Tracking " + protoEvent + " in " + strA, null, null, 16);
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "AqueductRepository", a0.d.s("Tracking ", protoEvent.getId(), " in ", strA), null, null, 16);
            }
            zVar.d(strA, event, protoEvent);
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
