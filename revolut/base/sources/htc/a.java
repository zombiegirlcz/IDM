package htc;

import com.revolut.feature.second_device_login.impl.network.SecondDeviceLoginService;
import sri.m;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f155341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155342b;

    public a(b bVar, int i) {
        this.f155341a = bVar;
        this.f155342b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f155341a;
        nj0.a aVar = bVar.f155345c;
        int i = this.f155342b;
        if (i == 0) {
            return new jtc.b();
        }
        if (i == 1) {
            return new jtc.a((m) bVar.f155347h.get());
        }
        if (i == 2) {
            return hsi.b.p(bVar.f155343a);
        }
        if (i == 3) {
            return new ltc.a((SecondDeviceLoginService) bVar.f155348j.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        ik0.b bVarM = ((nj0.d) aVar).m();
        s.j(bVarM);
        return g.a(((nj0.d) aVar).d(), bVarM);
    }
}
