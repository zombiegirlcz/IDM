package zyb;

import aw0.n6;
import cli.y;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import nyb.k;
import q06.l;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements e {
    public final RevPointsBottomSheetScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f326404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f326405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f326406r;

    public h(znc.l stateMapper, RevPointsBottomSheetScreenContract$InputData inputData, k revPointsInteractor, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = inputData;
        this.f326404p = revPointsInteractor;
        this.f326405q = deeplinkRouter;
        this.f326406r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        e0 context = this.o.f83774a;
        k kVar = this.f326404p;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jxb.l lVar = (jxb.l) kVar.f220804a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rd0.e.b(lVar.k.e(context, loadingStrategy)), null, null, new zt4.l(this, null, 15), 3);
    }

    public final void I2(n6 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        B2();
        Object obj2 = model.k;
        if (obj2 instanceof azb.a) {
            l2(new zr5.k(this, obj2, null, 17), new yi5.b(26));
        } else if (obj2 instanceof azb.b) {
            C1(new BridgeDestination(u0.f(((azb.b) obj2).f11423a)));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f326406r;
    }
}
