package ly2;

import a08.p0;
import akl.s;
import aw0.o9;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_input.common.CardInputContract$ScreenMode;
import com.revolut.feature.card_input.common.ui.CardInputActivity;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import efm.r;
import java.util.List;
import jy2.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lu5.o;
import org.jetbrains.annotations.NotNull;
import szl.b;
import te0.w;
import tx0.j0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends bsi.a implements jy2.i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jy2.j f200646j;
    public final jy2.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z53.b f200647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xpi.g f200648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ypi.i f200649n;
    public final tpi.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f9b.f f200650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jy2.e f200651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k3l.b f200652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final opi.d f200653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rpi.j f200654t;
    public final gte.a u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ihm.b f200655w;

    public l(jy2.j router, jy2.h presentationModel, z53.b cardNfsScanner, xpi.g navBarWithToolbar, ypi.i nextButtonView, tpi.j progressView, f9b.f errorView, jy2.e itemsProvider, k3l.b statusView, opi.d bottomDialogView, rpi.j secureKeyboardView, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(cardNfsScanner, "cardNfsScanner");
        Intrinsics.checkNotNullParameter(navBarWithToolbar, "navBarWithToolbar");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        Intrinsics.checkNotNullParameter(bottomDialogView, "bottomDialogView");
        Intrinsics.checkNotNullParameter(secureKeyboardView, "secureKeyboardView");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f200646j = router;
        this.k = presentationModel;
        this.f200647l = cardNfsScanner;
        this.f200648m = navBarWithToolbar;
        this.f200649n = nextButtonView;
        this.o = progressView;
        this.f200650p = errorView;
        this.f200651q = itemsProvider;
        this.f200652r = statusView;
        this.f200653s = bottomDialogView;
        this.f200654t = secureKeyboardView;
        this.u = featureToggleInteractor;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f200655w = bVarE;
    }

    public static final void Q(l lVar, ServerError serverError) {
        jy2.b bVar = (jy2.b) lVar.k;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(serverError, "serverError");
        v60.e eVar = bVar.f179308b;
        int i = serverError.f51362a;
        v60.a type = v60.a.SERVER;
        String str = serverError.f51363b;
        szl.b.Companion.getClass();
        b.a.a();
        Unit unit = Unit.f186387a;
        ao0.a aVar = (ao0.a) eVar;
        Intrinsics.checkNotNullParameter(type, "type");
        bVar.e(new TextClause(aVar.d(aVar.a(i, type), str).toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        TextLocalisedClause textLocalisedClause;
        jy2.l view = (jy2.l) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        ((nri.a) this.f200646j).init();
        jy2.b bVar = (jy2.b) this.k;
        n nVar = (n) bVar.f179307a;
        te0.j jVar = nVar.o;
        KProperty[] kPropertyArr = n.f179315r;
        boolean zBooleanValue = ((Boolean) jVar.getValue(nVar, kPropertyArr[14]).get()).booleanValue();
        jy2.k kVar = bVar.f179307a;
        if (zBooleanValue) {
            n nVar2 = (n) kVar;
            textLocalisedClause = new TextLocalisedClause(R$string.card_youth_activate_title, v.l(((od0.i) nVar2.f179324p.getValue(nVar2, kPropertyArr[15]).get()).f224257a), null, 12);
        } else {
            n nVar3 = (n) kVar;
            textLocalisedClause = new TextLocalisedClause(((Number) nVar3.f179317c.getValue(nVar3, kPropertyArr[1]).get()).intValue(), null, null, 14);
        }
        n nVar4 = (n) kVar;
        int i = 2;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(((Number) nVar4.d.getValue(nVar4, kPropertyArr[2]).get()).intValue(), null, null, 14);
        R();
        j0 j0Var = j0.MULTILINE;
        xpi.c cVar = (xpi.c) this.f200648m;
        cVar.c0(j0Var);
        cVar.n0(textLocalisedClause);
        cVar.Z(true);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ypi.i iVar = this.f200649n;
        iVar.f(textLocalisedClause2);
        n nVar5 = (n) kVar;
        int i2 = 0;
        boolean z = ((CardInputContract$ScreenMode) nVar5.f179323n.getValue(nVar5, kPropertyArr[13]).get()) == CardInputContract$ScreenMode.LINKING;
        iVar.d(z);
        if (z) {
            iVar.t(new ypi.l(new TextLocalisedClause(R$string.card_link_enter_disclaimer, null, null, 14)));
        }
        r map = bVar.d().f.map(new jy2.a(new jxb.g(22), i));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarS = mo3.a.s(map, this.o);
        Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
        int i3 = 3;
        efm.b bVarFlatMapCompletable = o70.a.f(m70.a.g(hx7.a.K(rVarS, this.f200650p, false, true, new lrk.h(1, this, l.class, "onServerError", "onServerError(Lcom/revolut/core/error/data/model/ServerError;)Z", 0, 5), 8), null, new lxi.g(i3), 1)).flatMapCompletable(new lxb.c(i3, new b(this, 6)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        a0d.g gVar = new a0d.g(25, new lak.l(new BreadcrumbException(), 17));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        j7a.j jVar2 = new j7a.j(4, f.f200640a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new p0(24, sVar), jVar2);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, hVarW);
        n nVar6 = (n) kVar;
        te0.e eVarX0 = nVar6.x0();
        te0.s sVar2 = te0.s.f270018a;
        r map2 = eVarX0.c(sVar2).map(new jy2.a(new jxb.g(21), i2));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r map3 = w.l(map2, nVar6.y0().c(sVar2)).map(new jy2.a(new jud.d(bVar, 13), 1));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        r rVarF0 = w.f0(map3);
        b63.a aVar3 = (b63.a) this.f200647l;
        r rVarHide = aVar3.f12530l.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        int i5 = 11;
        r map4 = w.l(rVarF0, rVarHide).map(new lxb.c(i5, new b(this, i2)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        r rVarF = o70.a.f(map4);
        o oVar = new o(view, 13);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a0d.g(25, new lak.l(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new p0(24, oVar), new p0(24, sVar), new j7a.j(4, function0J));
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        if (!((jte.d) this.u).c(CardsCoreApi$Toggles.CardNumberCustomKeyboard.f65557c)) {
            rpi.i iVar2 = rpi.j.Companion;
            this.f200654t.r(0L);
        }
        r rVarHide2 = aVar3.f12530l.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        r rVarF2 = o70.a.f(rVarHide2);
        b bVar3 = new b(this, 13);
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new a0d.g(25, new lak.l(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new p0(24, bVar3), new p0(24, sVar), new j7a.j(4, function0J2));
        w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        CardInputActivity cardInputActivity = (CardInputActivity) view;
        v60.i panSubject = cardInputActivity.A0;
        Intrinsics.checkNotNullExpressionValue(panSubject, "panSubject");
        b bVar4 = new b(this, 1);
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext3 = panSubject.onErrorResumeNext(new a0d.g(25, new lak.l(new BreadcrumbException(), 20)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new p0(24, bVar4), new p0(24, sVar), new j7a.j(4, function0J3));
        w.j0(bVar2, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        int i6 = 2;
        int i21 = 9;
        r map5 = ((InputTextDelegate) cardInputActivity.f64757x0.getValue()).i.f121375b.map(new nx7.i(new nxa.v(i6), i21));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        pfm.a aVar4 = new pfm.a(w.D(map5, new b(this, i6)), new a0d.g(25, new lak.l(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar4.w(new p0(24, sVar), new j7a.j(4, g.f200641a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
        r rVarDoOnNext = ((LargeActionButtonDelegate) cardInputActivity.y0.getValue()).d.f121375b.doOnNext(new lxb.c(2, new b(this, 3)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        pfm.a aVar5 = new pfm.a(w.D(rVarDoOnNext, new b(this, 4)), new a0d.g(25, new lak.l(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar5.w(new p0(24, sVar), new j7a.j(4, h.f200642a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar2, hVarW3);
        n nVar7 = (n) kVar;
        r rVarDistinctUntilChanged = w.v(nVar7.f179321l.getValue(nVar7, kPropertyArr[11]).c(sVar2), this.f200655w, new lxi.g(2)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarF3 = o70.a.f(rVarDistinctUntilChanged);
        b bVar5 = new b(this, 7);
        Function0 function0J4 = J();
        r rVarOnErrorResumeNext4 = rVarF3.onErrorResumeNext(new a0d.g(25, new lak.l(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new p0(24, bVar5), new p0(24, sVar), new j7a.j(4, function0J4));
        w.j0(bVar2, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        int i22 = 10;
        pfm.a aVar6 = new pfm.a(w.D(iVar.s(), new b(this, i22)), new a0d.g(25, new lak.l(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar6.w(new p0(24, sVar), new j7a.j(4, i.f200643a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar2, hVarW4);
        efm.b bVarFlatMapCompletable2 = cVar.Q().flatMapCompletable(new lxb.c(i21, new b(this, i5)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        a0d.g gVar2 = new a0d.g(25, new lak.l(new BreadcrumbException(), 26));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar7 = new pfm.a(bVarFlatMapCompletable2, gVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar7.w(new p0(24, sVar), new j7a.j(4, j.f200644a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar2, hVarW5);
        efm.b bVarFlatMapCompletable3 = ((k3l.d) this.f200652r).f180813j.flatMapCompletable(new lxb.c(i22, new b(this, 12)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable3, "flatMapCompletable(...)");
        a0d.g gVar3 = new a0d.g(25, new lak.l(new BreadcrumbException(), 22));
        bVarFlatMapCompletable3.getClass();
        pfm.a aVar8 = new pfm.a(bVarFlatMapCompletable3, gVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar8.w(new p0(24, sVar), new j7a.j(4, k.f200645a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar2, hVarW6);
    }

    public final void R() {
        n nVar = (n) ((jy2.b) this.k).f179307a;
        ((xpi.c) this.f200648m).Y(new TextLocalisedClause(((Boolean) nVar.o.getValue(nVar, n.f179315r[14]).get()).booleanValue() ? R$string.card_link_youth_header_subtitle : R$string.card_link_header_subtitle, null, null, 14));
    }
}
