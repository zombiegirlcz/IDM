package wf5;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.boleto.impl.finder.hidden.HiddenBoletosScreen;
import com.revolut.feature.apm.upi.impl.screens.transfer_input_id_or_mobile.UpiTransferInputIdOrMobileScreen;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact_legacy.AddContactLegacyScreen;
import com.revolut.feature.credit.card.impl.ui.autopay.settings.AutopaySettingsScreen;
import com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacade;
import com.revolut.feature.crypto.exchange.fees.impl.model.TieredPricingFacade;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewActivity;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.accounts_selection.AccountsSelectionScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreen;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qlm.e;
import qlm.v1;
import vp0.h;
import wm0.f;
import wm0.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296973a;

    public /* synthetic */ a(int i) {
        this.f296973a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        switch (this.f296973a) {
            case 0:
                CryptoExchangeFeesFacade.Companion bVar = CryptoExchangeFeesFacade.INSTANCE;
                return new e(v1.f247718a);
            case 1:
                CryptoExchangeFeesFacade.Companion bVar2 = CryptoExchangeFeesFacade.INSTANCE;
                return new e(xf5.a.f304775a);
            case 2:
                TieredPricingFacade.Companion companion = TieredPricingFacade.INSTANCE;
                return new e(xf5.a.f304775a);
            case 3:
                KProperty[] kPropertyArr = UpiTransferInputIdOrMobileScreen.T;
                return new TextDelegate();
            case 4:
                KProperty[] kPropertyArr2 = UpiTransferInputIdOrMobileScreen.T;
                return new InputTextDelegate(null);
            case 5:
                KProperty[] kPropertyArr3 = FormScreen.V;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr4 = FormScreen.V;
                return new ListSubheaderDelegate();
            case 7:
                KProperty[] kPropertyArr5 = FormScreen.V;
                return new InputChecklistDelegate();
            case 8:
                KProperty[] kPropertyArr6 = AccountsSelectionScreen.S;
                return new CellDetailsChevronDelegate();
            case 9:
                KProperty[] kPropertyArr7 = AccountsSelectionScreen.S;
                return new RowDelegate(null, null, 7);
            case 10:
                KProperty[] kPropertyArr8 = CFACInsuranceExpenseDetailsScreen.V;
                return new AmountEditDelegate(null);
            case 11:
                KProperty[] kPropertyArr9 = CFACInsuranceExpenseDetailsScreen.V;
                return new CellDetailsActionDelegate();
            case 12:
                KProperty[] kPropertyArr10 = CFACInsuranceExpenseDetailsScreen.V;
                return new CellDetailsChevronDelegate();
            case 13:
                KProperty[] kPropertyArr11 = CFACInsuranceExpenseDetailsScreen.V;
                return new RowDelegate(null, null, 7);
            case 14:
                return new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 15:
                return new ResourceImage(R$drawable.uikit_icn_24_calendar_date, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 16:
                KProperty[] kPropertyArr12 = CryptoSettingsScreen.U;
                return new AppTipDelegate();
            case 17:
                wm0.e eVar = f.Companion;
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                Intrinsics.checkNotNullExpressionValue(keyStore, "apply(...)");
                eVar.getClass();
                Intrinsics.checkNotNullParameter(keyStore, "keyStore");
                Intrinsics.checkNotNullParameter(keyStore, "keyStore");
                return new g(keyStore);
            case 18:
                KProperty[] kPropertyArr13 = HiddenBoletosScreen.Q;
                return new RowDelegate(null, null, 7);
            case 19:
                KProperty[] kPropertyArr14 = AddContactLegacyScreen.S;
                return new InputTextDelegate(null);
            case 20:
                h hVar = wp0.h.f299001a;
                return Unit.f186387a;
            case 21:
                h hVar2 = wp0.h.f299001a;
                return Unit.f186387a;
            case 22:
                KProperty[] kPropertyArr15 = AutopaySettingsScreen.g0;
                return new CellDetailsActionDelegate();
            case 23:
                KProperty[] kPropertyArr16 = AutopaySettingsScreen.g0;
                return new CellDetailsSwitcherDelegate();
            case 24:
                KProperty[] kPropertyArr17 = AutopaySettingsScreen.g0;
                return new LargeActionButtonDelegate();
            case 25:
                KProperty[] kPropertyArr18 = AutopaySettingsScreen.g0;
                return new RowDelegate(null, null, 7);
            case 26:
                KProperty[] kPropertyArr19 = AutopaySettingsScreen.g0;
                return new FullScreenStateDelegate();
            case 27:
                int i = CryptoWithdrawToAddressReviewActivity.A0;
                return new LargeActionButtonDelegate();
            case 28:
                int i2 = CryptoWithdrawToAddressReviewActivity.A0;
                return new RowDelegate(null, null, 7);
            default:
                int i3 = CryptoWithdrawToAddressReviewActivity.A0;
                return new TwinHorizontalButtonDelegate();
        }
    }
}
