package nv;

import e4m.b;
import nk7.e;
import sw.c;
import vc.s;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f219333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0m.a f219334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f219335c;
    public final e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f219336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f219337h;

    public a(n0m.a aVar, c cVar) {
        this.f219333a = cVar;
        this.f219334b = aVar;
        int i = 18;
        this.f219335c = new e(this, 1, i);
        this.d = new e(this, 2, i);
        this.e = b.b(new e(this, 0, i));
        this.f = b.b(new e(this, 3, i));
        this.f219336g = b.b(new e(this, 4, i));
        this.f219337h = b.b(new e(this, 5, i));
    }

    public final prl.e a() {
        c cVar = this.f219333a;
        xw.a aVar = (xw.a) cVar.d.get();
        s.j(aVar);
        d4m.a aVarA = b.a(this.f219335c);
        qw.a aVarC = cVar.c();
        s.j(aVarC);
        return new prl.e(aVar, aVarA, aVarC, b.a(this.d));
    }
}
