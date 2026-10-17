package obb;

import ang.f;
import e4m.b;
import e4m.e;
import ffk.t;
import kbb.c;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ufk.a f223908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xmg.a f223909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efk.a f223910c;
    public final kl2.a d;
    public final e e = b.b(new o3i.b(this, 1));

    public a(kl2.a aVar, efk.a aVar2, ufk.a aVar3, xmg.a aVar4) {
        this.f223908a = aVar3;
        this.f223909b = aVar4;
        this.f223910c = aVar2;
        this.d = aVar;
    }

    public final c a() {
        f fVarE = this.f223909b.e();
        t tVarF = this.f223910c.f();
        s.j(tVarF);
        hl2.a aVar = (hl2.a) this.d.f185272q.get();
        s.j(aVar);
        return new c(fVarE, tVarF, aVar);
    }

    public final itb.c b() {
        return (itb.c) this.e.get();
    }
}
