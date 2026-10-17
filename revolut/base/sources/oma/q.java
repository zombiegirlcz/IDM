package oma;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.confirmation.ProfileDetailsConfirmationActivity;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oid.y;
import om4.l3;
import om4.m1;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends bsi.a implements b {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vla.d f226794j;
    public final xpi.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f226795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tri.c f226796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ypi.i f226797n;
    public final f9b.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f226798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bma.b f226799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k3l.b f226800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r3l.a f226801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tpi.j f226802t;
    public final kpi.c u;
    public final ihm.b v;

    public q(vla.d mapper, xpi.g navBarWithToolbarView, c router, tri.c backButtonView, ypi.i nextButtonView, f9b.f errorView, g presentationModel, bma.b profileDetailsInteractor, k3l.b statusDialogView, r3l.a shotDialogView, tpi.j progressView, kpi.c activityResultDelegate) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(profileDetailsInteractor, "profileDetailsInteractor");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(shotDialogView, "shotDialogView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        this.f226794j = mapper;
        this.k = navBarWithToolbarView;
        this.f226795l = router;
        this.f226796m = backButtonView;
        this.f226797n = nextButtonView;
        this.o = errorView;
        this.f226798p = presentationModel;
        this.f226799q = profileDetailsInteractor;
        this.f226800r = statusDialogView;
        this.f226801s = shotDialogView;
        this.f226802t = progressView;
        this.u = activityResultDelegate;
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.v = bVarE;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.profile_update_details_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.k;
        cVar.p0(textLocalisedClause);
        cVar.n0(new TextLocalisedClause(R$string.profile_update_details_title, null, null, 14));
        cVar.Y(new TextLocalisedClause(R$string.profile_update_details_subtitle, null, null, 14));
        cVar.Z(true);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        efm.b bVarSwitchMapCompletable = cVar.Q().mergeWith(this.f226796m.f273801b).switchMapCompletable(new y(new h(this, 2), 13));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        lhi.b bVar = new lhi.b(15, new n(new BreadcrumbException(), 1));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, bVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        j7a.j jVar = new j7a.j(28, o.f226792a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new m3l.d(10, sVar), jVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, hVarW);
        ypi.i iVar = this.f226797n;
        iVar.setVisible(false);
        iVar.f(new TextLocalisedClause(R.string.common_action_confirm, null, null, 14));
        iVar.g();
        efm.r rVarA = iVar.a();
        ok7.c cVar2 = new ok7.c(view, 13);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarA.onErrorResumeNext(new lhi.b(15, new n(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new m3l.d(10, cVar2), new m3l.d(10, sVar), new j7a.j(28, function0J));
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.b bVarSwitchMapCompletable2 = iVar.s().switchMapCompletable(new y(new h(this, 5), 18));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        lhi.b bVar3 = new lhi.b(15, new n(new BreadcrumbException(), 3));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable2, bVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new m3l.d(10, sVar), new j7a.j(28, p.f226793a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
        ProfileDetailsConfirmationActivity profileDetailsConfirmationActivity = (ProfileDetailsConfirmationActivity) view;
        efm.b bVarSwitchMapCompletable3 = profileDetailsConfirmationActivity.f81366w0.d.switchMapCompletable(new y(new h(this, 0), 15));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable3, "switchMapCompletable(...)");
        lhi.b bVar4 = new lhi.b(15, new o3l.m(new BreadcrumbException(), 29));
        bVarSwitchMapCompletable3.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable3, bVar4, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new m3l.d(10, sVar), new j7a.j(28, l.f226788a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar2, hVarW3);
        ihm.f fVar = profileDetailsConfirmationActivity.f81367x0.f52371h.f121375b;
        h hVar = new h(this, 7);
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = fVar.onErrorResumeNext(new lhi.b(15, new o3l.m(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new m3l.d(10, hVar), new m3l.d(10, sVar), new j7a.j(28, function0J2));
        w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.b bVarSwitchMapCompletable4 = ((k3l.d) this.f226800r).f180813j.switchMapCompletable(new y(new h(this, 8), 19));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable4, "switchMapCompletable(...)");
        lhi.b bVar5 = new lhi.b(15, new n(new BreadcrumbException(), 0));
        bVarSwitchMapCompletable4.getClass();
        pfm.a aVar5 = new pfm.a(bVarSwitchMapCompletable4, bVar5, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new m3l.d(10, sVar), new j7a.j(28, m.f226789a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar2, hVarW4);
        efm.b bVarSwitchMapCompletable5 = profileDetailsConfirmationActivity.f81365v0.d.f121375b.switchMapCompletable(new y(new h(this, 1), 10));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable5, "switchMapCompletable(...)");
        lhi.b bVar6 = new lhi.b(15, new o3l.m(new BreadcrumbException(), 26));
        bVarSwitchMapCompletable5.getClass();
        pfm.a aVar6 = new pfm.a(bVarSwitchMapCompletable5, bVar6, 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new m3l.d(10, sVar), new j7a.j(28, k.f226787a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar2, hVarW5);
        efm.r map = this.v.switchMap(new y(new h(this, 9), 20)).map(new y(new h(this, 10), 21));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF = o70.a.f(map);
        ofg.a aVar7 = new ofg.a(view, this, 28);
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF.onErrorResumeNext(new lhi.b(15, new o3l.m(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new m3l.d(10, aVar7), new m3l.d(10, sVar), new j7a.j(28, function0J3));
        w.j0(bVar2, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.b bVarSwitchMapCompletable6 = i26.l.g(this.u.N(8361)).map(new y(new l3(18), 11)).switchMapCompletable(new y(new m1(1, this.f226798p, g.class, "setAccountPurposes", "setAccountPurposes(Ljava/util/List;)Lio/reactivex/Completable;", 0, 2), 12));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable6, "switchMapCompletable(...)");
        lhi.b bVar7 = new lhi.b(15, new o3l.m(new BreadcrumbException(), 25));
        bVarSwitchMapCompletable6.getClass();
        pfm.a aVar8 = new pfm.a(bVarSwitchMapCompletable6, bVar7, 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar8.w(new m3l.d(10, sVar), new j7a.j(28, j.f226786a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar2, hVarW6);
    }
}
