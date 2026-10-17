package h40;

import cli.y;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n30.x;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends oki.h implements b {
    public final n30.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f149264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final use.d f149265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mse.a f149266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f149267s;

    public n(n30.n chatInteractor, x chatPricingPlanInteractor, use.d ticketsInteractor, mse.a ticketsWidgetControllerExtension, cli.n mapper) {
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(chatPricingPlanInteractor, "chatPricingPlanInteractor");
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        Intrinsics.checkNotNullParameter(ticketsWidgetControllerExtension, "ticketsWidgetControllerExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = chatInteractor;
        this.f149264p = chatPricingPlanInteractor;
        this.f149265q = ticketsInteractor;
        this.f149266r = ticketsWidgetControllerExtension;
        this.f149267s = mra.d.b(this, new a(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null), mapper, null, true, 4);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, (j2) ((tse.i) this.f149266r).f274111q.f22677a, null, null, new m(this, continuation, 0), 3);
        yji.l.a1(this, rd0.e.b(this.f149264p.a()), null, null, new m(this, continuation, 1), 3);
        akg.n nVarV = nim.a.v(this.o.i(w4l.h.f294642c), new h3d.a(4));
        use.d dVar = this.f149265q;
        dVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        qse.i iVar = dVar.f282891a;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarFilter = iVar.f.e(Unit.f186387a, loadingStrategy).filter(new qsa.a(9, new qsa.p(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filterEmptyData(...)");
        yji.l.a1(this, u0.m(nVarV, xam.a.h(new m(this, continuation, 2), rd0.e.b(rVarFilter))), null, null, new m(this, continuation, 3), 3);
    }

    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj2 instanceof v30.y) {
            C1(new ChatFlowDestination(new ChatTarget.Messages(com.revolut.chat.domain.model.a.a((v30.y) obj2), null, null, 6), true));
        } else {
            this.f149266r.Z2(obj2, listId);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f149267s;
    }
}
