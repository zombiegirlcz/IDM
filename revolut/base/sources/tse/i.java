package tse;

import com.revolut.data.model.Data;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import com.revolut.feature.tickets.api.extensions.TicketsWidgetContract$State;
import ep6.n;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import skm.a2;
import tna.p;
import tpl.o;
import vkm.j2;
import vkm.q;
import vkm.t0;
import vkm.z1;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends mse.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p3c.a f274107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final use.d f274108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y9l.a f274109n;
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f274110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vki.a f274111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f274112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f274113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f274114t;
    public a2 u;

    public i(p3c.a widgetInteractor, use.d ticketsInteractor, y9l.a actionControllerExtension, n feedbackExtension, boolean z, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(widgetInteractor, "widgetInteractor");
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        Intrinsics.checkNotNullParameter(actionControllerExtension, "actionControllerExtension");
        Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        this.f274107l = widgetInteractor;
        this.f274108m = ticketsInteractor;
        this.f274109n = actionControllerExtension;
        this.o = feedbackExtension;
        this.f274110p = z;
        this.f274111q = pyd.c.a(this, new Data(z ? null : new TicketsWidgetContract$State(r0.g(), null, null), null, z, 2, null));
        this.f274112r = new vii.b(loadingStrategy);
        this.f274113s = q.b(0, 7, null);
        this.f274114t = q.b(0, 6, null);
    }

    public static final boolean c3(i iVar, String str) {
        Map map;
        Set setKeySet;
        TicketsWidgetContract$State ticketsWidgetContract$State = (TicketsWidgetContract$State) ((Data) ((j2) iVar.f274111q.f22677a).getValue()).getContent();
        return pd.b.j((ticketsWidgetContract$State == null || (map = ticketsWidgetContract$State.f90444a) == null || (setKeySet = map.keySet()) == null) ? null : Boolean.valueOf(setKeySet.contains(str)));
    }

    @Override // yji.n
    public final void D2() {
        if (this.f274110p) {
            Continuation continuation = null;
            yji.n.j2(this, new c(new t0(this.f274109n.b3(), 1), this, 1), null, new tqh.j(this, continuation, 7), 3);
            yji.n.j2(this, q.q(this.f274114t), null, new tk5.c(this, continuation, 12), 3);
        }
    }

    @Override // yji.n
    public final void H2() {
        if (this.f274110p) {
            Continuation continuation = null;
            wkm.l lVarQ = q.Q(this.f274112r, new tik.b(continuation, this.f274107l, 7));
            o block = new o(this, 11);
            Intrinsics.checkNotNullParameter(lVarQ, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            yji.n.l2(this, c6d.b.i(q.r(new tq0.j(12), lVarQ), block), null, new p(this, continuation, 8), 3);
        }
    }

    @Override // mse.a
    public final boolean Z2(Object obj2, String listId) {
        String str;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "TICKETS_LIST_ERROR_ID")) {
            this.f274112r.a();
            return true;
        }
        Continuation continuation = null;
        if (a0.H(listId, "DETAILED_TICKET_ERROR_ID_", false)) {
            pse.a aVar = obj2 instanceof pse.a ? (pse.a) obj2 : null;
            if (aVar != null && (str = aVar.f239483a) != null) {
                V2(new h(this, str, null, 1), new yi5.b(29));
                return true;
            }
        } else {
            if (obj2 instanceof pse.a) {
                String str2 = ((pse.a) obj2).f239483a;
                vki.a aVar2 = this.f274111q;
                TicketsWidgetContract$State ticketsWidgetContract$State = (TicketsWidgetContract$State) ((Data) ((j2) aVar2.f22677a).getValue()).getContent();
                if (Intrinsics.f(ticketsWidgetContract$State != null ? ticketsWidgetContract$State.f90445b : null, str2)) {
                    X2(aVar2, new tpi.g(26));
                    return true;
                }
                X2(aVar2, new te8.a(str2, 15));
                V2(new d(this, str2, continuation, 2), new yi5.b(29));
                a2 a2Var = this.u;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                this.u = V2(new d(this, str2, continuation, 1), new yi5.b(29));
                return true;
            }
            if (obj2 instanceof FincrimeHomeScreenAction) {
                this.f274109n.Z2((FincrimeHomeScreenAction) obj2);
                return true;
            }
        }
        return false;
    }

    @Override // mse.a
    public final void b3(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        V2(new h(this, listId, null, 0), new yi5.b(29));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f274111q;
    }
}
