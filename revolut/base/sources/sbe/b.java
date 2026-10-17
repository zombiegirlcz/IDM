package sbe;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import dce.k0;
import dj0.d;
import efm.r;
import fva.c;
import fva.h;
import g8a.k;
import ip0.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.joda.time.LocalDate;
import qua.p;
import qv0.i;
import s8a.f;
import te0.w;
import zhm.a0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f261586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final abe.b f261587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f261588c;
    public final e d;

    public b(a9e.b commonSubscriptionMapper, abe.b paymentFromItemMapper, f pixAutomaticoInteractor, e dateProvider) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(paymentFromItemMapper, "paymentFromItemMapper");
        Intrinsics.checkNotNullParameter(pixAutomaticoInteractor, "pixAutomaticoInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f261586a = commonSubscriptionMapper;
        this.f261587b = paymentFromItemMapper;
        this.f261588c = pixAutomaticoInteractor;
        this.d = dateProvider;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        return ((i9e.f) this.f261586a).c(f0.f322471a);
    }

    @Override // abe.a
    public final List b(Object obj2) {
        int i;
        CellDetailsDelegate.Model model;
        Data data;
        CellDetailsDelegate.Model model2;
        CellDetailsDelegate.Model model3;
        String str;
        TextLocalisedClause textLocalisedClause;
        fva.f fVar;
        fva.f fVar2;
        String str2;
        c cVar;
        String str3;
        TextLocalisedClause textLocalisedClause2;
        fva.f fVar3;
        fva.f fVar4;
        String str4;
        d dVar;
        a model4 = (a) obj2;
        Intrinsics.checkNotNullParameter(model4, "model");
        ArrayList arrayList = new ArrayList();
        p pVar = model4.f261583a;
        Data data2 = model4.f261584b;
        q qVar = model4.d;
        Data data3 = model4.f261585c;
        h hVar = pVar.E;
        i9e.f fVar5 = (i9e.f) this.f261586a;
        i iVarR = fVar5.r(pVar, false);
        p subscription = model4.f261583a;
        ibd.e eVar = subscription.f249314a;
        h hVar2 = subscription.E;
        CellDetailsDelegate.Model modelF = fVar5.F(eVar.e);
        LocalDate localDate = subscription.e;
        CellDetailsDelegate.Model model5 = null;
        i[] elements = {iVarR, modelF, localDate != null ? fVar5.p(localDate) : null, ofm.q.y(subscription) ? fVar5.v(eVar.f, subscription) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        a0.x(listL, arrayList);
        k kVar = (k) data3.getContent();
        if (kVar == null || (dVar = kVar.f141318m) == null) {
            i = 1;
            model = null;
        } else {
            i = 1;
            model = new CellDetailsDelegate.Model("ID_SINGLE_TRANSACTION_LIMIT", new TextLocalisedClause(R$string.recurring_payment_details_single_transaction_limit_title, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        i iVarA = this.f261587b.a(subscription, qVar);
        k kVar2 = (k) data3.getContent();
        CellDetailsSwitcherDelegate.Model model6 = new CellDetailsSwitcherDelegate.Model("ID_NOTIFY_ME_TAG", new TextLocalisedClause(R$string.recurring_payment_details_notify_me_before_payment_title, null, null, 14), pd.b.k(kVar2 != null ? Boolean.valueOf(kVar2.f141319n) : null), false, R$drawable.uikit_icn_16_info_outline, null, null, null, 4064);
        i[] elements2 = new i[3];
        elements2[0] = model;
        elements2[i] = iVarA;
        elements2[2] = model6;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL2 = kotlin.collections.d.L(elements2);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        a0.x(listL2, arrayList);
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        List listC = u.c(new CellDetailsNoteDelegate.Model("ID_AUTHORIZATION", new TextLocalisedClause(R$string.recurring_payment_details_authorization_title, null, null, 14), null, new TextClause(eVar.f160150a.toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        a0.x(listC, arrayList);
        try {
            Object content = data2.getContent();
            data = new Data(content != null ? ((hce.d) content).f150888a : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        hce.d dVar2 = (hce.d) data2.getContent();
        List listD = fVar5.d(data, qVar, dVar2 != null ? dVar2.f150889b : null);
        if (listD != null) {
            a0.x(listD, arrayList);
        }
        c cVar2 = hVar != null ? hVar.f138397a : null;
        CellDetailsDelegate.Model model7 = (cVar2 == null || (str4 = cVar2.f138390a) == null) ? null : new CellDetailsDelegate.Model("ID_CREDITOR_NAME", new TextLocalisedClause(R$string.recurring_payment_details_beneficiary_title, null, null, 14), new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        c cVar3 = hVar != null ? hVar.f138397a : null;
        BeneficiaryIdentificationType beneficiaryIdentificationType = (cVar3 == null || (fVar4 = cVar3.f138391b) == null) ? null : fVar4.f138395a;
        String str5 = (cVar3 == null || (fVar3 = cVar3.f138391b) == null) ? null : fVar3.f138396b;
        if (beneficiaryIdentificationType == null || str5 == null) {
            model2 = null;
        } else {
            int i2 = i9e.e.e[beneficiaryIdentificationType.ordinal()];
            if (i2 == i) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payment_details_cpf_title, null, null, 14);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payment_details_cnpj_title, null, null, 14);
            }
            model2 = new CellDetailsDelegate.Model("ID_CREDITOR_TYPE", textLocalisedClause2, new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        CellDetailsDelegate.Model[] elements3 = {model7, model2, (hVar2 == null || (cVar = hVar2.f138397a) == null || (str3 = cVar.f138392c) == null) ? null : new CellDetailsDelegate.Model("ID_INSTITUTION", new TextLocalisedClause(R$string.recurring_payment_details_institution_title, null, null, 14), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760)};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        List listL3 = kotlin.collections.d.L(elements3);
        yp0.b.k(listL3, 0, 0, 0, 0, 31);
        a0.x(listL3, arrayList);
        fva.d dVar3 = hVar != null ? hVar.f138398b : null;
        CellDetailsDelegate.Model model8 = (dVar3 == null || (str2 = dVar3.f138393a) == null) ? null : new CellDetailsDelegate.Model("ID_DEBTOR_NAME", new TextLocalisedClause(R$string.recurring_payment_details_debtor_title, null, null, 14), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        fva.d dVar4 = hVar != null ? hVar.f138398b : null;
        BeneficiaryIdentificationType beneficiaryIdentificationType2 = (dVar4 == null || (fVar2 = dVar4.f138394b) == null) ? null : fVar2.f138395a;
        String str6 = (dVar4 == null || (fVar = dVar4.f138394b) == null) ? null : fVar.f138396b;
        if (beneficiaryIdentificationType2 == null || str6 == null) {
            model3 = null;
        } else {
            int i3 = i9e.e.e[beneficiaryIdentificationType2.ordinal()];
            if (i3 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_cpf_title, null, null, 14);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_cnpj_title, null, null, 14);
            }
            model3 = new CellDetailsDelegate.Model("ID_DEBTOR_TYPE", textLocalisedClause, new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        if (hVar2 != null && (str = hVar2.d) != null) {
            model5 = new CellDetailsDelegate.Model("ID_COLLECTION_IDENTIFIER", new TextLocalisedClause(R$string.recurring_payment_details_collection_identifier_title, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        CellDetailsDelegate.Model[] elements4 = {model8, model3, model5};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        List listL4 = kotlin.collections.d.L(elements4);
        yp0.b.k(listL4, 0, 0, 0, 0, 31);
        a0.x(listL4, arrayList);
        CellDetailsChevronDelegate.Model modelS = fVar5.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        arrayList.add(modelS);
        CellDetailsChevronDelegate.Model modelL = fVar5.l(R$string.recurring_payment_details_action_cancel_pix);
        yp0.b.l(modelL, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        arrayList.add(modelL);
        return arrayList;
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        r map = rd0.e.c(this.f261588c.a(subscriptionContent.f150886a.f150883a.f249314a.f160150a), g.f186406a).map(new sa6.a(new k0(subscriptionContent, 3), 20));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        Image contactImage;
        c cVar;
        String str;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        MoneyClause moneyClauseU = ((i9e.f) this.f261586a).u(zae.c.b(subscriptionContent), qua.u.i(zae.c.c(subscriptionContent), ((l80.f) this.d).g()));
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        p pVar = subscriptionContent.f150886a.f150883a;
        String str2 = pVar.k;
        if (str2 == null) {
            str2 = "";
        }
        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_header_subtitle_pix_automatico, null, null, 14);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        h hVar = pVar.E;
        if (hVar == null || (cVar = hVar.f138397a) == null || (str = cVar.d) == null) {
            Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
            contactImage = new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, pVar.k, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        } else {
            contactImage = new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        }
        return w.h(new hce.a(moneyClauseU, textClause, textLocalisedClause, contactImage, (Image) null, (Serializable) null, 112));
    }
}
