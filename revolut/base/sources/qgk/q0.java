package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 implements qmk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f246197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f246198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246199c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246201h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246202j;
    public final e4m.e k;

    public q0(i0 i0Var, p0 p0Var, BaseScreen baseScreen) {
        this.f246197a = i0Var;
        this.f246198b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 14;
        this.f246199c = e4m.b.b(new m(i0Var, this, 2, i));
        this.d = e4m.b.b(new m(i0Var, this, 1, i));
        this.e = e4m.b.b(new m(i0Var, this, 0, i));
        this.f = e4m.b.b(new m(i0Var, this, 4, i));
        this.f246200g = e4m.b.b(new m(i0Var, this, 3, i));
        this.f246201h = e4m.b.b(new m(i0Var, this, 5, i));
        this.i = e4m.b.b(new m(i0Var, this, 6, i));
        this.f246202j = e4m.b.b(new m(i0Var, this, 8, i));
        this.k = e4m.b.b(new m(i0Var, this, 7, i));
    }

    @Override // sji.b
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(3);
        builderBuilderWithExpectedSize.addAll((Iterable) this.f246200g.get());
        builderBuilderWithExpectedSize.add(this.f246201h.get());
        return j6.a.g(this.i, builderBuilderWithExpectedSize);
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
