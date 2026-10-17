package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f246092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zgk.d f246093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f246094c;
    public final l d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246096h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246097j;
    public final e4m.e k;

    public l(i0 i0Var, agk.a aVar, zgk.d dVar) {
        this.f246094c = i0Var;
        this.f246092a = aVar;
        this.f246093b = dVar;
        int i = 29;
        this.e = e4m.b.b(new prk.k0(i0Var, this, 2, i));
        this.f = e4m.b.b(new prk.k0(i0Var, this, 3, i));
        this.f246095g = e4m.b.b(new prk.k0(i0Var, this, 4, i));
        this.f246096h = e4m.b.b(new prk.k0(i0Var, this, 1, i));
        this.i = e4m.b.b(new prk.k0(i0Var, this, 5, i));
        this.f246097j = e4m.b.b(new prk.k0(i0Var, this, 0, i));
        this.k = e4m.b.b(new prk.k0(i0Var, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.copyOf((Collection) this.f246097j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
