package us6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 implements xki.c, xx6.a, cy6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f282769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2 f282770b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282771c = e4m.b.b(new r96.a(28));

    public u2(g2 g2Var) {
        this.f282769a = g2Var;
    }

    @Override // cy6.a
    public final c3 b() {
        return new c3(this.f282769a, this.f282770b, 0);
    }

    @Override // xx6.a
    public final a3 c() {
        return new a3(this.f282769a, this.f282770b, 0);
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
