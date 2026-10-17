package xf6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi6.i f304810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f304811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f304812c;
    public final e4m.e d;
    public final e4m.e e;

    public c2(w2 w2Var, q2 q2Var, wi6.i iVar) {
        this.f304811b = w2Var;
        this.f304810a = iVar;
        int i = 6;
        this.f304812c = e4m.b.b(new t1(w2Var, this, 2, i));
        this.d = e4m.b.b(new t1(w2Var, this, 1, i));
        this.e = e4m.b.b(new t1(w2Var, this, 0, i));
    }

    public final hi6.b b() {
        w2 w2Var = this.f304811b;
        t70.b bVarG = w2Var.e.g();
        vc.s.j(bVarG);
        m35.r rVarO = w2Var.f305149t.o();
        vc.s.j(rVarO);
        return new hi6.b(bVarG, rVarO);
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
