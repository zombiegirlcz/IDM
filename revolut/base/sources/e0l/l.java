package e0l;

import a08.f0;
import a08.q;
import a08.s;
import a0l.p;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.NationalIdentifiersContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.national_identifier_document_screen.NationalIdentifierDocumentFragment;
import efm.r;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends pri.b implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xzk.g f121734h;
    public final xzk.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f121735j;
    public final f9b.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tpi.j f121736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final iqi.h f121737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xpi.g f121738n;
    public final NationalIdentifiersContract$Configuration o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f121739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f121740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f121741r;

    public l(xzk.g presentationModel, xzk.b router, b mapper, f9b.f errorView, tpi.j progressView, iqi.h twinVerticalButtonView, xpi.g toolbarView, NationalIdentifiersContract$Configuration config, p statesMapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(statesMapper, "statesMapper");
        this.f121734h = presentationModel;
        this.i = router;
        this.f121735j = mapper;
        this.k = errorView;
        this.f121736l = progressView;
        this.f121737m = twinVerticalButtonView;
        this.f121738n = toolbarView;
        this.o = config;
        this.f121739p = statesMapper;
        this.f121740q = new HashMap();
        this.f121741r = w.y0(new d8e.a(this, 26));
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_continue, null, null, 14);
        iqi.b bVar = (iqi.b) this.f121737m;
        bVar.a0(textLocalisedClause);
        bVar.Z(false);
        bVar.e0(false);
        bVar.Y(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        bVar.X(true);
        r0 r0VarD = w.D(bVar.O(), new g(this, 1));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new f0(5, new e05.h(new BreadcrumbException(), 7)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new s(9, function1K), new q(28, i.f121731a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, hVarW);
        r0 r0VarD2 = w.D(bVar.N(), new dug.a(view, 25));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new f0(5, new e05.h(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new s(9, function1K2), new q(28, j.f121732a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
        r0 r0VarD3 = w.D(((xpi.c) this.f121738n).b(), new g(this, 7));
        Function1 function1K3 = K();
        pfm.a aVar4 = new pfm.a(r0VarD3, new f0(5, new e05.h(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new s(9, function1K3), new q(28, k.f121733a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar2, hVarW3);
        r rVarHide = ((NationalIdentifierDocumentFragment) view).g0.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.b bVarFlatMapCompletable = rVarHide.flatMapCompletable(new e0f.k(new g(this, 2), 18));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K4 = K();
        f0 f0Var = new f0(5, new e05.h(new BreadcrumbException(), 5));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar5 = new pfm.a(bVarFlatMapCompletable, f0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new s(9, function1K4), new q(28, h.f121730a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar2, hVarW4);
        r map = hx7.a.K(o70.a.f(this.f121734h.b(this.o)), this.k, false, true, null, 24).map(new e0f.k(new g(this, 0), 17));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        dkm.a aVar6 = new dkm.a(1, view, d.class, "setItems", "setItems(Ljava/util/List;)V", 0, 12);
        Function1 function1K5 = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = map.onErrorResumeNext(new f0(5, new e05.h(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new s(9, aVar6), new s(9, function1K5), new q(28, function0J));
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
