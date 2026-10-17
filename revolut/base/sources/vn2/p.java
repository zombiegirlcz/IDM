package vn2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankAccountSwitchingReviewScreenContract$InputData f290708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f290709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f290710c;
    public final e4m.e d;

    public p(h hVar, BankAccountSwitchingReviewScreenContract$InputData bankAccountSwitchingReviewScreenContract$InputData) {
        this.f290709b = hVar;
        this.f290708a = bankAccountSwitchingReviewScreenContract$InputData;
        this.f290710c = e4m.b.b(new l(hVar, this, 1, 3));
        this.d = e4m.b.b(new l(hVar, this, 0, 3));
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
