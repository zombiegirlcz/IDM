package km4;

import al4.e;
import al4.m;
import cm4.f;
import cm4.j;
import djf.c;
import gs4.h;
import jid.z;
import jm4.r;
import qgk.i3;
import thf.d;
import vc.s;
import vt4.g;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements zk4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f185715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f185716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3 f185717c;

    public b(r rVar, c cVar, i3 i3Var) {
        this.f185715a = rVar;
        this.f185716b = cVar;
        this.f185717c = i3Var;
    }

    @Override // zk4.a
    public final fm4.a a() {
        r rVar = this.f185715a;
        m mVarR = rVar.r();
        s.j(mVarR);
        whf.b bVarA = this.f185716b.a();
        s.j(bVarA);
        e eVarP = rVar.p();
        s.j(eVarP);
        return new xt4.c(mVarR, new z(bVarA, eVarP));
    }

    @Override // zk4.a
    public final bl4.e d() {
        egk.e eVarE = this.f185717c.e();
        s.j(eVarE);
        return new sm4.a(eVarE);
    }

    @Override // zk4.a
    public final ou4.a e() {
        return new ou4.a();
    }

    @Override // zk4.a
    public final f f() {
        c cVar = this.f185716b;
        thf.m mVarG = cVar.g();
        s.j(mVarG);
        d dVarD = cVar.d();
        s.j(dVarD);
        return new h(mVarG, new gs4.f(dVarD));
    }

    @Override // zk4.a
    public final cm4.h g() {
        return new g();
    }

    @Override // zk4.a
    public final dm4.f h() {
        return new hu4.a(new iu4.a());
    }

    @Override // zk4.a
    public final cm4.a i() {
        return new wq4.a(new ep4.a());
    }

    @Override // zk4.a
    public final j k() {
        return new sv4.b();
    }

    @Override // zk4.a
    public final dm4.c l() {
        return new hu4.c(new iu4.a());
    }
}
