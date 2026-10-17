package jjl;

import android.content.Context;
import e4m.e;
import ljl.z1;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f175009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nn0.c f175010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final th0.a f175011c;
    public final z1 d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f175012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f175013h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f175014j;

    public a(z1 z1Var, nn0.c cVar, th0.a aVar, Context context) {
        this.f175009a = context;
        this.f175010b = cVar;
        this.f175011c = aVar;
        this.d = z1Var;
        int i = 19;
        this.e = e4m.b.b(new ibh.a(this, 1, i));
        this.f = e4m.b.b(new ibh.a(this, 3, i));
        this.f175012g = e4m.b.b(new ibh.a(this, 4, i));
        this.f175013h = e4m.b.b(new ibh.a(this, 2, i));
        this.i = e4m.b.b(new ibh.a(this, 5, i));
        this.f175014j = e4m.b.b(new ibh.a(this, 0, i));
    }

    public final uil.a a() {
        return (uil.a) this.f175014j.get();
    }
}
