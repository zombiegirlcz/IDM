package ta7;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements xki.c, gb7.a, rb7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f269128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f269129b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f269130c;

    public g(d dVar) {
        this.f269128a = dVar;
        this.f269130c = e4m.b.b(new f(dVar, 0));
    }

    @Override // rb7.a
    public final k b() {
        return new k(this.f269128a, this.f269129b, 0);
    }

    @Override // gb7.a
    public final i c() {
        return new i(this.f269128a, this.f269129b, 0);
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
