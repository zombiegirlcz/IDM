package gie;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ash.j f144126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wn.a f144127m;

    public b0(ash.j widgetsView, wn.a adsTrackingControllerModelExtension) {
        Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        this.f144126l = widgetsView;
        this.f144127m = adsTrackingControllerModelExtension;
    }

    @Override // yji.n
    public final void D2() {
        yji.n.j2(this, rd0.e.b(this.f144126l.getP().g()), null, new a0(this, null), 3);
    }
}
