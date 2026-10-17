package zm6;

import android.os.Parcelable;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration a() {
        return new ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration(new TextLocalisedClause(R$string.external_institutions_selection_linking_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_selection_linking_subtitle, null, null, 14), null, null, false, SyslogConstants.LOG_CLOCK);
    }

    public static final CrossBorderLinkAccountFlowContract$InputData b(ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer) {
        CrossBorderLinkAccountFlowContract$InputData.PreselectedInstitution preselectedInstitution;
        ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfigurationA;
        AnalyticsProduct analyticsProductH;
        String str;
        if (trueLayer == null || (str = trueLayer.f72299b) == null) {
            preselectedInstitution = null;
        } else {
            String str2 = trueLayer.f72304l;
            boolean z = trueLayer.f;
            boolean z3 = trueLayer.f72305m;
            String str3 = trueLayer.f72306n;
            if (str3 == null) {
                str3 = "";
            }
            preselectedInstitution = new CrossBorderLinkAccountFlowContract$InputData.PreselectedInstitution(str, str2, str3, z, z3);
        }
        String str4 = trueLayer != null ? trueLayer.d : null;
        if (trueLayer == null || (externalInstitutionsConfigurationA = trueLayer.f72302h) == null) {
            externalInstitutionsConfigurationA = a();
        }
        ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration = externalInstitutionsConfigurationA;
        ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration = trueLayer != null ? trueLayer.f72301g : null;
        NaviCommand naviCommand = trueLayer != null ? trueLayer.i : null;
        boolean z4 = trueLayer != null ? trueLayer.k : true;
        if (trueLayer == null || (analyticsProductH = trueLayer.f72303j) == null) {
            k9 k9Var = k9.OpenBanking;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProductH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        }
        return new CrossBorderLinkAccountFlowContract$InputData(preselectedInstitution, str4, externalInstitutionsConfiguration, externalConsentConfiguration, naviCommand, analyticsProductH, z4, trueLayer != null ? trueLayer.f72300c : null);
    }

    public static final LinkAccountFlowContract$InputData c(ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer, boolean z) {
        LinkAccountFlowContract$InputData.PreselectedInstitution preselectedInstitution;
        ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfigurationA;
        AnalyticsProduct analyticsProductH;
        String str;
        LinkAccountFlowContract$InputData.PreselectedInstitution preselectedInstitution2;
        ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfigurationA2;
        AnalyticsProduct analyticsProductH2;
        String str2;
        if (z) {
            if (trueLayer == null || (str2 = trueLayer.f72299b) == null) {
                preselectedInstitution2 = null;
            } else {
                boolean z3 = trueLayer.f72305m;
                String str3 = trueLayer.f72306n;
                preselectedInstitution2 = new LinkAccountFlowContract$InputData.PreselectedInstitution(str2, null, str3 == null ? "" : str3, false, z3);
            }
            boolean z4 = (trueLayer != null ? trueLayer.f72299b : null) == null;
            if (trueLayer == null || (externalInstitutionsConfigurationA2 = trueLayer.f72302h) == null) {
                externalInstitutionsConfigurationA2 = a();
            }
            ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration = externalInstitutionsConfigurationA2;
            ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration = trueLayer != null ? trueLayer.f72301g : null;
            NaviCommand naviCommand = trueLayer != null ? trueLayer.i : null;
            boolean z6 = trueLayer != null ? trueLayer.k : false;
            if (trueLayer == null || (analyticsProductH2 = trueLayer.f72303j) == null) {
                k9 k9Var = k9.OpenBanking;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                analyticsProductH2 = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
            }
            return new LinkAccountFlowContract$InputData(preselectedInstitution2, null, z4, true, externalInstitutionsConfiguration, externalConsentConfiguration, naviCommand, analyticsProductH2, z6, trueLayer != null ? trueLayer.f72300c : null);
        }
        if (trueLayer == null || (str = trueLayer.f72299b) == null) {
            preselectedInstitution = null;
        } else {
            String str4 = trueLayer.f72304l;
            boolean z11 = trueLayer.f;
            boolean z12 = trueLayer.f72305m;
            String str5 = trueLayer.f72306n;
            preselectedInstitution = new LinkAccountFlowContract$InputData.PreselectedInstitution(str, str4, str5 == null ? "" : str5, z11, z12);
        }
        String str6 = trueLayer != null ? trueLayer.d : null;
        if (trueLayer == null || (externalInstitutionsConfigurationA = trueLayer.f72302h) == null) {
            externalInstitutionsConfigurationA = a();
        }
        ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration2 = externalInstitutionsConfigurationA;
        ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration2 = trueLayer != null ? trueLayer.f72301g : null;
        NaviCommand naviCommand2 = trueLayer != null ? trueLayer.i : null;
        boolean z29 = trueLayer != null ? trueLayer.k : true;
        if (trueLayer == null || (analyticsProductH = trueLayer.f72303j) == null) {
            k9 k9Var2 = k9.OpenBanking;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            analyticsProductH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2);
        }
        return new LinkAccountFlowContract$InputData(preselectedInstitution, str6, false, false, externalInstitutionsConfiguration2, externalConsentConfiguration2, naviCommand2, analyticsProductH, z29, trueLayer != null ? trueLayer.f72300c : null);
    }

    public static final ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration d() {
        return new ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration(new TextLocalisedClause(R$string.external_institutions_selection_topup_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_selection_description, null, null, 14), null, null, false, 124);
    }
}
