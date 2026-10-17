package chc;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentMethodEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentSchemeEmbeddedEntity;
import com.revolut.data.database.models.recurringpayments.WalletAutomationEmbeddedEntity;
import com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator;
import com.revolut.feature.commodities.onboarding.impl.R$string;
import com.revolut.feature.commodities.onboarding.impl.ui_kompot.risks.CommoditiesOnboardingRisksController;
import com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.CFACInsuranceReasonGroupScreen;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreen;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_add_phone_number.EsimMobilePlanAddPhoneNumberScreen;
import com.revolut.sso.impl.data.storage.RevolutAccountsManagerContentProvider;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import qlm.h0;
import qlm.v1;
import tw0.l0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24154a;

    public /* synthetic */ c0(int i) {
        this.f24154a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        nn0.c cVar;
        switch (this.f24154a) {
            case 0:
                return new qlm.e(v1.f247718a);
            case 1:
                return ci7.t.Companion.serializer();
            case 2:
                return new qlm.e(ci7.b.f24403a);
            case 3:
                KProperty[] kPropertyArr = AccountsController.O0;
                return new l0();
            case 4:
                int i = ShopsCampaignCheckoutScreen.W;
                return new FullScreenStateDelegate();
            case 5:
                return Unit.f186387a;
            case 6:
                KProperty[] kPropertyArr2 = EsimMobilePlanAddPhoneNumberScreen.T;
                return new FullScreenStateDelegate();
            case 7:
                KProperty[] kPropertyArr3 = EsimMobilePlanAddPhoneNumberScreen.T;
                return new CellDetailsDelegate();
            case 8:
                KProperty[] kPropertyArr4 = EsimMobilePlanAddPhoneNumberScreen.T;
                return new RowDelegate(null, null, 7);
            case 9:
                CommoditiesOnboardingRisksController.a aVar = CommoditiesOnboardingRisksController.Companion;
                return new ListCellBulletDelegate();
            case 10:
                List listK = zhm.v.k(Integer.valueOf(R$string.commodities_onboarding_row_1), Integer.valueOf(R$string.commodities_onboarding_row_2), Integer.valueOf(R$string.commodities_onboarding_row_3));
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.commodities_onboarding_row_last_without_link, null, null, 14);
                t0 t0Var = t0.f186434a;
                m70.a.t(t0Var);
                TextClause textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i2 = R$string.commodities_onboarding_row_last_link;
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return ck3.o.a(new CompositeClause(zhm.v.k(textLocalisedClause, textClause, new TextLocalisedClause(i2, null, new Click(30, (Integer) null, (Object) null, "", false), 10)), null, null, null, 14), "LIST_ID_PREFIX_REGULAR_ITEM_", listK);
            case 11:
                List listK2 = zhm.v.k(Integer.valueOf(R$string.commodities_onboarding_rl_row_1), Integer.valueOf(R$string.commodities_onboarding_rl_row_2), Integer.valueOf(R$string.commodities_onboarding_rl_row_3));
                int i3 = R$string.commodities_onboarding_rl_row_last;
                int i5 = R$string.commodities_onboarding_rl_row_last_link;
                m70.a.c(t0.f186434a);
                return ck3.o.a(new TextLocalisedClause(i3, zhm.u.c(new TextLocalisedClause(i5, null, new Click(30, (Integer) null, (Object) null, "", false), 10)), null, 12), "LIST_ID_PREFIX_RL_ITEM_", listK2);
            case 12:
                List listK3 = zhm.v.k(Integer.valueOf(R$string.commodities_onboarding_nz_row_1), Integer.valueOf(R$string.commodities_onboarding_nz_row_2), Integer.valueOf(R$string.commodities_onboarding_nz_row_3));
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.commodities_onboarding_row_last_without_link, null, null, 14);
                t0 t0Var2 = t0.f186434a;
                m70.a.t(t0Var2);
                TextClause textClause2 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i6 = R$string.commodities_onboarding_row_last_link;
                Intrinsics.checkNotNullParameter(t0Var2, "<this>");
                return ck3.o.a(new CompositeClause(zhm.v.k(textLocalisedClause2, textClause2, new TextLocalisedClause(i6, null, new Click(30, (Integer) null, (Object) null, "", false), 10)), null, null, null, 14), "LIST_ID_PREFIX_NZ_ITEM_", listK3);
            case 13:
                List listK4 = zhm.v.k(Integer.valueOf(R$string.commodities_onboarding_au_row_1), Integer.valueOf(R$string.commodities_onboarding_au_row_2), Integer.valueOf(R$string.commodities_onboarding_au_row_3), Integer.valueOf(R$string.commodities_onboarding_au_row_4));
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.commodities_onboarding_row_last_without_link, null, null, 14);
                t0 t0Var3 = t0.f186434a;
                m70.a.t(t0Var3);
                TextClause textClause3 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i21 = R$string.commodities_onboarding_row_last_link;
                Intrinsics.checkNotNullParameter(t0Var3, "<this>");
                return ck3.o.a(new CompositeClause(zhm.v.k(textLocalisedClause3, textClause3, new TextLocalisedClause(i21, null, new Click(30, (Integer) null, (Object) null, "", false), 10)), null, null, null, 14), "LIST_ID_PREFIX_AU_ITEM_", listK4);
            case 14:
                List listK5 = zhm.v.k(Integer.valueOf(R$string.commodities_onboarding_jp_row_1), Integer.valueOf(R$string.commodities_onboarding_jp_row_2));
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.commodities_onboarding_row_last_without_link, null, null, 14);
                t0 t0Var4 = t0.f186434a;
                m70.a.t(t0Var4);
                TextClause textClause4 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i22 = R$string.commodities_onboarding_row_last_link;
                Intrinsics.checkNotNullParameter(t0Var4, "<this>");
                return ck3.o.a(new CompositeClause(zhm.v.k(textLocalisedClause4, textClause4, new TextLocalisedClause(i22, null, new Click(30, (Integer) null, (Object) null, "", false), 10)), null, null, null, 14), "LIST_ID_PREFIX_JP_ITEM_", listK5);
            case 15:
                List listK6 = zhm.v.k(Integer.valueOf(R$string.commodities_onboarding_sg_row_1), Integer.valueOf(R$string.commodities_onboarding_row_2), Integer.valueOf(R$string.commodities_onboarding_row_3));
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.commodities_onboarding_row_last_without_link, null, null, 14);
                t0 t0Var5 = t0.f186434a;
                m70.a.t(t0Var5);
                TextClause textClause5 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i32 = R$string.commodities_onboarding_row_last_link;
                Intrinsics.checkNotNullParameter(t0Var5, "<this>");
                return ck3.o.a(new CompositeClause(zhm.v.k(textLocalisedClause5, textClause5, new TextLocalisedClause(i32, null, new Click(30, (Integer) null, (Object) null, "", false), 10)), null, null, null, 14), "LIST_ID_PREFIX_SG_ITEM_", listK6);
            case 16:
                KProperty[] kPropertyArr5 = CFACInsuranceReasonGroupScreen.c0;
                return new CellDetailsChevronDelegate();
            case 17:
                KProperty[] kPropertyArr6 = CFACInsuranceReasonGroupScreen.c0;
                return new ActionWidgetDelegate();
            case 18:
                v1 v1Var = v1.f247718a;
                return new h0(v1Var, v1Var, 1);
            case 19:
                return new qlm.e(ckl.f.f24877a);
            case 20:
                return new qlm.e(ckl.i.f24881a);
            case 21:
                return new qlm.e(ckl.l.f24885a);
            case 22:
                RevolutAccountsManagerContentProvider.a aVar2 = RevolutAccountsManagerContentProvider.Companion;
                try {
                    cVar = (nn0.c) nn0.b.Companion.c();
                    break;
                } catch (Exception e) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    cVar = null;
                }
                if (cVar != null) {
                    return (pn0.b) cVar.f217433c.get();
                }
                return null;
            case 23:
                return zhm.f0.f322471a;
            case 24:
                return new Regex("[’‘]");
            case 25:
                return RecurringPaymentMethodEmbeddedEntity._init_$_anonymous_();
            case 26:
                return RecurringPaymentSchemeEmbeddedEntity._init_$_anonymous_();
            case 27:
                return WalletAutomationEmbeddedEntity._init_$_anonymous_();
            case 28:
                return Unit.f186387a;
            default:
                ApmKeyGenerator.a aVar3 = ApmKeyGenerator.Companion;
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
        }
    }
}
