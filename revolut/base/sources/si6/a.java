package si6;

import aim.e;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.domain.models.openbanking.OpenBankingPayment;
import com.revolut.domain.models.openbanking.Provider;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ti6.d f263521b;

    public a(ti6.d paymentConsentMapper, int i) {
        this.f263520a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(paymentConsentMapper, "paymentConsentMapper");
                this.f263521b = paymentConsentMapper;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(paymentConsentMapper, "paymentConsentMapper");
                this.f263521b = paymentConsentMapper;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(paymentConsentMapper, "paymentConsentMapper");
                this.f263521b = paymentConsentMapper;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(paymentConsentMapper, "paymentConsentMapper");
                this.f263521b = paymentConsentMapper;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(paymentConsentMapper, "paymentConsentMapper");
                this.f263521b = paymentConsentMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(paymentConsentMapper, "paymentConsentMapper");
                this.f263521b = paymentConsentMapper;
                break;
        }
    }

    @Override // si6.d
    public final c a(ei6.d merchantData, ei6.c openBankingPaymentScreenData) {
        int i = this.f263520a;
        Intrinsics.checkNotNullParameter(merchantData, "clientData");
        Intrinsics.checkNotNullParameter(openBankingPaymentScreenData, "openBankingPaymentScreenData");
        switch (i) {
            case 0:
                OpenBankingPayment openBankingPayment = openBankingPaymentScreenData.f126443a;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_confirm_screen_title, null, null, 14);
                e eVarB = u.b();
                eVarB.addAll(this.f263521b.h(R$string.oba_authorize_payment_type_recurring, openBankingPayment.f60391l, openBankingPaymentScreenData.f126444b, merchantData, openBankingPaymentScreenData.f126445c, openBankingPaymentScreenData.d));
                eVarB.addAll(ti6.d.l(openBankingPayment));
                List listF = ti6.d.f(openBankingPaymentScreenData.f126445c);
                if (listF != null) {
                    eVarB.addAll(listF);
                }
                return new c(u.a(eVarB), textLocalisedClause);
            case 1:
                OpenBankingPayment openBankingPayment2 = openBankingPaymentScreenData.f126443a;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_confirm_screen_title, null, null, 14);
                e eVarB2 = u.b();
                eVarB2.addAll(this.f263521b.h(R$string.oba_authorize_payment_type_scheduled, openBankingPayment2.f60391l, openBankingPaymentScreenData.f126444b, merchantData, openBankingPaymentScreenData.f126445c, openBankingPaymentScreenData.d));
                eVarB2.addAll(ti6.d.m(openBankingPayment2));
                List listF2 = ti6.d.f(openBankingPaymentScreenData.f126445c);
                if (listF2 != null) {
                    eVarB2.addAll(listF2);
                }
                return new c(u.a(eVarB2), textLocalisedClause2);
            case 2:
                OpenBankingPayment payment = openBankingPaymentScreenData.f126443a;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_confirm_screen_title, null, null, 14);
                e eVarB3 = u.b();
                eVarB3.addAll(this.f263521b.h(R$string.oba_authorize_payment_type_single, payment.f60391l, openBankingPaymentScreenData.f126444b, merchantData, openBankingPaymentScreenData.f126445c, openBankingPaymentScreenData.d));
                Intrinsics.checkNotNullParameter(payment, "payment");
                ArrayList arrayListN = v.n(ti6.d.c());
                ArrayList arrayList = new ArrayList();
                arrayList.add(ti6.d.b(payment.k));
                arrayList.addAll(ti6.d.e(payment.f60392m));
                Provider provider = payment.f60394p;
                if (provider != null) {
                    arrayList.add(ti6.d.k(provider.d));
                }
                String str = payment.i;
                if (str != null) {
                    arrayList.add(ti6.d.d(str));
                }
                yp0.b.k(arrayList, R$attr.uikit_dp8, 0, 0, 0, 30);
                arrayListN.addAll(arrayList);
                eVarB3.addAll(arrayListN);
                List listF3 = ti6.d.f(openBankingPaymentScreenData.f126445c);
                if (listF3 != null) {
                    eVarB3.addAll(listF3);
                }
                return new c(u.a(eVarB3), textLocalisedClause3);
            case 3:
                OpenBankingPayment openBankingPayment3 = openBankingPaymentScreenData.f126443a;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_confirm_screen_title, null, null, 14);
                e eVarB4 = u.b();
                eVarB4.addAll(this.f263521b.h(R$string.oba_authorize_payment_type_recurring, openBankingPayment3.f60391l, openBankingPaymentScreenData.f126444b, merchantData, openBankingPaymentScreenData.f126445c, openBankingPaymentScreenData.d));
                eVarB4.addAll(ti6.d.l(openBankingPayment3));
                List listF4 = ti6.d.f(openBankingPaymentScreenData.f126445c);
                if (listF4 != null) {
                    eVarB4.addAll(listF4);
                }
                return new c(u.a(eVarB4), textLocalisedClause4);
            case 4:
                OpenBankingPayment openBankingPayment4 = openBankingPaymentScreenData.f126443a;
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_confirm_screen_title, null, null, 14);
                e eVarB5 = u.b();
                eVarB5.addAll(this.f263521b.h(R$string.oba_authorize_payment_type_scheduled, openBankingPayment4.f60391l, openBankingPaymentScreenData.f126444b, merchantData, openBankingPaymentScreenData.f126445c, openBankingPaymentScreenData.d));
                eVarB5.addAll(ti6.d.m(openBankingPayment4));
                List listF5 = ti6.d.f(openBankingPaymentScreenData.f126445c);
                if (listF5 != null) {
                    eVarB5.addAll(listF5);
                }
                return new c(u.a(eVarB5), textLocalisedClause5);
            default:
                OpenBankingPayment payment2 = openBankingPaymentScreenData.f126443a;
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_confirm_screen_title, null, null, 14);
                e eVarB6 = u.b();
                int i2 = R$string.oba_authorize_payment_type_single;
                dj0.d paymentAmount = payment2.f60391l;
                AccountWrapper accountWrapper = openBankingPaymentScreenData.f126444b;
                OutboundPaymentExtras outboundPaymentExtras = openBankingPaymentScreenData.f126445c;
                boolean z = openBankingPaymentScreenData.d;
                Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
                Intrinsics.checkNotNullParameter(merchantData, "merchantData");
                RowDelegate.Model model = new RowDelegate.Model("MERCHANT_ID", ti6.d.i(merchantData.f126447b), new TextClause(merchantData.f126446a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(i2, null, null, 14), null, null, 0, new RowDelegate.Model.c.b(ti6.d.a(paymentAmount.l()), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB6.addAll(this.f263521b.j(model, accountWrapper, outboundPaymentExtras, z));
                Intrinsics.checkNotNullParameter(payment2, "payment");
                ArrayList arrayListN2 = v.n(new ListSubheaderDelegate.Model("CONSENTS_LABEL_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_information_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                e eVarB7 = u.b();
                eVarB7.add(ti6.d.b(payment2.k));
                eVarB7.addAll(ti6.d.e(payment2.f60392m));
                Provider provider2 = payment2.f60394p;
                if (provider2 != null) {
                    eVarB7.add(ti6.d.k(provider2.d));
                }
                String str2 = payment2.i;
                if (str2 != null) {
                    eVarB7.add(ti6.d.d(str2));
                }
                e eVarA = u.a(eVarB7);
                yp0.b.k(eVarA, R$attr.uikit_dp8, 0, 0, 0, 30);
                arrayListN2.addAll(eVarA);
                eVarB6.addAll(arrayListN2);
                List listF6 = ti6.d.f(outboundPaymentExtras);
                if (listF6 != null) {
                    eVarB6.addAll(listF6);
                }
                return new c(u.a(eVarB6), textLocalisedClause6);
        }
    }
}
