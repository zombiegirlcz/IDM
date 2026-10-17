package com.revolut.feature.external_accounts.impl.domain.open_banking_brazil;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f72415c;
    public final OpenBankingBrazilPayment.PaymentInformation d;
    public final boolean e;
    public final ThirdPartyBrazil f;

    public c(String consentId, String str, d dVar, OpenBankingBrazilPayment.PaymentInformation paymentInformation, boolean z, ThirdPartyBrazil thirdParty) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(paymentInformation, "paymentInformation");
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        this.f72413a = consentId;
        this.f72414b = str;
        this.f72415c = dVar;
        this.d = paymentInformation;
        this.e = z;
        this.f = thirdParty;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f72413a, cVar.f72413a) && Intrinsics.f(this.f72414b, cVar.f72414b) && Intrinsics.f(this.f72415c, cVar.f72415c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f72413a.hashCode() * 31;
        String str = this.f72414b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.f72415c;
        return this.f.hashCode() + j6.a.c(p.a.d((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.d.f72409a), 31, this.e);
    }
}
