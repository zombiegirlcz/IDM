package r18;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.invest.smart_notifications.api.domain.AllInsightsNotificationsDestination;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l3d.h0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends a18.c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final List f250919r = v.k(x08.c.REV_INSIGHT, x08.c.PRICE_ALERT);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jt0.b f250920l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a18.e f250921m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final oih.j f250922n;
    public final h0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f250923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f250924q;

    public m(jt0.b feedInteractor, a18.e inputData, oih.j stocksAccountCommandProvider, h0 watchlistInteractor) {
        Intrinsics.checkNotNullParameter(feedInteractor, "feedInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksAccountCommandProvider, "stocksAccountCommandProvider");
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        this.f250920l = feedInteractor;
        this.f250921m = inputData;
        this.f250922n = stocksAccountCommandProvider;
        this.o = watchlistInteractor;
        this.f250923p = pyd.c.a(this, null);
        this.f250924q = q.c(inputData.f560a.getF76423a());
    }

    @Override // yji.n
    public final void D2() {
        yji.n.j2(this, this.o.f191909a.i, null, new g(this, null), 3);
    }

    @Override // yji.n
    public final void H2() {
        FeedFilter feedFilter = this.f250921m.f560a;
        Continuation continuation = null;
        if (feedFilter instanceof FeedFilter.ByAssetFilter) {
            yji.n.l2(this, q.Q(this.f250924q, new q7b.j(continuation, this, 28)), null, new qp7.g(this, continuation, 22), 3);
            return;
        }
        if (!(feedFilter instanceof FeedFilter.ByRef)) {
            throw new NoWhenBranchMatchedException();
        }
        FeedFilter.ByRef byRef = (FeedFilter.ByRef) feedFilter;
        String ref2 = byRef.f76424a;
        jt0.b bVar = this.f250920l;
        bVar.getClass();
        List feedElementTypes = f250919r;
        Intrinsics.checkNotNullParameter(feedElementTypes, "feedElementTypes");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.n.l2(this, nim.a.v(new n18.c(bVar.x0(feedElementTypes, ref2, null), bVar, 1), new qtb.c(byRef, 21)), null, new f(this, null), 3);
    }

    @Override // a18.c
    public final void Z2(FullScreenStateDelegate.Model model) {
        a18.a aVar;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.k;
        q18.g gVar = obj2 instanceof q18.g ? (q18.g) obj2 : null;
        int i = 29;
        if (Intrinsics.f(gVar, q18.d.f241404a)) {
            V2(new i(this, null), new yi5.b(i));
            return;
        }
        if (Intrinsics.f(gVar, q18.e.f241405a)) {
            V2(new k(this, null), new yi5.b(i));
            return;
        }
        if (!Intrinsics.f(gVar, q18.f.f241406a)) {
            if (gVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.f186387a;
        } else {
            Data data = (Data) ((j2) this.f250923p.f22677a).getValue();
            if (data == null || (aVar = (a18.a) data.getContent()) == null) {
                return;
            }
            V2(new l(aVar.f558b, this, null), new yi5.b(i));
        }
    }

    @Override // a18.c
    public final void b3(ListSubheaderDelegate.Model model) {
        a18.a aVar;
        Intrinsics.checkNotNullParameter(model, "model");
        Data data = (Data) ((j2) this.f250923p.f22677a).getValue();
        if (data == null || (aVar = (a18.a) data.getContent()) == null) {
            return;
        }
        A2(new AllInsightsNotificationsDestination(aVar.f558b));
    }

    @Override // a18.c
    public final void c3(Set selectedFilters) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        if (this.f250921m.f560a instanceof FeedFilter.ByAssetFilter) {
            this.f250924q.setValue(selectedFilters);
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f250923p;
    }
}
