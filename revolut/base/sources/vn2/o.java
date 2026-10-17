package vn2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.BankAccountSwitchingReviewOutScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankAccountSwitchingReviewOutScreenContract$InputData f290705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f290706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f290707c;
    public final e4m.e d;

    public o(h hVar, BankAccountSwitchingReviewOutScreenContract$InputData bankAccountSwitchingReviewOutScreenContract$InputData) {
        this.f290706b = hVar;
        this.f290705a = bankAccountSwitchingReviewOutScreenContract$InputData;
        int i = 2;
        this.f290707c = e4m.b.b(new l(hVar, this, 1, i));
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
