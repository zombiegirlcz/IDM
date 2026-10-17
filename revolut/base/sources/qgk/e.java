package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements ugk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f245927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tgk.d f245928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f245929c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f245930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f245931h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f245932j;
    public final e4m.e k;

    public e(i0 i0Var, agk.a aVar, tgk.d dVar) {
        this.f245927a = aVar;
        this.f245928b = dVar;
        this.f245929c = e4m.b.b(new prk.k0(i0Var, this, 3, 23));
        this.d = e4m.b.b(new prk.k0(i0Var, this, 4, 23));
        this.e = e4m.b.b(new prk.k0(i0Var, this, 5, 23));
        this.f = e4m.b.b(new prk.k0(i0Var, this, 2, 23));
        this.f245930g = e4m.b.b(new prk.k0(i0Var, this, 1, 23));
        this.f245931h = e4m.b.b(new prk.k0(i0Var, this, 0, 23));
        this.i = e4m.b.b(new prk.k0(i0Var, this, 7, 23));
        this.f245932j = e4m.b.b(new prk.k0(i0Var, this, 6, 23));
        this.k = e4m.b.b(new prk.k0(i0Var, this, 8, 23));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.add(this.f245931h.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f245932j.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
