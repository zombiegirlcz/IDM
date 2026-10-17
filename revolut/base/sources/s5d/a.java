package s5d;

import com.google.common.collect.ImmutableMap;
import e4m.e;
import ib7.j;
import k18.c;
import odh.d;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f260061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jdh.a f260062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f260063c = e4m.b.b(new r96.a(6));

    public a(ite.a aVar, jdh.a aVar2) {
        this.f260061a = aVar;
        this.f260062b = aVar2;
    }

    public final c a() {
        gte.a aVarB = this.f260061a.b();
        s.j(aVarB);
        jdh.a aVar = this.f260062b;
        jdh.b bVar = aVar.f173070a;
        jpc.e eVar = new jpc.e(bVar.a(), aVar.e.a(), bVar.b());
        d dVar = new d(bVar.b());
        fk3.a aVarA = aVar.f173071b.a();
        s.j(aVarA);
        ImmutableMap immutableMapOf = ImmutableMap.of("instrument", (ndh.d) dVar, "commodity", new ndh.d(aVarA, aVar.f173072c.a(), aVar.d.b()));
        s.j(immutableMapOf);
        return new c(aVarB, eVar, new j(immutableMapOf));
    }

    public final t5d.d b() {
        return new t5d.d();
    }
}
