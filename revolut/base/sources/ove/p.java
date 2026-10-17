package ove;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MandateTopupFlowContract$InputData f230106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f230107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f230108c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f230109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f230110h;

    public p(t tVar, ViewController viewController, MandateTopupFlowContract$InputData mandateTopupFlowContract$InputData) {
        this.f230107b = tVar;
        this.f230106a = mandateTopupFlowContract$InputData;
        this.f230108c = e4m.b.b(e4m.c.a(viewController));
        int i = 28;
        this.d = e4m.b.b(new oi9.a(tVar, this, 2, i));
        this.e = e4m.b.b(new oi9.a(tVar, this, 1, i));
        this.f = e4m.b.b(new oi9.a(tVar, this, 0, i));
        this.f230109g = e4m.b.b(new oi9.a(tVar, this, 4, i));
        this.f230110h = e4m.b.b(new oi9.a(tVar, this, 3, i));
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
