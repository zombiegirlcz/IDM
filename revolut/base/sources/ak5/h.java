package ak5;

import com.revolut.feature.crypto.remittance.impl.network.CryptoCounterpartiesService;
import com.revolut.feature.crypto.remittance.impl.ui.error.CryptoEmtStatusViewModelFactoryImpl;
import retrofit2.Converter;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f5687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5688b;

    public h(i iVar, int i) {
        this.f5687a = iVar;
        this.f5688b = i;
    }

    @Override // phm.a
    public final Object get() {
        i iVar = this.f5687a;
        int i = this.f5688b;
        switch (i) {
            case 0:
                return new hk5.b();
            case 1:
                return new ik5.d();
            case 2:
                return new ik5.a();
            case 3:
                dl3.f fVarC = iVar.f5689a.c();
                s.j(fVarC);
                return new vk5.c(fVarC);
            case 4:
                return new ik5.g();
            case 5:
                return new dk5.a();
            case 6:
                sf0.h hVarB = iVar.f5691c.b();
                s.j(hVarB);
                return new ik5.f(hVarB);
            case 7:
                return new gk5.a((CryptoCounterpartiesService) iVar.o.get());
            case 8:
                ik0.b bVarM = ((nj0.d) iVar.d).m();
                s.j(bVarM);
                return ek5.d.a(bVarM, (Converter.Factory) iVar.f5697n.get());
            case 9:
                ee0.a aVar = iVar.e;
                return ek5.c.a(fe0.d.a());
            case 10:
                return new CryptoEmtStatusViewModelFactoryImpl();
            case 11:
                return new sk5.a();
            case 12:
                return new hk5.a();
            case 13:
                return new hk5.c();
            case 14:
                return new zj5.c();
            default:
                throw new AssertionError(i);
        }
    }
}
