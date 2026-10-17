package nb2;

import android.content.Context;
import lz1.m;
import ove.t;
import p12.l;
import qve.w;
import vc.s;
import xf6.n1;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ila.b f213959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f213960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uw1.b f213961c;
    public final l70.e d;
    public final usg.a e;
    public final r5a.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nf0.a f213962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final je6.g f213963h;
    public final t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nj0.a f213964j;
    public final w k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n1 f213965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f213966m = this;

    public b(g gVar, uw1.b bVar, l lVar, l70.e eVar, nf0.a aVar, nj0.a aVar2, n1 n1Var, je6.g gVar2, ila.b bVar2, t tVar, w wVar, usg.a aVar3, r5a.c cVar, Context context) {
        this.f213959a = bVar2;
        this.f213960b = context;
        this.f213961c = bVar;
        this.d = eVar;
        this.e = aVar3;
        this.f = cVar;
        this.f213962g = aVar;
        this.f213963h = gVar2;
        this.i = tVar;
        this.f213964j = aVar2;
        this.k = wVar;
        this.f213965l = n1Var;
    }

    public final mb2.b a() {
        return new mb2.b(this.f213959a.a(), ((m) this.f213961c).g(), new mb2.c());
    }

    public final sb2.b b() {
        t12.b bVar = new t12.b();
        l70.e eVar = this.d;
        f90.b bVarT = eVar.t();
        s.j(bVarT);
        l80.e eVarH = eVar.h();
        s.j(eVarH);
        return new sb2.b(bVar, bVarT, eVarH);
    }
}
