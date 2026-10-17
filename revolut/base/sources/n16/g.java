package n16;

import android.content.Context;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f211273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f211274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f211275c;
    public final c21.e d;
    public final rg0.e e;
    public final vv5.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z46.b f211276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f211277h = e4m.b.b(new f(this, 1));
    public final e4m.e i = e4m.b.b(new f(this, 3));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f211278j = e4m.b.b(new f(this, 2));
    public final e4m.e k = e4m.b.b(new f(this, 0));

    public g(rg0.e eVar, nj0.a aVar, vv5.e eVar2, c21.e eVar3, z46.b bVar, an0.c cVar, Context context) {
        this.f211273a = aVar;
        this.f211274b = context;
        this.f211275c = cVar;
        this.d = eVar3;
        this.e = eVar;
        this.f = eVar2;
        this.f211276g = bVar;
    }

    public final k18.c a() {
        f16.b bVar = (f16.b) this.k.get();
        xv5.c cVarA = this.f.a();
        s.j(cVarA);
        t46.a aVar = (t46.a) this.f211276g.i.get();
        s.j(aVar);
        return new k18.c(bVar, cVarA, aVar);
    }
}
