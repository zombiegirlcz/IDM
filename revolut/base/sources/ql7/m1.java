package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files.UploadFilesListScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UploadFilesListScreenContract$InputData f247384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f247386c;
    public final e4m.e d;
    public final e4m.e e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f247388h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f247389j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f247390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f247391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f247392n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f247393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f247394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f247395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f247396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f247397t;

    public m1(k0 k0Var, k1 k1Var, BaseScreen baseScreen, UploadFilesListScreenContract$InputData uploadFilesListScreenContract$InputData) {
        this.f247385b = k0Var;
        this.f247384a = uploadFilesListScreenContract$InputData;
        e4m.c cVarA = e4m.c.a(baseScreen);
        this.f247386c = cVarA;
        this.d = e4m.b.b(cVarA);
        this.e = e4m.b.b(new l(k0Var, this, 2, 26));
        this.f = new l(k0Var, this, 3, 26);
        this.f247387g = e4m.b.b(new l(k0Var, this, 4, 26));
        this.f247388h = new l(k0Var, this, 5, 26);
        this.i = e4m.b.b(new l(k0Var, this, 6, 26));
        this.f247389j = e4m.b.b(this.f247386c);
        this.k = e4m.b.b(new l(k0Var, this, 7, 26));
        this.f247390l = e4m.b.b(new l(k0Var, this, 1, 26));
        this.f247391m = e4m.b.b(new l(k0Var, this, 0, 26));
        this.f247392n = e4m.b.b(new l(k0Var, this, 10, 26));
        this.o = e4m.b.b(new l(k0Var, this, 9, 26));
        this.f247393p = e4m.b.b(new l(k0Var, this, 8, 26));
        this.f247394q = e4m.b.b(new l(k0Var, this, 11, 26));
        this.f247395r = e4m.b.b(new l(k0Var, this, 14, 26));
        this.f247396s = e4m.b.b(new l(k0Var, this, 13, 26));
        this.f247397t = e4m.b.b(new l(k0Var, this, 12, 26));
    }

    public final u96.b d() {
        l70.e eVar = this.f247385b.f;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e e() {
        l70.e eVar = this.f247385b.f;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f247387g.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f247394q.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f247391m.get(), (yji.d) this.f247393p.get());
    }
}
