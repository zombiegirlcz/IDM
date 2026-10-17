package tn6;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.R$plurals;
import com.revolut.feature.external_accounts.impl.R$string;
import ip0.ak0;
import ip0.yt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f272320a;

    public m(g inputData, bn6.a itemsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        this.f272320a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        ArrayList arrayListU;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        g gVar = this.f272320a;
        ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration = gVar.f272314a;
        boolean z = gVar.f272315b;
        UserCompanyRegion userCompanyRegion = domainState.f272313a;
        if (externalConsentConfiguration != null) {
            List list = externalConsentConfiguration.f72283c;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration.ConsentItem consentItem = (ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration.ConsentItem) obj2;
                arrayList.add(new ListCellDelegate.Model(a0.d.n("EXTERNAL_CONSENT_ID_", i), new j8(consentItem.f72286c, yt.TOP), consentItem.f72284a, consentItem.f72285b, false, null, null, 0, 0, 0, 0, 4064));
                i = i2;
            }
            yp0.b.k(arrayList, 0, R$attr.uikit_dp16, 0, 0, 29);
            arrayListU = w.u(v.k(arrayList, u.c(new TextDelegate.Model("FOOTER_ID", externalConsentConfiguration.d, false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036))));
        } else {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.external_institutions_consent_account_details_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(z ? R$string.external_institutions_consent_account_details_subtitle : R$string.external_institutions_consent_account_details_no_budget_info_subtitle, null, null, 14);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            yt ytVar = yt.TOP;
            ListCellDelegate.Model model = new ListCellDelegate.Model("ACCOUNT_ID", new j8(resourceImage, ytVar), textLocalisedClause, textLocalisedClause2, false, null, null, 0, 0, 0, 0, 4080);
            ListCellDelegate.Model model2 = new ListCellDelegate.Model("TRANSACTIONS_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.external_institutions_consent_transactions_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_consent_transactions_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
            if (!z) {
                model2 = null;
            }
            ListCellDelegate.Model model3 = new ListCellDelegate.Model("FEATURES_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_star_filled, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.external_institutions_consent_features_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_consent_features_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
            if (!z) {
                model3 = null;
            }
            qv0.i[] elements = {model, model2, model3, new ListCellDelegate.Model("INFORMATION_ID", new j8(new ResourceImage(R$drawable.uikit_icn_16_lock_closed, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.external_institutions_consent_information_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_consent_information_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, R$attr.uikit_dp16, 0, 0, 29);
            Clause clauseW = userCompanyRegion == null ? null : yoj.b.w(bn6.b.f17120a[userCompanyRegion.ordinal()] == 1 ? new HtmlLocalisedClause(R$string.external_institutions_consent_footer_uk, (List) null, (Integer) null, (Object) null, 30) : new TextLocalisedClause(R$string.external_institutions_consent_footer, null, null, 14), yoj.b.w(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedQuantityClause(R$plurals.oba_authorize_accounts_bottom_note, (Number) 90, v.k(new TimeClause(DateTime.now().plusDays(90).getMillis(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), 90), (Style) null, 24)));
            arrayListU = w.u(v.k(listL, clauseW == null ? f0.f322471a : u.c(new TextDelegate.Model("FOOTER_ID", clauseW, false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036))));
        }
        return new j(arrayListU);
    }
}
