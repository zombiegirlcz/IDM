package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f109745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f109746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109747c;
    public final e4m.e d;
    public final e4m.e e;

    public m0(h0 h0Var, p0 p0Var, BaseScreen baseScreen) {
        this.f109745a = h0Var;
        this.f109746b = e4m.b.b(e4m.c.a(baseScreen));
        this.f109747c = e4m.b.b(new d0(h0Var, this, 0, 6));
        this.d = e4m.b.b(new d0(h0Var, this, 2, 6));
        this.e = e4m.b.b(new d0(h0Var, this, 1, 6));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f109747c.get());
    }
}
