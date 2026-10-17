package n08;

import a08.f0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.ui.profile.pet.PetProfileActivity;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.oc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends bsi.a implements f {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wpi.e f210887j;
    public final ypi.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f08.d f210888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f08.a f210889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f9b.f f210890n;
    public final tpi.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g08.p f210891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g08.a f210892q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g08.h f210893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g08.o f210894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final opi.d f210895t;
    public final zd7.b u;
    public final mm.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l80.e f210896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u08.a f210897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e0 f210898y;
    public final ihm.f z;

    public c0(wpi.e navBar, ypi.i nextButtonView, f08.d router, f08.a presentationModel, f9b.f errorView, tpi.j progressView, g08.p profileUiBuilder, g08.a callVetUIBuilder, g08.h makeClaimUIBuilder, g08.o navBarUIBuilder, opi.d expandableDialogView, zd7.b imagePickerBottomDialog, mm.d actionDispatcher, l80.e dateProvider, u08.a clipboardDelegate, e0 screenMapper) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(profileUiBuilder, "profileUiBuilder");
        Intrinsics.checkNotNullParameter(callVetUIBuilder, "callVetUIBuilder");
        Intrinsics.checkNotNullParameter(makeClaimUIBuilder, "makeClaimUIBuilder");
        Intrinsics.checkNotNullParameter(navBarUIBuilder, "navBarUIBuilder");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(imagePickerBottomDialog, "imagePickerBottomDialog");
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(clipboardDelegate, "clipboardDelegate");
        Intrinsics.checkNotNullParameter(screenMapper, "screenMapper");
        this.f210887j = navBar;
        this.k = nextButtonView;
        this.f210888l = router;
        this.f210889m = presentationModel;
        this.f210890n = errorView;
        this.o = progressView;
        this.f210891p = profileUiBuilder;
        this.f210892q = callVetUIBuilder;
        this.f210893r = makeClaimUIBuilder;
        this.f210894s = navBarUIBuilder;
        this.f210895t = expandableDialogView;
        this.u = imagePickerBottomDialog;
        this.v = actionDispatcher;
        this.f210896w = dateProvider;
        this.f210897x = clipboardDelegate;
        this.f210898y = screenMapper;
        this.z = v0.a.d("create(...)");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        h view = (h) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        wpi.b bVar = (wpi.b) this.f210887j;
        NavBarWithBigTile navBarWithBigTile = bVar.f299341j;
        if (navBarWithBigTile == null) {
            Intrinsics.r("navBarWithBigTileView");
            throw null;
        }
        navBarWithBigTile.setVisibility(0);
        int i = R$drawable.uikit_icn_24_back;
        NavBarWithBigTile navBarWithBigTile2 = bVar.f299341j;
        if (navBarWithBigTile2 == null) {
            Intrinsics.r("navBarWithBigTileView");
            throw null;
        }
        navBarWithBigTile2.setNavigationButtonIcon(Integer.valueOf(i));
        ypi.i iVar = this.k;
        iVar.setVisible(false);
        iVar.setEnabled(false);
        f08.h hVar = (f08.h) this.f210889m;
        efm.r rVarDelay = te0.w.l(this.z, ((f08.k) hVar.f131015h).z0().c(te0.s.f270018a)).delay(800L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDelay, "delay(...)");
        efm.b bVarFlatMapCompletable = o70.a.f(rVarDelay).flatMapCompletable(new mzj.j(new j(this, 13), 11));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        m3l.d dVar = new m3l.d(3, new ms2.j(new BreadcrumbException(), 24));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        j7a.j jVar = new j7a.j(14, w.f210917a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new f0(25, sVar), jVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        te0.w.j0(bVar2, hVarW);
        sfm.b bVar3 = new sfm.b(te0.w.N(((f08.k) hVar.f131015h).d()), new ey7.a(new f08.f(hVar, 1), 8), 2);
        Intrinsics.checkNotNullExpressionValue(bVar3, "flatMapObservable(...)");
        efm.r rVarR = mo3.a.r(o70.a.f(nim.a.w(pd.b.r(bVar3, new f08.f(hVar, 2)), new j(this, 7))), this.o);
        Intrinsics.checkNotNullExpressionValue(rVarR, "withAbsenceDataProgress(...)");
        efm.r map = m70.a.g(rVarR, null, new mv5.h(26), 1).doOnNext(new mzj.j(new j(this, 15), 13)).doOnNext(new mzj.j(new j(this, 16), 14)).map(new mzj.j(new oc(28), 15));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarN = hx7.a.N(map, this.f210890n, false, false);
        mt9.c cVar = new mt9.c(view, this, 29);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new m3l.d(3, new ms2.j(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new f0(25, cVar), new f0(25, sVar), new j7a.j(14, function0J));
        te0.w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        NavBarWithBigTile navBarWithBigTile3 = bVar.f299341j;
        if (navBarWithBigTile3 == null) {
            Intrinsics.r("navBarWithBigTileView");
            throw null;
        }
        pfm.a aVar3 = new pfm.a(te0.w.D(navBarWithBigTile3.f59357t, new j(this, 1)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new f0(25, sVar), new j7a.j(14, t.f210914a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar2, hVarW2);
        NavBarWithBigTile navBarWithBigTile4 = bVar.f299341j;
        if (navBarWithBigTile4 == null) {
            Intrinsics.r("navBarWithBigTileView");
            throw null;
        }
        pfm.a aVar4 = new pfm.a(te0.w.D(navBarWithBigTile4.K(), new j(this, 8)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new f0(25, sVar), new j7a.j(14, s.f210913a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar2, hVarW3);
        PetProfileActivity petProfileActivity = (PetProfileActivity) view;
        ?? r2 = petProfileActivity.f76402x0;
        ?? r4 = petProfileActivity.C0;
        ?? r56 = petProfileActivity.u0;
        pfm.a aVar5 = new pfm.a(te0.w.D(((RowDelegate) r2.getValue()).f53218h, new j(this, 10)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new f0(25, sVar), new j7a.j(14, u.f210915a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar2, hVarW4);
        pfm.a aVar6 = new pfm.a(te0.w.D(((RowDelegate) petProfileActivity.f76402x0.getValue()).k, new j(this, 11)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new f0(25, sVar), new j7a.j(14, v.f210916a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar2, hVarW5);
        pfm.a aVar7 = new pfm.a(te0.w.D(((LargeActionButtonDelegate) petProfileActivity.A0.getValue()).d.f121375b, new j(this, 0)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new f0(25, sVar), new j7a.j(14, q.f210911a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar2, hVarW6);
        pfm.a aVar8 = new pfm.a(te0.w.D(((ListSubheaderDelegate) petProfileActivity.f76401w0.getValue()).f52707c, new j(this, 5)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new f0(25, sVar), new j7a.j(14, r.f210912a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar2, hVarW7);
        pfm.a aVar9 = new pfm.a(te0.w.D(((CellDetailsActionDelegate) petProfileActivity.z0.getValue()).d, new j(this, 12)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        ofm.h hVarW8 = aVar9.w(new f0(25, sVar), new j7a.j(14, n.f210908a));
        Intrinsics.checkNotNullExpressionValue(hVarW8, "subscribe(...)");
        te0.w.j0(bVar2, hVarW8);
        efm.r rVarHide = ((ae7.i) ((zd7.b) r56.getValue())).f3498l.map(new a9j.j(new a9h.b(29), 14)).hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        pfm.a aVar10 = new pfm.a(te0.w.D(rVarHide, new j(this, 2)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        ofm.h hVarW9 = aVar10.w(new f0(25, sVar), new j7a.j(14, o.f210909a));
        Intrinsics.checkNotNullExpressionValue(hVarW9, "subscribe(...)");
        te0.w.j0(bVar2, hVarW9);
        efm.r rVarHide2 = ((ae7.i) ((zd7.b) r56.getValue())).f3499m.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        pfm.a aVar11 = new pfm.a(te0.w.D(rVarHide2, new j(this, 3)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar11, "onErrorResumeNext(...)");
        ofm.h hVarW10 = aVar11.w(new f0(25, sVar), new j7a.j(14, p.f210910a));
        Intrinsics.checkNotNullExpressionValue(hVarW10, "subscribe(...)");
        te0.w.j0(bVar2, hVarW10);
        pfm.a aVar12 = new pfm.a(te0.w.D(((PlainTextWarningDelegate) petProfileActivity.B0.getValue()).d.f121375b, new j(this, 4)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar12, "onErrorResumeNext(...)");
        ofm.h hVarW11 = aVar12.w(new f0(25, sVar), new j7a.j(14, y.f210919a));
        Intrinsics.checkNotNullExpressionValue(hVarW11, "subscribe(...)");
        te0.w.j0(bVar2, hVarW11);
        pfm.a aVar13 = new pfm.a(te0.w.D(((TextDelegate) petProfileActivity.y0.getValue()).d, new j(this, 9)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar13, "onErrorResumeNext(...)");
        ofm.h hVarW12 = aVar13.w(new f0(25, sVar), new j7a.j(14, x.f210918a));
        Intrinsics.checkNotNullExpressionValue(hVarW12, "subscribe(...)");
        te0.w.j0(bVar2, hVarW12);
        efm.r rVarSkipWhile = hVar.l3().skipWhile(new mzj.j(new oc(27), 9));
        Intrinsics.checkNotNullExpressionValue(rVarSkipWhile, "skipWhile(...)");
        efm.b bVarFlatMapCompletable2 = m70.a.h(rVarSkipWhile, new mig.a(11), null, new mv5.h(25), 2).flatMapCompletable(new mzj.j(new j(this, 6), 10));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        m3l.d dVar2 = new m3l.d(3, new ms2.j(new BreadcrumbException(), 29));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar14 = new pfm.a(bVarFlatMapCompletable2, dVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar14, "onErrorResumeNext(...)");
        ofm.h hVarW13 = aVar14.w(new f0(25, sVar), new j7a.j(14, b0.f210884a));
        Intrinsics.checkNotNullExpressionValue(hVarW13, "subscribe(...)");
        te0.w.j0(bVar2, hVarW13);
        efm.r rVarMerge = efm.r.merge(((TwinHorizontalButtonDelegate) r4.getValue()).f53572c.f121375b.map(new mzj.j(new oc(25), 7)), ((TwinHorizontalButtonDelegate) r4.getValue()).d.f121375b.map(new mzj.j(new oc(26), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        pfm.a aVar15 = new pfm.a(te0.w.D(rVarMerge, new j(this, 14)), new m3l.d(3, new ms2.j(new BreadcrumbException(), 27)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar15, "onErrorResumeNext(...)");
        ofm.h hVarW14 = aVar15.w(new f0(25, sVar), new j7a.j(14, z.f210920a));
        Intrinsics.checkNotNullExpressionValue(hVarW14, "subscribe(...)");
        te0.w.j0(bVar2, hVarW14);
    }

    public final pfm.a Q(Date date) {
        efm.r rVarR = mo3.a.r(o70.a.f(((f08.h) this.f210889m).l3()), this.o);
        Intrinsics.checkNotNullExpressionValue(rVarR, "withAbsenceDataProgress(...)");
        efm.d0 d0VarFirstOrError = hx7.a.N(m70.a.g(rVarR, null, new mv5.h(27), 1), this.f210890n, false, false).firstOrError();
        mzj.j jVar = new mzj.j(new mt9.c(date, this, 27), 12);
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, jVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.h R() {
        f08.k kVar = (f08.k) ((f08.h) this.f210889m).f131015h;
        pfm.h hVar = new pfm.h(new la8.j(this, new zd7.a(((g) kVar.e.getValue(kVar, f08.k.f131021g[3]).get()) == g.CUSTOM, null, 30), 19), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final pfm.h S(rp0.y yVar) {
        pfm.h hVar = new pfm.h(new k(this, yVar), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
