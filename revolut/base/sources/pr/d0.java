package pr;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public final class d0 implements xki.c, eu.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zt.c f238836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f238837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f238838c = this;
    public final e4m.e d = e4m.b.b(new p7c.a(this, 26));

    public d0(q qVar, zt.c cVar) {
        this.f238837b = qVar;
        this.f238836a = cVar;
    }

    @Override // eu.a
    public final i0 b() {
        return new i0(this.f238837b, this.f238838c, 0);
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
