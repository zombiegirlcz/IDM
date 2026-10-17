package ufg;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements xki.c, fig.a, big.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f279789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f279790b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f279791c;

    public s(g gVar) {
        this.f279789a = gVar;
        this.f279791c = e4m.b.b(new u45.v(gVar, 27));
    }

    @Override // big.a
    public final d0 b() {
        return new d0(this.f279789a, this.f279790b, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // fig.a
    public final f0 j() {
        return new f0(this.f279789a, this.f279790b, 0);
    }
}
