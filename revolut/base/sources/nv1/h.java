package nv1;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements xki.c, rw1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ov1.e f219413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f219414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f219415c = this;
    public final e4m.e d;

    public h(g gVar, ov1.e eVar) {
        this.f219414b = gVar;
        this.f219413a = eVar;
        this.d = e4m.b.b(new nng.n(gVar, this, 6));
    }

    @Override // rw1.a
    public final t b() {
        return new t(this.f219414b, this.f219415c, 1);
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
