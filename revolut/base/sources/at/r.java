package at;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import bq5.j0;
import cie.l1;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.feedback.api.domain.FeedbackTag;
import com.revolut.feature.insurance.api.models.details.CFACClaimProperties;
import com.revolut.feature.insurance.api.models.details.CFACPaymentCanceller;
import com.revolut.feature.insurance.api.models.details.CFACPaymentPurpose;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ik2.d;
import ip0.dg;
import ip0.kr;
import ip0.qd0;
import ip0.qe0;
import ip0.qr;
import ip0.we0;
import ip0.z;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k8d.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.text.a0;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import yp0.e0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8975a;

    public /* synthetic */ r() {
        this.f8975a = 5;
    }

    public static List a() {
        List listC = u.c(new dg("ERROR_ITEM_ID", new TextLocalisedClause(R.string.error_generic, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14)));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    public static lw0.a b() {
        return new lw0.a(new TextLocalisedClause(R$string.airport_lounges_refund_bottom_sheet_title, null, null, 14), null, null, null, false, 30);
    }

    private final cli.o d(cli.j jVar) {
        tf tfVar;
        tf tfVar2;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        pj7.e domainState = (pj7.e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        nj7.a aVar = domainState.f236679b;
        CFACClaimProperties cFACClaimProperties = domainState.f236680c;
        boolean z = true;
        switch (pj7.p.f236690a[aVar.ordinal()]) {
            case 1:
                ArrayList<CFACPaymentPurpose> availablePaymentPurposes = cFACClaimProperties.f74974b;
                CFACPaymentPurpose cFACPaymentPurpose = domainState.d;
                Intrinsics.checkNotNullParameter(availablePaymentPurposes, "availablePaymentPurposes");
                lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_expense_add_details_info_purpose, null, null, 14), null, null, null, false, 30);
                ArrayList arrayList = new ArrayList(w.t(availablePaymentPurposes, 10));
                for (CFACPaymentPurpose cFACPaymentPurpose2 : availablePaymentPurposes) {
                    boolean zF = Intrinsics.f(cFACPaymentPurpose, cFACPaymentPurpose2);
                    String str = cFACPaymentPurpose2.f74996a;
                    Clause clauseB = ik7.b.b(cFACPaymentPurpose2);
                    Intrinsics.checkNotNullParameter(cFACPaymentPurpose2, "<this>");
                    String str2 = cFACPaymentPurpose2.f74998c;
                    Clause textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : a0.z(cFACPaymentPurpose2.f74996a, "LEISURE", true) ? new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_expense_add_details_purpose_leisure_subtitle, null, null, 14) : new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_expense_add_details_purpose_business_subtitle, null, null, 14);
                    if (zF) {
                        yy0.i iVar = yy0.l.Companion;
                        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
                        iVar.getClass();
                        tfVar = new tf(yy0.i.a(resourceImage));
                    } else {
                        tfVar = null;
                    }
                    arrayList.add(new RowDelegate.Model(str, null, clauseB, null, 0, textClause, null, null, 0, tfVar, false, null, zF, null, null, null, null, null, null, cFACPaymentPurpose2, null, 0, 0, 0, 0, 532667354));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new cii.b(null, arrayList, aVar2);
            case 2:
                ArrayList<CFACPaymentCanceller> availablePaymentCancellers = cFACClaimProperties.f74975c;
                CFACPaymentCanceller cFACPaymentCanceller = domainState.e;
                Intrinsics.checkNotNullParameter(availablePaymentCancellers, "availablePaymentCancellers");
                lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_expense_add_details_info_canceled_by, null, null, 14), null, null, null, false, 30);
                ArrayList arrayList2 = new ArrayList(w.t(availablePaymentCancellers, 10));
                for (CFACPaymentCanceller cFACPaymentCanceller2 : availablePaymentCancellers) {
                    boolean zF2 = Intrinsics.f(cFACPaymentCanceller, cFACPaymentCanceller2);
                    String str3 = cFACPaymentCanceller2.f74993a;
                    Clause clauseA = ik7.b.a(cFACPaymentCanceller2);
                    Intrinsics.checkNotNullParameter(cFACPaymentCanceller2, "<this>");
                    String str4 = cFACPaymentCanceller2.f74995c;
                    Clause textClause2 = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : a0.z(cFACPaymentCanceller2.f74993a, "CUSTOMER", true) ? new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_expense_add_details_canceller_customer_subtitle, null, null, 14) : new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_expense_add_details_canceller_provider_subtitle, null, null, 14);
                    if (zF2) {
                        yy0.i iVar2 = yy0.l.Companion;
                        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
                        iVar2.getClass();
                        tfVar2 = new tf(yy0.i.a(resourceImage2));
                    } else {
                        tfVar2 = null;
                    }
                    arrayList2.add(new RowDelegate.Model(str3, null, clauseA, null, 0, textClause2, null, null, 0, tfVar2, false, null, zF2, null, null, null, null, null, null, cFACPaymentCanceller2, null, 0, 0, 0, 0, 532667354));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return new cii.b(null, arrayList2, aVar3);
            case 3:
                return new cii.b(new aw0.g(new n6(new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_remove, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), f0.f322471a, new lw0.a(new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_supporting_documents_remove_expense_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_supporting_documents_remove_expense_subtitle, null, null, 14), null, null, false, 28));
            case 4:
                return new cii.b(new aw0.g(new n6(new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_remove, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), f0.f322471a, new lw0.a(new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_supporting_documents_remove_document_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_supporting_documents_remove_document_subtitle, null, null, 14), null, null, false, 28));
            case 5:
            case 6:
                long j2 = domainState.f236678a;
                nj7.a configuration = domainState.f236679b;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                int[] iArr = oj7.b.f225745a;
                int i = iArr[configuration.ordinal()];
                if (i == 1) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_expense_add_details_date_picker_start_date_title, null, null, 14);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("Date picker dialog should be opened only for picking trip start date or cancellation date");
                    }
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_expense_add_details_date_picker_cancellation_date_title, null, null, 14);
                }
                TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
                int i2 = iArr[configuration.ordinal()];
                if (i2 == 1) {
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_expense_add_details_date_picker_start_date_subtitle, null, null, 14);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("Date picker dialog should be opened only for picking trip start date or cancellation date");
                    }
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_claim_expense_add_details_date_picker_cancellation_date_subtitle, null, null, 14);
                }
                lw0.a aVar4 = new lw0.a(textLocalisedClause3, textLocalisedClause2, null, null, false, 28);
                wj7.h hVar = wj7.o.Companion;
                hVar.getClass();
                ZoneId zoneId = wj7.h.f297977b;
                Intrinsics.checkNotNullExpressionValue(zoneId, "<get-UTC_TIME_ZONE>(...)");
                LocalDate localDate = oi0.d.X(j2, zoneId).toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                hVar.getClass();
                Intrinsics.checkNotNullExpressionValue(zoneId, "<get-UTC_TIME_ZONE>(...)");
                LocalDate localDate2 = oi0.d.X(j2, zoneId).toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
                g5 g5Var = new g5("ID_DATE_PICKER_ITEM", localDate, localDate2, false, null, null, null, null, null, null, 0, 0, 1048568);
                e0 e0Var = e0.INSIDE_BOX;
                TimeClause.Format.INSTANCE.getClass();
                boolean z3 = false;
                return new cii.b(new aw0.g(new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), yp0.b.i(g5Var, new ListSubheaderDelegate.Model("ID_DATE_PICKER_HEADER", (Image) null, (Clause) new TimeClause(j2, TimeClause.Format.f57959a, null, null, 12), (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_reset, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z3, z3, z, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450), e0Var, 0, 0, 124), aVar4);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final cli.o e(cli.j jVar) {
        qyc.i domainState = (qyc.i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String text = domainState.f250275a;
        Intrinsics.checkNotNullParameter(text, "text");
        TextClause textClause = new TextClause(text, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.selfserve.core.R$string.sot_source_create_source, null, null, 14);
        int i = R$attr.uikit_dp4;
        InputTextDelegate.Model model = new InputTextDelegate.Model("description_input", textClause, textLocalisedClause, null, false, null, false, null, null, null, null, null, null, true, Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST), null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, i, i, -49160, 16383);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(model);
        String str = domainState.f250275a;
        return new qyc.m(listC, str.length() > 0 && str.length() <= 250);
    }

    private final cli.o f(cli.j jVar) {
        DocumentType documentType;
        syc.d domainState = (syc.d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        IncomeSource incomeSource = domainState.f266651a;
        List list = domainState.f266652b;
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.selfserve.core.R$string.document_selection_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, 0, 0, 0, 61434);
        List<List> list2 = incomeSource.e;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (List list3 : list2) {
            DocumentType documentType2 = (DocumentType) d0.b0(list3);
            String strQ = j6.a.q("INCOME_SOURCE_LIST_ID", documentType2.f85860b);
            String strQ2 = j6.a.q("INCOME_SOURCE_ROW_LIST_ID", documentType2.f85860b);
            TextClause textClause = new TextClause(documentType2.f85860b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i = R$attr.uikit_dp0;
            arrayList.add(new SelectableDelegate.Model(strQ, new RowDelegate.Model(strQ2, null, textClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, list3, null, i, i, 0, 0, 482344954), Intrinsics.f(documentType2.f85859a, (list == null || (documentType = (DocumentType) d0.d0(list)) == null) ? null : documentType.f85859a) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, list3, null, false, 32504));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new syc.h(d0.E0(arrayList, u.c(model)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Object selectedItemId;
        int i;
        AnimatedBackgroundType animatedBackgroundType;
        TextLocalisedClause textLocalisedClause;
        int i2 = 5;
        int i3 = 29;
        int i5 = 17;
        int i6 = 22;
        int i21 = 3;
        int i22 = 12;
        int i32 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        int i33 = 1;
        int i43 = 14;
        switch (this.f8975a) {
            case 0:
                h domainState = (h) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_nfc_my_number_details_title, null, null, 14);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_nfc_my_number_details_subtitle, null, null, 14);
                String str = domainState.f8961a;
                String str2 = domainState.f8962b;
                return new o(textLocalisedClause2, textLocalisedClause3, str, str2, s.b(str, str2));
            case 1:
                azc.i domainState2 = (azc.i) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                String currentNote = domainState2.f11432a;
                String enteredNote = domainState2.f11433b;
                Intrinsics.checkNotNullParameter(currentNote, "currentNote");
                Intrinsics.checkNotNullParameter(enteredNote, "enteredNote");
                TextClause textClause = new TextClause(enteredNote, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.selfserve.core.R$string.sot_note_caption, null, null, 14);
                int i59 = R$attr.uikit_dp4;
                InputTextDelegate.Model model = new InputTextDelegate.Model("note_input", textClause, textLocalisedClause4, null, false, null, false, null, null, null, null, null, null, true, Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST), null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, i59, i59, -49160, 16383);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new azc.m(u.c(model), domainState2.f11433b.length() <= 250);
            case 2:
                chg.e domainState3 = (chg.e) jVar;
                Intrinsics.checkNotNullParameter(domainState3, "domainState");
                return new chg.h((List) iii.c.f(domainState3.f24224a, new cge.g(this, i43), new ccg.a(this, i43), new b9d.k(i32, domainState3.f24225b, this)));
            case 3:
                cig.e domainState4 = (cig.e) jVar;
                Intrinsics.checkNotNullParameter(domainState4, "domainState");
                return new cig.h((List) iii.c.f(t1.t(domainState4.f24545a, domainState4.f24546b), new cge.g(this, 25), new ccg.a(19), new b9d.k(3, domainState4.f24547c, this)));
            case 4:
                cjj.e domainState5 = (cjj.e) jVar;
                Intrinsics.checkNotNullParameter(domainState5, "domainState");
                return (cjj.h) iii.c.f(domainState5.f24690a, new cjj.j(this, objArr == true ? 1 : 0), new ccg.a(i6), new l1(this, i33));
            case 5:
                Intrinsics.checkNotNullParameter((cm6.d) jVar, "domainState");
                return new cm6.g(u.c(new we0("ILLUSTRATION_ID", new qe0(Constants.TAG_SUPPORTED_LOCALE_LIST, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D301", null, null, null, 30)))));
            case 6:
                dq5.c domainState6 = (dq5.c) jVar;
                Intrinsics.checkNotNullParameter(domainState6, "domainState");
                int i66 = dq5.f.f116917a[domainState6.f116915a.ordinal()];
                if (i66 == 1) {
                    selectedItemId = "RECIPIENT_TYPE_INDIVIDUAL_ITEM_ID";
                } else {
                    if (i66 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    selectedItemId = "RECIPIENT_TYPE_BUSINESS_ITEM_ID";
                }
                Intrinsics.checkNotNullParameter(selectedItemId, "selectedItemId");
                List listK = v.k(new SingleChoiceDelegate.Model("RECIPIENT_TYPE_INDIVIDUAL_ITEM_ID", new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_create_address_details_recipient_info_dropdown_individual, null, null, 14), selectedItemId.equals("RECIPIENT_TYPE_INDIVIDUAL_ITEM_ID"), null, j0.INDIVIDUAL, YearClass.CLASS_2008), new SingleChoiceDelegate.Model("RECIPIENT_TYPE_BUSINESS_ITEM_ID", new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_create_address_details_recipient_info_dropdown_business, null, null, 14), selectedItemId.equals("RECIPIENT_TYPE_BUSINESS_ITEM_ID"), null, j0.BUSINESS, YearClass.CLASS_2008));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new cii.b(null, listK, new lw0.a(new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_create_address_details_recipient_info_title, null, null, 14), null, null, null, false, 30));
            case 7:
                du.j state = (du.j) jVar;
                Intrinsics.checkNotNullParameter(state, "domainState");
                s0 s0Var = new s0(2);
                Intrinsics.checkNotNullParameter(state, "state");
                List listC = u.c(new InputTextDelegate.Model("INPUT_TEXT_ID", new TextClause(state.f117495a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_nfc_document_information_document_number, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                s0Var.b(listC.toArray(new qv0.i[0]));
                Intrinsics.checkNotNullParameter(state, "state");
                String d = state.f117496b;
                Intrinsics.checkNotNullParameter(d, "d");
                String str3 = gu.a.b(d).format(DateTimeFormatter.ofPattern("ddMMyyyy"));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                TextClause textClause2 = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_nfc_document_information_date_of_birth, null, null, 14);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                kr krVar = kr.f165065a;
                InputTextDelegate.Model model2 = new InputTextDelegate.Model("INPUT_DATES_BIRTH_ID", textClause2, textLocalisedClause5, null, false, null, false, null, null, null, null, null, resourceImage, false, null, null, false, false, false, false, krVar, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -538976264, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                String d5 = state.f117497c;
                Intrinsics.checkNotNullParameter(d5, "d");
                String str4 = gu.a.b(d5).format(DateTimeFormatter.ofPattern("ddMMyyyy"));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                InputTextDelegate.Model model3 = new InputTextDelegate.Model("INPUT_DATES_EXPIRY_ID", new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_nfc_document_information_date_of_expiry, null, null, 14), null, false, null, false, null, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, null, false, false, false, false, krVar, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -538976264, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                s0Var.b(v.k(model2, model3).toArray(new qv0.i[0]));
                ArrayList arrayList = s0Var.f186433a;
                List listK2 = v.k(arrayList.toArray(new qv0.i[arrayList.size()]));
                Intrinsics.checkNotNullParameter(state, "state");
                int i74 = fu.d.f138048a[state.d.ordinal()];
                if (i74 == 1) {
                    i = com.revolut.camerakit.revolut.ui.R$string.vision_nfc_document_information_check_passport_details;
                } else if (i74 == 2) {
                    i = com.revolut.camerakit.revolut.ui.R$string.vision_nfc_document_information_check_identity_card_details;
                } else {
                    if (i74 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = com.revolut.camerakit.revolut.ui.R$string.vision_nfc_document_information_check_residence_permit_details;
                }
                return new du.b(new TextLocalisedClause(i, null, null, 14), listK2);
            case 8:
                f47.f domainState7 = (f47.f) jVar;
                Intrinsics.checkNotNullParameter(domainState7, "domainState");
                f47.i iVar = new f47.i(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_filter_currencies_header_title, null, null, 14));
                f47.h hVar = new f47.h(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_filter_currencies_action_save, null, null, 14));
                Set set = domainState7.f132013a;
                return new f47.j(iVar, hVar, w47.b.b(set, domainState7.f132014b, domainState7.f132015c, set.size()));
            case 9:
                Intrinsics.checkNotNullParameter((cli.k) jVar, "domainState");
                f7g.a aVar = new f7g.a(new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_title, null, null, 14));
                aim.e eVarB = u.b();
                eVarB.addAll(yp0.b.g(v.k(new PlainTextDelegate.Model("SELF_TRANSFER_HOW_IT_WORKS_INTRO", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_how_it_works_intro, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518), h7g.a.a(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_how_it_works_collect_baggage_title, com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_how_it_works_collect_baggage_subtitle, R$drawable.uikit_icn_24_suitcase, "SELF_TRANSFER_COLLECT_BAGGAGE"), h7g.a.a(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_how_it_works_check_in_title, com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_how_it_works_check_in_subtitle, R$drawable.uikit_icn_24_check_verification, "SELF_TRANSFER_CHECK_IN"), h7g.a.a(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_how_it_works_security_title, com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_how_it_works_security_subtitle, R$drawable.uikit_icn_24_passport, "SELF_TRANSFER_SECURITY")), h7g.a.b(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_how_it_works_section_title, "SELF_TRANSFER_HOW_IT_WORKS_SUBHEADER"), null, 0, 0, 126));
                eVarB.addAll(yp0.b.g(v.k(h7g.a.a(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_important_entry_requirements_title, com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_important_entry_requirements_subtitle, R$drawable.uikit_icn_24_visa_document, "SELF_TRANSFER_ENTRY_REQUIREMENTS"), h7g.a.a(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_important_transfer_time_title, com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_important_transfer_time_subtitle, R$drawable.uikit_icn_24_time, "SELF_TRANSFER_TRANSFER_TIME")), h7g.a.b(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_important_section_title, "SELF_TRANSFER_IMPORTANT_TO_CHECK_SUBHEADER"), null, 0, 0, 126));
                eVarB.addAll(yp0.b.g(u.c(new PlainTextDelegate.Model("SELF_TRANSFER_GUARANTEE_BODY", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_guarantee_body, u.c(new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_guarantee_terms, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10)), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518)), h7g.a.b(com.revolut.feature.travel.flights.api.R$string.travel_flights_self_transfer_info_guarantee_section_title, "SELF_TRANSFER_GUARANTEE_SUBHEADER"), null, 0, 0, 126));
                return new f7g.c(aVar, u.a(eVarB));
            case 10:
                fk9.c domainState8 = (fk9.c) jVar;
                Intrinsics.checkNotNullParameter(domainState8, "domainState");
                return new fk9.e((List) iii.c.f(domainState8.f135734a, new fj5.e(25), new fk4.r(i33), new et6.a(this, 28)));
            case 11:
                h50.i domainState9 = (h50.i) jVar;
                Intrinsics.checkNotNullParameter(domainState9, "domainState");
                ArrayList arrayList2 = new ArrayList();
                List list = domainState9.f149417c;
                Set chosenTags = domainState9.d;
                String comment = domainState9.e;
                if (!list.isEmpty()) {
                    List tags = domainState9.f149417c;
                    Intrinsics.checkNotNullParameter(tags, "tags");
                    Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
                    List list2 = tags;
                    ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList3.add(mp6.a.a((FeedbackTag) it8.next(), chosenTags));
                    }
                    arrayList2.add(new z("FEEDBACK_EXTENSION_ACTIONS_LIST_ID", arrayList3, null, mx0.l.FLEXBOX, R$attr.uikit_dp0, 0, 100));
                }
                TextLocalisedClause placeholder = new TextLocalisedClause(com.revolut.chat_core.R$string.chat_resolution_feedback_other_placeholder, null, null, 14);
                Intrinsics.checkNotNullParameter(comment, "comment");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                qr style = qr.f166041a;
                Intrinsics.checkNotNullParameter(style, "style");
                arrayList2.add(mp6.a.f(comment, placeholder, style, true));
                TextLocalisedClause text = new TextLocalisedClause(com.revolut.chat_core.R$string.chat_rate_footer_submit, null, null, 14);
                boolean z = (comment.length() > 0 || !chosenTags.isEmpty()) && comment.length() <= 280;
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(text, "text");
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                int i92 = R$attr.uikit_dp8;
                int i96 = R$attr.uikit_dp16;
                arrayList2.add(new LargeActionButtonDelegate.Model("FEEDBACK_EXTENSION_BUTTON_LIST_ID", defaultFilledButton, null, text, z, null, null, i92, i96, i96, i96, DefaultFrameSampler.DESIRED_FRAME_WIDTH));
                return new cii.b(null, arrayList2, new lw0.a(domainState9.f149416b ? new TextLocalisedClause(com.revolut.chat_core.R$string.chat_rate_message_positive_title, null, null, 14) : new TextLocalisedClause(com.revolut.chat_core.R$string.chat_rate_message_negative_title, null, null, 14), null, null, null, false, 30));
            case 12:
                h5g.b domainState10 = (h5g.b) jVar;
                Intrinsics.checkNotNullParameter(domainState10, "domainState");
                return new h5g.c(f5g.a.a(domainState10.f149555a));
            case 13:
                i2k.k domainState11 = (i2k.k) jVar;
                Intrinsics.checkNotNullParameter(domainState11, "domainState");
                return (i2k.m) iii.c.f(domainState11.f157997a, new i2i.o(this, 6), new hy2.b(i3), new hnc.a(i22, domainState11, this));
            case 14:
                ibg.d domainState12 = (ibg.d) jVar;
                Intrinsics.checkNotNullParameter(domainState12, "domainState");
                return new ibg.f((List) iii.c.f(domainState12.f160167a, new i9g.e0(20), new i83.m(i22), new i6j.q(this, i2)));
            case 15:
                ik2.d domainState13 = (ik2.d) jVar;
                Intrinsics.checkNotNullParameter(domainState13, "domainState");
                if (domainState13 instanceof d.b) {
                    lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_dialog_withdrawal_fee_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_dialog_withdrawal_fee_description, null, null, 14), null, null, false, 28);
                    RowDelegate.Model model4 = new RowDelegate.Model("HOW_TO_AVOID_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, 6), new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_dialog_withdrawal_fee_how_to_avoid_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_dialog_withdrawal_fee_how_to_avoid_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
                    yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                    return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_dialog_withdrawal_fee_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "ATM_WITHDRAWAL_FEE_LARGE_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55), u.c(model4), aVar2);
                }
                if (!(domainState13 instanceof d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_dialog_exchange_fee_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_dialog_exchange_fee_description, null, null, 14), null, null, false, 28);
                RowDelegate.Model model5 = new RowDelegate.Model("HOW_TO_AVOID_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 6), new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_dialog_exchange_fee_how_to_avoid_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_dialog_exchange_fee_how_to_avoid_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
                yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.atm.impl.R$string.atm_dialog_exchange_fee_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "ATM_EXCHANGE_FEE_LARGE_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55), u.c(model5), aVar3);
            case 16:
                jdg.c domainState14 = (jdg.c) jVar;
                Intrinsics.checkNotNullParameter(domainState14, "domainState");
                return new jdg.d((List) iii.c.f(domainState14.f173066a, new jcj.n(28), new j7b.m(i6), new jb8.b(this, 6)));
            case 17:
                k27.d domainState15 = (k27.d) jVar;
                Intrinsics.checkNotNullParameter(domainState15, "domainState");
                lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_type_picker_more_payment_options_title, null, null, 14), null, null, null, false, 30);
                Set set2 = domainState15.f180398a;
                k27.f fVar = k27.f.E_COMMERCE;
                RowDelegate.Model modelA = set2.contains(fVar) ? c27.a.a(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_type_picker_more_payment_options_item_e_commerce_plugins_title, R$drawable.uikit_icn_24_puzzle, Integer.valueOf(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_type_picker_more_payment_options_item_e_commerce_plugins_subtitle), fVar, "SALE_ITEM_ID_E_COMMERCE") : null;
                Set set3 = domainState15.f180398a;
                k27.f fVar2 = k27.f.HARDWARE_SHOP;
                qv0.i[] elements = {modelA, set3.contains(fVar2) ? c27.a.a(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_type_picker_more_payment_options_item_payment_terminals_title, R$drawable.uikit_icn_24_card_terminal, Integer.valueOf(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_type_picker_more_payment_options_item_payment_terminals_subtitle), fVar2, "SALE_ITEM_ID_HARDWARE_SHOP") : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                return new k27.g(listL, aVar4);
            case 18:
                l5g.e domainState16 = (l5g.e) jVar;
                Intrinsics.checkNotNullParameter(domainState16, "domainState");
                return new l5g.g((List) iii.c.f(domainState16.f192259b, new l5a.u(this, i32), new l2c.v(16), new t(this, 23)));
            case 19:
                me7.c domainState17 = (me7.c) jVar;
                Intrinsics.checkNotNullParameter(domainState17, "domainState");
                f0 f0Var = f0.f322471a;
                v30.s chatPricingPlan = domainState17.f204620a;
                Intrinsics.checkNotNullParameter(chatPricingPlan, "chatPricingPlan");
                switch (je7.a.f173234a[chatPricingPlan.ordinal()]) {
                    case 1:
                    case 2:
                        animatedBackgroundType = AnimatedBackgroundType.DEFAULT.f51471a;
                        break;
                    case 3:
                        animatedBackgroundType = AnimatedBackgroundType.PLAN_PREMIUM.f51481a;
                        break;
                    case 4:
                        animatedBackgroundType = AnimatedBackgroundType.PLAN_METAL.f51479a;
                        break;
                    case 5:
                        animatedBackgroundType = AnimatedBackgroundType.PLAN_ULTRA.f51483a;
                        break;
                    case 6:
                        animatedBackgroundType = AnimatedBackgroundType.PLAN_PRIVATE.f51482a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return new me7.g(f0Var, animatedBackgroundType);
            case 20:
                nt4.d domainState18 = (nt4.d) jVar;
                Intrinsics.checkNotNullParameter(domainState18, "domainState");
                return new nt4.e(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_hub_limit_history_screen_header_title, null, null, 14), (List) iii.c.f(domainState18.f218961a, new nrb.c(i6), new nsl.d(i21), new ngh.i(this, 7)));
            case 21:
                okk.j domainState19 = (okk.j) jVar;
                Intrinsics.checkNotNullParameter(domainState19, "domainState");
                aim.e eVarA = com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.c.a(domainState19.f226141a);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return new okk.k(eVarA);
            case 22:
                oyi.b domainState20 = (oyi.b) jVar;
                Intrinsics.checkNotNullParameter(domainState20, "domainState");
                return (cii.b) iii.c.f(domainState20.f231039a, new oxd.m(this, domainState20), new ox5.d0(this, i5), new nrd.i(this, domainState20, 26));
            case 23:
                p8f.e domainState21 = (p8f.e) jVar;
                Intrinsics.checkNotNullParameter(domainState21, "domainState");
                return new p8f.g((List) iii.c.f(domainState21.f234150a, new p5a.m(i22), new p4a.g(21), new p2b.a(this, i2)));
            case 24:
                return d(jVar);
            case 25:
                pt.f state2 = (pt.f) jVar;
                Intrinsics.checkNotNullParameter(state2, "domainState");
                Intrinsics.checkNotNullParameter(state2, "state");
                CountryClause countryClause = new CountryClause(state2.f239555a, null);
                CountryImage countryImage = new CountryImage(state2.f239555a.f297794a, Integer.valueOf(R$drawable.uikit_icn_24_globe), (ez0.e) null, 10);
                kr krVar2 = kr.f165065a;
                InputTextDelegate.Model model6 = new InputTextDelegate.Model("COUNTRY_INPUT_ID", countryClause, null, null, false, null, false, null, null, countryImage, null, null, null, false, null, null, false, false, false, false, krVar2, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -2098180, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                AnalyticsContext analyticsContext = state2.e;
                model6.Q = analyticsContext;
                InputTextDelegate.Model modelA2 = yp0.r.a(model6);
                yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
                List listC2 = u.c(modelA2);
                Intrinsics.checkNotNullParameter(state2, "state");
                BiometricVerificationDocumentType biometricVerificationDocumentType = state2.f239556b;
                if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.DrivingLicence) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_driving_license_name, null, null, 14);
                } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.IdentityCard) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_identity_card_name, null, null, 14);
                } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.Passport) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_passport_name, null, null, 14);
                } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.ResidencePermit) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_residence_permit_name, null, null, 14);
                } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.Visa) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_visa_name, null, null, 14);
                } else {
                    if (!(biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.BirthCertificate)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_birth_certificate_name, null, null, 14);
                }
                InputTextDelegate.Model model7 = new InputTextDelegate.Model("DOCUMENT_INPUT_ID", textLocalisedClause, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, krVar2, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -2097156, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                model7.Q = analyticsContext;
                InputTextDelegate.Model modelA3 = yp0.r.a(model7);
                yp0.b.l(modelA3, 0, 0, 0, 0, null, false, 63);
                return new pt.n(d0.E0(u.c(modelA3), listC2));
            case 26:
                q92.a domainState22 = (q92.a) jVar;
                Intrinsics.checkNotNullParameter(domainState22, "domainState");
                return (q92.b) iii.c.f(domainState22.f243634a, new q75.n(i3), new q92.f((int) (objArr6 == true ? 1 : 0)), new pv7.t(this, i43));
            case 27:
                return e(jVar);
            case 28:
                return f(jVar);
            default:
                tm8.f domainState23 = (tm8.f) jVar;
                Intrinsics.checkNotNullParameter(domainState23, "domainState");
                return (tm8.h) iii.c.f(t1.u(domainState23.f272162b, domainState23.f272161a, domainState23.f272163c), new tlf.n(this, i33), new tj9.d(this, i43), new sr8.a(this, i5));
        }
    }

    public r(syc.j mapper) {
        this.f8975a = 28;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
    }

    public r(f5g.a bookingsItemMapper) {
        this.f8975a = 12;
        Intrinsics.checkNotNullParameter(bookingsItemMapper, "bookingsItemMapper");
    }

    public r(com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.c moreForFamilyMapper) {
        this.f8975a = 21;
        Intrinsics.checkNotNullParameter(moreForFamilyMapper, "moreForFamilyMapper");
    }

    public r(jdg.f additionalDetailsItemMapper) {
        this.f8975a = 16;
        Intrinsics.checkNotNullParameter(additionalDetailsItemMapper, "additionalDetailsItemMapper");
    }

    public r(je7.b chatPricingPlanMapper) {
        this.f8975a = 19;
        Intrinsics.checkNotNullParameter(chatPricingPlanMapper, "chatPricingPlanMapper");
    }

    public r(s validator) {
        this.f8975a = 0;
        Intrinsics.checkNotNullParameter(validator, "validator");
    }

    public r(h7g.a itemMapper) {
        this.f8975a = 9;
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
    }

    public r(kk2.a exchangeFeeUiStateProvider, kk2.b withdrawalFeeUiStateProvider) {
        this.f8975a = 15;
        Intrinsics.checkNotNullParameter(exchangeFeeUiStateProvider, "exchangeFeeUiStateProvider");
        Intrinsics.checkNotNullParameter(withdrawalFeeUiStateProvider, "withdrawalFeeUiStateProvider");
    }

    public r(rt.a countryMapper, rt.c documentMapper) {
        this.f8975a = 25;
        Intrinsics.checkNotNullParameter(countryMapper, "countryMapper");
        Intrinsics.checkNotNullParameter(documentMapper, "documentMapper");
    }

    public r(fu.c documentNumberMapper, fu.b datesInputMapper, fu.e titleMapper) {
        this.f8975a = 7;
        Intrinsics.checkNotNullParameter(documentNumberMapper, "documentNumberMapper");
        Intrinsics.checkNotNullParameter(datesInputMapper, "datesInputMapper");
        Intrinsics.checkNotNullParameter(titleMapper, "titleMapper");
    }

    public r(i2k.b itemsMapper) {
        this.f8975a = 13;
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
    }

    public r(w47.b transactionExportComponentMapper) {
        this.f8975a = 8;
        Intrinsics.checkNotNullParameter(transactionExportComponentMapper, "transactionExportComponentMapper");
    }

    public r(e92.b enrollmentMapper) {
        this.f8975a = 26;
        Intrinsics.checkNotNullParameter(enrollmentMapper, "enrollmentMapper");
    }

    public r(bq5.c cryptoCreateBeneficiaryDialogProvider) {
        this.f8975a = 6;
        Intrinsics.checkNotNullParameter(cryptoCreateBeneficiaryDialogProvider, "cryptoCreateBeneficiaryDialogProvider");
    }

    public r(h50.a inputData, ep6.b feedbackItemsProvider) {
        this.f8975a = 11;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(feedbackItemsProvider, "feedbackItemsProvider");
    }

    public r(q8f.c assetsMapper) {
        this.f8975a = 23;
        Intrinsics.checkNotNullParameter(assetsMapper, "assetsMapper");
    }

    public r(vi9.z planProgressMapper) {
        this.f8975a = 10;
        Intrinsics.checkNotNullParameter(planProgressMapper, "planProgressMapper");
    }

    public r(fcg.a additionalInformationItemMapper) {
        this.f8975a = 14;
        Intrinsics.checkNotNullParameter(additionalInformationItemMapper, "additionalInformationItemMapper");
    }

    public r(c27.a pickerItemMapper) {
        this.f8975a = 17;
        Intrinsics.checkNotNullParameter(pickerItemMapper, "pickerItemMapper");
    }

    public r(vt4.c limitHistoryItemMapper) {
        this.f8975a = 20;
        Intrinsics.checkNotNullParameter(limitHistoryItemMapper, "limitHistoryItemMapper");
    }

    public r(oj7.a datePickerDialogMapper, oj7.f removeExpenseDialogMapper, oj7.e removeDocumentDialogMapper, oj7.d elementPickerTripPurposeDialogMapper, oj7.c elementPickerCancellerDialogMapper) {
        this.f8975a = 24;
        Intrinsics.checkNotNullParameter(datePickerDialogMapper, "datePickerDialogMapper");
        Intrinsics.checkNotNullParameter(removeExpenseDialogMapper, "removeExpenseDialogMapper");
        Intrinsics.checkNotNullParameter(removeDocumentDialogMapper, "removeDocumentDialogMapper");
        Intrinsics.checkNotNullParameter(elementPickerTripPurposeDialogMapper, "elementPickerTripPurposeDialogMapper");
        Intrinsics.checkNotNullParameter(elementPickerCancellerDialogMapper, "elementPickerCancellerDialogMapper");
    }

    public r(r39.a itemMapper) {
        this.f8975a = 18;
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
    }

    public r(vm8.a juniorRewardsListItemMapper) {
        this.f8975a = 29;
        Intrinsics.checkNotNullParameter(juniorRewardsListItemMapper, "juniorRewardsListItemMapper");
    }

    public r(ejj.b planFeatureSectionMapper, ejj.a additionalPriceSectionMapper, ejj.c selectionOptionsSectionMapper) {
        this.f8975a = 4;
        Intrinsics.checkNotNullParameter(planFeatureSectionMapper, "planFeatureSectionMapper");
        Intrinsics.checkNotNullParameter(additionalPriceSectionMapper, "additionalPriceSectionMapper");
        Intrinsics.checkNotNullParameter(selectionOptionsSectionMapper, "selectionOptionsSectionMapper");
    }

    public r(qyi.a breakdownItemsMapper, qyi.c infoItemsMapper, qyi.b footerMapper) {
        this.f8975a = 22;
        Intrinsics.checkNotNullParameter(breakdownItemsMapper, "breakdownItemsMapper");
        Intrinsics.checkNotNullParameter(infoItemsMapper, "infoItemsMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
    }

    public r(ugg.b airlinesWithWaysToRedeemListItemMapper, int i) {
        this.f8975a = i;
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter(airlinesWithWaysToRedeemListItemMapper, "airlinesWithWaysToRedeemListItemMapper");
                break;
            default:
                Intrinsics.checkNotNullParameter(airlinesWithWaysToRedeemListItemMapper, "airlinesWithWaysToRedeemListItemMapper");
                break;
        }
    }

    public r(azc.o mapper) {
        this.f8975a = 1;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
    }

    public r(qyc.o mapper) {
        this.f8975a = 27;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
    }
}
