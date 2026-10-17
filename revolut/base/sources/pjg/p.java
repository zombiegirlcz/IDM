package pjg;

import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.feature.trusted_merchants.impl.ui.merchant_details.TrustedMerchantDetailsActivity;
import com.revolut.feature.trusted_merchants.impl.ui.merchant_details.TrustedMerchantDetailsContract$Configuration;
import efm.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ozc.z;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends pri.b implements c {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gjg.a f236766h;
    public final gjg.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f236767j;
    public final tpi.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f236768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final opi.d f236769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k3l.b f236770n;
    public final xpi.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TrustedMerchantDetailsContract$Configuration f236771p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xig.b f236772q;

    public p(gjg.a presentationModel, gjg.b router, b itemsMapper, tpi.j progressView, f9b.f errorView, opi.d bottomDialogView, k3l.b statusView, xpi.g toolbarView, TrustedMerchantDetailsContract$Configuration configuration, xig.b trustedMerchantDialogFactory) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(bottomDialogView, "bottomDialogView");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(trustedMerchantDialogFactory, "trustedMerchantDialogFactory");
        this.f236766h = presentationModel;
        this.i = router;
        this.f236767j = itemsMapper;
        this.k = progressView;
        this.f236768l = errorView;
        this.f236769m = bottomDialogView;
        this.f236770n = statusView;
        this.o = toolbarView;
        this.f236771p = configuration;
        this.f236772q = trustedMerchantDialogFactory;
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        TrustedMerchant.Approved approved = this.f236771p.f94439a;
        TextClause textClause = new TextClause(approved.f94406c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        xpi.c cVar = (xpi.c) this.o;
        cVar.n0(textClause);
        cVar.Y(new TextLocalisedClause(R$string.trusted_merchants_trusted_retailer, null, null, 14));
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        cVar.Z(true);
        g gVar = (g) this.f236767j;
        cVar.W(gVar.b());
        cVar.a0(gVar.c(approved));
        List items = gVar.a(approved);
        TrustedMerchantDetailsActivity trustedMerchantDetailsActivity = (TrustedMerchantDetailsActivity) view;
        ?? r110 = trustedMerchantDetailsActivity.f94437w0;
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) trustedMerchantDetailsActivity.f94438x0.getValue()).c(items);
        r rVarS = mo3.a.s(o70.a.f(((gjg.j) this.f236766h).f144288g.f), this.k);
        Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
        r rVarA0 = w.a0(hx7.a.K(rVarS, this.f236768l, false, true, null, 24), new pj9.n(4));
        h hVar = new h(this, 3);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarA0.onErrorResumeNext(new o9h.d(8, new k(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new nw8.d(5, hVar), new nw8.d(5, function1K), new z(10, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        r rVarFilter = ((k3l.d) this.f236770n).f180813j.filter(new i(new pj9.n(6), 1));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        efm.b bVarFlatMapCompletable = o70.a.f(rVarFilter).flatMapCompletable(new i(new h(this, 4), 2));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K2 = K();
        o9h.d dVar = new o9h.d(8, new k(new BreadcrumbException(), 1));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new nw8.d(5, function1K2), new z(10, l.f236762a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        r0 r0VarD = w.D(navBarWithToolbar.s0(), new h(this, 5));
        Function1 function1K3 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new o9h.d(8, new k(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new nw8.d(5, function1K3), new z(10, m.f236763a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        r0 r0VarD2 = w.D(cVar.Q(), new h(this, 0));
        Function1 function1K4 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new o9h.d(8, new k(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new nw8.d(5, function1K4), new z(10, n.f236764a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        r rVarMerge = r.merge(((TwinHorizontalButtonDelegate) r110.getValue()).f53572c.f121375b.map(new phc.b(27, new pj9.n(2))), ((TwinHorizontalButtonDelegate) r110.getValue()).d.f121375b.map(new phc.b(28, new pj9.n(3))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        r rVarFilter2 = rVarMerge.doOnNext(new phc.b(29, new h(this, 1))).filter(new i(new pj9.n(5), 0));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        r0 r0VarD3 = w.D(rVarFilter2, new h(this, 2));
        Function1 function1K5 = K();
        pfm.a aVar5 = new pfm.a(r0VarD3, new o9h.d(8, new k(new BreadcrumbException(), 4)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new nw8.d(5, function1K5), new z(10, o.f236765a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
    }
}
