package cwi;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 implements xki.c, zyi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f109762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f109763b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109764c;

    public r0(h0 h0Var) {
        this.f109762a = h0Var;
        this.f109764c = e4m.b.b(new o0(h0Var, 1));
    }

    @Override // zyi.b
    public final zyi.a b() {
        return new i1(this.f109762a, this.f109763b);
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
