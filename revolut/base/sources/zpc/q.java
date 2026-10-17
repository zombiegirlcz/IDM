package zpc;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.g f324284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wpc.f f324285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f324286c;
    public final e4m.e d;
    public final e4m.e e;

    public q(k kVar, wpc.f fVar, mkd.g gVar) {
        this.f324284a = gVar;
        this.f324285b = fVar;
        int i = 2;
        this.f324286c = e4m.b.b(new m(kVar, this, 0, i));
        this.d = e4m.b.b(new m(kVar, this, 2, i));
        this.e = e4m.b.b(new m(kVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f324286c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
