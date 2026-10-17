package xf6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a3 implements xki.c, bm6.a, xj6.a, ik6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f304790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f304791b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f304792c;

    public a3(w2 w2Var) {
        this.f304790a = w2Var;
        this.f304792c = e4m.b.b(new v2(w2Var, 0, 1));
        e4m.b.b(new v2(w2Var, 1, 1));
        e4m.b.b(new v2(w2Var, 2, 1));
    }

    @Override // xj6.a
    public final l b() {
        return new l(this.f304790a, this.f304791b, 1);
    }

    @Override // bm6.a
    public final h3 c() {
        return new h3(this.f304790a, this.f304791b, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // ik6.a
    public final k j() {
        return new k(this.f304790a, this.f304791b, 1);
    }
}
