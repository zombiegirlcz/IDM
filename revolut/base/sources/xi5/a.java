package xi5;

import ev5.d;
import ku5.f;
import mva.b;
import vc.s;
import yd9.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final et5.a f306309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae9.a f306310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f306311c;

    public a(et5.a aVar, ae9.a aVar2, b bVar) {
        this.f306309a = aVar;
        this.f306310b = aVar2;
        this.f306311c = bVar;
    }

    public final ou5.b a() {
        f fVar = (f) this.f306309a;
        d dVarD = fVar.d();
        s.j(dVarD);
        e eVarA = this.f306310b.a();
        iva.a aVarA = this.f306311c.a();
        s.j(aVarA);
        return new ou5.b(dVarD, eVarA, aVarA, fVar.b(), new yi5.a());
    }
}
