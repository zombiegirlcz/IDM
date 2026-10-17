package p7c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options.InsufficientFundsOptionsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 implements xdc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsufficientFundsOptionsContract$InputData f233656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f233657b = e4m.b.b(new a(this, 3));

    public o0(r rVar, InsufficientFundsOptionsContract$InputData insufficientFundsOptionsContract$InputData) {
        this.f233656a = insufficientFundsOptionsContract$InputData;
    }

    @Override // xdc.b
    public final wdc.j a() {
        return (wdc.j) this.f233657b.get();
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
