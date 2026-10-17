package b3j;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.BankBeneficiaryDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankBeneficiaryDetailsScreenContract$InputData f12089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f12090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12091c;
    public final e4m.e d;
    public final e4m.e e;

    public r(t tVar, BankBeneficiaryDetailsScreenContract$InputData bankBeneficiaryDetailsScreenContract$InputData) {
        this.f12090b = tVar;
        this.f12089a = bankBeneficiaryDetailsScreenContract$InputData;
        int i = 26;
        this.f12091c = e4m.b.b(new ak5.f(tVar, this, 1, i));
        this.d = e4m.b.b(new ak5.f(tVar, this, 0, i));
        this.e = e4m.b.b(new ak5.f(tVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
