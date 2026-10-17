package o6d;

import com.revolut.feature.shared.branding.api.destination.BrandingSharedDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements t6d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrandingSharedDestination.InputData f222549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f222550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f222551c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f222552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f222553h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f222554j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f222555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f222556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f222557n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f222558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f222559q;

    public e(f fVar, c cVar, ViewController viewController, BrandingSharedDestination.InputData inputData) {
        this.f222550b = fVar;
        this.f222549a = inputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f222551c = cVarA;
        this.d = e4m.b.b(cVarA);
        this.e = e4m.b.b(new d(fVar, cVar, this, 1));
        this.f = e4m.b.b(new d(fVar, cVar, this, 0));
        this.f222552g = new d(fVar, cVar, this, 4);
        this.f222553h = e4m.b.b(new d(fVar, cVar, this, 5));
        this.i = new d(fVar, cVar, this, 6);
        this.f222554j = e4m.b.b(new d(fVar, cVar, this, 7));
        this.k = e4m.b.b(this.f222551c);
        this.f222555l = e4m.b.b(new d(fVar, cVar, this, 8));
        this.f222556m = e4m.b.b(new d(fVar, cVar, this, 3));
        this.f222557n = e4m.b.b(new d(fVar, cVar, this, 2));
        this.o = e4m.b.b(new d(fVar, cVar, this, 9));
        this.f222558p = e4m.b.b(new d(fVar, cVar, this, 11));
        this.f222559q = e4m.b.b(new d(fVar, cVar, this, 10));
    }

    public final t80.b b() {
        l70.e eVar = this.f222550b.f222560a;
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        l80.e eVarH = eVar.h();
        s.j(eVarH);
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        return new t80.b(aVarX, eVarH, bVarL);
    }

    public final u96.b c() {
        l70.e eVar = this.f222550b.f222560a;
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.singleton((n) this.o.get());
    }

    @Override // xki.e
    public final Set g() {
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(this.f, "Set contributions cannot be null", arrayList);
        return kii.e.C(this.f222557n, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList);
    }

    public final nli.e j() {
        l70.e eVar = this.f222550b.f222560a;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        t80.c cVar = (t80.c) this.f222553h.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }
}
