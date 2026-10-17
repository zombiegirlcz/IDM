package q9a;

import android.os.Parcelable;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.api.model.PixQrCodeAgent;
import com.revolut.feature.pix.api.model.PixQrCodeCreditor;
import com.revolut.feature.pix.api.model.PixQrCodeDebtor;
import com.revolut.feature.pix.api.model.PixQrCodeIdentification;
import com.revolut.feature.pix.api.model.PixQrCodeImplementation;
import com.revolut.feature.pix.api.model.PixQrCodeParty;
import com.revolut.feature.pix.api.model.PixQrCodeRetryPolicy;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static List a(PixQrCodeCreditor pixQrCodeCreditor) {
        CellDetailsDelegate.Model model;
        PixQrCodeAgent pixQrCodeAgent;
        String str;
        PixQrCodeParty pixQrCodeParty;
        PixQrCodeIdentification pixQrCodeIdentification;
        PixQrCodeParty pixQrCodeParty2;
        String str2;
        CellDetailsDelegate.Model model2 = null;
        CellDetailsDelegate.Model model3 = (pixQrCodeCreditor == null || (pixQrCodeParty2 = pixQrCodeCreditor.f80432a) == null || (str2 = pixQrCodeParty2.f80468a) == null) ? null : new CellDetailsDelegate.Model("BENEFICIARY_NAME_ID", new t0((Clause) new TextLocalisedClause(R$string.pix_authorisation_request_beneficiary, null, null, 14), (Image) null, 0, false, 30), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        if (pixQrCodeCreditor == null || (pixQrCodeParty = pixQrCodeCreditor.f80432a) == null || (pixQrCodeIdentification = pixQrCodeParty.f80469b) == null) {
            model = null;
        } else {
            t0 t0Var = new t0((Clause) h(pixQrCodeIdentification), (Image) null, 0, false, 30);
            String str3 = pixQrCodeIdentification.f80463b;
            if (str3 == null) {
                str3 = "";
            }
            model = new CellDetailsDelegate.Model("BENEFICIARY_IDENTIFICATION_ID", t0Var, new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        if (pixQrCodeCreditor != null && (pixQrCodeAgent = pixQrCodeCreditor.f80433b) != null && (str = pixQrCodeAgent.f80422a) != null) {
            model2 = new CellDetailsDelegate.Model("BENEFICIARY_INSTITUTION_ID", new t0((Clause) new TextLocalisedClause(R$string.pix_authorisation_request_institution, null, null, 14), (Image) null, 0, false, 30), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        CellDetailsDelegate.Model[] elements = {model3, model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.RowDelegate.Model b(com.revolut.feature.pix.api.model.PixQrCodeCreditor r25, com.revolut.feature.pix.api.model.PixAuthorisationFrequency r26, java.lang.String r27, dj0.d r28) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q9a.b.b(com.revolut.feature.pix.api.model.PixQrCodeCreditor, com.revolut.feature.pix.api.model.PixAuthorisationFrequency, java.lang.String, dj0.d):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    public static List c(PixQrCodeDebtor pixQrCodeDebtor, String str) {
        CellDetailsDelegate.Model model;
        PixQrCodeIdentification pixQrCodeIdentification;
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.pix_authorisation_request_debtor, null, null, 14), (Image) null, 0, false, 30);
        String str2 = pixQrCodeDebtor != null ? pixQrCodeDebtor.f80443a : null;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("DEBTOR_NAME_ID", t0Var, new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        if (pixQrCodeDebtor == null || (pixQrCodeIdentification = pixQrCodeDebtor.f80444b) == null) {
            model = null;
        } else {
            t0 t0Var2 = new t0((Clause) h(pixQrCodeIdentification), (Image) null, 0, false, 30);
            String str3 = pixQrCodeIdentification.f80463b;
            model = new CellDetailsDelegate.Model("DEBTOR_IDENTIFICATION_ID", t0Var2, new TextClause(str3 == null ? "" : str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        CellDetailsDelegate.Model[] elements = {model2, model, new CellDetailsDelegate.Model("DEBTOR_COLLECTION_IDENTIFIER_ID", new t0((Clause) new TextLocalisedClause(R$string.pix_authorisation_request_collection_identifier, null, null, 14), (Image) null, 0, false, 30), new TextClause(str == null ? "" : str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    public static TextDelegate.Model d(PixQrCodeImplementation pixQrCodeImplementation, PixQrCodeRetryPolicy pixQrCodeRetryPolicy) {
        TextLocalisedClause[] elements = {pixQrCodeImplementation == PixQrCodeImplementation.PIX_INSTANT_RECURRING ? new TextLocalisedClause(R$string.pix_authorisation_request_legal_instant_payment_authorising, null, null, 14) : null, pixQrCodeRetryPolicy == PixQrCodeRetryPolicy.ALLOWED_3_TIMES_7_DAYS ? new TextLocalisedClause(R$string.pix_authorisation_request_retry_policy_allowed_footer, null, null, 14) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new TextDelegate.Model(0, 0, 1020, new CompositeClause(kotlin.collections.d.L(elements), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), "PAYMENT_INFORMATION_FOOTER_ID");
    }

    public static List e(io3.d dVar, dj0.d dVar2, dj0.d dVar3, boolean z) {
        CellDetailsActionDelegate.Model model;
        CellDetailsDelegate.Model model2 = dVar != null ? new CellDetailsDelegate.Model("PAYMENT_FROM_SMALL_CELL_ID", new t0((Clause) new TextLocalisedClause(R$string.pix_authorisation_request_payment_from, null, null, 14), (Image) null, 0, false, 30), new CompositeClause(v.k(new TextLocalisedClause(R.string.new_bank_acc_personal, null, null, 14), new TextClause(dVar.f163147c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null;
        if (dVar2 == null) {
            model = new CellDetailsActionDelegate.Model("SINGLE_TRANSACTION_LIMIT_ID", new TextLocalisedClause(R$string.pix_authorisation_request_single_transaction_limit, null, null, 14), 0, new ResourceImage(dVar3 == null ? R$drawable.uikit_icn_16_plus : R$drawable.uikit_icn_24_pen, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), dVar3 == null ? new TextLocalisedClause(R.string.common_action_add, null, null, 14) : new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
        } else {
            model = null;
        }
        Object[] elements = {model2, model, new CellDetailsSwitcherDelegate.Model("NOTIFY_BEFORE_PAYMENT_ID", new TextLocalisedClause(R$string.pix_authorisation_request_notify_before_payment, null, null, 14), z, true, R$drawable.uikit_icn_16_info_outline, null, null, null, 4064)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    public static List f(b bVar, dj0.d dVar, String str, String str2, int i) {
        LocalDate localDate;
        String str3 = (i & 4) != 0 ? null : str2;
        boolean z = (i & 8) == 0;
        bVar.getClass();
        LocalDate localDate2 = str != null ? LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd")) : null;
        Clause textLocalisedClause = z ? new TextLocalisedClause(R$string.pix_authorisation_request_down_payment_today, null, null, 14) : null;
        if (textLocalisedClause == null) {
            textLocalisedClause = (str3 == null || (localDate = LocalDate.parse(str3, DateTimeFormatter.ofPattern("yyyy-MM-dd"))) == null) ? null : new TimeClause(oc.c.N(localDate), TimeClause.Format.DateLong.f57962b, null, null, 12);
        }
        CellDetailsDelegate.Model[] elements = {dVar != null ? new CellDetailsDelegate.Model("PAYMENT_INFORMATION_FIXED_AMOUNT_ID", new t0((Clause) new TextLocalisedClause(R$string.pix_authorisation_request_fixed_amount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null, new CellDetailsDelegate.Model("PAYMENT_INFORMATION_PAYMENT_TYPE_ID", new t0((Clause) new TextLocalisedClause(R$string.pix_authorisation_request_payment_type, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.pix_authorisation_request_pix_automatico, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760), textLocalisedClause != null ? new CellDetailsDelegate.Model("PAYMENT_INFORMATION_START_DATE_ID", new t0((Clause) new TextLocalisedClause(R$string.pix_authorisation_request_start_date, null, null, 14), (Image) null, 0, false, 30), textLocalisedClause, null, null, null, null, 0, null, false, false, null, null, 32760) : null, localDate2 != null ? new CellDetailsDelegate.Model("PAYMENT_INFORMATION_END_DATE_ID", new t0((Clause) new TextLocalisedClause(R$string.pix_authorisation_request_end_date, null, null, 14), (Image) null, 0, false, 30), new TimeClause(oc.c.N(localDate2), TimeClause.Format.DateLong.f57962b, null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    public static CellDetailsNoteDelegate.Model g(String str) {
        if (str == null) {
            return null;
        }
        CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("PAYMENT_OBJECT_ID", new TextLocalisedClause(R$string.pix_authorisation_request_payment_object, null, null, 14), null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static TextLocalisedClause h(PixQrCodeIdentification pixQrCodeIdentification) {
        int i;
        BeneficiaryIdentificationType beneficiaryIdentificationType = pixQrCodeIdentification.f80462a;
        int i2 = beneficiaryIdentificationType == null ? -1 : a.f243848c[beneficiaryIdentificationType.ordinal()];
        if (i2 == -1) {
            i = R.string.common_empty;
        } else if (i2 == 1) {
            i = R$string.pix_key_document;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.pix_key_cnpj;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static ListSubheaderDelegate.Model i() {
        return new ListSubheaderDelegate.Model("PAYMENT_INFORMATION_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.pix_authorisation_request_payment_information, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }
}
