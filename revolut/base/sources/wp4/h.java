package wp4;

import com.revolut.feature.credit.autopay.models.CreditAutopaySourceConfig;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardAutopayPayment.AutoPayment f299050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardAutopayConfig f299051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardAutopayPayments f299052c;
    public final CreditCardAutopayPayment.BackupCard d;
    public final CreditCardDirectDebitMandate e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RepaymentSource f299053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CreditAutopaySourceConfig f299054h;

    public h(CreditCardAutopayPayment.AutoPayment activeAutopayPayment, CreditCardAutopayConfig autopayConfig, CreditCardAutopayPayments payments, CreditCardAutopayPayment.BackupCard backupCard, CreditCardDirectDebitMandate creditCardDirectDebitMandate, List revolutSources, RepaymentSource repaymentSource, CreditAutopaySourceConfig revolutSourcesConfig) {
        Intrinsics.checkNotNullParameter(activeAutopayPayment, "activeAutopayPayment");
        Intrinsics.checkNotNullParameter(autopayConfig, "autopayConfig");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(revolutSources, "revolutSources");
        Intrinsics.checkNotNullParameter(revolutSourcesConfig, "revolutSourcesConfig");
        this.f299050a = activeAutopayPayment;
        this.f299051b = autopayConfig;
        this.f299052c = payments;
        this.d = backupCard;
        this.e = creditCardDirectDebitMandate;
        this.f = revolutSources;
        this.f299053g = repaymentSource;
        this.f299054h = revolutSourcesConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f299050a, hVar.f299050a) && Intrinsics.f(this.f299051b, hVar.f299051b) && Intrinsics.f(this.f299052c, hVar.f299052c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f299053g, hVar.f299053g) && Intrinsics.f(this.f299054h, hVar.f299054h);
    }

    public final int hashCode() {
        int iHashCode = (this.f299052c.hashCode() + ((this.f299051b.hashCode() + (this.f299050a.hashCode() * 31)) * 31)) * 31;
        CreditCardAutopayPayment.BackupCard backupCard = this.d;
        int iHashCode2 = (iHashCode + (backupCard == null ? 0 : backupCard.hashCode())) * 31;
        CreditCardDirectDebitMandate creditCardDirectDebitMandate = this.e;
        int iD = p.a.d((iHashCode2 + (creditCardDirectDebitMandate == null ? 0 : creditCardDirectDebitMandate.hashCode())) * 31, 31, this.f);
        RepaymentSource repaymentSource = this.f299053g;
        return this.f299054h.hashCode() + ((iD + (repaymentSource != null ? repaymentSource.hashCode() : 0)) * 31);
    }
}
