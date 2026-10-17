package px;

import android.content.Context;
import p8a.c0;
import vc.s;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sw.c f240527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k81.a f240528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nv.a f240529c;
    public final gx.c d;
    public final u00.d e;
    public final l70.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f240530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f240531h = this;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f240532j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f240533l;

    public g(k81.a aVar, l70.e eVar, gx.c cVar, u00.d dVar, nv.a aVar2, sw.c cVar2, Context context) {
        this.f240527a = cVar2;
        this.f240528b = aVar;
        this.f240529c = aVar2;
        this.d = cVar;
        this.e = dVar;
        this.f = eVar;
        this.f240530g = context;
        int i = 12;
        this.i = e4m.b.b(new c0(this, 0, i));
        this.f240532j = e4m.b.b(new c0(this, 1, i));
        this.k = e4m.b.b(new c0(this, 2, i));
        this.f240533l = e4m.b.b(new c0(this, 3, i));
    }

    public final tw.a a() {
        tw.a aVarA = this.f240527a.a();
        s.j(aVarA);
        return aVarA;
    }

    public final py.d b() {
        return (py.d) this.f240532j.get();
    }
}
