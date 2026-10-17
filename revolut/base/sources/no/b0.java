package no;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class b0 extends gim.i implements Function2 {
    public com.revolut.analytics.tracking.v3.c u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kul.b f217733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.analytics.tracking.v3.c f217734x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f217735y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kul.b bVar, com.revolut.analytics.tracking.v3.c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f217733w = bVar;
        this.f217734x = cVar;
        this.f217735y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b0(this.f217733w, this.f217734x, this.f217735y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        com.revolut.analytics.tracking.v3.c cVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                kul.b bVar = this.f217733w;
                com.revolut.analytics.tracking.v3.c cVar2 = this.f217734x;
                String str = this.f217735y;
                com.google.protobuf.w0 w0Var = ((AnalyticsContext) bVar.invoke()).f50296a;
                this.u = cVar2;
                this.v = 1;
                com.revolut.analytics.tracking.v3.b bVar2 = new com.revolut.analytics.tracking.v3.b(cVar2, str, w0Var, null);
                skm.p0 p0Var = skm.p0.f264001a;
                obj2 = skm.e0.J(zkm.o.f323119a.e, bVar2, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                cVar = cVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = this.u;
                yhm.o.b(obj2);
            }
            ((ho.t) cVar.f50311a.get()).e2((ho.b) obj2);
            Unit unit = Unit.f186387a;
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        return Unit.f186387a;
    }
}
