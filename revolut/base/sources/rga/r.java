package rga;

import kotlin.jvm.internal.Intrinsics;
import mga.f0;
import mga.k0;
import mga.l0;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f254065c;
    public final f0 d;
    public final on.a e;
    public final gte.a f;

    public r(l0 screen, f0 controllerModelExtension, on.a viewableRecordItemCollector, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollector, "viewableRecordItemCollector");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f254065c = screen;
        this.d = controllerModelExtension;
        this.e = viewableRecordItemCollector;
        this.f = featureToggleInteractor;
    }

    @Override // yji.d
    public final void M() {
        if (aha.a.a(this.f)) {
            yji.d.H(this, ((sn.a) this.e).b(this.f254065c.g0(), true), new r5e.e(this, null, 20), 3);
        }
    }
}
