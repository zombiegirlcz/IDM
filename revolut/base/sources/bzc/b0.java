package bzc;

import bs9.i0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import com.revolut.feature.selfserve.sot.impl.ui.status.StatusFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends bsi.a implements c {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pyc.h f19951j;
    public final pyc.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f19952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mxc.b f19953m;

    public b0(pyc.h router, pyc.f presentationModel, b mapper, mxc.b errorItemsFactory) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(errorItemsFactory, "errorItemsFactory");
        this.f19951j = router;
        this.k = presentationModel;
        this.f19952l = mapper;
        this.f19953m = errorItemsFactory;
    }

    public static SubmissionEvidence Q(List list, a3 a3Var) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((SubmissionEvidence) next).d.f85876a, a3Var.f272581b)) {
                break;
            }
        }
        return (SubmissionEvidence) next;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        efm.b bVarR = R();
        a08.r rVar = new a08.r(11, new b9i.h(new BreadcrumbException(), 21));
        bVarR.getClass();
        pfm.a aVar2 = new pfm.a(bVarR, rVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        a08.q qVar = new a08.q(13, y.f19984a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new a0d.g(5, sVar), qVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        StatusFragment statusFragment = (StatusFragment) view;
        pfm.a aVar3 = new pfm.a(te0.w.D(te0.w.a0(((RowDelegate) statusFragment.f0.getValue()).f53218h, new bxg.t(10)), new w(this, 2)), new a08.r(11, new b9i.h(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new a0d.g(5, sVar), new a08.q(13, z.f19985a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        efm.b bVarSwitchMapCompletable = ((ErrorDelegate) statusFragment.g0.getValue()).f52226c.switchMapCompletable(new i0(22, new w(this, 3)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        a08.r rVar2 = new a08.r(11, new b9i.h(new BreadcrumbException(), 23));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable, rVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new a0d.g(5, sVar), new a08.q(13, a0.f19950a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
    }

    public final efm.b R() {
        efm.r map = ((pyc.t) this.k).f240801g.o().map(new i0(20, new w(this, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.b bVarIgnoreElements = o70.a.f(map).doOnNext(new i0(21, new w(this, 1))).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }
}
