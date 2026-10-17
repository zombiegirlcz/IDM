package jxk;

import efm.r;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends wwk.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f179244l;

    public b(wwk.c router, e presenterDelegate) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presenterDelegate, "presenterDelegate");
        this.f179244l = presenterDelegate;
    }

    @Override // wwk.b
    public final vkm.d Z2() {
        r rVarDistinctUntilChanged = rd0.e.c(this.f179244l.f179246h.f132450a.f268116a.C0("trading_hours_animation_showed", Boolean.TYPE), g.f186406a).map(new t45.a(new t3b.g(26), 9)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarTake = rVarDistinctUntilChanged.take(1L);
        Intrinsics.checkNotNullExpressionValue(rVarTake, "take(...)");
        return rd0.e.b(rVarTake);
    }

    @Override // wwk.b
    public final void b3(boolean z) {
        e eVar = this.f179244l;
        if (z) {
            eVar.getClass();
            return;
        }
        com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, eVar.f179246h.f132450a.f268116a, "trading_hours_animation_showed", Boolean.TRUE);
    }
}
