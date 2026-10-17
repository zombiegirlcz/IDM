package p8a;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vaa.k f234039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f234041c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234042g;

    public o(d0 d0Var, n nVar, vaa.k kVar) {
        this.f234040b = d0Var;
        this.f234041c = nVar;
        this.f234039a = kVar;
        this.d = e4m.b.b(new ned.h(d0Var, nVar, this, 1, 27));
        int i = 27;
        this.e = e4m.b.b(new ned.h(d0Var, nVar, this, 0, i));
        this.f = e4m.b.b(new ned.h(d0Var, nVar, this, 2, i));
        this.f234042g = e4m.b.b(new ned.h(d0Var, nVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f234041c.f.get(), (yji.n) this.e.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
