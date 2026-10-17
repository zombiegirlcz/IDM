package ux8;

import l70.e;
import no.j2;
import tx8.b0;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final poi.b f283908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f283909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f283910c;
    public final e4m.e d;

    public a(poi.b bVar, e eVar) {
        this.f283908a = bVar;
        this.f283909b = eVar;
        int i = 28;
        this.f283910c = e4m.b.b(new tn3.a(this, 1, i));
        this.d = e4m.b.b(new tn3.a(this, 0, i));
    }

    public final wx8.a a() {
        return (wx8.a) this.d.get();
    }

    public final b0 b() {
        j2 j2VarH = this.f283908a.h();
        s.j(j2VarH);
        return new b0(j2VarH);
    }
}
