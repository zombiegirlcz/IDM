package pm2;

import bn2.j0;
import r10.v;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f237459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ckg.a f237460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cm2.b f237461c;
    public final nm2.e d;
    public final og3.a e;
    public final l70.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f237462g = this;

    public c(nm2.e eVar, cm2.b bVar, l70.e eVar2, ite.a aVar, ckg.a aVar2, og3.a aVar3) {
        this.f237459a = aVar;
        this.f237460b = aVar2;
        this.f237461c = bVar;
        this.d = eVar;
        this.e = aVar3;
        this.f = eVar2;
    }

    public final j0 a() {
        lg3.a aVarA = ((og3.e) this.e).a();
        s.j(aVarA);
        hm2.a aVar = (hm2.a) this.f237461c;
        v vVarA = aVar.a();
        vjg.g gVarA = this.f237460b.a();
        s.j(gVarA);
        l80.e eVarH = this.f.h();
        s.j(eVarH);
        return new j0(aVarA, vVarA, gVarA, eVarH, new fnc.s(aVar.i.e()), new gm2.a());
    }
}
