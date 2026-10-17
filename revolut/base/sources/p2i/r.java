package p2i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.exchange_v2.recurring_order_settings.RecurringOrderSettingsActivityV2;
import g1i.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import om4.m1;
import ozc.z;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends bsi.a implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f2i.j f232251j;
    public final g1i.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f232252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final opi.d f232253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xpi.g f232254n;
    public final tri.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ypi.i f232255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c90.c f232256q;

    public r(f2i.j router, g1i.a presentationModel, e mapper, opi.d expandableDialogView, xpi.g navBarWithToolbarView, tri.c backButtonView, ypi.i nextButtonView, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f232251j = router;
        this.k = presentationModel;
        this.f232252l = mapper;
        this.f232253m = expandableDialogView;
        this.f232254n = navBarWithToolbarView;
        this.o = backButtonView;
        this.f232255p = nextButtonView;
        this.f232256q = uiResources;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        f view = (f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        ((u) this.f232252l).getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.fx_orders_recurring_schedule_header_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f232254n;
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        efm.r rVarMergeWith = cVar.Q().mergeWith(this.o.f273801b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        pfm.a aVar2 = new pfm.a(w.b(rVarMergeWith, new h(this, 2)), new n1i.b(7, new l(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        z zVar = new z(2, k.f232243a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new o0(6, sVar), zVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        RecurringOrderSettingsActivityV2 recurringOrderSettingsActivityV2 = (RecurringOrderSettingsActivityV2) view;
        efm.b bVarFlatMapCompletable = ((DatePickerDelegate) recurringOrderSettingsActivityV2.f96960v0.getValue()).f52176c.f121375b.flatMapCompletable(new p24.b(27, new h(this, 8)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        n1i.b bVar2 = new n1i.b(7, new oma.n(new BreadcrumbException(), 27));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarFlatMapCompletable, bVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(6, sVar), new z(2, j.f232242a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        pfm.a aVar4 = new pfm.a(w.D(((SingleChoiceDelegate) recurringOrderSettingsActivityV2.f96961w0.getValue()).p(), new h(this, 9)), new n1i.b(7, new l(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new o0(6, sVar), new z(2, n.f232247a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.fx_orders_recurring_schedule_next_button_title, null, null, 14);
        ypi.i iVar = this.f232255p;
        iVar.f(textLocalisedClause2);
        pfm.a aVar5 = new pfm.a(w.D(iVar.s(), new h(this, 10)), new n1i.b(7, new l(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new o0(6, sVar), new z(2, m.f232246a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        efm.r rVarA = iVar.a();
        os9.t tVar = new os9.t(this, view, 23);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarA.onErrorResumeNext(new n1i.b(7, new l(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(6, tVar), new o0(6, sVar), new z(2, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        ?? r110 = recurringOrderSettingsActivityV2.u0;
        efm.r rVarMergeWith2 = ((InputTextDelegate) r110.getValue()).i.f121375b.mergeWith(((InputTextDelegate) r110.getValue()).f52575g.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith2, "mergeWith(...)");
        pfm.a aVar6 = new pfm.a(w.D(rVarMergeWith2, new h(this, 1)), new n1i.b(7, new l(new BreadcrumbException(), 4)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new o0(6, sVar), new z(2, o.f232248a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar, hVarW5);
        efm.r rVarV = ((opi.b) this.f232253m).V();
        d0 d0Var = (d0) this.k;
        efm.r map = w.l(rVarV, d0Var.G3()).filter(new p24.b(28, new p0g.b(13))).map(new p24.b(19, new p0g.b(14))).map(new p24.b(20, new m1(1, this.f232252l, e.class, "mapFrequencyDialogConfig", "mapFrequencyDialogConfig(Lcom/revolut/feature_exchange/impl/ui/exchange/recurring_order_settings/RecurringOrderSettingsContract$PeriodType;)Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;", 0, 11)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF = o70.a.f(map);
        m1 m1Var = new m1(1, this.f232253m, opi.d.class, "update", "update(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;)V", 0, 12);
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF.onErrorResumeNext(new n1i.b(7, new oma.n(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o0(6, m1Var), new o0(6, sVar), new z(2, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r map2 = w.l(d0Var.H3(), d0Var.G3()).map(new p24.b(24, new h(this, 0)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r rVarF2 = o70.a.f(map2);
        m1 m1Var2 = new m1(1, view, f.class, "setItems", "setItems(Ljava/util/List;)V", 0, 13);
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF2.onErrorResumeNext(new n1i.b(7, new oma.n(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new o0(6, m1Var2), new o0(6, sVar), new z(2, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.b bVarFlatMapCompletable2 = w.l(d0Var.H3(), d0Var.G3()).flatMapCompletable(new p24.b(21, new h(this, 3)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        pfm.a aVar7 = new pfm.a(o70.a.g(bVarFlatMapCompletable2), new n1i.b(7, new l(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new o0(6, sVar), new z(2, p.f232249a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar, hVarW6);
        pfm.a aVar8 = new pfm.a(d0Var.M3(), new n1i.b(7, new l(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new o0(6, sVar), new z(2, q.f232250a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        w.j0(bVar, hVarW7);
    }
}
