package e51;

import dw3.f6;
import ljl.q1;
import rg0.e;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final poi.b f122703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final el0.a f122704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f122705c;
    public final zvj.a d;
    public final xmg.a e;
    public final q1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f6 f122706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f6 f122707h;
    public final f6 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f6 f122708j;
    public final f6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f122709l;

    public a(poi.b bVar, e eVar, el0.a aVar, q1 q1Var, xmg.a aVar2, zvj.a aVar3) {
        this.f122703a = bVar;
        this.f122704b = aVar;
        this.f122705c = eVar;
        this.d = aVar3;
        this.e = aVar2;
        this.f = q1Var;
        int i = 8;
        this.f122706g = new f6(this, 1, i);
        this.f122707h = new f6(this, 2, i);
        this.i = new f6(this, 3, i);
        this.f122708j = new f6(this, 4, i);
        this.k = new f6(this, 5, i);
        this.f122709l = e4m.b.b(new f6(this, 0, i));
    }

    public final mwl.e a() {
        return (mwl.e) this.f122709l.get();
    }
}
