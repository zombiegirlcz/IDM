package hm9;

import com.google.common.collect.ImmutableSet;
import hc2.r;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xki.c, xm9.a, zm9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sm9.d f153562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f153563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f153564c = this;
    public final e4m.e d;

    public g(b bVar, sm9.d dVar) {
        this.f153563b = bVar;
        this.f153562a = dVar;
        this.d = e4m.b.b(new r(bVar, this, 5));
    }

    @Override // zm9.a
    public final i b() {
        return new i(this.f153563b, this.f153564c, 0);
    }

    @Override // xm9.a
    public final k c() {
        return new k(this.f153563b, this.f153564c, 0);
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
