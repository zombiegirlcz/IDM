package x94;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer.CreditApplicationDocumentViewerActivity;
import com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer.CreditApplicationDocumentViewerContract$Configuration;
import com.revolut.feature.credit.core.R$string;
import efm.d0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends pri.a implements d {

    @NotNull
    public static final m Companion = new m();
    public final CreditApplicationDocumentViewerContract$Configuration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f303564j;
    public final iqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xpi.g f303565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f303566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y94.b f303567n;
    public final tpi.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f9b.f f303568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hk0.a f303569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zk0.b f303570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n80.d f303571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rz3.b f303572t;
    public final bk0.e u;

    public s(CreditApplicationDocumentViewerContract$Configuration configuration, k presentationModel, iqi.h twinVerticalButtonView, xpi.g navBarWithToolbarView, e router, y94.b documentDelegate, tpi.j progressView, f9b.f errorView, hk0.a networkFileRepository, zk0.b fileSystemRepository, n80.d packageManagerResolver, rz3.b creditApplicationLinkRouter, pri.f authorizedPresenterDelegate, bk0.e revolutHeadersProvider) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(documentDelegate, "documentDelegate");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(packageManagerResolver, "packageManagerResolver");
        Intrinsics.checkNotNullParameter(creditApplicationLinkRouter, "creditApplicationLinkRouter");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(revolutHeadersProvider, "revolutHeadersProvider");
        this.i = configuration;
        this.f303564j = presentationModel;
        this.k = twinVerticalButtonView;
        this.f303565l = navBarWithToolbarView;
        this.f303566m = router;
        this.f303567n = documentDelegate;
        this.o = progressView;
        this.f303568p = errorView;
        this.f303569q = networkFileRepository;
        this.f303570r = fileSystemRepository;
        this.f303571s = packageManagerResolver;
        this.f303572t = creditApplicationLinkRouter;
        this.u = revolutHeadersProvider;
        P(v.k(authorizedPresenterDelegate, documentDelegate));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        h view = (h) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        k kVar = this.f303564j;
        kVar.init();
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_cross);
        xpi.c cVar = (xpi.c) this.f303565l;
        cVar.e0(numValueOf);
        r0 r0VarD = w.D(cVar.Q(), new l(this, 0));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new o9h.d(28, new q(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new nw8.d(22, function1K), new t1i.n(20, p.f303560a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        this.f303567n.getClass();
        cVar.n0(new TextLocalisedClause(R$string.credit_application_credit_registers, null, null, 14));
        cVar.p0(new TextLocalisedClause(R$string.credit_application_credit_registers, null, null, 14));
        cVar.Z(false);
        CreditApplicationDocumentViewerContract$Configuration creditApplicationDocumentViewerContract$Configuration = this.i;
        if (creditApplicationDocumentViewerContract$Configuration.f67565a.f66358a) {
            cVar.d0(zhm.u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "download_action", new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        }
        efm.b bVarFlatMapCompletable = cVar.b().flatMapCompletable(new x8i.g(22, new l(this, 7)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K2 = K();
        o9h.d dVar = new o9h.d(28, new q(new BreadcrumbException(), 1));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarFlatMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new nw8.d(22, function1K2), new t1i.n(20, r.f303563a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        String documentId = creditApplicationDocumentViewerContract$Configuration.f67566b;
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        efm.r map = kVar.f303553b.U().c(te0.s.f270018a).filter(new x8i.g(14, new wsg.j(documentId, 20))).map(new x8i.g(15, new x8i.h(2)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF = o70.a.f(map);
        wma.e eVar = new wma.e(1, this.f303567n, y94.b.class, "setButtonStatusRead", "setButtonStatusRead(Z)V", 0, 18);
        Function1 function1K3 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new o9h.d(28, new wrj.p(new BreadcrumbException(), 26)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new nw8.d(22, eVar), new nw8.d(22, function1K3), new t1i.n(20, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        Q();
        CreditApplicationDocumentViewerActivity creditApplicationDocumentViewerActivity = (CreditApplicationDocumentViewerActivity) view;
        efm.r map2 = w.l(((WebViewDelegate) creditApplicationDocumentViewerActivity.f67562v0.getValue()).f53637c, creditApplicationDocumentViewerActivity.u0).map(new x8i.g(21, new x8i.h(4)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r rVarF2 = o70.a.f(map2);
        l lVar = new l(this, 4);
        Function1 function1K4 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new o9h.d(28, new wrj.p(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new nw8.d(22, lVar), new nw8.d(22, function1K4), new t1i.n(20, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        r0 r0VarD2 = w.D(((WebViewDelegate) creditApplicationDocumentViewerActivity.f67562v0.getValue()).f, new l(this, 5));
        Function1 function1K5 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new o9h.d(28, new wrj.p(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new nw8.d(22, function1K5), new t1i.n(20, o.f303559a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        ihm.f fVar = ((LargeActionButtonDelegate) creditApplicationDocumentViewerActivity.f67563w0.getValue()).d.f121375b;
        l lVar2 = new l(this, 6);
        Function1 function1K6 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = fVar.onErrorResumeNext(new o9h.d(28, new wrj.p(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new nw8.d(22, lVar2), new nw8.d(22, function1K6), new t1i.n(20, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
    }

    public final void Q() {
        ufm.f fVar = new ufm.f(new ufm.f(new ufm.f(o70.a.i(this.f303564j.j3(this.i.f67566b)), new x8i.g(23, new l(this, 8)), 2), new x8i.g(24, new l(this, 9)), 1), new x8i.g(25, new l(this, 10)), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        d0 d0VarW = mo3.a.w(fVar, this.o);
        l lVar = new l(this, 11);
        l lVar2 = new l(this, 1);
        ufm.i iVar = new ufm.i(d0VarW, new o9h.d(28, new wrj.p(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new nw8.d(22, lVar), new nw8.d(22, lVar2), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        w.j0(this.f239031a, iVar2);
    }
}
