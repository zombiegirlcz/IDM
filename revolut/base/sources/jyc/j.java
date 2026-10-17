package jyc;

import com.revolut.feature.selfserve.sot.api.navigation.SotDestination;
import kl.c0;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f179391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f179392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f179393c;

    public j(h hVar, k kVar, int i) {
        this.f179391a = hVar;
        this.f179392b = kVar;
        this.f179393c = i;
    }

    @Override // phm.a
    public final Object get() {
        k kVar = this.f179392b;
        int i = this.f179393c;
        if (i == 0) {
            return kxa.j.m((j60.a) kVar.d.get());
        }
        if (i == 1) {
            return y.r((com.revolut.kompot.navigable.a) kVar.f179395b.get(), (rp0.m) kVar.f179396c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        SotDestination.Config config = kVar.f179394a;
        h hVar = this.f179391a;
        return new com.revolut.feature.selfserve.sot.impl.ui.flow.e(config, hVar.m(), new c0(hVar.f179383b.a()), new k7i.i(hVar.f.a(), hVar.m()), new xyc.f(), (j60.a) kVar.d.get());
    }
}
