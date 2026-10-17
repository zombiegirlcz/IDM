package pz3;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.KontomatikPopupScreenConfig;
import com.revolut.feature.credit.core.R$string;
import hs3.v;
import hs3.z;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends e {
    @Override // pz3.e
    public final KontomatikPopupScreenConfig b(PluginPayload pluginPayload, cs3.b configuration) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        it3.d dVar = pluginPayload.f66247a;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof z)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof z) {
                        break;
                    }
                }
                obj2 = (v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.FailedIncomeFetchReasonMetaData");
            }
            obj2 = (z) obj3;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", o0.f186429a.b(z.class)));
        }
        switch (f.f240886a[((z) obj2).f154978a.ordinal()]) {
            case 1:
            case 2:
                return e.a();
            case 3:
                return e.c();
            case 4:
                return new KontomatikPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_kontomatik_loan_unknown_bank_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_kontomatik_loan_unknown_bank_over_limit_subtitle, null, null, 14), new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), ju3.e.IGNORE_INCOME_CHECK), new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(R$string.credit_application_kontomatik_loan_over_limit_button_cancel, null, null, 14), ju3.e.CLOSE_APPLICATION), ju3.f.WARNING);
            case 5:
            case 6:
                return new KontomatikPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_kontomatik_loan_unknown_bank_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_kontomatik_loan_unknown_bank_under_limit_subtitle, null, null, 14), new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), ju3.e.IGNORE_INCOME_CHECK), null, ju3.f.WARNING);
            case 7:
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_kontomatik_loan_not_available_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_kontomatik_loan_not_available_over_limit_subtitle, null, null, 14);
                KontomatikPopupScreenConfig.Button button = new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(R$string.credit_application_kontomatik_loan_not_available_over_limit_button_cancel, null, null, 14), ju3.e.CLOSE_SCREEN);
                int i = R$string.credit_application_kontomatik_loan_not_available_over_limit_button_continue;
                dj0.d money = configuration.d;
                if (money == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Intrinsics.checkNotNullParameter(money, "money");
                return new KontomatikPopupScreenConfig(textLocalisedClause, textLocalisedClause2, button, new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(i, u.c(new MoneyClause(money, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12), ju3.e.IGNORE_INCOME_CHECK), ju3.f.WARNING);
            case 8:
            case 9:
                return new KontomatikPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_kontomatik_loan_not_available_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_kontomatik_loan_not_available_under_limit_subtitle, null, null, 14), new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), ju3.e.IGNORE_INCOME_CHECK), null, ju3.f.WARNING);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
