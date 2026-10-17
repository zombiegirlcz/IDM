package t5d;

import akg.n;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.shared.asset.trade.actions.ui.api.SwipeAssetTradeActionsApi$Toggles$SwipeActions;
import ib7.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.v;
import sx2.r;
import t3b.g;
import vkm.q;
import zhm.a0;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends o5d.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f268052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f268053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f268054n;

    public c(gte.a featureToggleInteractor, j swipeAssetTradeActionsStateProvider, e swipeAssetTradeActionsNavigationHandler) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsStateProvider, "swipeAssetTradeActionsStateProvider");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsNavigationHandler, "swipeAssetTradeActionsNavigationHandler");
        this.f268052l = featureToggleInteractor;
        this.f268053m = swipeAssetTradeActionsStateProvider;
        this.f268054n = swipeAssetTradeActionsNavigationHandler;
    }

    @Override // o5d.a
    public final Flow Z2(Flow swipeableAssetsFlow) {
        Intrinsics.checkNotNullParameter(swipeableAssetsFlow, "swipeableAssetsFlow");
        if (this.f268052l.a(SwipeAssetTradeActionsApi$Toggles$SwipeActions.f86033c)) {
            return zi0.c.i(new o5d.d(r0.g()));
        }
        v swipeableAssetsFlow2 = new v(swipeableAssetsFlow, this, 17);
        j jVar = this.f268053m;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(swipeableAssetsFlow2, "swipeableAssetsFlow");
        n nVarV = nim.a.v(swipeableAssetsFlow2, new g(20));
        g gVar = new g(21);
        pq0.d dVar = q.f290100b;
        return q.s(q.Q(q.s(nVarV, gVar, dVar), new s9b.n((Continuation) null, jVar, 22)), new g(22), dVar);
    }

    @Override // o5d.a
    public final void b3(vh clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        T2(new r(this, clickData, null, 14), new yi5.b(27));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Set c3() {
        ?? r06 = this.f268054n.f268055a;
        Collection collectionValues = r06.values();
        Collection collectionValues2 = r06.values();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = collectionValues2.iterator();
        while (it8.hasNext()) {
            a0.x(((p5d.d) it8.next()).Z2(), arrayList);
        }
        return d0.i1(d0.E0(arrayList, collectionValues));
    }
}
