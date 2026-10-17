package bac;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xki.c, fac.b, wec.a, yec.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f14023b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f14024c;

    public c(b bVar) {
        this.f14022a = bVar;
        this.f14024c = e4m.b.b(new a(bVar, 1));
    }

    @Override // fac.b
    public final fac.a b() {
        return new h(this.f14022a, this.f14023b);
    }

    @Override // wec.a
    public final d c() {
        return new d(this.f14022a, this.f14023b, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // yec.d
    public final yec.c y() {
        return new f(this.f14022a, this.f14023b, 0);
    }
}
