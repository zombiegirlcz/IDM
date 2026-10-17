package mad;

import l70.e;
import nad.c;
import vc.s;
import zk0.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f203995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qsc.a f203996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xp.a f203997c;

    public a(xp.a aVar, e eVar, qsc.a aVar2) {
        this.f203995a = eVar;
        this.f203996b = aVar2;
        this.f203997c = aVar;
    }

    public final c a() {
        e eVar = this.f203995a;
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        b bVarL = eVar.l();
        s.j(bVarL);
        z70.a aVarF2 = eVar.f();
        s.j(aVarF2);
        a19.a aVar = new a19.a(aVarF2, 1);
        usc.b bVar = (usc.b) ((tsc.a) this.f203996b).f274069b.get();
        s.j(bVar);
        return new c(aVarF, bVarL, aVar, bVar, this.f203997c.a());
    }
}
