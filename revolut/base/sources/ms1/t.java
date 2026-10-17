package ms1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class t implements qji.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumTransferInputData f208588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f208589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f208590c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f208591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f208592h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f208593j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f208594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f208595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f208596n;

    public t(j jVar, BizumTransferInputData bizumTransferInputData) {
        this.f208589b = jVar;
        this.f208588a = bizumTransferInputData;
        int i = 0;
        this.d = e4m.b.b(new s(jVar, this, 1, i));
        this.e = e4m.b.b(new s(jVar, this, 0, i));
        this.f = e4m.b.b(new s(jVar, this, 4, i));
        this.f208591g = e4m.b.b(new s(jVar, this, 3, i));
        this.f208592h = e4m.b.b(new s(jVar, this, 2, i));
        this.i = e4m.b.b(new s(jVar, this, 6, i));
        this.f208593j = e4m.b.b(new s(jVar, this, 5, i));
        this.k = e4m.b.b(new s(jVar, this, 7, i));
        this.f208594l = e4m.b.b(new s(jVar, this, 8, i));
        this.f208595m = e4m.b.b(new s(jVar, this, 9, i));
        this.f208596n = e4m.b.b(new s(jVar, this, 10, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f208592h.get(), (yji.n) this.f208593j.get(), (yji.n) this.k.get(), (yji.n) this.f208594l.get());
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    public final ns1.f q() {
        j jVar = this.f208589b;
        sf0.h hVarB = jVar.f208533a.b();
        vc.s.j(hVarB);
        v60.e eVarA = jVar.f208534b.a();
        vc.s.j(eVarA);
        l80.e eVarH = jVar.f208535c.h();
        vc.s.j(eVarH);
        return new ns1.f(hVarB, eVarA, eVarH);
    }
}
