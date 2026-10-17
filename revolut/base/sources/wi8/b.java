package wi8;

import a3e.u;
import com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.JuniorCardProfileScreenContract;
import vc.s;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f297839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f297840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f297841c;

    public b(e eVar, a aVar, c cVar) {
        this.f297839a = eVar;
        this.f297840b = aVar;
        this.f297841c = cVar;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f297841c;
        e eVar = cVar.f297843b;
        u uVar = new u(new aj8.a(eVar.f297847a.d(), eVar.a()));
        JuniorCardProfileScreenContract.Input input = cVar.f297842a;
        e eVar2 = this.f297839a;
        hj8.a aVarA = eVar2.f.a();
        s.j(aVarA);
        n nVarB = eVar2.d.b();
        yi8.g gVar = (yi8.g) this.f297840b.d.get();
        xi8.b bVarA = eVar2.a();
        c70.a aVarZ = eVar2.f297847a.z();
        s.j(aVarZ);
        return new com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.a(uVar, input, aVarA, nVarB, gVar, bVarA, aVarZ);
    }
}
