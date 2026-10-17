package p8a;

import com.revolut.feature.pix.api.model.AliasRegistrationType;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f233975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f233976b;

    public h(d0 d0Var, i iVar) {
        this.f233975a = d0Var;
        this.f233976b = iVar;
    }

    @Override // phm.a
    public final Object get() {
        i iVar = this.f233976b;
        d0 d0Var = iVar.f233984b;
        zzl.b bVar = (zzl.b) d0Var.F.get();
        z80.b bVarS = d0Var.f233933h.s();
        vc.s.j(bVarS);
        a9a.l lVar = new a9a.l(bVarS, bVar);
        AliasRegistrationType.Inputtable inputtable = iVar.f233983a;
        d0 d0Var2 = this.f233975a;
        z80.b bVarS2 = d0Var2.f233933h.s();
        vc.s.j(bVarS2);
        e4m.e eVar = d0Var2.G;
        ang.f fVarE = d0Var2.f233942t.e();
        f8a.a aVarB = d0Var2.e.b();
        vc.s.j(aVarB);
        return new a9a.k(lVar, inputtable, bVarS2, eVar, fVarE, aVarB);
    }
}
