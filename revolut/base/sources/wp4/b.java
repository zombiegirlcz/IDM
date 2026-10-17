package wp4;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.autopay.models.CreditAutopaySourceConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardAutopayPayment.AutoPayment f299031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardAutopayPayments f299032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardAutopayConfig f299033c;
    public final wi0.b d;
    public final t61.g e;
    public final CreditCardAutopayPayment.BackupCard f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CreditCardDirectDebitMandate f299034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Image f299035h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f299036j;
    public final CreditAutopaySourceConfig k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f299037l;

    public b(CreditCardAutopayPayment.AutoPayment activePayment, CreditCardAutopayPayments autopayPayments, CreditCardAutopayConfig autopayConfig, wi0.b countryCode, t61.g gVar, CreditCardAutopayPayment.BackupCard backupCard, CreditCardDirectDebitMandate creditCardDirectDebitMandate, Image image, List repaymentSources, f autopaySource, CreditAutopaySourceConfig autopaySourceConfig, boolean z) {
        Intrinsics.checkNotNullParameter(activePayment, "activePayment");
        Intrinsics.checkNotNullParameter(autopayPayments, "autopayPayments");
        Intrinsics.checkNotNullParameter(autopayConfig, "autopayConfig");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(repaymentSources, "repaymentSources");
        Intrinsics.checkNotNullParameter(autopaySource, "autopaySource");
        Intrinsics.checkNotNullParameter(autopaySourceConfig, "autopaySourceConfig");
        this.f299031a = activePayment;
        this.f299032b = autopayPayments;
        this.f299033c = autopayConfig;
        this.d = countryCode;
        this.e = gVar;
        this.f = backupCard;
        this.f299034g = creditCardDirectDebitMandate;
        this.f299035h = image;
        this.i = repaymentSources;
        this.f299036j = autopaySource;
        this.k = autopaySourceConfig;
        this.f299037l = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f299031a, bVar.f299031a) && Intrinsics.f(this.f299032b, bVar.f299032b) && Intrinsics.f(this.f299033c, bVar.f299033c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f299034g, bVar.f299034g) && Intrinsics.f(this.f299035h, bVar.f299035h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f299036j, bVar.f299036j) && Intrinsics.f(this.k, bVar.k) && this.f299037l == bVar.f299037l;
    }

    @Override // wp4.e
    public final wi0.b getCountryCode() {
        return this.d;
    }

    public final int hashCode() {
        int iC = p.a.c((this.f299033c.hashCode() + ((this.f299032b.hashCode() + (this.f299031a.hashCode() * 31)) * 31)) * 31, 31, this.d.f297794a);
        t61.g gVar = this.e;
        int iHashCode = (iC + (gVar == null ? 0 : gVar.hashCode())) * 31;
        CreditCardAutopayPayment.BackupCard backupCard = this.f;
        int iHashCode2 = (iHashCode + (backupCard == null ? 0 : backupCard.hashCode())) * 31;
        CreditCardDirectDebitMandate creditCardDirectDebitMandate = this.f299034g;
        int iHashCode3 = (iHashCode2 + (creditCardDirectDebitMandate == null ? 0 : creditCardDirectDebitMandate.hashCode())) * 31;
        Image image = this.f299035h;
        return Boolean.hashCode(this.f299037l) + ((this.k.hashCode() + ((this.f299036j.hashCode() + p.a.d((iHashCode3 + (image != null ? image.hashCode() : 0)) * 31, 31, this.i)) * 31)) * 31);
    }
}
