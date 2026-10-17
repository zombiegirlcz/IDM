package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class k1 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f246079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oik.c f246080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f246081c;
    public final k1 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246083h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246084j;
    public final e4m.e k;

    public k1(i0 i0Var, agk.a aVar, oik.c cVar) {
        this.f246081c = i0Var;
        this.f246079a = aVar;
        this.f246080b = cVar;
        int i = 25;
        this.e = e4m.b.b(new m(i0Var, this, 2, i));
        this.f = e4m.b.b(new m(i0Var, this, 3, i));
        this.f246082g = e4m.b.b(new m(i0Var, this, 4, i));
        this.f246083h = e4m.b.b(new m(i0Var, this, 1, i));
        this.i = e4m.b.b(new m(i0Var, this, 5, i));
        this.f246084j = e4m.b.b(new m(i0Var, this, 0, i));
        this.k = e4m.b.b(new m(i0Var, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.copyOf((Collection) this.f246084j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
