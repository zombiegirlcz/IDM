package b9i;

import a08.r;
import a08.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature_news_api.NewsInfoFeatureConfig;
import com.revolut.retail.common.ui.model.NewsUiItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import te0.w;
import ufm.n;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends pri.b implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f9b.f f13797h;
    public final tqi.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f13798j;
    public final xoj.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a61.a f13799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q06.l f13800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fk3.a f13801n;
    public final c9i.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public NewsUiItem f13802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f13803q;

    public l(NewsInfoFeatureConfig configuration, f9b.f errorView, tqi.g shareNaviCommandFactory, m navigator, xoj.a featuresInteractor, a61.a newsInteractor, q06.l deeplinkRouter, fk3.a configurationInteractor, c9i.c newsMapper) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(newsInteractor, "newsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(newsMapper, "newsMapper");
        this.f13797h = errorView;
        this.i = shareNaviCommandFactory;
        this.f13798j = navigator;
        this.k = featuresInteractor;
        this.f13799l = newsInteractor;
        this.f13800m = deeplinkRouter;
        this.f13801n = configurationInteractor;
        this.o = newsMapper;
        this.f13802p = configuration.f97427a;
        this.f13803q = configuration.f97428b;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        n nVarI = o70.a.i(((cpj.b) this.k).h());
        b58.f fVar = new b58.f(this, view, 19);
        Function1 function1K = K();
        ufm.i iVar = new ufm.i(nVarI, new s(5, new h(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new r(8, fVar), new r(8, function1K), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        w.j0(this.f239031a, iVar2);
    }
}
