package vn2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.BankAccountSwitchingPaymentsReviewScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankAccountSwitchingPaymentsReviewScreenContract$InputData f290699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f290700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f290701c;
    public final e4m.e d;

    public m(h hVar, BankAccountSwitchingPaymentsReviewScreenContract$InputData bankAccountSwitchingPaymentsReviewScreenContract$InputData) {
        this.f290700b = hVar;
        this.f290699a = bankAccountSwitchingPaymentsReviewScreenContract$InputData;
        int i = 0;
        this.f290701c = e4m.b.b(new l(hVar, this, 1, i));
        this.d = e4m.b.b(new l(hVar, this, 0, i));
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
