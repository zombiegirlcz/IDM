package xf6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 implements xki.c, bm6.a, zi6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f305161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2 f305162b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f305163c;

    public x2(w2 w2Var) {
        this.f305161a = w2Var;
        this.f305163c = e4m.b.b(new l2(w2Var, 1));
    }

    @Override // zi6.a
    public final c3 b() {
        return new c3(this.f305161a, this.f305162b, 1);
    }

    @Override // bm6.a
    public final h3 c() {
        return new h3(this.f305161a, this.f305162b, 1);
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
