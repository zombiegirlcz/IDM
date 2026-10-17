package ew2;

import android.content.Context;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.nd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.feature.card_add_to_googlepay.impl.AddCardToGooglePayActivity;
import com.revolut.retail.common.ui.R$string;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends pri.a implements e {

    @NotNull
    public static final m Companion = new m();
    public final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z63.k f130045j;
    public final tpi.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f130046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z63.p f130047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tri.c f130048n;
    public final mm.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ja3.f f130049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sri.m f130050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kpi.c f130051r;

    public u(k presentationModel, z63.k tapAndPayPresenterDelegate, tpi.j progressView, f9b.f errorView, z63.p tapAndPayView, tri.c backButtonView, mm.d actionsDispatcher, gte.a featureToggleInteractor, ja3.f cardBitmapDisplayer, pri.f authorizedPresenterDelegate, Context context, sri.m navigator, kpi.c activityResultDelegate) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(tapAndPayPresenterDelegate, "tapAndPayPresenterDelegate");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(tapAndPayView, "tapAndPayView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cardBitmapDisplayer, "cardBitmapDisplayer");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        this.i = presentationModel;
        this.f130045j = tapAndPayPresenterDelegate;
        this.k = progressView;
        this.f130046l = errorView;
        this.f130047m = tapAndPayView;
        this.f130048n = backButtonView;
        this.o = actionsDispatcher;
        this.f130049p = cardBitmapDisplayer;
        this.f130050q = navigator;
        this.f130051r = activityResultDelegate;
        P(zhm.v.k(authorizedPresenterDelegate, tapAndPayPresenterDelegate));
    }

    public static PromptMarketingContentDelegate.Model.Content.MediaContent Q(Image image) {
        if (image != null) {
            return new PromptMarketingContentDelegate.Model.Content.MediaContent(image, nd.LINEAR_REVEAL);
        }
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        return new PromptMarketingContentDelegate.Model.Content.MediaContent(new TextImage("", 0, 0, 0, 0, 0, 206), null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        g view = (g) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        k kVar = this.i;
        kVar.init();
        AddCardToGooglePayActivity addCardToGooglePayActivity = (AddCardToGooglePayActivity) view;
        efm.r map = ((PromptMarketingContentDelegate) addCardToGooglePayActivity.f64448t0.getValue()).f53079c.map(new et6.m0(12, new eul.d(21)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarMerge = efm.r.merge(map, this.f130048n.f273801b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        qfm.r0 r0VarD = te0.w.D(rVarMerge, new l(this, 0));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new a08.o0(12, new e05.h(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new a08.g0(14, function1K), new ea9.c(2, o.f130034a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        efm.d0 d0VarF = kVar.e.f(false);
        j jVar = j.f;
        ufm.i iVar = new ufm.i(d0VarF, new dug.e(14), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(te0.w.H0(iVar, ((ik3.c) kVar.f).p()), new et6.m0(14, new eul.d(23)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        efm.r rVarX = iVar2.x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r map2 = te0.w.m(rVarX, rd0.e.c(new dfj.f(((om4.f) kVar.f130025h).a(kVar.j3()), 19), kotlin.coroutines.g.f186406a), this.f130049p.c(kVar.j3().f150110a)).map(new et6.m0(15, new l(this, 2)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        od0.h hVar = od0.i.Companion;
        n nVar = new n(null, false, false, false, null, null);
        hVar.getClass();
        efm.r rVarStartWith = ue0.e.E(map2, od0.h.a(nVar)).startWith(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        efm.r map3 = rVarStartWith.map(new et6.m0(17, new l(this, 3)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        efm.r rVarF = o70.a.f(map3);
        l lVar = new l(this, 4);
        Function1 function1K2 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a08.o0(12, new e05.h(new BreadcrumbException(), 26)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.g0(14, lVar), new a08.g0(14, function1K2), new ea9.c(2, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarHide = ((ihm.j) kVar.i.d).hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarS = mo3.a.s(o70.a.f(rVarHide), this.k);
        Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
        efm.r rVarG = m70.a.g(hx7.a.N(rVarS, this.f130046l, false, true), null, new eu4.b0(24), 1);
        eif.c cVar = new eif.c(1, this.f130045j, z63.k.class, "addCardToGooglePay", "addCardToGooglePay(Lcom/revolut/feature/cards/models/revolutcard/RevolutCard;)V", 0, 25);
        Function1 function1K3 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarG.onErrorResumeNext(new a08.o0(12, new e05.h(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a08.g0(14, cVar), new a08.g0(14, function1K3), new ea9.c(2, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        v60.i tokenizeResultSubject = ((z63.d) this.f130047m).f319660l;
        Intrinsics.checkNotNullExpressionValue(tokenizeResultSubject, "tokenizeResultSubject");
        efm.b bVarSwitchMapCompletable = tokenizeResultSubject.switchMapCompletable(new et6.m0(18, new l(this, 5)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        Function1 function1K4 = K();
        a08.o0 o0Var = new a08.o0(12, new q(new BreadcrumbException(), 0));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable, o0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new a08.g0(14, function1K4), new ea9.c(2, p.f130036a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        ?? r110 = addCardToGooglePayActivity.f64448t0;
        efm.r map4 = ((PromptMarketingContentDelegate) r110.getValue()).f.f121375b.map(new et6.m0(13, new eul.d(22)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        qfm.r0 r0VarD2 = te0.w.D(map4, new l(this, 6));
        Function1 function1K5 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new a08.o0(12, new q(new BreadcrumbException(), 1)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new a08.g0(14, function1K5), new ea9.c(2, r.f130039a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        efm.r map5 = ((PromptMarketingContentDelegate) r110.getValue()).f53080g.f121375b.map(new et6.m0(11, new eul.d(20)));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        qfm.r0 r0VarD3 = te0.w.D(map5, new l(this, 7));
        Function1 function1K6 = K();
        pfm.a aVar5 = new pfm.a(r0VarD3, new a08.o0(12, new q(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new a08.g0(14, function1K6), new ea9.c(2, s.f130041a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        efm.b bVarFlatMapCompletable = o70.a.f(i26.l.g(this.f130051r.N(1024))).flatMapCompletable(new et6.m0(16, new l(this, 1)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K7 = K();
        a08.o0 o0Var2 = new a08.o0(12, new e05.h(new BreadcrumbException(), 28));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar6 = new pfm.a(bVarFlatMapCompletable, o0Var2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new a08.g0(14, function1K7), new ea9.c(2, t.f130043a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar, hVarW5);
    }

    public final PromptMarketingContentDelegate.Model R(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, BitmapImage bitmapImage) {
        return new PromptMarketingContentDelegate.Model("PROMPT_ID", textLocalisedClause, textLocalisedClause2, Q(bitmapImage), null, null, this.i.k3(), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.common_action_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), null, null, null, null, null, null, null, null, null, null, null, 2096560);
    }
}
