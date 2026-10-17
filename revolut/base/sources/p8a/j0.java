package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixQrCodeTransactionAmountScreenContract$InputData f233994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f233995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233996c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j0(d0 d0Var, k0 k0Var, PixQrCodeTransactionAmountScreenContract$InputData pixQrCodeTransactionAmountScreenContract$InputData) {
        this.f233995b = d0Var;
        this.f233994a = pixQrCodeTransactionAmountScreenContract$InputData;
        this.f233996c = e4m.b.b(new m(d0Var, this, 3, 8));
        this.d = e4m.b.b(new m(d0Var, this, 2, 8));
        this.e = e4m.b.b(new m(d0Var, this, 1, 8));
        this.f = e4m.b.b(new m(d0Var, this, 0, 8));
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
