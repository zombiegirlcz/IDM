package spf;

import nrf.d;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static d a(upf.a aVar) {
        String shortDescription = aVar.getShortDescription();
        String title = aVar.getTitle();
        String description = aVar.getDescription();
        dj0.d dVarO = mo3.a.o(aVar.getAmount());
        jo3.a amountInBaseCurrency = aVar.getAmountInBaseCurrency();
        return new d(shortDescription, title, description, dVarO, amountInBaseCurrency != null ? mo3.a.o(amountInBaseCurrency) : null, null);
    }
}
