package yn0;

import e4m.g;
import l70.e;
import xf6.a1;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f315074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f315075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f315076c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f315077g;

    public a(e eVar, ee0.a aVar, nj0.a aVar2) {
        this.f315074a = aVar;
        this.f315075b = eVar;
        this.f315076c = aVar2;
        int i = 25;
        this.d = e4m.b.b(new a1(this, 1, i));
        this.e = g.a(new a1(this, 2, i));
        this.f = e4m.b.b(new a1(this, 3, i));
        this.f315077g = g.a(new a1(this, 0, i));
    }

    public final wn0.a a() {
        return (wn0.a) this.f315077g.get();
    }
}
