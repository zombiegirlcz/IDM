package mhd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mhd.q;
import n33.v0;
import vkm.v1;
import zh9.u0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 extends jki.g implements r {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WatchlistHomeScreenContract$InputData f205505p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rfd.a f205506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n3d.c f205507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ohd.a f205508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o5d.a f205509t;
    public final ifd.h u;
    public final n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p stateMapper, WatchlistHomeScreenContract$InputData inputData, rfd.a watchlistContentExtension, n3d.c watchlistFooterDelegate, ohd.a appTipsExtension, o5d.a swipeAssetTradeActionsExtension, ifd.h watchlistMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(watchlistContentExtension, "watchlistContentExtension");
        Intrinsics.checkNotNullParameter(watchlistFooterDelegate, "watchlistFooterDelegate");
        Intrinsics.checkNotNullParameter(appTipsExtension, "appTipsExtension");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsExtension, "swipeAssetTradeActionsExtension");
        Intrinsics.checkNotNullParameter(watchlistMapper, "watchlistMapper");
        this.f205505p = inputData;
        this.f205506q = watchlistContentExtension;
        this.f205507r = watchlistFooterDelegate;
        this.f205508s = appTipsExtension;
        this.f205509t = swipeAssetTradeActionsExtension;
        this.u = watchlistMapper;
        this.v = new n(inputData.f86975c, 95);
    }

    @Override // yji.l
    public final void T1(long j2) {
        ohd.a aVar = this.f205508s;
        dte.b bVar = aVar.f225349m;
        aVar.f225350n.getClass();
        w2d.a.a();
        dte.f fVar = (dte.f) bVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter("WATCHLIST_TIPS_HOST_ID", "$v$c$com-revolut-feature-tips-domain-model-AppTipsHostScreenId$-appTipsHostScreenId$0");
        zq.a aVar2 = fVar.f117439n;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter("WATCHLIST_TIPS_HOST_ID", "$v$c$com-revolut-feature-tips-domain-model-AppTipsHostScreenId$-appTipsHostScreenId$0");
        ate.e eVar = (ate.e) aVar2.f324335b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter("WATCHLIST_TIPS_HOST_ID", "$v$c$com-revolut-feature-tips-domain-model-AppTipsHostScreenId$-screen$0");
        yji.l.b1(this, rd0.e.e(new cqh.m(new v1(new ald.l(eVar, null, 12)), aVar2, 15), zhm.h0.f322473a, new c9k.k(3, 17, null)), null, new g0(this, null, 3), 3);
        yji.l.b1(this, this.f205506q.c3(), null, new g0(this, null, 2), 3);
        Set typeKeys = this.f205505p.f86973a.f86890b;
        n3d.c cVar = this.f205507r;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(typeKeys, "typeKeys");
        Set<FavouritesAssetTypeKey> setC = cVar.c(typeKeys);
        ArrayList arrayList = new ArrayList();
        for (FavouritesAssetTypeKey favouritesAssetTypeKey : setC) {
            x3d.b bVar2 = (x3d.b) cVar.f211983c.get(favouritesAssetTypeKey);
            akg.n nVarV = bVar2 != null ? nim.a.v(bVar2.e(), new l2d.c(favouritesAssetTypeKey, 1)) : null;
            if (nVarV != null) {
                arrayList.add(nVarV);
            }
        }
        List listN = c6d.b.N(arrayList);
        yji.l.b1(this, listN == null ? new go.g(zi0.c.P(r0.g(), false, null, 3), 2) : nim.a.v(u0.k(listN), new v0(9)), null, new g0(this, null, 0), 3);
        yji.l.b1(this, this.f205509t.Z2(new a07.p(nim.a.v(new lfg.d0(q2(), 9), new m98.k(this, 22)), 25)), null, new g0(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final void y2(com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C0546a) {
            v2(q.a.f205525a);
            return;
        }
        if (event instanceof a.b) {
            u2();
            return;
        }
        boolean z = event instanceof t;
        rfd.a aVar = this.f205506q;
        if (z) {
            t tVar = (t) event;
            aVar.b3(((n) t2()).f205516b.size() + 1, tVar.f205533a, tVar.f205534b);
            return;
        }
        if (event instanceof w) {
            aii.u uVarA = this.f205507r.a(((w) event).f205537a);
            if (uVarA != null) {
                C1(uVarA);
                return;
            }
            return;
        }
        if (event instanceof a.c) {
            x2(new mh4.x(7));
            n2(new mci.e(this, null, 4), new whi.b(6));
            aVar.h3();
            return;
        }
        if (event instanceof s) {
            String str = ((s) event).f205532a;
            if (aVar.Z2()) {
                x2(new lu6.p(str, 18));
                return;
            }
            return;
        }
        if (event instanceof u) {
            x2(new lu6.p(((u) event).f205535a, 17));
            return;
        }
        if (!(event instanceof v)) {
            if (!(event instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.g3();
        } else {
            boolean z3 = ((v) event).f205536a;
            if (this.f205505p.f86975c) {
                u2();
            } else {
                x2(new lph.c(z3, 9));
            }
        }
    }
}
