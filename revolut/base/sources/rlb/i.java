package rlb;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import r7d.o;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f254997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f254998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f254999c;
    public final e4m.e d;

    public i(e eVar, g gVar) {
        this.f254997a = eVar;
        this.f254998b = e4m.b.b(new o(eVar, this, 1, 17));
        this.f254999c = e4m.b.b(new o(eVar, this, 0, 17));
        this.d = e4m.b.b(new o(eVar, this, 2, 17));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f254999c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
