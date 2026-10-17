package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.PixQrCodeChangeAmountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixQrCodeChangeAmountScreenContract$InputData f233977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f233978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233979c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public h0(d0 d0Var, k0 k0Var, PixQrCodeChangeAmountScreenContract$InputData pixQrCodeChangeAmountScreenContract$InputData) {
        this.f233978b = d0Var;
        this.f233977a = pixQrCodeChangeAmountScreenContract$InputData;
        this.f233979c = e4m.b.b(new m(d0Var, this, 3, 7));
        this.d = e4m.b.b(new m(d0Var, this, 2, 7));
        this.e = e4m.b.b(new m(d0Var, this, 1, 7));
        this.f = e4m.b.b(new m(d0Var, this, 0, 7));
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
