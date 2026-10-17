package eo4;

import com.revolut.feature.credit.card.api.models.limits.CreditCardLimits;
import dj0.d;
import do4.a;
import hx7.b;
import io4.g;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final CreditCardLimits.Limit a(a.c cVar) {
        d dVarO = mo3.a.o(cVar.getAmount());
        String title = cVar.getTitle();
        a.b error = cVar.getError();
        String label = error.getLabel();
        g dialogue = error.getDialogue();
        return new CreditCardLimits.Limit(dVarO, title, new CreditCardLimits.Error(label, dialogue != null ? b.A(dialogue) : null));
    }
}
