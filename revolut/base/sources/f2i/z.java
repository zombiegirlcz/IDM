package f2i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.exchange.recurring_order_settings.RecurringOrderSettingsActivity;
import g1i.d0;
import g1i.m0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends bsi.a implements h {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f131816j;
    public final g1i.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f131817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final opi.d f131818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xpi.g f131819n;
    public final tri.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ypi.i f131820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c90.c f131821q;

    public z(j router, g1i.a presentationModel, k mapper, opi.d expandableDialogView, xpi.g navBarWithToolbarView, tri.c backButtonView, ypi.i nextButtonView, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f131816j = router;
        this.k = presentationModel;
        this.f131817l = mapper;
        this.f131818m = expandableDialogView;
        this.f131819n = navBarWithToolbarView;
        this.o = backButtonView;
        this.f131820p = nextButtonView;
        this.f131821q = uiResources;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        l view = (l) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        ((b0) this.f131817l).getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.fx_orders_recurring_schedule_header_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f131819n;
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        efm.r rVarMergeWith = cVar.Q().mergeWith(this.o.f273801b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        pfm.a aVar2 = new pfm.a(te0.w.b(rVarMergeWith, new n(this, 0)), new a08.s(12, new ew2.q(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ea9.c cVar2 = new ea9.c(5, u.f131812a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new a08.r(17, sVar), cVar2);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        RecurringOrderSettingsActivity recurringOrderSettingsActivity = (RecurringOrderSettingsActivity) view;
        ?? r72 = recurringOrderSettingsActivity.f96934v0;
        ?? r87 = recurringOrderSettingsActivity.u0;
        efm.b bVarFlatMapCompletable = ((DatePickerDelegate) r72.getValue()).f52176c.f121375b.flatMapCompletable(new ey7.a(new n(this, 4), 28));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        a08.s sVar2 = new a08.s(12, new ew2.q(new BreadcrumbException(), 13));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarFlatMapCompletable, sVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new a08.r(17, sVar), new ea9.c(5, r.f131809a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        pfm.a aVar4 = new pfm.a(te0.w.D(((SingleChoiceDelegate) recurringOrderSettingsActivity.f96935w0.getValue()).p(), new n(this, 5)), new a08.s(12, new ew2.q(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new a08.r(17, sVar), new ea9.c(5, w.f131814a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.fx_orders_recurring_schedule_next_button_title, null, null, 14);
        ypi.i iVar = this.f131820p;
        iVar.f(textLocalisedClause2);
        pfm.a aVar5 = new pfm.a(te0.w.D(iVar.s(), new n(this, 6)), new a08.s(12, new ew2.q(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new a08.r(17, sVar), new ea9.c(5, v.f131813a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        efm.r rVarA = iVar.a();
        f0d.l lVar = new f0d.l(this, view, 4);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarA.onErrorResumeNext(new a08.s(12, new ew2.q(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.r(17, lVar), new a08.r(17, sVar), new ea9.c(5, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r map = ((LargeActionButtonDelegate) recurringOrderSettingsActivity.f96936x0.getValue()).d.f121375b.map(new ey7.a(new f0d.k(11), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        pfm.a aVar6 = new pfm.a(te0.w.D(map, new n(this, 2)), new a08.s(12, new ew2.q(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new a08.r(17, sVar), new ea9.c(5, s.f131810a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar, hVarW5);
        j1i.g gVar = recurringOrderSettingsActivity.f96933t0;
        if (gVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        rp0.m mVarN = ((opi.b) gVar.f170581l.get()).N();
        efm.r map2 = mVarN.o.map(new rof.e(15, new rp0.k(mVarN, 3)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r map3 = map2.map(new ey7.a(new f0d.k(12), 24));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        pfm.a aVar7 = new pfm.a(te0.w.D(map3, new n(this, 3)), new a08.s(12, new ew2.q(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new a08.r(17, sVar), new ea9.c(5, t.f131811a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar, hVarW6);
        efm.r rVarMergeWith2 = ((InputTextDelegate) r87.getValue()).i.f121375b.mergeWith(((InputTextDelegate) r87.getValue()).f52575g.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith2, "mergeWith(...)");
        pfm.a aVar8 = new pfm.a(te0.w.D(rVarMergeWith2, new n(this, 1)), new a08.s(12, new ew2.q(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new a08.r(17, sVar), new ea9.c(5, y.f131815a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar, hVarW7);
        opi.b bVar2 = (opi.b) this.f131818m;
        efm.r rVarV = bVar2.V();
        d0 d0Var = (d0) this.k;
        efm.r rVarG3 = d0Var.G3();
        g1i.b bVar3 = d0Var.e;
        efm.r map4 = te0.w.l(rVarV, rVarG3).filter(new o(new f0d.k(14), 4)).map(new o(new f0d.k(15), 5)).map(new o(new eif.c(1, this.f131817l, k.class, "mapRepeatDialogConfig", "mapRepeatDialogConfig(Lcom/revolut/feature_exchange/impl/ui/exchange/recurring_order_settings/RecurringOrderSettingsContract$PeriodType;)Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;", 0, 29), 6));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        efm.r rVarF = o70.a.f(map4);
        x xVar = new x(1, this.f131818m, opi.d.class, "update", "update(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;)V", 0, 0);
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF.onErrorResumeNext(new a08.s(12, new ew2.q(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a08.r(17, xVar), new a08.r(17, sVar), new ea9.c(5, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r map5 = te0.w.l(bVar2.V(), d0Var.H3()).filter(new o(new f0d.k(16), 7)).map(new ey7.a(new f0d.k(13), 26)).map(new ey7.a(new x(1, this.f131817l, k.class, "mapStartDateDialogConfig", "mapStartDateDialogConfig(Lorg/joda/time/LocalDate;)Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;", 0, 1), 27));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        efm.r rVarF2 = o70.a.f(map5);
        x xVar2 = new x(1, this.f131818m, opi.d.class, "update", "update(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;)V", 0, 2);
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF2.onErrorResumeNext(new a08.s(12, new ew2.q(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new a08.r(17, xVar2), new a08.r(17, sVar), new ea9.c(5, function0J3));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        te0.e eVarD0 = ((m0) bVar3).D0();
        te0.s sVar3 = te0.s.f270018a;
        efm.r map6 = te0.w.l(eVarD0.c(sVar3), ((m0) bVar3).C0().c(sVar3)).map(new o(new n(this, 7), 3));
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        efm.r rVarF3 = o70.a.f(map6);
        eif.c cVar3 = new eif.c(1, view, l.class, "setItems", "setItems(Ljava/util/List;)V", 0, 28);
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarF3.onErrorResumeNext(new a08.s(12, new ew2.q(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new a08.r(17, cVar3), new a08.r(17, sVar), new ea9.c(5, function0J4));
        te0.w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
    }
}
