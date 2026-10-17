package no;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class g2 extends gim.i implements Function2 {
    public final /* synthetic */ i2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(i2 i2Var, Continuation continuation) {
        super(2, continuation);
        this.u = i2Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g2(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i2 i2Var = this.u;
        Object objC = i2Var.f217793b.c();
        AnalyticsContext u = null;
        String str = objC != null ? i2Var.f217794c.e(objC).f281496a : null;
        AnalyticsProduct analyticsProductE = ((uo.o) i2Var.d).e(objC, null);
        try {
            k kVar = objC instanceof k ? (k) objC : null;
            if (kVar != null) {
                u = kVar.getL();
            }
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        return new ho.j(str, analyticsProductE, u);
    }
}
