package qjg;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.trusted_merchants.impl.ui.trusted_merchants.TrustedMerchantsActivity;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import org.jetbrains.annotations.NotNull;
import ozc.z;
import qce.m0;
import qfm.r0;
import qg7.v;
import qgf.o;
import te0.s;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends pri.b implements c {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gjg.a f246875h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gjg.b f246876j;
    public final tpi.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f246877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final opi.d f246878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k3l.b f246879n;
    public final xpi.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xig.b f246880p;

    public n(gjg.a presentationModel, b itemsMapper, gjg.b router, tpi.j progressView, f9b.f errorView, opi.d bottomDialogView, k3l.b statusView, xpi.g toolbarView, xig.b trustedMerchantDialogFactory) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(bottomDialogView, "bottomDialogView");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
        Intrinsics.checkNotNullParameter(trustedMerchantDialogFactory, "trustedMerchantDialogFactory");
        this.f246875h = presentationModel;
        this.i = itemsMapper;
        this.f246876j = router;
        this.k = progressView;
        this.f246877l = errorView;
        this.f246878m = bottomDialogView;
        this.f246879n = statusView;
        this.o = toolbarView;
        this.f246880p = trustedMerchantDialogFactory;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        Object obj2 = this.f246875h;
        ((nri.a) obj2).init();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trusted_merchants_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.o;
        cVar.n0(textLocalisedClause);
        cVar.Y(new TextLocalisedClause(R$string.trusted_merchants_subtitle, null, null, 14));
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        cVar.Z(true);
        r0 r0VarD = w.D(cVar.Q(), new h(this, 0));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new o0(11, new m0(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new lhi.b(23, function1K), new z(20, l.f246873a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        gjg.j jVar = (gjg.j) obj2;
        gjg.l lVar = (gjg.l) jVar.e;
        r map = lVar.f144291b.getValue(lVar, gjg.l.f144290c[0]).c(s.f270018a).map(new qe0.g(25, new h(this, 2)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF = o70.a.f(map);
        o oVar = new o(view, 8);
        Function1 function1K2 = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new o0(11, new m0(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new lhi.b(23, oVar), new lhi.b(23, function1K2), new z(20, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        r rVarS = mo3.a.s(o70.a.f(jVar.f.f), this.k);
        Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
        r rVarA0 = w.a0(hx7.a.K(rVarS, this.f246877l, false, true, null, 24), new v(19));
        h hVar = new h(this, 3);
        Function1 function1K3 = K();
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarA0.onErrorResumeNext(new o0(11, new m0(new BreadcrumbException(), 12)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new lhi.b(23, hVar), new lhi.b(23, function1K3), new z(20, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        TrustedMerchantsActivity trustedMerchantsActivity = (TrustedMerchantsActivity) view;
        r map2 = ((FullScreenStateDelegate) trustedMerchantsActivity.y0.getValue()).f52371h.f121375b.map(new qe0.g(23, new v(18)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        h hVar2 = new h(this, 4);
        Function1 function1K4 = K();
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext3 = map2.onErrorResumeNext(new o0(11, new m0(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new lhi.b(23, hVar2), new lhi.b(23, function1K4), new z(20, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        r0 r0VarD2 = w.D(((RowDelegate) trustedMerchantsActivity.f94444x0.getValue()).f53218h, new h(this, 5));
        Function1 function1K5 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new o0(11, new m0(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new lhi.b(23, function1K5), new z(20, j.f246871a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        r rVarDoOnNext = ((LargeActionButtonDelegate) trustedMerchantsActivity.f94442v0.getValue()).d.f121375b.doOnNext(new qe0.g(24, new h(this, 6)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        r0 r0VarD3 = w.D(rVarDoOnNext, new h(this, 1));
        Function1 function1K6 = K();
        pfm.a aVar4 = new pfm.a(r0VarD3, new o0(11, new m0(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new lhi.b(23, function1K6), new z(20, k.f246872a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
    }
}
