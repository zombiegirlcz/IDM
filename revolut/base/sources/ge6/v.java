package ge6;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.extension_auth.impl.R$string;
import com.revolut.feature.extension_auth.impl.ui.ExtensionAuthActivity;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.d0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends pri.c implements b {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sri.m f143253h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f143254j;
    public final jqi.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k3l.b f143255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tpi.j f143256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f9b.f f143257n;
    public final tri.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s70.a f143258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final til.m f143259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.b f143260r;

    public v(sri.m navigator, l presentationModel, h mapper, jqi.e twinHorizontalButtonView, k3l.b statusView, tpi.j progressView, f9b.f errorView, tri.c backButtonView, s70.a intentProvider, til.m workflowFlowProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(twinHorizontalButtonView, "twinHorizontalButtonView");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        this.f143253h = navigator;
        this.i = presentationModel;
        this.f143254j = mapper;
        this.k = twinHorizontalButtonView;
        this.f143255l = statusView;
        this.f143256m = progressView;
        this.f143257n = errorView;
        this.o = backButtonView;
        this.f143258p = intentProvider;
        this.f143259q = workflowFlowProvider;
        ihm.b bVarE = ihm.b.e(x.IDLE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f143260r = bVarE;
    }

    public static final void N(v vVar) {
        ((k3l.d) vVar.f143255l).O(new StatusViewConfiguration.Error("status_view_id", new TextLocalisedClause(R$string.revolut_secure_sign_in_failure_title, null, null, 14), new TextLocalisedClause(R$string.revolut_secure_sign_in_failure_subtitle, null, null, 14), null, null, null, null, 8184));
    }

    public final d0 O(ufm.n nVar) {
        ufm.f fVar = new ufm.f(new ufm.f(new ufm.f(new ufm.f(nVar, new j(5, new m(this, 5)), 2), new j(6, new m(this, 6)), 1), new j(7, new m(this, 7)), 1), new j(8, new m(this, 8)), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return mo3.a.w(hx7.a.O(fVar, this.f143257n, false, new g9i.s(1, this, v.class, "onServerError", "onServerError(Lcom/revolut/core/error/data/model/ServerError;)Z", 0, 10), 8), this.f143256m);
    }

    public final void P() {
        ufm.f fVar = new ufm.f(new ufm.f(hx7.a.O(o70.a.i(this.i.a()), this.f143257n, true, new g9i.s(1, this, v.class, "onServerError", "onServerError(Lcom/revolut/core/error/data/model/ServerError;)Z", 0, 11), 8), new j(10, new m(this, 11)), 2), new j(11, new m(this, 12)), 1);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
        m mVar = new m(this, 13);
        Function1 function1K = K();
        ufm.i iVar = new ufm.i(fVar, new a08.s(15, new g0d.m(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new a08.r(19, mVar), new a08.r(19, function1K), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        te0.w.j0(this.f239031a, iVar2);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        ihm.f fVar = this.o.f273801b;
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new a08.s(15, new g0d.m(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.r(19, q.f143248a), new a08.r(19, function1K), new ea9.c(15, function0J));
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        P();
        jqi.b bVar2 = (jqi.b) this.k;
        TwinHorizontalButton twinHorizontalButton = bVar2.f177726j;
        if (twinHorizontalButton == null) {
            Intrinsics.r("twinHorizontalButton");
            throw null;
        }
        twinHorizontalButton.setSecondaryButtonEnabled(false);
        efm.r rVarStartWith = ((w) this.i.f143241b).w0().c(te0.s.f270018a).map(new j(0, new gd8.j(10))).startWith(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        efm.r rVarF = o70.a.f(rVarStartWith);
        g9i.s sVar = new g9i.s(1, bVar2, jqi.e.class, "setSecondaryButtonEnabled", "setSecondaryButtonEnabled(Z)V", 0, 12);
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF.onErrorResumeNext(new a08.s(15, new g0d.m(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a08.r(19, sVar), new a08.r(19, function1K2), new ea9.c(15, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        TextLocalisedClause text = new TextLocalisedClause(R$string.rwa_main_button_accept, null, null, 14);
        Intrinsics.checkNotNullParameter(text, "text");
        TwinHorizontalButton twinHorizontalButton2 = bVar2.f177726j;
        if (twinHorizontalButton2 == null) {
            Intrinsics.r("twinHorizontalButton");
            throw null;
        }
        twinHorizontalButton2.setSecondaryButtonText(text);
        LargeActionButton.ButtonStyle.DefaultFilledButton style = LargeActionButton.ButtonStyle.f58725a;
        Intrinsics.checkNotNullParameter(style, "style");
        TwinHorizontalButton twinHorizontalButton3 = bVar2.f177726j;
        if (twinHorizontalButton3 == null) {
            Intrinsics.r("twinHorizontalButton");
            throw null;
        }
        twinHorizontalButton3.setSecondaryButtonStyle(style);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
        TwinHorizontalButton twinHorizontalButton4 = bVar2.f177726j;
        if (twinHorizontalButton4 == null) {
            Intrinsics.r("twinHorizontalButton");
            throw null;
        }
        twinHorizontalButton4.setSecondaryButtonIcon(resourceImage);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rwa_main_button_reject, null, null, 14);
        TwinHorizontalButton twinHorizontalButton5 = bVar2.f177726j;
        if (twinHorizontalButton5 == null) {
            Intrinsics.r("twinHorizontalButton");
            throw null;
        }
        twinHorizontalButton5.setPrimaryButtonText(textLocalisedClause);
        LargeActionButton.ButtonStyle.DefaultFilledButton style2 = LargeActionButton.ButtonStyle.f58726b;
        Intrinsics.checkNotNullParameter(style2, "style");
        TwinHorizontalButton twinHorizontalButton6 = bVar2.f177726j;
        if (twinHorizontalButton6 == null) {
            Intrinsics.r("twinHorizontalButton");
            throw null;
        }
        twinHorizontalButton6.setPrimaryButtonStyle(style2);
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        TwinHorizontalButton twinHorizontalButton7 = bVar2.f177726j;
        if (twinHorizontalButton7 == null) {
            Intrinsics.r("twinHorizontalButton");
            throw null;
        }
        twinHorizontalButton7.setPrimaryButtonIcon(resourceImage2);
        TwinHorizontalButton twinHorizontalButton8 = bVar2.f177726j;
        if (twinHorizontalButton8 == null) {
            Intrinsics.r("twinHorizontalButton");
            throw null;
        }
        r0 r0VarD = te0.w.D(twinHorizontalButton8.d(), new m(this, 4));
        Function1 function1K3 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new a08.s(15, new g0d.m(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new a08.r(19, function1K3), new ea9.c(15, r.f143249a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar, hVarW);
        TwinHorizontalButton twinHorizontalButton9 = bVar2.f177726j;
        if (twinHorizontalButton9 == null) {
            Intrinsics.r("twinHorizontalButton");
            throw null;
        }
        r0 r0VarD2 = te0.w.D(twinHorizontalButton9.c(), new m(this, 10));
        Function1 function1K4 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new a08.s(15, new g0d.m(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new a08.r(19, function1K4), new ea9.c(15, s.f143250a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        r0 r0VarD3 = te0.w.D(((k3l.d) this.f143255l).f180813j, new m(this, 14));
        Function1 function1K5 = K();
        pfm.a aVar4 = new pfm.a(r0VarD3, new a08.s(15, new g0d.m(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new a08.r(19, function1K5), new ea9.c(15, u.f143252a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        r0 r0VarD4 = te0.w.D(((ErrorDelegate) ((ExtensionAuthActivity) view).u0.getValue()).f52226c, new m(this, 0));
        Function1 function1K6 = K();
        pfm.a aVar5 = new pfm.a(r0VarD4, new a08.s(15, new g0d.m(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new a08.r(19, function1K6), new ea9.c(15, t.f143251a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
    }
}
