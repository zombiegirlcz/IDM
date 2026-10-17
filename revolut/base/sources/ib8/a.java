package ib8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior.pending_graduation.impl.data.service.JuniorGraduationService;
import gb8.g;
import ne0.j;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f160116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f160117b;

    public a(b bVar, int i) {
        this.f160116a = bVar;
        this.f160117b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f160116a;
        nj0.a aVar = bVar.f160118a;
        ee0.a aVar2 = bVar.f160120c;
        int i = this.f160117b;
        if (i == 0) {
            JuniorGraduationService juniorGraduationService = (JuniorGraduationService) bVar.f160122h.get();
            gte.a aVarB = bVar.f160119b.b();
            s.j(aVarB);
            return new gb8.b(juniorGraduationService, aVarB, (j) bVar.i.get(), (ue0.c) bVar.f160123j.get());
        }
        if (i == 1) {
            ik0.b bVarM = ((nj0.d) aVar).m();
            s.j(bVarM);
            return e.a(((nj0.d) aVar).d(), bVarM);
        }
        if (i == 2) {
            return new ne0.d();
        }
        if (i != 3) {
            if (i == 4) {
                return new g((j) bVar.i.get(), (ue0.c) bVar.f160123j.get());
            }
            if (i == 5) {
                return new if0.a(ImmutableSet.of((od0.e) bVar.f160123j.get()));
            }
            throw new AssertionError(i);
        }
        je0.d dVarD = aVar2.d();
        s.j(dVarD);
        yk0.a aVarB2 = bVar.d.b();
        s.j(aVarB2);
        f fVarF = aVar2.f();
        s.j(fVarF);
        return hy1.g.m(dVarD, fVarF, aVarB2);
    }
}
