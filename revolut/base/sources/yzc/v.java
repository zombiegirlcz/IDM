package yzc;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.selfserve.sow.impl.ui.evidencelist.SowEvidenceListFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends pri.a implements i {

    @NotNull
    public static final n Companion = new n();
    public final ozc.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f318087j;
    public final swl.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t70.g f318088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ozc.f f318089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f318090n;

    public v(ozc.d presentationModel, h mapper, swl.a mediaPickerPresenterDelegate, t70.g localization, ozc.f router, c filter) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(mediaPickerPresenterDelegate, "mediaPickerPresenterDelegate");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.i = presentationModel;
        this.f318087j = mapper;
        this.k = mediaPickerPresenterDelegate;
        this.f318088l = localization;
        this.f318089m = router;
        this.f318090n = filter;
        P(zhm.u.c(mediaPickerPresenterDelegate));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        j view = (j) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        ozc.t tVar = (ozc.t) this.i;
        efm.r map = w.l(tVar.v3(), tVar.y3()).map(new a(12, new m(this, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF = o70.a.f(map);
        yuc.p pVar = new yuc.p(view, 25);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new wl3.e(7, new yma.w(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new xz7.f(2, pVar), new xz7.f(2, function1K), new p(0, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        SowEvidenceListFragment sowEvidenceListFragment = (SowEvidenceListFragment) view;
        efm.b bVarSwitchMapCompletable = ((RowDelegate) sowEvidenceListFragment.f0.getValue()).f53218h.filter(new a(1, new yy9.s(13))).switchMapCompletable(new a(2, new m(this, 1)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        Function1 function1K2 = K();
        wl3.e eVar = new wl3.e(7, new yma.w(new BreadcrumbException(), 5));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, eVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new xz7.f(2, function1K2), new p(0, q.f318082a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        ?? r110 = sowEvidenceListFragment.f0;
        efm.r rVarFlatMapMaybe = ((RowDelegate) r110.getValue()).f53218h.filter(new a(3, new yy9.s(14))).flatMapMaybe(new a(5, new m(this, 2)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapMaybe, "flatMapMaybe(...)");
        r0 r0VarD = w.D(rVarFlatMapMaybe, new yea.l(1, this.f318089m, ozc.f.class, "openImage", "openImage(Lcom/revolut/feature/selfserve/sow/impl/ui/evidencelist/SowEvidenceListContract$AttachedFile;)Lio/reactivex/Completable;", 0, 19));
        Function1 function1K3 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new wl3.e(7, new yma.w(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new xz7.f(2, function1K3), new p(0, r.f318083a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.b bVarSwitchMapCompletable2 = ((RowDelegate) r110.getValue()).k.filter(new a(9, new yy9.s(15))).map(new a(10, new yy9.s(16))).switchMapCompletable(new a(11, new m(this, 7)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        Function1 function1K4 = K();
        wl3.e eVar2 = new wl3.e(7, new yma.w(new BreadcrumbException(), 7));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable2, eVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new xz7.f(2, function1K4), new p(0, s.f318084a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        efm.b bVarSwitchMapCompletable3 = tVar.w3().switchMapCompletable(new a(4, new m(this, 3)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable3, "switchMapCompletable(...)");
        Function1 function1K5 = K();
        wl3.e eVar3 = new wl3.e(7, new yma.w(new BreadcrumbException(), 3));
        bVarSwitchMapCompletable3.getClass();
        pfm.a aVar5 = new pfm.a(bVarSwitchMapCompletable3, eVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new xz7.f(2, function1K5), new p(0, o.f318079a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        efm.r rVarFilter = tVar.y3().filter(new a(7, new m(this, 5)));
        int i = 8;
        efm.b bVarSwitchMapCompletable4 = rVarFilter.switchMapCompletable(new a(i, new m(this, 6)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable4, "switchMapCompletable(...)");
        Function1 function1K6 = K();
        wl3.e eVar4 = new wl3.e(7, new yma.w(new BreadcrumbException(), i));
        bVarSwitchMapCompletable4.getClass();
        pfm.a aVar6 = new pfm.a(bVarSwitchMapCompletable4, eVar4, 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new xz7.f(2, function1K6), new p(0, t.f318085a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar, hVarW5);
    }
}
