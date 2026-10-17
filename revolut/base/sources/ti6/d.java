package ti6;

import aim.e;
import android.graphics.Bitmap;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.openbanking.OpenBankingAccountData;
import com.revolut.domain.models.openbanking.OpenBankingPayment;
import com.revolut.domain.models.openbanking.PaymentFrequency;
import com.revolut.feature.external_accounts.api.OpenBankingConsentsApi$Toggles$AnyToAnyOutboundPaymentAndroid;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d4i.f;
import d4i.h;
import d9.e1;
import h5i.g;
import ip0.pb0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.Instant;
import qv0.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f271424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f271425b;

    public d(g currencyExchangeSummaryMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(currencyExchangeSummaryMapper, "currencyExchangeSummaryMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f271424a = currencyExchangeSummaryMapper;
        this.f271425b = featureToggleInteractor;
    }

    public static MoneyClause a(dj0.d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    public static CellDetailsDelegate.Model b(String merchant) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        return new CellDetailsDelegate.Model("CONSENTS_MERCHANT_ID", new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_merchant, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new TextClause(merchant, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static i c() {
        return new ListSubheaderDelegate.Model("CONSENTS_LABEL_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_information_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp4, 0, 0, 57338);
    }

    public static CellDetailsDelegate.Model d(String reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        return new CellDetailsDelegate.Model("CONSENTS_REFERENCE_ID", new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_reference, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new TextClause(reference, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static List e(OpenBankingAccountData creditor) {
        Intrinsics.checkNotNullParameter(creditor, "creditor");
        if (creditor instanceof OpenBankingAccountData.Iban) {
            return u.c(new CellDetailsDelegate.Model("CONSENTS_IBAN_ID", new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_iban, null, null, 14), new TextClause(d0.F0(new Regex("(.{4})").replace(((OpenBankingAccountData.Iban) creditor).f60372a, "$1 ")).toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        if (!(creditor instanceof OpenBankingAccountData.Local)) {
            throw new NoWhenBranchMatchedException();
        }
        OpenBankingAccountData.Local local = (OpenBankingAccountData.Local) creditor;
        return v.k(new CellDetailsDelegate.Model("CONSENTS_ACCOUNT_NUMBER_ID", new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_account_number, null, null, 14), new TextClause(local.f60373a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("CONSENTS_SORT_CODE_ID", new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_sort_code, null, null, 14), new TextClause(local.f60374b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
    }

    public static List f(OutboundPaymentExtras outboundPaymentExtras) {
        if (outboundPaymentExtras == null) {
            return null;
        }
        if (!(outboundPaymentExtras instanceof OutboundPaymentExtras.LegacyQuote)) {
            if (outboundPaymentExtras instanceof OutboundPaymentExtras.PaymentBreakdown) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!e1.z(((OutboundPaymentExtras.LegacyQuote) outboundPaymentExtras).f72531a)) {
            return null;
        }
        List listK = v.k(new RowDelegate.Model("INFO_EXCHANGE_RATE_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_exchange_rate_caption, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("INFO_FEES_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_intl_payment_caption, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public static ListCellDelegate.Model g() {
        return new ListCellDelegate.Model("INFO_PAYMENT_SCHEDULED_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlack), (List) null, (ImageTransformations) null, (Clause) null, 246)), null, new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_schedule_caption, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, null, null, 0, 0, 0, 0, 4080);
    }

    public static RowDelegate.Model.MainImage.Image40 i(Bitmap bitmap) {
        Image bitmapImage;
        if (bitmap == null) {
            bitmapImage = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bank, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, 8.0f, Float.valueOf(24.0f), null, 32);
        } else {
            bitmapImage = new BitmapImage(bitmap, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), 10);
        }
        return new RowDelegate.Model.MainImage.Image40(bitmapImage, null, null, false, null, false, 60);
    }

    public static CellDetailsDelegate.Model k(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new CellDetailsDelegate.Model("CONSENTS_PROVIDER_DESCRIPTION_ID", new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_provider_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new TextClause(description, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static ArrayList l(OpenBankingPayment payment) {
        int i;
        Intrinsics.checkNotNullParameter(payment, "payment");
        ArrayList arrayListN = v.n(c());
        ArrayList arrayList = new ArrayList();
        arrayList.add(b(payment.k));
        arrayList.addAll(e(payment.f60392m));
        Instant date = payment.f;
        if (date != null) {
            Intrinsics.checkNotNullParameter(date, "date");
            arrayList.add(new CellDetailsDelegate.Model("CONSENTS_FIRST_DATE_ID", new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_first_payment_due, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new TimeClause(date.getMillis(), TimeClause.Format.DateLong.f57962b, null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        PaymentFrequency frequency = payment.e;
        if (frequency != null) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.auth_account_frequency, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            int i2 = c.f271423a[frequency.ordinal()];
            if (i2 == 1) {
                i = R$string.open_banking_consent_flow_payment_initiation_frequency_daily;
            } else if (i2 == 2) {
                i = R$string.open_banking_consent_flow_payment_initiation_frequency_weekly;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.open_banking_consent_flow_payment_initiation_frequency_monthly;
            }
            arrayList.add(new CellDetailsDelegate.Model("CONSENTS_FREQUENCY_ID", textLocalisedClause, new TextLocalisedClause(i, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        String str = payment.i;
        if (str != null) {
            arrayList.add(d(str));
        }
        yp0.b.k(arrayList, R$attr.uikit_dp8, 0, 0, 0, 30);
        arrayListN.addAll(arrayList);
        ListCellDelegate.Model modelG = g();
        yp0.b.l(modelG, 0, 0, 0, 0, null, false, 63);
        arrayListN.add(modelG);
        return arrayListN;
    }

    public static ArrayList m(OpenBankingPayment payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        ArrayList arrayListN = v.n(c());
        ArrayList arrayList = new ArrayList();
        arrayList.add(b(payment.k));
        arrayList.addAll(e(payment.f60392m));
        Instant paymentDate = payment.d;
        if (paymentDate != null) {
            Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
            arrayList.add(new CellDetailsDelegate.Model("CONSENTS_PAYMENT_NAME_ID", new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_date, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new TimeClause(paymentDate.getMillis(), TimeClause.Format.DateLong.f57962b, null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        String str = payment.i;
        if (str != null) {
            arrayList.add(d(str));
        }
        yp0.b.k(arrayList, R$attr.uikit_dp8, 0, 0, 0, 30);
        arrayListN.addAll(arrayList);
        ListCellDelegate.Model modelG = g();
        yp0.b.l(modelG, 0, 0, 0, 0, null, false, 63);
        arrayListN.add(modelG);
        return arrayListN;
    }

    public final e h(int i, dj0.d amount, AccountWrapper accountWrapper, ei6.d merchantData, OutboundPaymentExtras outboundPaymentExtras, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "paymentAmount");
        Intrinsics.checkNotNullParameter(merchantData, "merchantData");
        Intrinsics.checkNotNullParameter(merchantData, "merchantData");
        Intrinsics.checkNotNullParameter(amount, "amount");
        RowDelegate.Model model = new RowDelegate.Model("MERCHANT_ID", i(merchantData.f126447b), new TextClause(merchantData.f126446a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(i, null, null, 14), null, null, 0, new RowDelegate.Model.c.b(a(amount.l()), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return j(model, accountWrapper, outboundPaymentExtras, z);
    }

    public final e j(RowDelegate.Model model, AccountWrapper accountWrapper, OutboundPaymentExtras outboundPaymentExtras, boolean z) {
        List listC;
        ChargeBreakdown chargeBreakdown;
        e eVarB = u.b();
        eVarB.add(model);
        eVarB.add(new ListSubheaderDelegate.Model("PAYMENT_FROM_LABEL_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_sections_account_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp4, 0, 0, 57338));
        if (accountWrapper == null) {
            listC = u.c(new pb0("ACCOUNT_WRAPPER_LOADING_LIST_ID"));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        } else {
            e eVarB2 = u.b();
            eVarB2.add(new RowDelegate.Model("POCKET_INFO_ID", accountWrapper.f97226c, null, null, accountWrapper.f97225b, new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_selected_account_balance, u.c(a(accountWrapper.getBalance())), z ? new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254) : null, 8), null, null, 0, new pf(new TextLocalisedClause(R.string.common_action_change, null, null, 14), null, null, false, null, null, 510), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735532));
            if (outboundPaymentExtras != null) {
                boolean z3 = outboundPaymentExtras instanceof OutboundPaymentExtras.LegacyQuote;
                a aVar = a.f271422a;
                if (z3) {
                    if (((jte.d) this.f271425b).c(OpenBankingConsentsApi$Toggles$AnyToAnyOutboundPaymentAndroid.f72206c)) {
                        OrderQuote quote = ((OutboundPaymentExtras.LegacyQuote) outboundPaymentExtras).f72531a;
                        Intrinsics.checkNotNullParameter(quote, "quote");
                        Amount amount = quote.d;
                        if (amount == null) {
                            amount = quote.f104754c;
                        }
                        dj0.d dVarL = a.a.L(amount);
                        eVarB2.add(new CellDetailsActionDelegate.Model("ESTIMATED_TOTAL_ID", new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_estimated_total, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), quote.f104755g.f104731a.f104722a.f104717a.compareTo(BigDecimal.ZERO) > 0 ? new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_estimated_total_inc_fees, u.c(a(dVarL)), null, 12) : a(dVarL), null, false, false, null, null, aVar, 0, 0, 0, 0, 4192228));
                    } else {
                        OrderQuote quote2 = ((OutboundPaymentExtras.LegacyQuote) outboundPaymentExtras).f72531a;
                        Intrinsics.checkNotNullParameter(quote2, "quote");
                        eVarB2.addAll(this.f271424a.j(quote2, new h(false, f.f111332a, null, null, false, 61), null));
                    }
                } else {
                    if (!(outboundPaymentExtras instanceof OutboundPaymentExtras.PaymentBreakdown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OutboundPaymentBreakdown fees = ((OutboundPaymentExtras.PaymentBreakdown) outboundPaymentExtras).f72532a;
                    if ((fees instanceof OutboundPaymentBreakdown.CrossCurrency) || fees.getF72385c() != null) {
                        Intrinsics.checkNotNullParameter(fees, "fees");
                        dj0.d f72384b = fees.getF72384b();
                        Charges f72385c = fees.getF72385c();
                        eVarB2.add(new CellDetailsActionDelegate.Model("ESTIMATED_TOTAL_ID", new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_estimated_total, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), (f72385c == null || (chargeBreakdown = f72385c.f104731a) == null || chargeBreakdown.f104722a.f104717a.compareTo(BigDecimal.ZERO) <= 0) ? a(f72384b) : new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_estimated_total_inc_fees, u.c(a(f72384b)), null, 12), null, false, false, null, null, aVar, 0, 0, 0, 0, 4192228));
                    }
                }
            }
            e eVarA = u.a(eVarB2);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            listC = eVarA;
        }
        eVarB.addAll(listC);
        return u.a(eVarB);
    }
}
