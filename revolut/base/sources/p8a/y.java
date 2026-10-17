package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.common.PixCommonModalsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements xki.c, pba.a, nba.a, vba.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixCommonModalsContract$InputData f234122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f234124c = this;
    public final e4m.e d = e4m.b.b(new p7c.a(this, 11));

    public y(d0 d0Var, PixCommonModalsContract$InputData pixCommonModalsContract$InputData) {
        this.f234123b = d0Var;
        this.f234122a = pixCommonModalsContract$InputData;
    }

    @Override // pba.a
    public final k1 b() {
        return new k1(this.f234123b, this.f234124c, 0);
    }

    @Override // vba.a
    public final m1 c() {
        return new m1(this.f234123b, this.f234124c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // nba.a
    public final i1 j() {
        return new i1(this.f234123b, this.f234124c, 0);
    }
}
