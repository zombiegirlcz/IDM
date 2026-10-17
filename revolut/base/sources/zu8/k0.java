package zu8;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f325306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f325307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f325308c;
    public final e4m.e d;

    public k0(c0 c0Var, j0 j0Var) {
        this.f325306a = c0Var;
        this.f325307b = e4m.b.b(new zpc.m(c0Var, this, 0, 21));
        this.f325308c = e4m.b.b(new zpc.m(c0Var, this, 1, 21));
        this.d = e4m.b.b(new zpc.m(c0Var, this, 2, 21));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f325307b.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
