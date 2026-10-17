package cr3;

import com.revolut.feature.credit.application.models.credit_health.CreditHealthAction;
import com.revolut.feature.credit.application.models.credit_health.CreditHealthButton;
import com.revolut.feature.credit.application.models.credit_health.CreditHealthPopupConfig;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes21.dex */
public final class i {
    public static CreditHealthButton a(nt3.g gVar) {
        CreditHealthAction popup;
        CreditHealthAction creditHealthAction;
        String title = gVar.getTitle();
        nt3.e action = gVar.getAction();
        if (action instanceof nt3.d) {
            creditHealthAction = CreditHealthAction.Proceed.f66226a;
        } else {
            if (action instanceof nt3.b) {
                popup = new CreditHealthAction.Deeplink(((nt3.b) action).getDeeplink());
            } else {
                boolean z = action instanceof nt3.a;
                CreditHealthAction.CloseApplication closeApplication = CreditHealthAction.CloseApplication.f66223a;
                if (!z) {
                    if (action instanceof nt3.c) {
                        nt3.c cVar = (nt3.c) action;
                        String strD = cVar.getTitle();
                        String strA = cVar.getDescription();
                        CreditHealthButton creditHealthButtonA = a(cVar.getPrimaryButton());
                        nt3.g gVarC = cVar.getSecondaryButton();
                        popup = new CreditHealthAction.Popup(new CreditHealthPopupConfig(strD, strA, creditHealthButtonA, gVarC != null ? a(gVarC) : null));
                    } else if (action != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                creditHealthAction = closeApplication;
            }
            creditHealthAction = popup;
        }
        return new CreditHealthButton(title, creditHealthAction);
    }
}
