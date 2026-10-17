package wi8;

import android.content.Context;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements fj8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f297847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f297848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jd8.b f297849c;
    public final usg.a d;
    public final se8.a e;
    public final mj8.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mn8.b f297850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f297851h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f297852j;

    public e(l70.e eVar, mj8.b bVar, jd8.b bVar2, usg.a aVar, se8.a aVar2, mn8.b bVar3, Context context) {
        this.f297847a = eVar;
        this.f297848b = context;
        this.f297849c = bVar2;
        this.d = aVar;
        this.e = aVar2;
        this.f = bVar;
        this.f297850g = bVar3;
        int i = 7;
        this.i = e4m.g.a(new vxc.g(this, 0, i));
        this.f297852j = e4m.b.b(new vxc.g(this, 1, i));
    }

    public final xi8.b a() {
        f01.a aVar = (f01.a) this.f297852j.get();
        s70.a aVarM = this.f297847a.m();
        s.j(aVarM);
        return new xi8.b(aVar, aVarM);
    }

    @Override // fj8.b
    public final fj8.a b() {
        return new h(this.f297851h);
    }
}
