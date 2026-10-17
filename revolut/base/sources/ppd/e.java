package ppd;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f238395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f238396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238397c;

    public e(n nVar, l lVar) {
        this.f238395a = nVar;
        this.f238396b = lVar;
        this.f238397c = e4m.b.b(new d2h.b(nVar, 20, lVar, this));
    }

    public final pnd.c b() {
        n nVar = this.f238395a;
        je6.h hVarC = ((xf6.t) nVar.g0).c();
        vc.s.j(hVarC);
        iob.c cVarC = ((blb.e) nVar.M).c();
        g6e.b bVarA = nVar.f238491h0.a();
        vc.s.j(bVarA);
        pnd.e eVar = new pnd.e(this.f238396b.j());
        gte.a aVarB = nVar.f238482a.b();
        vc.s.j(aVarB);
        return new pnd.c(hVarC, cVarC, bVarA, eVar, aVarB);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
