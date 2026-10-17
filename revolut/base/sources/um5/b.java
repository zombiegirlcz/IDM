package um5;

import com.revolut.feature.crypto.tfr.validation.impl.data.network.CryptoTfrService;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f281231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f281232b;

    public b(c cVar, int i) {
        this.f281231a = cVar;
        this.f281232b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f281231a;
        nj0.a aVar = cVar.f281234b;
        int i = this.f281232b;
        if (i == 0) {
            return new an5.a();
        }
        if (i == 1) {
            return new rm5.a((nm5.f) cVar.f281239l.get());
        }
        if (i == 2) {
            return new nm5.g((nm5.b) cVar.k.get());
        }
        if (i == 3) {
            return new nm5.b((CryptoTfrService) cVar.f281238j.get());
        }
        if (i != 4) {
            if (i == 5) {
                return new nm5.d((nm5.b) cVar.k.get());
            }
            throw new AssertionError(i);
        }
        om5.a aVar2 = cVar.f281233a;
        ik0.b bVarM = ((nj0.d) aVar).m();
        s.j(bVarM);
        return om5.b.a(aVar2, bVarM, ((nj0.d) aVar).d());
    }
}
