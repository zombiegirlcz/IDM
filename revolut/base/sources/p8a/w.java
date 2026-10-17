package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixAutomaticoPaymentDetailsScreenContract$InputData f234108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234110c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f234112h;

    public w(d0 d0Var, u uVar, ViewController viewController, PixAutomaticoPaymentDetailsScreenContract$InputData pixAutomaticoPaymentDetailsScreenContract$InputData) {
        this.f234109b = d0Var;
        this.f234108a = pixAutomaticoPaymentDetailsScreenContract$InputData;
        this.f234110c = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.d = e4m.b.b(new m(d0Var, this, 2, i));
        this.e = e4m.b.b(new m(d0Var, this, 1, i));
        this.f = e4m.b.b(new m(d0Var, this, 0, i));
        this.f234111g = e4m.b.b(new m(d0Var, this, 4, i));
        this.f234112h = e4m.b.b(new m(d0Var, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
