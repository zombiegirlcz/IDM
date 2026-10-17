package n86;

import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import rp0.m;
import vc.s;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f213240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f213241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f213242c;

    public f(d dVar, g gVar, int i) {
        this.f213240a = dVar;
        this.f213241b = gVar;
        this.f213242c = i;
    }

    @Override // phm.a
    public final Object get() {
        g gVar = this.f213241b;
        int i = this.f213242c;
        if (i == 0) {
            return kxa.j.m((j60.a) gVar.d.get());
        }
        if (i == 1) {
            return y.r((com.revolut.kompot.navigable.a) gVar.f213244b.get(), (m) gVar.f213245c.get());
        }
        if (i == 2) {
            return new m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        DeviceManagementDestination.Config config = gVar.f213243a;
        d dVar = this.f213240a;
        kdh.b bVarD = dVar.d();
        r86.d dVar2 = new r86.d(new r86.b());
        tla.d dVarB = dVar.f.b();
        s.j(dVarB);
        return new com.revolut.feature.devicemanagement.impl.ui.flow.b(config, bVarD, dVar2, dVarB, (j60.a) gVar.d.get());
    }
}
