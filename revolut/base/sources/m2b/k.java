package m2b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cfd.impl.screens.maintenance_margin.CfdMaintenanceMarginControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5b.c f201846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CfdMaintenanceMarginControllerContract$InputData f201847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f201848c;
    public final e4m.e d;
    public final e4m.e e;

    public k(v vVar, CfdMaintenanceMarginControllerContract$InputData cfdMaintenanceMarginControllerContract$InputData, h5b.c cVar) {
        this.f201846a = cVar;
        this.f201847b = cfdMaintenanceMarginControllerContract$InputData;
        int i = 6;
        this.f201848c = e4m.b.b(new lzk.b(vVar, this, 0, i));
        this.d = e4m.b.b(new lzk.b(vVar, this, 2, i));
        this.e = e4m.b.b(new lzk.b(vVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f201848c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
