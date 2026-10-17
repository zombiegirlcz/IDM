package mn8;

import com.revolut.feature.junior_settings.impl.services.JuniorDeviceService;
import com.revolut.feature.junior_settings.impl.services.JuniorSettingsService;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f207390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f207391b;

    public a(b bVar, int i) {
        this.f207390a = bVar;
        this.f207391b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f207390a;
        int i = this.f207391b;
        switch (i) {
            case 0:
                return new un8.h((JuniorSettingsService) bVar.f.get(), (ne0.j) bVar.f207396h.get(), (ue0.c) bVar.i.get());
            case 1:
                return mj8.n.o(bVar.f207392a, ((nj0.d) bVar.f207393b).f());
            case 2:
                return new ne0.d();
            case 3:
                je0.d dVarB = bVar.f207394c.b();
                vc.s.j(dVarB);
                yk0.a aVarB = bVar.d.b();
                vc.s.j(aVarB);
                xe0.f fVarF = bVar.f207394c.f();
                vc.s.j(fVarF);
                return mj8.n.p(dVarB, fVarF, aVarB);
            case 4:
                return new un8.b((JuniorDeviceService) bVar.k.get(), (ne0.j) bVar.f207398l.get(), (ue0.c) bVar.f207399m.get());
            case 5:
                ik0.b bVarM = ((nj0.d) bVar.f207393b).m();
                vc.s.j(bVarM);
                return t.a(((nj0.d) bVar.f207393b).d(), bVarM);
            case 6:
                je0.d dVarD = bVar.f207394c.d();
                vc.s.j(dVarD);
                yk0.a aVarB2 = bVar.d.b();
                vc.s.j(aVarB2);
                xe0.f fVarF2 = bVar.f207394c.f();
                vc.s.j(fVarF2);
                return mj8.n.x(dVarD, fVarF2, aVarB2);
            case 7:
                return new pn8.a();
            case 8:
                ik0.b bVarM2 = ((nj0.d) bVar.f207393b).m();
                vc.s.j(bVarM2);
                return y.a(((nj0.d) bVar.f207393b).d(), bVarM2);
            case 9:
                je0.d dVarD2 = bVar.f207394c.d();
                vc.s.j(dVarD2);
                yk0.a aVarB3 = bVar.d.b();
                vc.s.j(aVarB3);
                xe0.f fVarF3 = bVar.f207394c.f();
                vc.s.j(fVarF3);
                return mj8.n.y(dVarD2, fVarF3, aVarB3);
            default:
                throw new AssertionError(i);
        }
    }
}
