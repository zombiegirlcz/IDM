package ow9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import ove.w;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentProfileFlowContract$InputData f230358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f230359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f230360c = this;
    public final e4m.c d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f230361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f230362h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f230363j;
    public final w k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f230364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f230365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f230366n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f230367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f230368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f230369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f230370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f230371t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f230372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f230373x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f230374y;
    public final e4m.e z;

    public f(e eVar, ViewController viewController, PaymentProfileFlowContract$InputData paymentProfileFlowContract$InputData) {
        this.f230359b = eVar;
        this.f230358a = paymentProfileFlowContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.d = cVarA;
        this.e = e4m.b.b(cVarA);
        int i = 4;
        this.f = e4m.b.b(new w(eVar, this, 2, i));
        this.f230361g = e4m.b.b(new w(eVar, this, 1, i));
        this.f230362h = e4m.b.b(new w(eVar, this, 0, i));
        this.i = new w(eVar, this, 5, i);
        this.f230363j = e4m.b.b(new w(eVar, this, 6, i));
        this.k = new w(eVar, this, 7, i);
        this.f230364l = e4m.b.b(new w(eVar, this, 8, i));
        this.f230365m = e4m.b.b(this.d);
        this.f230366n = e4m.b.b(new w(eVar, this, 9, i));
        this.o = e4m.b.b(new w(eVar, this, 4, i));
        this.f230367p = e4m.b.b(new w(eVar, this, 3, i));
        this.f230368q = e4m.b.b(new w(eVar, this, 10, i));
        this.f230369r = e4m.b.b(new w(eVar, this, 11, i));
        this.f230370s = e4m.b.b(new w(eVar, this, 13, i));
        this.f230371t = e4m.b.b(new w(eVar, this, 14, i));
        this.u = e4m.b.b(new w(eVar, this, 12, i));
        this.v = e4m.b.b(new w(eVar, this, 15, i));
        this.f230372w = e4m.b.b(new w(eVar, this, 16, i));
        this.f230373x = e4m.b.b(new w(eVar, this, 17, i));
        this.f230374y = e4m.b.b(new w(eVar, this, 18, i));
        this.z = e4m.b.b(new w(eVar, this, 19, i));
    }

    public final t80.b b() {
        l70.e eVar = this.f230359b.f230341a;
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        l80.e eVarH = eVar.h();
        s.j(eVarH);
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        return new t80.b(aVarX, eVarH, bVarL);
    }

    public final u96.b c() {
        l70.e eVar = this.f230359b.f230341a;
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f230368q.get(), (yji.n) this.f230369r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f230362h.get(), (yji.d) this.f230367p.get());
    }

    public final nli.e j() {
        l70.e eVar = this.f230359b.f230341a;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        t80.c cVar = (t80.c) this.f230363j.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }
}
