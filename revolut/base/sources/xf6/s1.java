package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateMandateScreenContract$InputData f305046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f305047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f305048c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f305049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f305050h;
    public final e4m.e i;

    public s1(y1 y1Var, ViewController viewController, CreateMandateScreenContract$InputData createMandateScreenContract$InputData) {
        this.f305046a = createMandateScreenContract$InputData;
        this.f305047b = e4m.b.b(e4m.c.a(viewController));
        this.f305048c = e4m.b.b(new xb1.m(y1Var, this, 2, 29));
        this.d = e4m.b.b(new xb1.m(y1Var, this, 1, 29));
        this.e = e4m.b.b(new xb1.m(y1Var, this, 0, 29));
        this.f = e4m.b.b(new xb1.m(y1Var, this, 4, 29));
        this.f305049g = e4m.b.b(new xb1.m(y1Var, this, 5, 29));
        this.f305050h = e4m.b.b(new xb1.m(y1Var, this, 6, 29));
        this.i = e4m.b.b(new xb1.m(y1Var, this, 3, 29));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
