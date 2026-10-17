package k8d;

import android.os.Parcelable;
import androidx.camera.core.CompositionSettings;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails;
import com.revolut.feature.trading.managed_portfolios.impl.domain.investor_update.model.InvestorUpdate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlowContract$PagerItem;
import com.revolut.retail.wealth.resources.R$string;
import dx4.a1;
import ip0.v7;
import ip0.zj;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ksk.i;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182127a;

    public /* synthetic */ t(int i) {
        this.f182127a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        jel.c details = (jel.c) obj2;
        ((Boolean) obj3).getClass();
        i.a aVar = ksk.i.Companion;
        Intrinsics.checkNotNullParameter(details, "details");
        TextClause textClause = ksk.i.f189482a;
        if (!(details instanceof jel.m)) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ABOUT_ISSUER_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.trading_bonds_issuer_widget_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_bonds_issuer_widget_name, null, null, 14);
        jel.i iVar = ((jel.m) details).e;
        String str = iVar.f173471c;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ABOUT_ISSUER_NAME", textLocalisedClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : textClause, 0, null, null, null, null, null, false, 0, 0, 32760);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_bonds_issuer_widget_country, null, null, 14);
        String str2 = iVar.f173469a;
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("ABOUT_ISSUER_COUNTRY", textLocalisedClause2, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : textClause, 0, null, null, null, null, null, false, 0, 0, 32760);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.trading_bonds_issuer_widget_industry, null, null, 14);
        String str3 = iVar.f173470b;
        List listK = v.k(model2, model3, new CellDetailsDelegate.Model("ABOUT_ISSUER_INDUSTRY", textLocalisedClause3, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : textClause, 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return i2b.a.q(model, listK);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        return new DualSurfaceProcessor((DynamicRange) obj2, (CompositionSettings) obj3, (CompositionSettings) obj4);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        l13.g content = (l13.g) obj2;
        ((Boolean) obj3).getClass();
        CdnImage cdnImage = l13.m.f191444a;
        Intrinsics.checkNotNullParameter(content, "content");
        return l13.m.b(content);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        i80.a qrCode = (i80.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        return zhm.u.c(new QRCodeDelegate.Model("LIST_ID_QR_CODE", null, new QrCodeImage(qrCode.f159408a, new QrCodeAppearance(new QrCodeAppearance.IconLayer(new QrCodeAppearance.Layer.DrawableResource(R$drawable.uikit_revolut_logo_white, 1.0f)), 23), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_qr_code_caption, null, null, 14), null, null, 0, 0, 0, 0, 65522));
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter((l2k.b) obj3, "<unused var>");
        Intrinsics.checkNotNullParameter((kq2.f) obj4, "<unused var>");
        return Unit.f186387a;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        ogd.a content = (ogd.a) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        return content;
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        v30.j content = (v30.j) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        od0.i.Companion.getClass();
        return od0.h.a(content);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        Clause compositeClause;
        WealthProtectionFeatureDetails details = (WealthProtectionFeatureDetails) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(details, "details");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_link_card_to_pocket_warning_card_spend_title, null, null, 14);
        if (details instanceof WealthProtectionFeatureDetails.Disabled) {
            compositeClause = new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_link_card_to_pocket_warning_card_spend_daily_limit_empty_description, zhm.u.c(new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_link_card_to_pocket_warning_card_spend_daily_limit, null, new Click(30, (Integer) null, (Object) null, "CARD_DAILY_LIMIT_INFO_ID", false), 10)), null, 12);
        } else {
            if (!(details instanceof WealthProtectionFeatureDetails.Enabled)) {
                throw new NoWhenBranchMatchedException();
            }
            m70.a.t(t0.f186434a);
            compositeClause = new CompositeClause(v.k(new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_link_card_to_pocket_warning_card_spend_daily_limit_description, zhm.u.c(new MoneyClause(((WealthProtectionFeatureDetails.Enabled) details).f85441b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_link_card_to_pocket_warning_card_spend_daily_limit_change_limit, null, new Click(30, (Integer) null, (Object) null, "CARD_DAILY_LIMIT_INFO_ID", false), 10)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        boolean z = false;
        return new RowDelegate.Model("SUBACCOUNT_CARD_LIMIT_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), textLocalisedClause, null, 0, compositeClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, details, null, 0, 0, 0, 0, 532674520);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r45, java.lang.Object r46, java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k8d.t.j(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        List updates = (List) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(updates, "updates");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : updates) {
            Integer numValueOf = Integer.valueOf(((InvestorUpdate) obj5).f91238b.getYear());
            Object objU = linkedHashMap.get(numValueOf);
            if (objU == null) {
                objU = v7.u(linkedHashMap, numValueOf);
            }
            ((List) objU).add(obj5);
        }
        List<Map.Entry> listP0 = d0.P0(linkedHashMap.entrySet(), new l7f.g());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (Map.Entry entry : listP0) {
            arrayList.add(new InvestorUpdateHistoryFlowContract$PagerItem.Year(((Number) entry.getKey()).intValue(), (List) entry.getValue()));
        }
        return arrayList;
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        l8k.e content = (l8k.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        do3.n nVar = content.f193003a;
        String str = content.f193004b;
        String strI = te0.w.I(nVar);
        zj zjVar = zj.SMALL;
        zjVar.c();
        List listC = zhm.u.c(new FullScreenStateDelegate.Model("PAYMENT_LINK_WIDGET_LIST_ID", new TextClause(te0.w.I(nVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.impl.R$string.payments_payment_link_request_share_description, null, null, 14), new ComplexImage.Regular(new UserAvatarImage(new UserNamePlaceholder.Default(strI, 0), null, null, 6)), zjVar, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, Integer.valueOf(R$drawable.uikit_icn_24_copy), str, false, 0, 0, 32064));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new l8k.f(listC, true);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        psg.a content = (psg.a) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        return content.f239484a;
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        vy3.b content = (vy3.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList<vy3.a> arrayList = content.f293129b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (vy3.a aVar : arrayList) {
            String str = aVar.f293125a;
            TextLocalisedClause textLocalisedClauseA = ky4.a.a(com.revolut.feature.credit.core.R$string.credit_application_loan_selection_loan_title, aVar.f293127c);
            TextLocalisedClause textLocalisedClauseA2 = ky4.a.a(com.revolut.feature.credit.core.R$string.credit_application_loan_selection_loan_description, aVar.d);
            RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(ky4.a.a(com.revolut.feature.credit.core.R$string.credit_application_loan_selection_loan_value, aVar.e), ky4.a.a(com.revolut.feature.credit.core.R$string.credit_application_loan_selection_loan_value_description, aVar.f), null, false, 124);
            a1 a1Var = aVar.f293126b;
            arrayList2.add(new RowDelegate.Model(str, a1Var != null ? new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(a1Var.c(), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62) : null, textLocalisedClauseA, null, 0, textLocalisedClauseA2, null, null, 0, bVar, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new ld4.m(ky4.a.a(com.revolut.feature.credit.core.R$string.credit_application_loan_selection_title, content.f293128a), arrayList2);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        ldc.d disclaimerContent = (ldc.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(disclaimerContent, "disclaimerContent");
        if (disclaimerContent instanceof ldc.b) {
            ldc.b bVar = (ldc.b) disclaimerContent;
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e eVar = bVar.f194056a;
            n6c.a userCompanyEntity = bVar.f194057b;
            Intrinsics.checkNotNullParameter(userCompanyEntity, "userCompanyEntity");
            int i = eVar == null ? -1 : ydc.e.f312675c[eVar.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    int i2 = ydc.e.f312674b[userCompanyEntity.ordinal()];
                    if (i2 == 1) {
                        return new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_payment_breakdown_disclaimer_uk_ltd_crypto, v.k(ydc.d.c("https://www.revolut.com/legal/terms/"), ydc.d.b("https://www.revolut.com/legal/cryptocurrency-terms/")), null, 12);
                    }
                    if (i2 == 2) {
                        return new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_payment_breakdown_disclaimer_uk_bank_crypto, v.k(ydc.d.c("https://www.revolut.com/legal/terms/"), ydc.d.b("https://www.revolut.com/legal/cryptocurrency-terms/")), null, 12);
                    }
                    if (i2 == 3) {
                        return new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_payment_breakdown_disclaimer_eea_buab_crypto, v.k(ydc.d.c("https://www.revolut.com/en-LT/legal/terms/"), ydc.d.b("https://www.revolut.com/en-LT/legal/cryptocurrency-terms/")), null, 12);
                    }
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (i == 2) {
                    int i3 = ydc.e.f312674b[userCompanyEntity.ordinal()];
                    if (i3 == 1) {
                        return new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_payment_breakdown_disclaimer_uk_ltd_commodities, v.k(ydc.d.c("https://www.revolut.com/legal/terms/"), ydc.d.a()), null, 12);
                    }
                    if (i3 == 2) {
                        return new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_payment_breakdown_disclaimer_uk_bank_commodities, v.k(ydc.d.c("https://www.revolut.com/legal/terms/"), ydc.d.a()), null, 12);
                    }
                    if (i3 == 3) {
                        return new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_payment_breakdown_disclaimer_eea_buab_commodities, v.k(ydc.d.c("https://www.revolut.com/en-LT/legal/terms/"), ydc.d.a()), null, 12);
                    }
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            if (disclaimerContent instanceof ldc.a) {
                return ((ldc.a) disclaimerContent).f194055a;
            }
            if (!(disclaimerContent instanceof ldc.c)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0b05 A[PHI: r13
      0x0b05: PHI (r13v11 int) = (r13v10 int), (r13v31 int) binds: [B:241:0x0ae4, B:251:0x0b04] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0b2c A[PHI: r13
      0x0b2c: PHI (r13v12 int) = (r13v11 int), (r13v26 int) binds: [B:252:0x0b05, B:261:0x0b2b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0bc8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0be6 A[PHI: r13
      0x0be6: PHI (r13v15 int) = (r13v14 int), (r13v19 int) binds: [B:286:0x0bc8, B:291:0x0be5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0be8  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r60, java.lang.Object r61, java.lang.Object r62) {
        /*
            Method dump skipped, instruction units count: 3504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k8d.t.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ t(Object obj2, int i) {
        this.f182127a = i;
    }
}
