package qf6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import foh.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import mf6.g;
import og6.h;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final OpenBankingBrazilPayment a(g gVar) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        try {
            String consentId = gVar.getConsentId();
            h hVarValueOf = h.valueOf(gVar.getType());
            String title = gVar.getTitle();
            String paymentDescription = gVar.getPaymentDescription();
            String fromPocketId = gVar.getFromPocketId();
            jo3.a paymentAmount = gVar.getPaymentAmount();
            if (paymentAmount != null) {
                long amount = paymentAmount.getAmount();
                xi0.a aVar = xi0.b.Companion;
                String currency = paymentAmount.getCurrency();
                aVar.getClass();
                dVar = new dj0.d(amount, xi0.a.a(currency));
            } else {
                dVar = null;
            }
            g.e paymentInformation = gVar.getPaymentInformation();
            return new OpenBankingBrazilPayment(consentId, hVarValueOf, title, paymentDescription, fromPocketId, dVar, paymentInformation != null ? c.a(paymentInformation) : null, gVar.getPixAutomaticoExpirationDate(), i.x(gVar.getThirdParty()), gVar.getFooterMessage());
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }
}
