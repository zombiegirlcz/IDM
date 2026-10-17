package wba;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.api.model.PixQrCodeAgent;
import com.revolut.feature.pix.api.model.PixQrCodeBill;
import com.revolut.feature.pix.api.model.PixQrCodeChange;
import com.revolut.feature.pix.api.model.PixQrCodeCreditor;
import com.revolut.feature.pix.api.model.PixQrCodeDebtor;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.api.model.PixQrCodeIdentification;
import com.revolut.feature.pix.api.model.PixQrCodeParty;
import com.revolut.feature.pix.api.model.PixQrCodeWithdrawal;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8a.c f296094a;

    public y(i8a.c pixMoneyBreakdownItemsMapper) {
        Intrinsics.checkNotNullParameter(pixMoneyBreakdownItemsMapper, "pixMoneyBreakdownItemsMapper");
        this.f296094a = pixMoneyBreakdownItemsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        CellDetailsNoteDelegate.Model model;
        CounterTextDelegate.Model model2;
        String str;
        PixQrCodeParty pixQrCodeParty;
        TextLocalisedClause textLocalisedClause;
        PixQrCodeDebtor pixQrCodeDebtor;
        PixQrCodeIdentification pixQrCodeIdentification;
        PixQrCodeDebtor pixQrCodeDebtor2;
        PixQrCodeIdentification pixQrCodeIdentification2;
        PixQrCodeDebtor pixQrCodeDebtor3;
        String str2;
        PixQrCodeAgent pixQrCodeAgent;
        String str3;
        TextLocalisedClause textLocalisedClause2;
        PixQrCodeParty pixQrCodeParty2;
        PixQrCodeIdentification pixQrCodeIdentification3;
        PixQrCodeParty pixQrCodeParty3;
        PixQrCodeIdentification pixQrCodeIdentification4;
        PixQrCodeParty pixQrCodeParty4;
        PixQrCodeParty pixQrCodeParty5;
        String str4;
        Long l2;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PixQrCodeDecodeData pixQrCodeDecodeData = domainState.f296075c;
        TransferScheduleData transferScheduleData = domainState.d;
        String str5 = domainState.f296074b;
        PixQrCodeWithdrawal pixQrCodeWithdrawal = pixQrCodeDecodeData.f;
        PixQrCodeChange pixQrCodeChange = pixQrCodeDecodeData.f80448g;
        PixQrCodeCreditor pixQrCodeCreditor = pixQrCodeDecodeData.e;
        PixQrCodeBill pixQrCodeBill = pixQrCodeDecodeData.f80449h;
        CounterTextDelegate.Model model3 = new CounterTextDelegate.Model("ID_COUNTER_TOTAL_AMOUNT", new TextLocalisedClause(pixQrCodeWithdrawal != null ? R$string.pix_transaction_review_item_title_withdrawal_amount : R$string.pix_transaction_review_item_title_total_amount, null, null, 14), new t4(new MoneyClause(domainState.f296073a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new TextLocalisedClause(R$string.pix_transaction_review_item_title_via_pix_qr, null, null, 14), false, null, null, 0, 0, 0, 0, 2032);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        aim.e eVarB = zhm.u.b();
        if (pixQrCodeBill != null && (l2 = pixQrCodeBill.f80427b) != null) {
            long jLongValue = l2.longValue();
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.pix_transaction_review_item_title_expiry_date, null, null, 14);
            TimeClause.Format.INSTANCE.getClass();
            eVarB.add(new CellDetailsDelegate.Model("ID_EXPIRY_DATE", textLocalisedClause3, new TimeClause(jLongValue, TimeClause.Format.f57959a, null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        if (pixQrCodeBill != null && (str4 = pixQrCodeBill.d) != null) {
            eVarB.add(new CellDetailsDelegate.Model("ID_DUE_DATE", new TextLocalisedClause(R$string.pix_transaction_review_item_title_due_date, null, null, 14), new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        List listL = zhm.v.l(transferScheduleData.f104285a != 0 ? new CellDetailsDelegate.Model("ID_SCHEDULED_ON", new TextLocalisedClause(R$string.pix_transaction_review_item_title_scheduled_on, null, null, 14), new TimeClause(transferScheduleData.f104285a, new TimeClause.Format.DayAndMonth(0), null, null, 12), 0, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, 0, 31224) : null);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        aim.e eVarB2 = zhm.u.b();
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.pix_transaction_review_item_title_to, null, null, 14);
        String str6 = (pixQrCodeCreditor == null || (pixQrCodeParty5 = pixQrCodeCreditor.f80432a) == null) ? null : pixQrCodeParty5.f80468a;
        eVarB2.add(new CellDetailsDelegate.Model("ID_TO_TAG", textLocalisedClause4, new TextClause(str6 == null ? "" : str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, ((pixQrCodeCreditor == null || (pixQrCodeParty4 = pixQrCodeCreditor.f80432a) == null) ? null : pixQrCodeParty4.f80470c) != null ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, true, 0, 0, 31224));
        BeneficiaryIdentificationType beneficiaryIdentificationType = (pixQrCodeCreditor == null || (pixQrCodeParty3 = pixQrCodeCreditor.f80432a) == null || (pixQrCodeIdentification4 = pixQrCodeParty3.f80469b) == null) ? null : pixQrCodeIdentification4.f80462a;
        String str7 = (pixQrCodeCreditor == null || (pixQrCodeParty2 = pixQrCodeCreditor.f80432a) == null || (pixQrCodeIdentification3 = pixQrCodeParty2.f80469b) == null) ? null : pixQrCodeIdentification3.f80463b;
        if (beneficiaryIdentificationType != null && str7 != null) {
            int i = x.f296093a[beneficiaryIdentificationType.ordinal()];
            if (i == 1) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.pix_transaction_review_item_title_cpf, null, null, 14);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(R$string.pix_transaction_review_item_title_cnpj, null, null, 14);
            }
            eVarB2.add(new CellDetailsDelegate.Model("ID_ALIAS_TAG", textLocalisedClause2, new TextClause(str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        if (pixQrCodeCreditor != null && (pixQrCodeAgent = pixQrCodeCreditor.f80433b) != null && (str3 = pixQrCodeAgent.f80422a) != null) {
            eVarB2.add(new CellDetailsDelegate.Model("ID_INSTITUTION_TAG", new TextLocalisedClause(R$string.pix_transaction_review_item_title_institution, null, null, 14), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        aim.e eVarA2 = zhm.u.a(eVarB2);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        aim.e eVarB3 = zhm.u.b();
        if (pixQrCodeBill != null && (pixQrCodeDebtor3 = pixQrCodeBill.f80429g) != null && (str2 = pixQrCodeDebtor3.f80443a) != null) {
            eVarB3.add(new CellDetailsDelegate.Model("ID_DEBTOR_NAME_TAG", new TextLocalisedClause(R$string.pix_transaction_review_item_title_debtor, null, null, 14), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        BeneficiaryIdentificationType beneficiaryIdentificationType2 = (pixQrCodeBill == null || (pixQrCodeDebtor2 = pixQrCodeBill.f80429g) == null || (pixQrCodeIdentification2 = pixQrCodeDebtor2.f80444b) == null) ? null : pixQrCodeIdentification2.f80462a;
        String str8 = (pixQrCodeBill == null || (pixQrCodeDebtor = pixQrCodeBill.f80429g) == null || (pixQrCodeIdentification = pixQrCodeDebtor.f80444b) == null) ? null : pixQrCodeIdentification.f80463b;
        if (beneficiaryIdentificationType2 != null && str8 != null) {
            int i2 = x.f296093a[beneficiaryIdentificationType2.ordinal()];
            if (i2 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.pix_transaction_review_item_title_cpf, null, null, 14);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.pix_transaction_review_item_title_cnpj, null, null, 14);
            }
            eVarB3.add(new CellDetailsDelegate.Model("ID_DEBTOR_ALIAS_TAG", textLocalisedClause, new TextClause(str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        aim.e eVarA3 = zhm.u.a(eVarB3);
        yp0.b.k(eVarA3, 0, 0, 0, 0, 31);
        aim.e eVarB4 = zhm.u.b();
        String str9 = pixQrCodeDecodeData.f80447c;
        if (str9 != null) {
            int i3 = R$string.pix_transaction_review_item_title_message_from;
            String str10 = (pixQrCodeCreditor == null || (pixQrCodeParty = pixQrCodeCreditor.f80432a) == null) ? null : pixQrCodeParty.f80468a;
            eVarB4.add(new CellDetailsNoteDelegate.Model("ID_MESSAGE_FROM", new TextLocalisedClause(i3, zhm.u.c(str10 != null ? str10 : ""), null, 12), null, new TextClause(str9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        aim.e eVarA4 = zhm.u.a(eVarB4);
        yp0.b.k(eVarA4, 0, 0, 0, 0, 31);
        String str11 = pixQrCodeDecodeData.f80455q;
        if (str11 != null) {
            CellDetailsNoteDelegate.Model model4 = new CellDetailsNoteDelegate.Model("ID_PAYMENT_OBJECT", new TextLocalisedClause(R$string.pix_authorisation_request_payment_object, null, null, 14), null, new TextClause(str11, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            model = model4;
        } else {
            model = null;
        }
        List listL2 = zhm.v.l(model);
        CellDetailsNoteDelegate.Model model5 = new CellDetailsNoteDelegate.Model("ID_REFERENCE", (pixQrCodeBill == null || (str = pixQrCodeBill.f) == null) ? new TextLocalisedClause(R$string.pix_refund_reference_hint, null, null, 14) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, str5.length() > 0 ? new TextClause(domainState.f296074b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, false, new ResourceImage(str5.length() == 0 ? R$drawable.uikit_icn_24_plus : R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(str5.length() == 0 ? R.string.common_action_add : R$string.pix_refund_review_reference_edit, null, null, 14), null, null, null, 0, 130676);
        yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
        aim.e eVarA5 = ((uca.d) this.f296094a).a(pixQrCodeBill != null ? pixQrCodeBill.i : null, pixQrCodeChange);
        aim.e eVarB5 = zhm.u.b();
        if (ue0.e.n(pixQrCodeBill != null ? pixQrCodeBill.f80430h : null)) {
            model2 = model3;
        } else {
            model2 = model3;
            CellDetailsDelegate.Model model6 = new CellDetailsDelegate.Model("ID_ADDITIONAL_INFORMATION", new TextLocalisedClause(R$string.pix_transaction_review_item_title_additional_information, null, null, 14), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, 0, 31224);
            yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
            eVarB5.add(model6);
        }
        aim.e eVarA6 = zhm.u.a(eVarB5);
        CellDetailsDelegate.Model model7 = new CellDetailsDelegate.Model("ID_ESTIMATED_ARRIVAL", new TextLocalisedClause(R$string.pix_transaction_review_item_title_estimated_arrival, null, null, 14), new TextLocalisedClause(R$string.pix_transaction_review_item_value_usually_in_seconds, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
        yp0.b.l(model7, 0, 0, 0, 0, null, false, 63);
        ArrayList arrayListF0 = zhm.d0.F0(model7, zhm.d0.E0(eVarA6, zhm.d0.E0(eVarA5, zhm.d0.F0(model5, zhm.d0.E0(listL2, zhm.d0.E0(eVarA4, zhm.d0.E0(eVarA3, zhm.d0.E0(eVarA2, zhm.d0.E0(listL, zhm.d0.E0(eVarA, zhm.u.c(model2)))))))))));
        Intrinsics.checkNotNullParameter(pixQrCodeDecodeData, "<this>");
        return new t(arrayListF0, pixQrCodeChange == null && pixQrCodeDecodeData.f == null);
    }
}
