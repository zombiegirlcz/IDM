package iwk;

import a08.o0;
import ael.t0;
import au6.k0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stats.DetailedStatsScreenContract$Configuration;
import efm.r;
import ip0.yc0;
import is2.t;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends pri.a {
    public final DetailedStatsScreenContract$Configuration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xrk.h f169196j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o9h.e f169197l;

    public p(DetailedStatsScreenContract$Configuration configuration, xrk.h presentationModel, ArrayList statsDelegates, o9h.e footerDisclosureDelegate) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(statsDelegates, "statsDelegates");
        Intrinsics.checkNotNullParameter(footerDisclosureDelegate, "footerDisclosureDelegate");
        this.i = configuration;
        this.f169196j = presentationModel;
        this.k = statsDelegates;
        this.f169197l = footerDisclosureDelegate;
        ArrayList arrayListF0 = d0.F0(footerDisclosureDelegate, statsDelegates);
        Intrinsics.checkNotNullParameter(arrayListF0, "<set-?>");
        this.f239030h = arrayListF0;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        m view = (m) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        DetailedStatsScreenContract$Configuration detailedStatsScreenContract$Configuration = this.i;
        String ref2 = detailedStatsScreenContract$Configuration.f104046b.f214596b;
        xrk.h hVar = this.f169196j;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        xrk.k kVar = (xrk.k) hVar.f308363b;
        if (!kVar.w0().isInitialized()) {
            kVar.w0().set(ref2);
        }
        int i = 24;
        sfm.b bVar = new sfm.b(((t0) hVar.f).g(), new ivb.i(new t(this, i), 3), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            int i2 = 5;
            if (!it8.hasNext()) {
                r rVarW = te0.w.w(arrayList2);
                o oVar = o.f;
                r map = rVarW.map(new h35.c(24));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                r map2 = te0.w.l(map, bVar).map(new ivb.i(new b(2), 4));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                r map3 = o70.a.f(map2).map(new ivb.i(new yc0(1, view, m.class, "setItems", "setItems(Ljava/util/List;)V", 0, 2), 5));
                Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                Function1 function1K = K();
                Function0 function0J = J();
                r rVarOnErrorResumeNext = map3.onErrorResumeNext(new f61.a(new i2i.d0(new BreadcrumbException(), i)));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(24, n.f169195a), new o0(24, function1K), new ea9.c(28, function0J));
                te0.w.j0(this.f239031a, cVarSubscribe);
                Intrinsics.h(cVarSubscribe);
                return;
            }
            l lVar = (l) it8.next();
            nel.n instrument = detailedStatsScreenContract$Configuration.f104046b;
            e eVar = (e) lVar;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            xrk.h hVar2 = eVar.k;
            hVar2.getClass();
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            arrayList2.add(m70.a.f(rd0.e.c(hVar2.e.a(instrument, w4l.h.f294642c), kotlin.coroutines.g.f186406a), new igh.o(eVar, 22), new iui.b(19), new k0(eVar, i2)));
        }
    }
}
