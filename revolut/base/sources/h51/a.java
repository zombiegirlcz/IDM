package h51;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import l70.e;
import yy0.d;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f149418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj0.a f149419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f149420c;
    public final egl.a d;
    public final an0.c e;
    public final djf.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ee0.a f149421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gff.a f149422h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f149423j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f149424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f149425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f149426n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f149427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f149428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f149429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f149430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f149431t;
    public final e4m.e u;
    public final e4m.e v;

    public a(e eVar, ee0.a aVar, nj0.a aVar2, an0.c cVar, egl.a aVar3, djf.c cVar2, Context context) {
        this.f149418a = context;
        this.f149419b = aVar2;
        this.f149420c = eVar;
        this.d = aVar3;
        this.e = cVar;
        this.f = cVar2;
        this.f149421g = aVar;
        int i = 10;
        gff.a aVar4 = new gff.a(this, 2, i);
        this.f149422h = aVar4;
        this.i = e4m.b.b(aVar4);
        this.f149423j = e4m.b.b(new gff.a(this, 1, i));
        this.k = e4m.b.b(new gff.a(this, 0, i));
        this.f149424l = e4m.b.b(new gff.a(this, 4, i));
        this.f149425m = e4m.b.b(new gff.a(this, 3, i));
        this.f149426n = e4m.b.b(new gff.a(this, 5, i));
        this.o = e4m.b.b(this.f149422h);
        this.f149427p = e4m.b.b(new gff.a(this, 6, i));
        this.f149428q = e4m.b.b(this.f149422h);
        this.f149429r = e4m.b.b(new gff.a(this, 8, i));
        this.f149430s = e4m.b.b(new gff.a(this, 7, i));
        this.f149431t = e4m.b.b(new gff.a(this, 9, i));
        this.u = e4m.b.b(new gff.a(this, 10, i));
        this.v = e4m.b.b(new gff.a(this, 11, i));
    }

    public final a01.b a() {
        return (a01.b) this.f149429r.get();
    }

    public final ue0.c b() {
        return (ue0.c) this.v.get();
    }

    public final ImmutableSet c() {
        return ImmutableSet.of((d) this.k.get(), (d) this.f149425m.get(), (d) this.f149426n.get(), (d) this.f149427p.get(), (d) this.f149430s.get(), (d) this.f149431t.get(), (d) this.u.get());
    }
}
