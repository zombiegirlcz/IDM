package bnb;

import ap3.d;
import e4m.e;
import rnb.w;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ndd.b f17127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tib.b f17128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f17129c = e4m.b.b(new d(this, 17));

    public a(tib.b bVar, ndd.b bVar2) {
        this.f17127a = bVar2;
        this.f17128b = bVar;
    }

    public final toh.d a() {
        w wVar = (w) this.f17129c.get();
        ijb.a aVarG = ((blb.e) this.f17128b).g();
        s.j(aVarG);
        return new toh.d(wVar, aVarG);
    }

    public final w b() {
        return (w) this.f17129c.get();
    }
}
