package no;

import com.revolut.analytics.tracking.MissingScreenException;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.analytics.tracking.v3.l u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.google.protobuf.w0 f217833w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AnalyticsProduct f217834x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.revolut.analytics.tracking.v3.l lVar, boolean z, com.google.protobuf.w0 w0Var, AnalyticsProduct analyticsProduct, Continuation continuation) {
        super(2, continuation);
        this.u = lVar;
        this.v = z;
        this.f217833w = w0Var;
        this.f217834x = analyticsProduct;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q2(this.u, this.v, this.f217833w, this.f217834x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strB;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.analytics.tracking.v3.l lVar = this.u;
        Object objC = lVar.d.c();
        com.google.protobuf.w0 w0Var = this.f217833w;
        if (objC != null) {
            strB = lVar.e.e(objC).b();
        } else if (this.v) {
            strB = "launch";
        } else {
            strB = null;
            MissingScreenException missingScreenException = new MissingScreenException(w0Var != null ? w0Var.getClass().getSimpleName() : null);
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "SettingsTracker", null, missingScreenException, h0Var);
        }
        AnalyticsProduct analyticsProductE = this.f217834x;
        if (analyticsProductE == null) {
            analyticsProductE = ((uo.o) lVar.f).e(objC, null);
        }
        return new ho.l(strB, analyticsProductE, w0Var);
    }
}
