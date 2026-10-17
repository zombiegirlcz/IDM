package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f196115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f196116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f196117c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f196118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f196119h;

    public v(q0 q0Var, e eVar, BaseScreen baseScreen) {
        this.f196115a = baseScreen;
        int i = 0;
        this.f196116b = e4m.b.b(new u(q0Var, this, 2, i));
        this.f196117c = e4m.b.b(new u(q0Var, this, 1, i));
        this.d = e4m.b.b(new u(q0Var, this, 0, i));
        this.e = e4m.b.b(new u(q0Var, this, 3, i));
        this.f = e4m.b.b(new u(q0Var, this, 5, i));
        this.f196118g = e4m.b.b(new u(q0Var, this, 6, i));
        this.f196119h = e4m.b.b(new u(q0Var, this, 4, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
