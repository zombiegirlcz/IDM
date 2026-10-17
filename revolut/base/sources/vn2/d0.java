package vn2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.TermsAndConditionsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TermsAndConditionsScreenContract$InputData f290652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f290653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f290654c;

    public d0(h hVar, TermsAndConditionsScreenContract$InputData termsAndConditionsScreenContract$InputData) {
        this.f290652a = termsAndConditionsScreenContract$InputData;
        int i = 6;
        this.f290653b = e4m.b.b(new l(hVar, this, 1, i));
        this.f290654c = e4m.b.b(new l(hVar, this, 0, i));
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
