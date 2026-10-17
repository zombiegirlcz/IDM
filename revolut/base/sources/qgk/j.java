package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements ygk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f246052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kik.b f246053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vgk.c f246054c;
    public final i0 d;
    public final j e = this;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246056h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246057j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f246058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f246059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f246060n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f246061p;

    public j(i0 i0Var, agk.a aVar, kik.b bVar, vgk.c cVar) {
        this.d = i0Var;
        this.f246052a = aVar;
        this.f246053b = bVar;
        this.f246054c = cVar;
        int i = 27;
        this.f = e4m.b.b(new prk.k0(i0Var, this, 2, i));
        this.f246055g = e4m.b.b(new prk.k0(i0Var, this, 3, i));
        this.f246056h = e4m.b.b(new prk.k0(i0Var, this, 4, i));
        this.i = e4m.b.b(new prk.k0(i0Var, this, 1, i));
        this.f246057j = e4m.b.b(new prk.k0(i0Var, this, 5, i));
        this.k = e4m.b.b(new prk.k0(i0Var, this, 0, i));
        this.f246058l = e4m.b.b(new prk.k0(i0Var, this, 7, i));
        this.f246059m = e4m.b.b(new prk.k0(i0Var, this, 6, i));
        this.f246060n = e4m.b.b(new prk.k0(i0Var, this, 8, i));
        this.o = e4m.b.b(new prk.k0(i0Var, this, 9, i));
        this.f246061p = e4m.b.b(new prk.k0(i0Var, this, 10, i));
    }

    @Override // klk.b
    public final t2 c() {
        return new t2(this.d, this.e, 4);
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        builderBuilderWithExpectedSize.addAll((Iterable) this.k.get());
        builderBuilderWithExpectedSize.add(this.f246059m.get());
        builderBuilderWithExpectedSize.add(this.f246060n.get());
        return j6.a.g(this.o, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
