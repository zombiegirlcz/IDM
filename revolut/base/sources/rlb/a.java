package rlb;

import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tib.b f254943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ite.a f254944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f254945c = e4m.b.b(new r96.a(5));

    public a(tib.b bVar, ite.a aVar) {
        this.f254943a = bVar;
        this.f254944b = aVar;
    }

    public final slb.a a() {
        ijb.a aVarG = ((blb.e) this.f254943a).g();
        s.j(aVarG);
        gte.a aVarB = this.f254944b.b();
        s.j(aVarB);
        return new slb.a(aVarG, aVarB);
    }
}
