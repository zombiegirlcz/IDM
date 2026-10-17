package qba;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.feature.apm.qvik.impl.ui.home.area.QvikHomeAreaScreen;
import com.revolut.feature.external_accounts.api.model.LinkedAccountPayload;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.form_name.FormNameScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreen;
import com.revolut.feature.pix.impl.flow.transfer.screen.new_contact.PixNewContactScreen;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsController;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration.TravelMilesAccountRegistrationScreen;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qgb.d0;
import qh0.p;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244150a;

    public /* synthetic */ c(int i) {
        this.f244150a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f244150a) {
            case 0:
                KProperty[] kPropertyArr = PixQrCodeTransactionAmountScreen.W;
                return new RowLoadingDelegate();
            case 1:
                return j1.b("com.revolut.feature.shared.savings.impl.core.account.data.dto.SavingsAccountBalanceOperationSideDto", qbd.a.values());
            case 2:
                return j1.b("com.revolut.feature.shared.savings.impl.core.account.data.dto.SavingsAccountBalanceOperationSideDto", qbd.a.values());
            case 3:
                int i = qc0.b.F0;
                return new LargeActionButtonDelegate();
            case 4:
                KProperty[] kPropertyArr2 = QvikHomeAreaScreen.W;
                return new FullScreenStateDelegate();
            case 5:
                KProperty[] kPropertyArr3 = QvikHomeAreaScreen.W;
                return new ActionsDelegate();
            case 6:
                KProperty[] kPropertyArr4 = QvikHomeAreaScreen.W;
                return new ActionWidgetDelegate();
            case 7:
                KProperty[] kPropertyArr5 = QvikHomeAreaScreen.W;
                return new ContactsWidgetDelegate();
            case 8:
                KProperty[] kPropertyArr6 = QvikHomeAreaScreen.W;
                return new RowsWidgetDelegate();
            case 9:
                KProperty[] kPropertyArr7 = QvikHomeAreaScreen.W;
                return new RowDelegate(null, null, 7);
            case 10:
                KProperty[] kPropertyArr8 = PixNewContactScreen.R;
                return new InputTextDelegate(null);
            case 11:
                KProperty[] kPropertyArr9 = PixNewContactScreen.R;
                return new RowDelegate(null, null, 7);
            case 12:
                LinkedAccountPayload.Companion bVar = LinkedAccountPayload.INSTANCE;
                return j1.b("com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitutionStatus", ho3.d.values());
            case 13:
                KProperty[] kPropertyArr10 = CardDeliveryDetailsController.X;
                return new RowDelegate(null, null, 7);
            case 14:
                KProperty[] kPropertyArr11 = CardDeliveryDetailsController.X;
                return new ListCellDelegate();
            case 15:
                KProperty[] kPropertyArr12 = CardDeliveryDetailsController.X;
                return new CellDetailsChevronDelegate();
            case 16:
                KProperty[] kPropertyArr13 = CardDeliveryDetailsController.X;
                return new ListSubheaderDelegate();
            case 17:
                KProperty[] kPropertyArr14 = CardDeliveryDetailsController.X;
                return new LargeActionButtonDelegate();
            case 18:
                KProperty[] kPropertyArr15 = CardDeliveryDetailsController.X;
                return new RowDelegate(null, null, 7);
            case 19:
                return new PromptContentDelegate();
            case 20:
                KProperty[] kPropertyArr16 = FormNameScreen.R;
                return new InputTextDelegate(null);
            case 21:
                return new qlm.e(v1.f247718a);
            case 22:
                return new qlm.e(d0.f245730a);
            case 23:
                return new qlm.e(qgb.k.f245749a);
            case 24:
                return new qlm.e(qgb.k.f245749a);
            case 25:
                KProperty[] kPropertyArr17 = TravelMilesAccountRegistrationScreen.c0;
                return new InputTextDelegate(null);
            case 26:
                return new qlm.e(p.f246409a);
            case 27:
                return new qlm.e(qh0.m.f246404a);
            case 28:
                return qh0.c.Companion.serializer();
            default:
                return j1.a("com.revolut.core.mobile_services.impl.auth.models.GmsCreateCredentialRequest.PublicKey.Attestation", qh0.c.values(), new String[]{"direct", "enterprise", "indirect", "none"}, new Annotation[][]{null, null, null, null});
        }
    }
}
