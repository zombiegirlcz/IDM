package ppd;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xqd.b f238529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f238530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238531c;
    public final e4m.e d;

    public q0(n nVar, p0 p0Var, xqd.b bVar) {
        this.f238529a = bVar;
        int i = 1;
        this.f238530b = e4m.g.a(new i0(nVar, this, 1, i));
        this.f238531c = e4m.g.a(new i0(nVar, this, 2, i));
        this.d = e4m.b.b(new i0(nVar, this, 0, i));
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
