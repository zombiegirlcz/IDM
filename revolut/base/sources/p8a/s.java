package p8a;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements xki.c, s9a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9a.b f234078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f234080c = this;
    public final e4m.e d = e4m.b.b(new p7c.a(this, 9));

    public s(d0 d0Var, h9a.b bVar) {
        this.f234079b = d0Var;
        this.f234078a = bVar;
    }

    @Override // s9a.a
    public final d1 b() {
        return new d1(this.f234079b, this.f234080c, 0);
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
