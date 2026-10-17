package wyc;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.selfserve.sot.impl.ui.evidencetypes.EvidenceTypesFragment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends bsi.a implements c {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pyc.h f301206j;
    public final pyc.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f301207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mxc.b f301208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tpi.j f301209n;

    public b0(pyc.h router, pyc.f presentationModel, b transactionMapper, mxc.b errorItemsFactory, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(transactionMapper, "transactionMapper");
        Intrinsics.checkNotNullParameter(errorItemsFactory, "errorItemsFactory");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.f301206j = router;
        this.k = presentationModel;
        this.f301207l = transactionMapper;
        this.f301208m = errorItemsFactory;
        this.f301209n = progressView;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        efm.b bVarQ = Q();
        ly7.g gVar = new ly7.g(26, new wrj.p(new BreadcrumbException(), 4));
        bVarQ.getClass();
        pfm.a aVar2 = new pfm.a(bVarQ, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        t1i.n nVar = new t1i.n(16, y.f301236a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new n1i.b(26, sVar), nVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        EvidenceTypesFragment evidenceTypesFragment = (EvidenceTypesFragment) view;
        pfm.a aVar3 = new pfm.a(te0.w.D(te0.w.a0(((SelectableDelegate) evidenceTypesFragment.f85908h0.getValue()).r(), new p(1)), new w(this, 0)), new ly7.g(26, new wrj.p(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new n1i.b(26, sVar), new t1i.n(16, z.f301237a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        efm.b bVarSwitchMapCompletable = ((ErrorDelegate) evidenceTypesFragment.g0.getValue()).f52226c.switchMapCompletable(new wx9.b(new w(this, 1), 4));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        ly7.g gVar2 = new ly7.g(26, new wrj.p(new BreadcrumbException(), 6));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable, gVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new n1i.b(26, sVar), new t1i.n(16, a0.f301205a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
    }

    public final efm.b Q() {
        pyc.t tVar = (pyc.t) this.k;
        efm.r rVarS3 = tVar.s3();
        oyc.c cVar = (oyc.c) tVar.d.f188258b;
        efm.r map = u1.d(rVarS3, nim.a.w(cVar.f230941g.f(Unit.f186387a, false), new oyc.a(cVar, 7))).map(new wx9.b(new w(this, 2), 5));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.b bVarIgnoreElements = o70.a.f(map).doOnNext(new wx9.b(new w(this, 3), 6)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }
}
