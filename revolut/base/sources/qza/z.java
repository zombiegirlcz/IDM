package qza;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesActivity;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class z extends bsi.a implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f250487j;
    public final RemoteStoriesContract$Config k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f250488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tri.c f250489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sri.m f250490n;
    public boolean o;

    public z(d presentationModel, RemoteStoriesContract$Config config, f router, tri.c backButton, sri.m navigator) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f250487j = presentationModel;
        this.k = config;
        this.f250488l = router;
        this.f250489m = backButton;
        this.f250490n = navigator;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        i view = (i) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Object obj2 = this.f250487j;
        ((nri.a) obj2).init();
        com.revolut.feature.remote_stories.impl.ui.b bVar = (com.revolut.feature.remote_stories.impl.ui.b) obj2;
        bVar.getClass();
        RemoteStoriesContract$Config config = this.k;
        Intrinsics.checkNotNullParameter(config, "config");
        g gVar = bVar.f81988c;
        b0 b0Var = (b0) gVar;
        if (!Intrinsics.f(te0.w.O(b0Var.w0()), config)) {
            b0Var.w0().set(config);
            bVar.f81989g.onNext(Unit.f186387a);
        }
        ihm.f fVar = this.f250489m.f273801b;
        RemoteStoriesActivity remoteStoriesActivity = (RemoteStoriesActivity) view;
        efm.r map = remoteStoriesActivity.Z0().f59735a.e.map(new pd.h(8));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarMerge = efm.r.merge(fVar, map);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        final int i = 0;
        pfm.a aVar2 = new pfm.a(te0.w.D(rVarMerge, new Function1(this) { // from class: qza.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f250482b;

            {
                this.f250482b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                Unit it8 = (Unit) obj3;
                switch (i) {
                    case 0:
                        z zVar = this.f250482b;
                        f fVar2 = zVar.f250488l;
                        NaviCommand f = zVar.k.getF();
                        ln.a aVar3 = ((a0) fVar2).f250456a;
                        return f != null ? aVar3.a(r6.b.g(null, null, null, 7, f)) : okl.m.w(null, null, null, 7, aVar3);
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        com.revolut.feature.remote_stories.impl.ui.b bVar2 = (com.revolut.feature.remote_stories.impl.ui.b) this.f250482b.f250487j;
                        if (((b0) bVar2.f81988c).w0().isInitialized()) {
                            bVar2.f81989g.onNext(Unit.f186387a);
                        }
                        return Unit.f186387a;
                }
            }
        }), new gn.b(8, new x(new BreadcrumbException(), 1)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        c86.f fVar2 = new c86.f(10, y.f250486a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new bo.e(8, sVar), fVar2);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        te0.w.j0(bVar2, hVarW);
        efm.r rVarF = o70.a.f(((b0) gVar).x0().c(te0.s.f270018a));
        bsi.b bVar3 = new bsi.b(view, this, 7);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new gn.b(8, new bo.c(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new bo.e(8, bVar3), new bo.e(8, sVar), new c86.f(10, function0J));
        te0.w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        ihm.f fVar3 = remoteStoriesActivity.Z0().f59736b.i;
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: qza.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f250482b;

            {
                this.f250482b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                Unit it8 = (Unit) obj3;
                switch (i2) {
                    case 0:
                        z zVar = this.f250482b;
                        f fVar22 = zVar.f250488l;
                        NaviCommand f = zVar.k.getF();
                        ln.a aVar3 = ((a0) fVar22).f250456a;
                        return f != null ? aVar3.a(r6.b.g(null, null, null, 7, f)) : okl.m.w(null, null, null, 7, aVar3);
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        com.revolut.feature.remote_stories.impl.ui.b bVar22 = (com.revolut.feature.remote_stories.impl.ui.b) this.f250482b.f250487j;
                        if (((b0) bVar22.f81988c).w0().isInitialized()) {
                            bVar22.f81989g.onNext(Unit.f186387a);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = fVar3.onErrorResumeNext(new gn.b(8, new x(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new bo.e(8, function1), new bo.e(8, sVar), new c86.f(10, function0J2));
        te0.w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }
}
