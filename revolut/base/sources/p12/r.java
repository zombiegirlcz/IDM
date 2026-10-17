package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.ApmAliasClaimUploadScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmAliasClaimUploadScreenContract$InputData f231749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f231750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f231751c;
    public final e4m.e d;
    public final ove.w e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ove.w f231752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f231753h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f231754j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f231755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f231756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f231757n;
    public final e4m.e o;

    public r(v vVar, p pVar, ViewController viewController, ApmAliasClaimUploadScreenContract$InputData apmAliasClaimUploadScreenContract$InputData) {
        this.f231750b = vVar;
        this.f231749a = apmAliasClaimUploadScreenContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f231751c = cVarA;
        this.d = e4m.b.b(cVarA);
        int i = 22;
        this.e = new ove.w(vVar, this, 2, i);
        this.f = e4m.b.b(new ove.w(vVar, this, 3, i));
        this.f231752g = new ove.w(vVar, this, 4, i);
        this.f231753h = e4m.b.b(new ove.w(vVar, this, 5, i));
        this.i = e4m.b.b(this.f231751c);
        this.f231754j = e4m.b.b(new ove.w(vVar, this, 6, i));
        this.k = e4m.b.b(new ove.w(vVar, this, 1, i));
        this.f231755l = e4m.b.b(new ove.w(vVar, this, 0, i));
        this.f231756m = e4m.b.b(new ove.w(vVar, this, 7, i));
        this.f231757n = e4m.b.b(new ove.w(vVar, this, 9, i));
        this.o = e4m.b.b(new ove.w(vVar, this, 8, i));
    }

    public final t80.b b() {
        l70.e eVar = this.f231750b.o;
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        return new t80.b(aVarX, eVarH, bVarL);
    }

    public final u96.b c() {
        l70.e eVar = this.f231750b.o;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f231756m.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f231755l.get());
    }

    public final nli.e j() {
        l70.e eVar = this.f231750b.o;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }
}
