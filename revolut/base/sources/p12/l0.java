package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class l0 implements xki.c, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferContract$InputData f231716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f231717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f231718c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f231719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f231720h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f231721j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f231722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f231723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f231724n;

    public l0(v vVar, ApmTransferContract$InputData apmTransferContract$InputData) {
        this.f231717b = vVar;
        this.f231716a = apmTransferContract$InputData;
        int i = 3;
        this.d = e4m.b.b(new f0(vVar, this, 1, i));
        this.e = e4m.b.b(new f0(vVar, this, 0, i));
        this.f = e4m.b.b(new f0(vVar, this, 3, i));
        this.f231719g = e4m.b.b(new f0(vVar, this, 2, i));
        this.f231720h = e4m.b.b(new f0(vVar, this, 6, i));
        this.i = e4m.b.b(new f0(vVar, this, 5, i));
        this.f231721j = e4m.b.b(new f0(vVar, this, 4, i));
        this.k = e4m.b.b(new f0(vVar, this, 8, i));
        this.f231722l = e4m.b.b(new f0(vVar, this, 7, i));
        this.f231723m = e4m.b.b(new f0(vVar, this, 9, i));
        this.f231724n = e4m.b.b(new f0(vVar, this, 10, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f231719g.get(), (yji.n) this.f231721j.get(), (yji.n) this.f231722l.get(), (yji.n) this.f231723m.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    public final e52.c q() {
        v vVar = this.f231717b;
        sf0.h hVarB = vVar.i.b();
        vc.s.j(hVarB);
        v60.e eVarA = vVar.f231782j.a();
        vc.s.j(eVarA);
        return new e52.c(hVarB, eVarA, 0);
    }
}
