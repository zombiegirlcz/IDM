package pz3;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.KontomatikPopupScreenConfig;
import com.revolut.feature.credit.core.R$string;
import ft3.j1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f240884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f240885b;

    public d(b creditCardIncomeFetchFailedApplicationCommandsFactory, g loanIncomeFetchFailedApplicationCommandsFactory) {
        Intrinsics.checkNotNullParameter(creditCardIncomeFetchFailedApplicationCommandsFactory, "creditCardIncomeFetchFailedApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(loanIncomeFetchFailedApplicationCommandsFactory, "loanIncomeFetchFailedApplicationCommandsFactory");
        this.f240884a = creditCardIncomeFetchFailedApplicationCommandsFactory;
        this.f240885b = loanIncomeFetchFailedApplicationCommandsFactory;
    }

    public final KontomatikPopupScreenConfig a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        return new KontomatikPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_kontomatik_status_success_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_kontomatik_status_success_description, null, null, 14), new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(R$string.credit_application_kontomatik_status_success_primary_button, null, null, 14), ju3.e.RETRY_INCOME_CHECK), new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(R$string.credit_application_kontomatik_status_success_secondary_button, null, null, 14), ju3.e.IGNORE_INCOME_CHECK), ju3.f.SUCCESS);
    }

    public final KontomatikPopupScreenConfig b(PluginPayload pluginPayload, cs3.b configuration) {
        e eVar;
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        j1 j1Var = pluginPayload.f66247a.f168328j;
        switch (c.f240883a[j1Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                eVar = this.f240884a;
                break;
            case 6:
                eVar = this.f240885b;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                throw new IllegalStateException(("Kontomatik plugin is not supported for " + j1Var).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        return eVar.b(pluginPayload, configuration);
    }

    public final KontomatikPopupScreenConfig c(PluginPayload pluginPayload, String unblockedInMinutes) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        Intrinsics.checkNotNullParameter(unblockedInMinutes, "unblockedInMinutes");
        return new KontomatikPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_kontomatik_attempts_error_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_kontomatik_attempts_error_description, u.c(new TextClause(unblockedInMinutes, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(R$string.credit_application_kontomatik_attempts_error_button_close, null, null, 14), ju3.e.CLOSE_SCREEN), null, ju3.f.ERROR);
    }
}
