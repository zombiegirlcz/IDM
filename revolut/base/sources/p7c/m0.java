package p7c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options.InsufficientFundsOptionsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 implements xdc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsufficientFundsOptionsContract$InputData f233644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f233645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233646c = e4m.b.b(new a(this, 2));

    public m0(r rVar, j jVar, InsufficientFundsOptionsContract$InputData insufficientFundsOptionsContract$InputData) {
        this.f233645b = jVar;
        this.f233644a = insufficientFundsOptionsContract$InputData;
    }

    @Override // xdc.b
    public final wdc.j a() {
        return (wdc.j) this.f233646c.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f233645b.f233628h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
