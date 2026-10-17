package il8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_remote_login.impl.data.service.JuniorRemoteLoginService;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f162132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162133b;

    public a(b bVar, int i) {
        this.f162132a = bVar;
        this.f162133b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f162132a;
        nj0.a aVar = bVar.f162134a;
        ee0.a aVar2 = bVar.f162135b;
        int i = this.f162133b;
        if (i == 0) {
            return new fl8.d((JuniorRemoteLoginService) bVar.f.get(), (ne0.j) bVar.f162137g.get(), (ue0.c) bVar.f162138h.get());
        }
        if (i == 1) {
            ik0.b bVarM = ((nj0.d) aVar).m();
            s.j(bVarM);
            return q.a(((nj0.d) aVar).d(), bVarM);
        }
        if (i == 2) {
            return new ne0.d();
        }
        if (i != 3) {
            if (i == 4) {
                return new jl8.c(bVar.e.e());
            }
            if (i == 5) {
                return new if0.a(ImmutableSet.of((od0.e) bVar.f162138h.get()));
            }
            throw new AssertionError(i);
        }
        je0.d dVarD = aVar2.d();
        s.j(dVarD);
        yk0.a aVarB = bVar.f162136c.b();
        s.j(aVarB);
        xe0.f fVarF = aVar2.f();
        s.j(fVarF);
        return ige.d.p(dVarD, fVarF, aVarB);
    }
}
