package vxc;

import com.revolut.feature.selfserve.entity.config.shared.services.EntityConfigService;
import vc.s;
import wpg.v;
import yxc.r;
import yxc.u;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f293041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f293042b;

    public a(b bVar, int i) {
        this.f293041a = bVar;
        this.f293042b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f293041a;
        int i = this.f293042b;
        switch (i) {
            case 0:
                ue0.c cVar = (ue0.c) bVar.i.get();
                EntityConfigService entityConfigService = (EntityConfigService) bVar.f293048j.get();
                ne0.j jVar = (ne0.j) bVar.k.get();
                sf0.h hVarB = bVar.e.b();
                s.j(hVarB);
                z9l.h hVar = (z9l.h) bVar.f.f293076c.get();
                s.j(hVar);
                return new ayc.i(cVar, entityConfigService, jVar, hVarB, hVar);
            case 1:
                je0.d dVarD = bVar.f293043a.d();
                s.j(dVarD);
                yk0.a aVarB = bVar.f293044b.b();
                s.j(aVarB);
                xe0.f fVarF = bVar.f293043a.f();
                s.j(fVarF);
                return v.m(dVarD, fVarF, aVarB);
            case 2:
                return wxc.e.a(((nj0.d) bVar.f293045c).d(), bVar.d);
            case 3:
                return new ne0.d();
            case 4:
                l80.e eVarH = bVar.f293046g.h();
                s.j(eVarH);
                return new yxc.s(eVarH);
            case 5:
                z9l.j jVar2 = (z9l.j) bVar.f293050m.get();
                yxc.l lVarA = bVar.f.a();
                s.j(lVarA);
                return new r(jVar2, lVarA);
            case 6:
                e4m.e eVar = bVar.o;
                h hVar2 = bVar.f;
                z9l.a aVar = (z9l.a) eVar.get();
                yxc.l lVarA2 = hVar2.a();
                s.j(lVarA2);
                z9l.c cVar2 = (z9l.c) hVar2.f293074a.get();
                s.j(cVar2);
                z9l.k kVar = (z9l.k) bVar.f293052p.get();
                z9l.i iVar = (z9l.i) bVar.f293051n.get();
                rxc.e eVar2 = (rxc.e) bVar.d.f250070c.get();
                s.j(eVar2);
                return new yxc.j(aVar, lVarA2, cVar2, kVar, iVar, eVar2);
            case 7:
                return new yxc.b();
            case 8:
                z9l.c cVar3 = (z9l.c) bVar.f.f293074a.get();
                s.j(cVar3);
                jsb.b bVar2 = (jsb.b) ((isb.a) bVar.f293047h).f168170b.get();
                s.j(bVar2);
                return new u(cVar3, bVar2);
            case 9:
                return new yxc.e((z9l.a) bVar.o.get(), (z9l.k) bVar.f293052p.get(), new yxc.g());
            case 10:
                bal.a aVar2 = (bal.a) bVar.f293049l.get();
                f80.a aVarX = bVar.f293046g.x();
                s.j(aVarX);
                return new byc.k(aVar2, aVarX, (z9l.d) bVar.f293056t.get(), ((s41.a) bVar.d.f250069b).d());
            case 11:
                return new yxc.g();
            default:
                throw new AssertionError(i);
        }
    }
}
