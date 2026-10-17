package qf6;

import foh.i;
import kotlin.jvm.internal.Intrinsics;
import mf6.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String consentId = fVar.getConsentId();
        String fromPocketId = fVar.getFromPocketId();
        jo3.a paymentAmount = fVar.getPaymentAmount();
        return new com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c(consentId, fromPocketId, paymentAmount != null ? mo3.a.o(paymentAmount) : null, c.a(fVar.getPaymentInformation()), fVar.getPaymentNotificationsEnabled(), i.x(fVar.getThirdParty()));
    }
}
