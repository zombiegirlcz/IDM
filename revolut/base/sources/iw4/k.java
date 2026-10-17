package iw4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardStatementDeferralQuote;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ll4.u;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f168947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f168948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardStatementDeferralQuote f168949c;
    public final boolean d;
    public final u e;

    public k(List quotes, dj0.d downPayment, CreditCardStatementDeferralQuote selectedQuote, boolean z, u creditManagementInfo) {
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(downPayment, "downPayment");
        Intrinsics.checkNotNullParameter(selectedQuote, "selectedQuote");
        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
        this.f168947a = quotes;
        this.f168948b = downPayment;
        this.f168949c = selectedQuote;
        this.d = z;
        this.e = creditManagementInfo;
    }

    public static k a(k kVar, List list, dj0.d dVar, CreditCardStatementDeferralQuote creditCardStatementDeferralQuote, int i) {
        if ((i & 1) != 0) {
            list = kVar.f168947a;
        }
        List quotes = list;
        if ((i & 2) != 0) {
            dVar = kVar.f168948b;
        }
        dj0.d downPayment = dVar;
        if ((i & 4) != 0) {
            creditCardStatementDeferralQuote = kVar.f168949c;
        }
        CreditCardStatementDeferralQuote selectedQuote = creditCardStatementDeferralQuote;
        boolean z = (i & 8) != 0 ? kVar.d : false;
        u creditManagementInfo = kVar.e;
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(downPayment, "downPayment");
        Intrinsics.checkNotNullParameter(selectedQuote, "selectedQuote");
        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
        return new k(quotes, downPayment, selectedQuote, z, creditManagementInfo);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f168947a, kVar.f168947a) && Intrinsics.f(this.f168948b, kVar.f168948b) && Intrinsics.f(this.f168949c, kVar.f168949c) && this.d == kVar.d && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c((this.f168949c.hashCode() + v7.c(this.f168947a.hashCode() * 31, 31, this.f168948b)) * 31, 31, this.d);
    }
}
