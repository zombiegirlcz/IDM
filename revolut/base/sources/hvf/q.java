package hvf;

import android.content.Context;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements ewf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final muf.b f155941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f49.a f155942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l70.e f155943c;
    public final nf0.a d;
    public final co0.a e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jhf.a f155944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final djf.c f155945h;
    public final nj0.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p7c.r f155946j;
    public final q k = this;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f155947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f155948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f155949n;
    public final e4m.e o;

    public q(l70.e eVar, nf0.a aVar, nj0.a aVar2, f49.a aVar3, p7c.r rVar, co0.a aVar4, jhf.a aVar5, djf.c cVar, muf.b bVar, Context context) {
        this.f155941a = bVar;
        this.f155942b = aVar3;
        this.f155943c = eVar;
        this.d = aVar;
        this.e = aVar4;
        this.f = context;
        this.f155944g = aVar5;
        this.f155945h = cVar;
        this.i = aVar2;
        this.f155946j = rVar;
        int i = 27;
        this.f155947l = e4m.b.b(new fw2.l(this, 0, i));
        this.f155948m = e4m.b.b(new fw2.l(this, 1, i));
        this.f155949n = e4m.b.b(new fw2.l(this, 2, i));
        this.o = e4m.b.b(new fw2.l(this, 3, i));
    }

    @Override // ewf.b
    public final ewf.a b() {
        return new y(this.k);
    }
}
