package rde;

import com.google.common.collect.ImmutableSet;
import eyd.u;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements xki.c, z7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f253426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f253427b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f253428c;
    public final e4m.e d;

    public f(h hVar) {
        this.f253426a = hVar;
        this.f253428c = e4m.b.b(new e(hVar, 0, 0));
        this.d = e4m.b.b(new e(hVar, 1, 0));
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new u(this.f253426a, this.f253427b, 16);
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
