package ube;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.pix.api.model.PixQrCodeAgent;
import com.revolut.feature.pix.api.model.PixQrCodeBill;
import com.revolut.feature.pix.api.model.PixQrCodeCreditor;
import com.revolut.feature.pix.api.model.PixQrCodeDebtor;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeResult;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeStatus;
import com.revolut.feature.pix.api.model.PixQrCodeIdentification;
import com.revolut.feature.pix.api.model.PixQrCodeMoneyBreakdown;
import com.revolut.feature.pix.api.model.PixQrCodeParty;
import com.revolut.feature.pix.api.model.PixQrCodeReferences;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import ip0.f6;
import ip0.t5;
import ip0.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import k71.q;
import klf.w1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l80.e;
import l80.f;
import org.jetbrains.annotations.NotNull;
import qua.p;
import qua.u;
import qv0.i;
import s8a.l;
import te0.w;
import vkm.v1;
import vkm.y;
import zhm.a0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends abe.a {

    @NotNull
    public static final b Companion = new b();
    public static final PixQrCodeDecodeResult f = new PixQrCodeDecodeResult("", PixQrCodeDecodeStatus.FAILED, "", "", null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f278843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final abe.b f278844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f278845c;
    public final l d;
    public final i8a.c e;

    public d(a9e.b commonSubscriptionMapper, abe.b paymentFromItemMapper, e dateProvider, l pixQrCodeInteractor, i8a.c pixMoneyBreakdownItemsMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(paymentFromItemMapper, "paymentFromItemMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(pixQrCodeInteractor, "pixQrCodeInteractor");
        Intrinsics.checkNotNullParameter(pixMoneyBreakdownItemsMapper, "pixMoneyBreakdownItemsMapper");
        this.f278843a = commonSubscriptionMapper;
        this.f278844b = paymentFromItemMapper;
        this.f278845c = dateProvider;
        this.d = pixQrCodeInteractor;
        this.e = pixMoneyBreakdownItemsMapper;
    }

    public static TextLocalisedClause e(PixQrCodeIdentification pixQrCodeIdentification) {
        int i;
        BeneficiaryIdentificationType beneficiaryIdentificationType = pixQrCodeIdentification.f80462a;
        int i2 = beneficiaryIdentificationType == null ? -1 : c.f278842a[beneficiaryIdentificationType.ordinal()];
        if (i2 == -1) {
            i = R.string.common_empty;
        } else if (i2 == 1) {
            i = R$string.recurring_payment_details_cpf_title;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.recurring_payment_details_cnpj_title;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    @Override // abe.a
    public final List b(Object obj2) {
        sa saVarZ;
        char c2;
        char c3;
        CellDetailsDelegate.Model model;
        String str;
        List listL;
        List listL2;
        Data data;
        PixQrCodeDecodeData pixQrCodeDecodeData;
        PixQrCodeBill pixQrCodeBill;
        List list;
        List list2;
        PixQrCodeDecodeData pixQrCodeDecodeData2;
        PixQrCodeBill pixQrCodeBill2;
        PixQrCodeMoneyBreakdown pixQrCodeMoneyBreakdown;
        PixQrCodeDecodeData pixQrCodeDecodeData3;
        PixQrCodeReferences pixQrCodeReferences;
        PixQrCodeDecodeData pixQrCodeDecodeData4;
        CellDetailsDelegate.Model model2;
        PixQrCodeDebtor pixQrCodeDebtor;
        PixQrCodeIdentification pixQrCodeIdentification;
        PixQrCodeDebtor pixQrCodeDebtor2;
        String str2;
        PixQrCodeDecodeData pixQrCodeDecodeData5;
        char c5;
        i model3;
        CellDetailsDelegate.Model model4;
        PixQrCodeAgent pixQrCodeAgent;
        String str3;
        PixQrCodeParty pixQrCodeParty;
        PixQrCodeIdentification pixQrCodeIdentification2;
        PixQrCodeParty pixQrCodeParty2;
        String str4;
        a model5 = (a) obj2;
        Intrinsics.checkNotNullParameter(model5, "model");
        ArrayList arrayList = new ArrayList();
        p pVar = model5.f278839a;
        Data data2 = model5.f278840b;
        q qVar = model5.f278841c;
        PixQrCodeDecodeResult pixQrCodeDecodeResult = model5.d;
        boolean zI = u.i(pVar, ((f) this.f278845c).g());
        a9e.b bVar = this.f278843a;
        if (zI) {
            saVarZ = null;
        } else {
            vua.a aVar = pVar.f249330s;
            saVarZ = ((i9e.f) bVar).z(aVar != null ? aVar.a() : null);
            yp0.b.l(saVarZ, 0, 0, 0, 0, null, false, 63);
        }
        a0.x(v.l(saVarZ), arrayList);
        i9e.f fVar = (i9e.f) bVar;
        i[] elements = {fVar.r(pVar, false), ofm.q.y(pVar) ? fVar.v(pVar.f249314a.f, pVar) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL3 = kotlin.collections.d.L(elements);
        yp0.b.k(listL3, 0, 0, 0, 0, 31);
        a0.x(listL3, arrayList);
        i iVarA = this.f278844b.a(pVar, qVar);
        if (u.D(pVar)) {
            c2 = 0;
            c3 = 1;
            model = new CellDetailsDelegate.Model("ID_TRANSACTION_TYPE", new TextLocalisedClause(R$string.recurring_payment_details_type_title, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_type_value_pix, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
        } else {
            c2 = 0;
            c3 = 1;
            model = null;
        }
        i[] elements2 = new i[2];
        elements2[c2] = iVarA;
        elements2[c3] = model;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL4 = kotlin.collections.d.L(elements2);
        yp0.b.k(listL4, 0, 0, 0, 0, 31);
        a0.x(listL4, arrayList);
        if (pixQrCodeDecodeResult == null || (pixQrCodeDecodeData5 = pixQrCodeDecodeResult.f) == null) {
            str = "";
            listL = null;
        } else {
            i[] elements3 = new i[3];
            PixQrCodeCreditor pixQrCodeCreditor = pixQrCodeDecodeData5.e;
            if (pixQrCodeCreditor == null || (pixQrCodeParty2 = pixQrCodeCreditor.f80432a) == null || (str4 = pixQrCodeParty2.f80468a) == null) {
                str = "";
                c5 = 2;
                model3 = null;
            } else {
                Address address = pixQrCodeParty2.f80470c;
                if (address != null) {
                    c5 = 2;
                    str = "";
                    model3 = new f6("ID_CREDITOR_NAME", new TextLocalisedClause(R$string.recurring_payment_details_to, null, null, 14), new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), address, 976);
                } else {
                    str = "";
                    c5 = 2;
                    model3 = new CellDetailsDelegate.Model("ID_CREDITOR_NAME", new TextLocalisedClause(R$string.recurring_payment_details_to, null, null, 14), new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
                }
            }
            elements3[c2] = model3;
            if (pixQrCodeCreditor == null || (pixQrCodeParty = pixQrCodeCreditor.f80432a) == null || (pixQrCodeIdentification2 = pixQrCodeParty.f80469b) == null) {
                model4 = null;
            } else {
                TextLocalisedClause textLocalisedClauseE = e(pixQrCodeIdentification2);
                String str5 = pixQrCodeIdentification2.f80463b;
                model4 = new CellDetailsDelegate.Model("ID_CREDITOR_TYPE", textLocalisedClauseE, new TextClause(str5 == null ? str : str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
            }
            elements3[c3] = model4;
            elements3[c5] = (pixQrCodeCreditor == null || (pixQrCodeAgent = pixQrCodeCreditor.f80433b) == null || (str3 = pixQrCodeAgent.f80422a) == null) ? null : new CellDetailsDelegate.Model("ID_INSTITUTION", new TextLocalisedClause(R$string.recurring_payment_details_institution_title, null, null, 14), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
            Intrinsics.checkNotNullParameter(elements3, "elements");
            listL = kotlin.collections.d.L(elements3);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
        }
        if (listL == null) {
            listL = f0.f322471a;
        }
        a0.x(listL, arrayList);
        if (pixQrCodeDecodeResult == null || (pixQrCodeDecodeData4 = pixQrCodeDecodeResult.f) == null) {
            listL2 = null;
        } else {
            PixQrCodeBill pixQrCodeBill3 = pixQrCodeDecodeData4.f80449h;
            CellDetailsDelegate.Model model6 = (pixQrCodeBill3 == null || (pixQrCodeDebtor2 = pixQrCodeBill3.f80429g) == null || (str2 = pixQrCodeDebtor2.f80443a) == null) ? null : new CellDetailsDelegate.Model("ID_DEBTOR_NAME", new TextLocalisedClause(R$string.recurring_payment_details_debtor_title, null, null, 14), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
            if (pixQrCodeBill3 == null || (pixQrCodeDebtor = pixQrCodeBill3.f80429g) == null || (pixQrCodeIdentification = pixQrCodeDebtor.f80444b) == null) {
                model2 = null;
            } else {
                TextLocalisedClause textLocalisedClauseE2 = e(pixQrCodeIdentification);
                String str6 = pixQrCodeIdentification.f80463b;
                model2 = new CellDetailsDelegate.Model("ID_DEBTOR_TYPE", textLocalisedClauseE2, new TextClause(str6 == null ? str : str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
            }
            CellDetailsDelegate.Model[] elements4 = {model6, model2};
            Intrinsics.checkNotNullParameter(elements4, "elements");
            listL2 = kotlin.collections.d.L(elements4);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
        }
        if (listL2 == null) {
            listL2 = f0.f322471a;
        }
        a0.x(listL2, arrayList);
        CellDetailsNoteDelegate.Model modelW = fVar.w(pVar.f249325m);
        if (modelW != null) {
            yp0.b.l(modelW, 0, 0, 0, 0, null, false, 63);
            arrayList.add(modelW);
        }
        if (pixQrCodeDecodeResult != null && (pixQrCodeDecodeData3 = pixQrCodeDecodeResult.f) != null && (pixQrCodeReferences = pixQrCodeDecodeData3.i) != null) {
            String str7 = pixQrCodeReferences.f80471a;
            TextClause textClause = new TextClause(str7 == null ? str : str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_transaction_id, null, null, 14);
            int i = R$attr.uikit_dp8;
            t5 t5Var = new t5("ID_TRANSACTION_IDENTIFIER", textClause, textLocalisedClause, pixQrCodeReferences, null, null, i, i, 0, 0, 1640);
            yp0.b.l(t5Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(t5Var);
        }
        try {
            Object content = data2.getContent();
            data = new Data(content != null ? ((hce.d) content).f150888a : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        hce.d dVar = (hce.d) data2.getContent();
        List listD = fVar.d(data, qVar, dVar != null ? dVar.f150889b : null);
        if (listD != null) {
            a0.x(listD, arrayList);
        }
        if (pixQrCodeDecodeResult != null && (pixQrCodeDecodeData2 = pixQrCodeDecodeResult.f) != null && (pixQrCodeBill2 = pixQrCodeDecodeData2.f80449h) != null && (pixQrCodeMoneyBreakdown = pixQrCodeBill2.i) != null) {
            i8a.b bVar2 = i8a.c.Companion;
            arrayList.addAll(((uca.d) this.e).a(pixQrCodeMoneyBreakdown, null));
        }
        if (pixQrCodeDecodeResult != null && (pixQrCodeDecodeData = pixQrCodeDecodeResult.f) != null && (pixQrCodeBill = pixQrCodeDecodeData.f80449h) != null && (list = pixQrCodeBill.f80430h) != null && (list2 = (List) ue0.e.M(list)) != null) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payment_details_additional_information, null, null, 14);
            m70.a.c(t0.f186434a);
            f6 f6Var = new f6("ID_ADDITIONAL_INFORMATION", textLocalisedClause2, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), list2, 976);
            yp0.b.l(f6Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(f6Var);
        }
        CellDetailsChevronDelegate.Model modelS = fVar.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        arrayList.add(modelS);
        CellDetailsChevronDelegate.Model modelL = fVar.l(R.string.common_action_delete);
        yp0.b.l(modelL, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        arrayList.add(modelL);
        return arrayList;
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVarC = zae.c.c(subscriptionContent);
        hce.b bVar = subscriptionContent.f150886a;
        String transactionId = pVarC.f249318c;
        if (transactionId == null) {
            return w.h(new a(bVar.f150883a, bVar.f150884b, bVar.f150885c, null));
        }
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        r rVarCombineLatest = r.combineLatest(rd0.e.c(new y(new w1(2, 27, null), new v1(new s8a.i(this.d, transactionId, null))), g.f186406a), w.h(new a(bVar.f150883a, bVar.f150884b, bVar.f150885c, null)), new u3a.q(new u4i.u(17), 29));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        boolean zI = u.i(zae.c.c(subscriptionContent), ((f) this.f278845c).g());
        dj0.d dVarB = zae.c.b(subscriptionContent);
        i9e.f fVar = (i9e.f) this.f278843a;
        MoneyClause moneyClauseU = fVar.u(dVarB, zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        p pVar = subscriptionContent.f150886a.f150883a;
        String str = pVar.k;
        if (str == null) {
            str = "";
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        Clause clauseC = u.D(pVar) ? fVar.C() : new TextLocalisedClause(R$string.recurring_payment_details_header_subtitle_one_off, null, null, 14);
        ConfigurableResourceImage configurableResourceImage = new ConfigurableResourceImage(R$drawable.uikit_icn_24_bank, null, null, null, 1022);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        return w.h(new hce.a(moneyClauseU, textClause, clauseC, new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, pVar.k, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), configurableResourceImage, (Serializable) null, 96));
    }
}
