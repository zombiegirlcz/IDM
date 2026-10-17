package yre;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreeDsVerificationScreenContract$InputData f316311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f316312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f316313c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f316314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f316315h;
    public final e4m.e i;

    public g(e eVar, f fVar, ViewController viewController, ThreeDsVerificationScreenContract$InputData threeDsVerificationScreenContract$InputData) {
        this.f316311a = threeDsVerificationScreenContract$InputData;
        this.f316312b = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.f316313c = e4m.b.b(new a(eVar, this, 2, i));
        this.d = e4m.b.b(new a(eVar, this, 1, i));
        this.e = e4m.b.b(new a(eVar, this, 0, i));
        this.f = e4m.b.b(new a(eVar, this, 4, i));
        this.f316314g = e4m.b.b(new a(eVar, this, 3, i));
        this.f316315h = e4m.b.b(new a(eVar, this, 6, i));
        this.i = e4m.b.b(new a(eVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f316314g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
