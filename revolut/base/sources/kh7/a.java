package kh7;

import android.content.Context;
import jm4.o3;
import l70.e;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f184074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f184075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f184076c;
    public final Context d;
    public final rg0.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f184077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f184078h;
    public final e4m.e i;

    public a(ee0.a aVar, an0.c cVar, rg0.e eVar, e eVar2, Context context) {
        this.f184074a = aVar;
        this.f184075b = cVar;
        this.f184076c = eVar2;
        this.d = context;
        this.e = eVar;
        int i = 19;
        this.f = e4m.b.b(new o3(this, 1, i));
        this.f184077g = e4m.b.b(new o3(this, 0, i));
        this.f184078h = e4m.b.b(new o3(this, 2, i));
        this.i = e4m.b.b(new o3(this, 3, i));
    }

    public final mh7.c a() {
        return (mh7.c) this.f184077g.get();
    }

    public final ih7.b b() {
        return (ih7.b) this.f184078h.get();
    }
}
