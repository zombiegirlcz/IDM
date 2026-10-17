package eyd;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements xki.c, jzd.a, hzd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f130811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f130812b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130813c;

    public p(b0 b0Var) {
        this.f130811a = b0Var;
        this.f130813c = e4m.b.b(new h(b0Var, 1));
    }

    @Override // hzd.a
    public final f0 b() {
        return new f0(this.f130811a, this.f130812b, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // jzd.a
    public final h0 j() {
        return new h0(this.f130811a, this.f130812b, 1);
    }
}
