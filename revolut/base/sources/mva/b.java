package mva;

import android.content.Context;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usg.a f209196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ava.a f209197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l70.e f209198c;
    public final ei5.d d;
    public final bpj.a e;
    public final ite.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f209199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f209200h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f209201j;
    public final e4m.e k;

    public b(l70.e eVar, ei5.d dVar, bpj.a aVar, usg.a aVar2, ava.a aVar3, ite.a aVar4, Context context) {
        this.f209196a = aVar2;
        this.f209197b = aVar3;
        this.f209198c = eVar;
        this.d = dVar;
        this.e = aVar;
        this.f = aVar4;
        this.f209199g = context;
        int i = 0;
        this.f209200h = e4m.b.b(new a(this, 0, i));
        this.i = e4m.b.b(new a(this, 1, i));
        this.f209201j = e4m.b.b(new a(this, 3, i));
        this.k = e4m.b.b(new a(this, 2, i));
    }

    public final iva.a a() {
        return (iva.a) this.f209200h.get();
    }
}
