package z25;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.tracking.v3.PayLaterCrossSellContext;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.y;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xi0.b f318963w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f318963w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, this.f318963w, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ai9.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ai9.c cVar = (ai9.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = this.v;
        j60.a aVar2 = gVar.f318965m;
        uj9.b bVar = gVar.f318964l;
        AnalyticsContext analyticsContext = null;
        BannerDelegate.Model modelA = cVar != null ? gVar.f318970s.a(cVar) : null;
        if (cVar != null) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            PayLaterCrossSellContext payLaterCrossSellContext = cVar.f;
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(payLaterCrossSellContext));
        }
        y yVarB = bVar.b(this.f318963w, modelA, analyticsContext);
        if (aVar2.j()) {
            aVar2.A(yVarB);
        } else {
            aVar2.x(yVarB);
        }
        return Unit.f186387a;
    }
}
