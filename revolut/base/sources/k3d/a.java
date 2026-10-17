package k3d;

import android.content.Context;
import jid.z;
import jqa.m;
import l3d.h0;
import l3d.r;
import s3d.l;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f180685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f180686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bpj.a f180687c;
    public final y2d.c d;
    public final fhd.b e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vgd.b f180688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hsh.b f180689h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f180690j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f180691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f180692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f180693n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f180694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f180695q;

    public a(vgd.b bVar, y2d.c cVar, b bVar2, d dVar, fhd.b bVar3, bpj.a aVar, vfd.g gVar, hsh.b bVar4, Context context) {
        this.f180685a = dVar;
        this.f180686b = bVar2;
        this.f180687c = aVar;
        this.d = cVar;
        this.e = bVar3;
        this.f = context;
        this.f180688g = bVar;
        this.f180689h = bVar4;
        int i = 12;
        this.i = e4m.b.b(new m(this, 1, i));
        this.f180690j = e4m.b.b(new m(this, 2, i));
        this.k = e4m.b.b(new m(this, 0, i));
        this.f180691l = e4m.b.b(new m(this, 4, i));
        this.f180692m = e4m.b.b(new m(this, 3, i));
        this.f180693n = e4m.b.b(new m(this, 5, i));
        this.o = e4m.b.b(new m(this, 6, i));
        this.f180694p = e4m.b.b(new m(this, 7, i));
        this.f180695q = e4m.b.b(new m(this, 8, i));
    }

    public final jpc.e a() {
        b bVar = this.f180686b;
        h0 h0VarB = bVar.b();
        s.j(h0VarB);
        r rVarA = bVar.a();
        s.j(rVarA);
        z zVar = new z(h0VarB, rVarA);
        n3d.e eVar = new n3d.e();
        ifd.h hVarB = this.e.f135205a.b();
        s.j(hVarB);
        return new jpc.e(zVar, eVar, new ghd.a(hVarB));
    }

    public final l b() {
        return (l) this.f180693n.get();
    }

    public final s3d.m c() {
        return (s3d.m) this.o.get();
    }
}
