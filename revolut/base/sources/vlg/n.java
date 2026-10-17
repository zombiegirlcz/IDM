package vlg;

import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model a() {
        InputTextDelegate.Model model = new InputTextDelegate.Model("ADDRESS", null, new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_address_line1_hint, null, null, 14), new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_address_line1_hint, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -14, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return model;
    }

    public static InputTextDelegate.Model b() {
        InputTextDelegate.Model model = new InputTextDelegate.Model("APARTMENT_SUITE", null, new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_address_line2_hint, null, null, 14), new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_address_line2_hint, null, null, 14), false, null, false, new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_hint_optional, null, null, 14), null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -142, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return model;
    }

    public static InputTextDelegate.Model d() {
        InputTextDelegate.Model model = new InputTextDelegate.Model("CITY", null, new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_city_hint, null, null, 14), new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_city_hint, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -14, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return model;
    }

    public static FixedTabsDelegate.Model e(l lVar) {
        return new FixedTabsDelegate.Model("fixed_tabs_list_id", v.k(new FixedTabs.Item("INDIVIDUAL", new TextLocalisedClause(R$string.bank_transfer_type_switcher_individual, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("BUSINESS", new TextLocalisedClause(R$string.bank_transfer_type_switcher_business, null, null, 14), (AnalyticsContext) null, 12)), lVar.name(), false, null, SyslogConstants.LOG_CLOCK);
    }

    public static InputTextDelegate.Model f(ao3.a aVar) {
        String str;
        String str2 = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_state_hint, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_state_hint, null, null, 14);
        if (aVar != null) {
            str2 = aVar.f7897c;
            if (str2.length() == 0 && (str = aVar.f7895a) != null) {
                str2 = str;
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("STATE", new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause, textLocalisedClause2, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554448, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return yp0.r.a(model);
    }

    public static InputTextDelegate.Model g() {
        InputTextDelegate.Model model = new InputTextDelegate.Model("ZIP_CODE", null, new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_zipcode_hint, null, null, 14), new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_zipcode_hint, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -14, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return model;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listK;
        List listK2;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        l lVar = domainState.f290432a;
        ao3.a aVar = domainState.f290433b;
        int[] iArr = p.f290443a;
        int i = iArr[lVar.ordinal()];
        boolean z = false;
        if (i == 1) {
            FixedTabsDelegate.Model modelE = e(lVar);
            InputTextDelegate.Model model = new InputTextDelegate.Model("FIRST_AND_MIDDLE_NAME", null, new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_first_name_hint, null, null, 14), new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_first_name_hint, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -14, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
            InputTextDelegate.Model model2 = new InputTextDelegate.Model("LAST_NAME", null, new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_last_name_hint, null, null, 14), new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_last_name_hint, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -14, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model2, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
            listK = v.k(modelE, model, model2, a(), b(), d(), f(aVar), g());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            FixedTabsDelegate.Model modelE2 = e(lVar);
            InputTextDelegate.Model model3 = new InputTextDelegate.Model("COMPANY_NAME", null, new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_company_name_hint, null, null, 14), new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_company_name_hint, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -14, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model3, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
            listK = v.k(modelE2, model3, a(), b(), d(), f(aVar), g());
        }
        l lVar2 = domainState.f290432a;
        ilg.b bVar = domainState.f290434c;
        int i2 = iArr[lVar2.ordinal()];
        if (i2 == 1) {
            listK2 = v.k(bVar.f162234a, bVar.f162236c, bVar.d, bVar.f, bVar.f162237g, bVar.f162238h);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listK2 = v.k(bVar.f162235b, bVar.d, bVar.f, bVar.f162237g, bVar.f162238h);
        }
        List list = listK2;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (((ilg.a) it8.next()).f162233a.length() <= 0) {
                    break;
                }
            }
            z = true;
        }
        return new m(listK, z);
    }
}
