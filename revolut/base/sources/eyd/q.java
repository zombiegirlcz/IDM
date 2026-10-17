package eyd;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f130815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f130816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130817c;
    public final e4m.e d;
    public final e4m.e e;

    public q(b0 b0Var, p pVar) {
        this.f130815a = b0Var;
        int i = 4;
        this.f130816b = e4m.b.b(new j(b0Var, this, 0, i));
        this.f130817c = e4m.b.b(new j(b0Var, this, 1, i));
        this.d = e4m.b.b(new j(b0Var, this, 3, i));
        this.e = e4m.b.b(new j(b0Var, this, 2, i));
    }

    public final kgm.i b() {
        b0 b0Var = this.f130815a;
        fk3.a aVarA = b0Var.f130700g.a();
        vc.s.j(aVarA);
        l80.e eVarH = b0Var.f130698b.h();
        vc.s.j(eVarH);
        return new kgm.i(aVarA, eVarH);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f130816b.get(), (yji.n) this.f130817c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
