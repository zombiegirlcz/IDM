package lti;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements xki.c, gji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f199922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f199923b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199924c;

    public k(g gVar) {
        this.f199922a = gVar;
        this.f199924c = e4m.b.b(new ljl.n(gVar, 14));
    }

    @Override // gji.b
    public final gji.a b() {
        return new t(this.f199922a, this.f199923b);
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
