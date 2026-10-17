package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.details.PersonalDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class a5 implements xki.e, b84.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f118268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PersonalDetailsScreenContract$InputData f118269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118270c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f118271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118272h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118273j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118276n;

    public a5(c1 c1Var, z4 z4Var, ViewController viewController, PersonalDetailsScreenContract$InputData personalDetailsScreenContract$InputData) {
        this.f118268a = viewController;
        this.f118269b = personalDetailsScreenContract$InputData;
        this.f118270c = e4m.b.b(e4m.c.a(viewController));
        int i = 26;
        this.d = e4m.b.b(new e0(c1Var, z4Var, this, 2, i));
        this.e = e4m.b.b(new e0(c1Var, z4Var, this, 1, i));
        this.f = e4m.b.b(new e0(c1Var, z4Var, this, 0, i));
        e0 e0Var = new e0(c1Var, z4Var, this, 4, i);
        this.f118271g = e0Var;
        this.f118272h = e4m.b.b(e0Var);
        this.i = e4m.b.b(new e0(c1Var, z4Var, this, 3, i));
        this.f118273j = e4m.b.b(new e0(c1Var, z4Var, this, 6, i));
        this.k = e4m.b.b(new e0(c1Var, z4Var, this, 5, i));
        this.f118274l = e4m.b.b(this.f118271g);
        this.f118275m = e4m.b.b(new e0(c1Var, z4Var, this, 8, i));
        this.f118276n = e4m.b.b(new e0(c1Var, z4Var, this, 7, i));
    }

    @Override // b84.c
    public final a84.a b() {
        return (a84.a) this.k.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118274l.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get(), (yji.d) this.k.get());
    }
}
