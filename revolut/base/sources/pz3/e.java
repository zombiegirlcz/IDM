package pz3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.KontomatikPopupScreenConfig;
import com.revolut.feature.credit.core.R$string;

/* JADX INFO: loaded from: classes22.dex */
public abstract class e {
    public static KontomatikPopupScreenConfig a() {
        return new KontomatikPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_kontomatik_status_fail_name_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_kontomatik_status_fail_name_desc, null, null, 14), new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(R$string.credit_application_kontomatik_status_fail_name_primary_button, null, null, 14), ju3.e.RETRY_INCOME_CHECK), new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(R$string.credit_application_kontomatik_status_fail_name_secondary_button, null, null, 14), ju3.e.IGNORE_INCOME_CHECK), ju3.f.WARNING);
    }

    public static KontomatikPopupScreenConfig c() {
        return new KontomatikPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_kontomatik_status_fail_currency_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_kontomatik_status_fail_currency_desc, null, null, 14), new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(R$string.credit_application_kontomatik_status_fail_currency_primary_button, null, null, 14), ju3.e.RETRY_INCOME_CHECK), new KontomatikPopupScreenConfig.Button(new TextLocalisedClause(R$string.credit_application_kontomatik_status_fail_currency_secondary_button, null, null, 14), ju3.e.IGNORE_INCOME_CHECK), ju3.f.WARNING);
    }

    public abstract KontomatikPopupScreenConfig b(PluginPayload pluginPayload, cs3.b bVar);
}
