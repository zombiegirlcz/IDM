package p7c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.impl.ui.deferred_payment.DeferredPaymentScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeferredPaymentScreenContract$InputData f233599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f233600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233601c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f233602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f233603h;
    public final e4m.e i;

    public e(r rVar, BaseScreen baseScreen, DeferredPaymentScreenContract$InputData deferredPaymentScreenContract$InputData) {
        this.f233599a = deferredPaymentScreenContract$InputData;
        this.f233600b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 17;
        this.f233601c = e4m.b.b(new p12.f0(rVar, this, 2, i));
        this.d = e4m.b.b(new p12.f0(rVar, this, 1, i));
        this.e = e4m.b.b(new p12.f0(rVar, this, 0, i));
        this.f = e4m.b.b(new p12.f0(rVar, this, 4, i));
        this.f233602g = e4m.b.b(new p12.f0(rVar, this, 5, i));
        this.f233603h = e4m.b.b(new p12.f0(rVar, this, 6, i));
        this.i = e4m.b.b(new p12.f0(rVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
