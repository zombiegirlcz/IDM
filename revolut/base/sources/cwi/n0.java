package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f109751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f109752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109753c;
    public final e4m.e d;
    public final e4m.e e;

    public n0(h0 h0Var, f0 f0Var, BaseScreen baseScreen) {
        this.f109751a = h0Var;
        this.f109752b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 7;
        this.f109753c = e4m.b.b(new d0(h0Var, this, 0, i));
        this.d = e4m.b.b(new d0(h0Var, this, 2, i));
        this.e = e4m.b.b(new d0(h0Var, this, 1, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f109753c.get());
    }
}
