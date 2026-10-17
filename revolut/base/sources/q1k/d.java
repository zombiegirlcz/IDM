package q1k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreenContract$InputData;
import e4m.e;
import e4m.g;
import java.util.Set;
import prk.k0;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentOptionsVaultWithdrawalScreenContract$InputData f241463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f241464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f241465c;
    public final e d;
    public final e e;

    public d(a aVar, b bVar, PaymentOptionsVaultWithdrawalScreenContract$InputData paymentOptionsVaultWithdrawalScreenContract$InputData) {
        this.f241464b = aVar;
        this.f241463a = paymentOptionsVaultWithdrawalScreenContract$InputData;
        int i = 6;
        this.f241465c = g.a(new k0(aVar, this, 2, i));
        this.d = e4m.b.b(new k0(aVar, this, 1, i));
        this.e = e4m.b.b(new k0(aVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
