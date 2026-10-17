package z52;

import android.content.Context;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f319424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.b f319425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f319426c;
    public final ila.b d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f319427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f319428h;
    public final e4m.e i;

    public g(uw1.b bVar, p12.l lVar, h hVar, ila.b bVar2, Context context) {
        this.f319424a = hVar;
        this.f319425b = bVar;
        this.f319426c = context;
        this.d = bVar2;
        int i = 11;
        this.e = e4m.b.b(new yxj.c(this, 0, i));
        this.f = e4m.b.b(new yxj.c(this, 1, i));
        this.f319427g = e4m.b.b(new yxj.c(this, 2, i));
        this.f319428h = e4m.b.b(new yxj.c(this, 4, i));
        this.i = e4m.b.b(new yxj.c(this, 3, i));
    }

    public final q52.a a() {
        return (q52.a) this.f319427g.get();
    }
}
