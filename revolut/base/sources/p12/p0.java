package p12;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class p0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f231741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f231742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231743c;
    public final e4m.e d;
    public final e4m.e e;

    public p0(v vVar, b0 b0Var) {
        this.f231741a = vVar;
        this.f231742b = b0Var;
        this.f231743c = e4m.b.b(new ned.h(vVar, b0Var, this, 0, 19));
        int i = 19;
        this.d = e4m.b.b(new ned.h(vVar, b0Var, this, 2, i));
        this.e = e4m.b.b(new ned.h(vVar, b0Var, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f231743c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
