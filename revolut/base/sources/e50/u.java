package e50;

import com.revolut.chat.domain.model.ChatEntryPoint;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.chat.ui.inbox.InboxScreenContract$DomainState;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import n30.x;
import org.jetbrains.annotations.NotNull;
import v30.c0;
import v30.y;
import vkm.j2;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends oki.h implements m {

    @NotNull
    public static final r Companion = new r();
    public final n30.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f122698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final be7.k f122699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mse.a f122700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final use.d f122701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qf3.b f122702t;
    public final y40.a u;
    public final cli.h v;

    public u(n30.n chatInteractor, x chatPricingPlanInteractor, be7.k inAppCallsInteractor, mse.a ticketsWidgetControllerExtension, use.d ticketsInteractor, qf3.b chatDisclaimerProvider, y40.a inboxItemsExtension, q mapper) {
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(chatPricingPlanInteractor, "chatPricingPlanInteractor");
        Intrinsics.checkNotNullParameter(inAppCallsInteractor, "inAppCallsInteractor");
        Intrinsics.checkNotNullParameter(ticketsWidgetControllerExtension, "ticketsWidgetControllerExtension");
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        Intrinsics.checkNotNullParameter(chatDisclaimerProvider, "chatDisclaimerProvider");
        Intrinsics.checkNotNullParameter(inboxItemsExtension, "inboxItemsExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = chatInteractor;
        this.f122698p = chatPricingPlanInteractor;
        this.f122699q = inAppCallsInteractor;
        this.f122700r = ticketsWidgetControllerExtension;
        this.f122701s = ticketsInteractor;
        this.f122702t = chatDisclaimerProvider;
        this.u = inboxItemsExtension;
        Intrinsics.checkNotNullParameter("inbox_screen", "keyValue");
        this.v = mra.d.e(this, "inbox_screen", new InboxScreenContract$DomainState(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), false, false, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), mapper, null, 16);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, (j2) ((tse.i) this.f122700r).f274111q.f22677a, null, null, new s(this, continuation, 0), 3);
        y40.a aVar = this.u;
        yji.l.a1(this, aVar.b3(), null, null, new s(this, continuation, 1), 3);
        yji.l.a1(this, aVar.c3(), null, null, new s(this, continuation, 2), 3);
        qf3.b bVar = this.f122702t;
        yji.l.a1(this, new pkg.e(bVar.f245234a.j(null), bVar, 23), null, null, new s(this, continuation, 3), 3);
        yji.l.a1(this, rd0.e.b(this.f122698p.a()), null, null, new s(this, continuation, 4), 3);
    }

    public final void I2(Object obj2, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (!a0.H(itemId, "FEED_ITEM_ID_", false)) {
            if (this.u.Z2(obj2, itemId)) {
                return;
            }
            this.f122700r.Z2(obj2, itemId);
        } else if (obj2 instanceof y) {
            y yVar = (y) obj2;
            C1(new ChatFlowDestination(new ChatTarget.Messages(com.revolut.chat.domain.model.a.a(yVar), v30.t.INBOX, yVar.f285834b == c0.ASSISTANT ? new ChatEntryPoint("inbox") : null), true));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, this.o.i(w4l.i.f294643c), null, new s(this, continuation, 5), 3);
        qse.i iVar = this.f122701s.f282891a;
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarFilter = iVar.f.e(Unit.f186387a, loadingStrategy).filter(new qsa.a(9, new qsa.p(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filterEmptyData(...)");
        yji.l.b1(this, nim.a.v(rd0.e.b(rVarFilter), new urd.y(12)), null, new s(this, continuation, 6), 3);
        yji.l.b1(this, rd0.e.b(((com.revolut.feature.in_app_calls.b) this.f122699q).f74794b), null, new s(this, continuation, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
