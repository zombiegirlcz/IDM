package q1e;

import ael.t;
import android.content.Context;
import r1e.g;
import vc.s;
import x8h.k;
import zdl.f;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdl.c f241427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9h.a f241428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f241429c;
    public final f d;

    public c(h9h.a aVar, f fVar, zdl.c cVar, Context context) {
        this.f241427a = cVar;
        this.f241428b = aVar;
        this.f241429c = context;
        this.d = fVar;
    }

    public final r1e.f a() {
        t tVarF = this.f241427a.f();
        s.j(tVarF);
        k kVarD = this.f241428b.d();
        g gVar = new g(this.f241429c);
        ybl.k kVarD2 = this.d.d();
        s.j(kVarD2);
        return new r1e.f(tVarF, kVarD, gVar, kVarD2, new tfl.a());
    }
}
