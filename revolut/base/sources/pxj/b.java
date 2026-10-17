package pxj;

import e4m.e;
import prk.q;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements lxj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final il8.b f240624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn8.b f240625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mj8.b f240626c;
    public final e d = e4m.b.b(new q(this, 5));

    public b(il8.b bVar, mn8.b bVar2, mj8.b bVar3) {
        this.f240624a = bVar;
        this.f240625b = bVar2;
        this.f240626c = bVar3;
    }

    @Override // lxj.a
    public final qxj.a a() {
        return new qxj.a();
    }

    @Override // lxj.a
    public final mxj.a b() {
        return (mxj.a) this.d.get();
    }

    @Override // lxj.a
    public final qxj.e c() {
        return new qxj.e();
    }
}
