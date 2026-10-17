package j5d;

import a5h.g;
import android.content.Context;
import cf0.f;
import e4m.e;
import g5d.d;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f171617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f171618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.c f171619c;
    public final f d;
    public final ite.a e;
    public final vn.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f171620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f171621h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ix5.b f171622j;
    public final ix5.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f171623l;

    public b(vn.a aVar, an0.c cVar, ee0.c cVar2, f fVar, ite.a aVar2, Context context) {
        this.f171617a = context;
        this.f171618b = cVar;
        this.f171619c = cVar2;
        this.d = fVar;
        this.e = aVar2;
        this.f = aVar;
        int i = 9;
        this.f171620g = e4m.b.b(new ix5.b(this, 1, i));
        this.f171621h = e4m.b.b(new ix5.b(this, 0, i));
        this.i = e4m.b.b(new ix5.b(this, 3, i));
        this.f171622j = new ix5.b(this, 2, i);
        this.k = new ix5.b(this, 4, i);
        this.f171623l = e4m.b.b(new ix5.b(this, 5, i));
    }

    public final g a() {
        d dVar = (d) this.f171621h.get();
        df0.b bVarA = this.d.a();
        s.j(bVarA);
        f4h.a aVar = new f4h.a(new i5d.c(dVar, bVarA));
        gte.a aVarB = this.e.b();
        s.j(aVarB);
        return new g(aVar, aVarB, this.f171622j, this.f.c(), this.k);
    }
}
