package xf6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi6.k f305034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f305035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f305036c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f305037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f305038h;

    public r2(w2 w2Var, pi6.k kVar) {
        this.f305035b = w2Var;
        this.f305034a = kVar;
        int i = 11;
        this.d = e4m.b.b(new t1(w2Var, this, 0, i));
        this.e = e4m.b.b(new t1(w2Var, this, 1, i));
        this.f = e4m.b.b(new t1(w2Var, this, 3, i));
        this.f305037g = e4m.b.b(new t1(w2Var, this, 4, i));
        this.f305038h = e4m.b.b(new t1(w2Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
