package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.refund.screen.amount.PixRefundAmountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class q0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixRefundAmountScreenContract$InputData f234060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234062c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public q0(d0 d0Var, r0 r0Var, PixRefundAmountScreenContract$InputData pixRefundAmountScreenContract$InputData) {
        this.f234061b = d0Var;
        this.f234060a = pixRefundAmountScreenContract$InputData;
        int i = 13;
        this.f234062c = e4m.b.b(new m(d0Var, this, 3, i));
        this.d = e4m.b.b(new m(d0Var, this, 2, i));
        this.e = e4m.b.b(new m(d0Var, this, 1, i));
        this.f = e4m.b.b(new m(d0Var, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
