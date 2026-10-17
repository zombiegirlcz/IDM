package kr9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupCustomizationScreenContract$InputData f188727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f188728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f188729c;
    public final e4m.c d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jqa.h f188730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f188731h;
    public final jqa.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f188732j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f188733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f188734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f188735n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f188736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f188737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f188738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f188739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f188740t;
    public final e4m.e u;

    public f(l lVar, k kVar, BaseScreen baseScreen, GroupCustomizationScreenContract$InputData groupCustomizationScreenContract$InputData) {
        this.f188729c = lVar;
        this.f188727a = groupCustomizationScreenContract$InputData;
        this.f188728b = baseScreen;
        e4m.c cVarA = e4m.c.a(baseScreen);
        this.d = cVarA;
        this.e = e4m.b.b(cVarA);
        int i = 29;
        this.f = e4m.b.b(new jqa.h(lVar, this, 2, i));
        this.f188730g = new jqa.h(lVar, this, 3, i);
        this.f188731h = e4m.b.b(new jqa.h(lVar, this, 4, i));
        this.i = new jqa.h(lVar, this, 5, i);
        this.f188732j = e4m.b.b(new jqa.h(lVar, this, 6, i));
        this.k = e4m.b.b(this.d);
        this.f188733l = e4m.b.b(new jqa.h(lVar, this, 7, i));
        this.f188734m = e4m.b.b(new jqa.h(lVar, this, 1, i));
        this.f188735n = e4m.b.b(new jqa.h(lVar, this, 0, i));
        this.o = e4m.b.b(new jqa.h(lVar, this, 10, i));
        this.f188736p = e4m.b.b(new jqa.h(lVar, this, 9, i));
        this.f188737q = e4m.b.b(new jqa.h(lVar, this, 8, i));
        this.f188738r = e4m.b.b(new jqa.h(lVar, this, 11, i));
        this.f188739s = e4m.b.b(new jqa.h(lVar, this, 13, i));
        this.f188740t = e4m.b.b(new jqa.h(lVar, this, 14, i));
        this.u = e4m.b.b(new jqa.h(lVar, this, 12, i));
    }

    public final u96.b d() {
        l70.e eVar = this.f188729c.f188760h;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e e() {
        l70.e eVar = this.f188729c.f188760h;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f188731h.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f188738r.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f188735n.get(), (yji.d) this.f188737q.get());
    }
}
