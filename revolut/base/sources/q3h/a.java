package q3h;

import ael.d0;
import l70.e;
import vc.s;
import ybl.l;
import zdl.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f241971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9h.a f241972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f241973c;

    public a(e eVar, c cVar, h9h.a aVar) {
        this.f241971a = cVar;
        this.f241972b = aVar;
        this.f241973c = eVar;
    }

    public final kbb.c a() {
        d0 d0VarK = this.f241971a.k();
        s.j(d0VarK);
        l lVarF = this.f241972b.f();
        f80.a aVarX = this.f241973c.x();
        s.j(aVarX);
        return new kbb.c(d0VarK, lVarF, new r3h.a(aVarX));
    }
}
