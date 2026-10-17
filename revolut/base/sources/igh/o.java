package igh;

import android.os.Parcelable;
import au0.u0;
import au0.z0;
import aw0.c7;
import aw0.o9;
import aw0.s8;
import aw0.t0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.kg;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.x4;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardStatementDeferralQuote;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel;
import com.revolut.feature.crypto.locked.balance.api.model.CryptoBalanceBreakdown;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownDisplayMode;
import com.revolut.feature.crypto.locked.balance.impl.R$string;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import com.revolut.feature.insurance_car.impl.data.model.OptionValue;
import com.revolut.feature.insurance_car.impl.data.model.PlanOption;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.models.SpareChangeAmount;
import com.revolut.feature.rev_points.models.SpareChangeCalculation;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest2A;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest2B;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.RevPointsSpareChangeFullListStateMapper$DescriptionItem;
import com.revolut.feature.shared.savings.models.info_sheets.InfoSheet;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import com.revolut.retail.wealth.resources.R$plurals;
import com.youTransactor.uCube.rpc.Constants;
import hqg.b;
import ip0.ck0;
import ip0.l1;
import ip0.qd0;
import ip0.tm0;
import ip0.um0;
import ip0.vd0;
import ip0.xk;
import ip0.yj0;
import ip0.zj;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kl7.d1;
import kl7.f1;
import kl7.o1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yp0.e0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f161215b;

    public /* synthetic */ o(ip7.f fVar, ip7.l lVar) {
        this.f161214a = 12;
        this.f161215b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: igh.o.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        CryptoBalanceBreakdownDisplayMode cryptoBalanceBreakdownDisplayMode = (CryptoBalanceBreakdownDisplayMode) this.f161215b;
        CryptoBalanceBreakdown content = (CryptoBalanceBreakdown) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        CryptoBalanceBreakdownDisplayMode.Full full = CryptoBalanceBreakdownDisplayMode.Full.f70870a;
        if (Intrinsics.f(cryptoBalanceBreakdownDisplayMode, full)) {
            eVarB.add(ih5.d.b("LOCKED_BALANCE_TOTAL", new TextLocalisedClause(R$string.crypto_pocket_details_balance_breakdown_total_balance, null, null, 14), content.f70867a, null, 24));
        }
        dj0.d dVar = content.f70869c;
        if (dVar != null) {
            if (dVar.f115082a <= 0) {
                dVar = null;
            }
            if (dVar != null) {
                eVarB.add(ih5.d.b("LOCKED_BALANCE_UNSTAKE", new TextLocalisedClause(R$string.crypto_pocket_details_balance_breakdown_locked_earn, null, null, 14), dVar, eh5.a.LOCKED_UNSTAKE, 16));
            }
        }
        dj0.d dVar2 = content.d;
        if (dVar2 != null) {
            if (dVar2.f115082a <= 0) {
                dVar2 = null;
            }
            if (dVar2 != null) {
                eVarB.add(ih5.d.a("LOCKED_BALANCE_OPEN_ORDERS", new TextLocalisedClause(R$string.crypto_pocket_details_balance_breakdown_open_orders, null, null, 14), dVar2, eh5.a.OPEN_ORDERS, new TextLocalisedClause(R$string.crypto_pocket_details_balance_breakdown_open_orders, null, null, 14)));
            }
        }
        dj0.d dVar3 = content.e;
        if (dVar3 != null) {
            if (dVar3.f115082a <= 0) {
                dVar3 = null;
            }
            if (dVar3 != null) {
                eVarB.add(ih5.d.b("LOCKED_BALANCE_GIFT", new TextLocalisedClause(R$string.crypto_pocket_details_balance_breakdown_locked_gift, null, null, 14), dVar3, eh5.a.LOCKED_GIFT, 16));
            }
        }
        if (Intrinsics.f(cryptoBalanceBreakdownDisplayMode, full)) {
            eVarB.add(ih5.d.b("LOCKED_BALANCE_AVAILABLE", new TextLocalisedClause(R$string.crypto_pocket_details_balance_breakdown_available, null, null, 14), content.f70868b, null, 24));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        int i = R$attr.uikit_dp0;
        yp0.b.k(eVarA, i, i, 0, 0, 28);
        return eVarA;
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        Integer numValueOf;
        ij4.g gVar = (ij4.g) this.f161215b;
        List valuators = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(valuators, "valuators");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_company_outline, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62);
        List list = valuators;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : list) {
            String str = ((iy3.b) obj5).f;
            Object objO = linkedHashMap.get(str);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, str);
            }
            ((List) objO).add(obj5);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (true) {
            int i = 12;
            Style style = null;
            if (!it8.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it8.next();
            String str2 = (String) entry.getKey();
            List<iy3.b> list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (iy3.b bVar : list2) {
                RowDelegate.Model.MainImage.Image40 image402 = image40;
                ArrayList arrayList3 = arrayList;
                String str3 = bVar.f169617a;
                ArrayList arrayList4 = arrayList2;
                image40 = image402;
                arrayList4.add(new RowDelegate.Model(str3, image402, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.recommended_valuators_list_item_title, zhm.u.c(str3), style, i), null, 0, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.recommended_valuators_list_item_subtitle, zhm.u.c(bVar.f169618b), style, i), null, null, 0, null, true, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532674520));
                arrayList2 = arrayList4;
                i = i;
                arrayList = arrayList3;
                style = null;
                it8 = it8;
            }
            ArrayList arrayList5 = arrayList;
            arrayList5.add(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model(str2, (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.recommended_valuators_list_section_title, zhm.u.c(str2), null, i), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
            it8 = it8;
            arrayList = arrayList5;
        }
        ArrayList arrayListU = zhm.w.u(arrayList);
        ArrayList arrayList6 = new ArrayList(zhm.w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList6.add(((iy3.b) it9.next()).f);
        }
        Set<String> setI1 = d0.i1(arrayList6);
        ArrayList arrayList7 = new ArrayList(zhm.w.t(setI1, 10));
        for (String str4 : setI1) {
            arrayList7.add(new com.revolut.core.ui_kit.views.q(str4, new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.recommended_valuators_list_tab, zhm.u.c(str4), null, 12)), 58));
        }
        String str5 = gVar.f161701b;
        if (gVar.f161702c) {
            Iterator it10 = arrayListU.iterator();
            int i2 = 0;
            while (true) {
                if (!it10.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.f(((koi.j) it10.next()).getF55009b(), gVar.f161701b)) {
                    break;
                }
                i2++;
            }
            numValueOf = Integer.valueOf(i2);
        } else {
            numValueOf = null;
        }
        return new ij4.i(arrayListU, arrayList7, str5, numValueOf);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList;
        CellDetailsDelegate.Model modelG;
        ij6.k kVar = (ij6.k) this.f161215b;
        lk6.b bVar = kVar.f161717a;
        com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c content = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        List list = content.d.f72409a;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        int i2 = 0;
        for (Object obj5 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                zhm.v.s();
                throw null;
            }
            ArrayList arrayList3 = ((OpenBankingBrazilPayment.InfoGroup) obj5).f72405a;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, i));
            int i5 = 0;
            for (Object obj6 : arrayList3) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    zhm.v.s();
                    throw null;
                }
                OpenBankingBrazilPayment.Item item = (OpenBankingBrazilPayment.Item) obj6;
                OpenBankingBrazilPayment.EditableMoneyField editableMoneyField = item.f72408c;
                OpenBankingBrazilPayment.EditableDateField editableDateField = item.d;
                if (editableMoneyField != null) {
                    String strG = a0.d.g(i2, i5, "ID_INFO_GROUP", "_");
                    OpenBankingBrazilPayment.EditableMoneyField editableMoneyField2 = item.f72408c;
                    modelG = bVar.a(strG, editableMoneyField2.f72402a, item.f72406a, editableMoneyField2.d, editableMoneyField2);
                    arrayList = arrayList4;
                } else {
                    arrayList = arrayList4;
                    if (editableDateField != null) {
                        String listId = a0.d.g(i2, i5, "ID_INFO_GROUP", "_");
                        String editableItemId = editableDateField.f72400a;
                        String title = item.f72406a;
                        LocalDate localDate = editableDateField.f72401b;
                        Intrinsics.checkNotNullParameter(listId, "listId");
                        Intrinsics.checkNotNullParameter(editableItemId, "editableItemId");
                        Intrinsics.checkNotNullParameter(title, "title");
                        modelG = ((hj6.a) bVar.f196229a).b(listId, editableItemId, title, localDate, editableDateField);
                    } else {
                        String listId2 = a0.d.g(i2, i5, "ID_INFO_GROUP", "_");
                        String title2 = item.f72406a;
                        String endText = item.f72407b;
                        Intrinsics.checkNotNullParameter(listId2, "listId");
                        Intrinsics.checkNotNullParameter(title2, "title");
                        Intrinsics.checkNotNullParameter(endText, "endText");
                        modelG = ((hj6.a) bVar.f196229a).g(listId2, title2, endText);
                    }
                }
                arrayList.add(modelG);
                arrayList4 = arrayList;
                i5 = i6;
            }
            ArrayList arrayList5 = arrayList4;
            yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
            arrayList2.add(arrayList5);
            i2 = i3;
            i = 10;
        }
        eVarB.addAll(zhm.w.u(arrayList2));
        RowDelegate.Model model = new RowDelegate.Model("REVOKE_ITEM_LIST_ID", null, new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.consent_action_revoke, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        if (kVar.f161718b.f72542b) {
            eVarB.add(new TextDelegate.Model("FOOTER_TEXT_LIST_ID", new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_authorization_details_global_pix_limits_footer, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036));
        }
        return zhm.u.a(eVarB);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        ilb.c cVar = (ilb.c) this.f161215b;
        InfoSheet content = (InfoSheet) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayListA = cVar.f162217b.a(content.d);
        TextClause textClause = new TextClause(content.f86471b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = content.f86472c;
        return new cii.b(klb.a.a(content), arrayListA, new lw0.a(textClause, str != null ? new HtmlClause(0, 28, (Integer) null, (Object) null, str) : null, null, null, false, 28));
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        im3.h hVar = (im3.h) this.f161215b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((tr9.c) hVar.f162294b).b((PaymentGroup) it8.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r47, java.lang.Object r48, java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: igh.o.h(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        char c2;
        TextLocalisedClause textLocalisedClause;
        ip4.o oVar = (ip4.o) this.f161215b;
        ip4.e content = (ip4.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        el4.f fVar = content.f167649c;
        dj0.d dVar = fVar.f127258g;
        boolean z = fVar.f127260j;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        RowDelegate.Model model = new RowDelegate.Model("id_additional_cards_cardholder_details_monthly_spending_limit", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_card, R$attr.uikit_colorWhite, R$attr.uikit_colorAccentNeutral_10), null, ProgressStyle.Companion.c(ProgressStyle.INSTANCE, fVar.k, R$attr.uikit_colorAccent), false, null, false, 58), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_account_info_settings_monthly_spending_limit, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_account_info_settings_monthly_spending_limit_info, zhm.v.k(sx4.f.b(3, null, null, fVar.f127257c), sx4.f.b(3, null, null, fVar.f127256b)), null, 12), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, fVar, null, 0, 0, 0, 0, 532675544);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_coins_shield, R$attr.uikit_colorWhite, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_account_info_settings_single_purchase_limit, null, null, 14);
        if (dVar != null) {
            c2 = '\f';
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_account_info_settings_single_purchase_limit_description, zhm.u.c(sx4.f.b(3, null, null, dVar)), null, 12);
        } else {
            c2 = '\f';
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_account_info_settings_single_purchase_limit_disabled, null, null, 14);
        }
        List listK = zhm.v.k(model, new RowDelegate.Model("id_additional_cards_cardholder_details_single_purchase_limit", image40, textLocalisedClause2, null, 0, textLocalisedClause, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, fVar, null, 0, 0, 0, 0, 532675544), new RowDelegate.Model("id_additional_cards_cardholder_details_purchase_restriction", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_lock_closed, R$attr.uikit_colorWhite, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_account_info_settings_purchase_restrictions_title, null, null, 14), null, 0, z ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_account_info_settings_purchase_restrictions_description, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_account_info_settings_purchase_restrictions_disabled, null, null, 14), null, null, 0, new vf(z, true), false, null, false, null, null, null, null, null, null, fVar, null, 0, 0, 0, 0, 532673496));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        List<el4.b> list = content.d;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (el4.b bVar : list) {
            arrayList.add(new RowDelegate.Model(bVar.f127246a, new RowDelegate.Model.MainImage.Image40(((ia3.h) oVar.f167663a).b(bVar.d, false), null, null, false, null, false, 62), new TextClause(bVar.f127247b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(bVar.f127248c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        RowDelegate.Model model2 = new RowDelegate.Model("id_additional_cards_cardholder_details_help", null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_account_info_help_title, null, null, 14), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        RowDelegate.Model model3 = new RowDelegate.Model("id_additional_cards_cardholder_details_cancel", null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.additional_cards_cardholders_details_remove_cardholder_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model3);
        return new ip4.k(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.cardholder_account_info_subtitle_name, zhm.u.c(content.f167647a), null, 12), new ContactImage(content.f167648b, (String) null, (String) null, (String) null, (String) null, content.f167647a, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062), zhm.u.a(eVarB), 1);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        MoneyClause moneyClause;
        LayeredImage layeredImage;
        List listJ;
        ip7.f fVar = (ip7.f) this.f161215b;
        o1 priceOption = (o1) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(priceOption, "priceOption");
        Set set = fVar.f167668c;
        boolean z = fVar.d;
        f1 f1Var = fVar.f167666a;
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        Iterator it8 = set.iterator();
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            LayeredImage layeredImage2 = null;
            if (!it8.hasNext()) {
                dj0.d dVarO2 = pyd.c.O(dVarO, priceOption.f185368a);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_common_continue, null, null, 14);
                int i5 = ip7.k.f167677b[f1Var.ordinal()];
                if (i5 == 1) {
                    i = 2;
                    i2 = 1;
                    moneyClause = new MoneyClause(dVarO2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    moneyClause = new MoneyClause(pyd.c.U(dVarO2, 12L), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    i = 2;
                    i2 = 1;
                }
                Clause[] clauseArr = new Clause[i];
                clauseArr[0] = textLocalisedClause;
                clauseArr[i2] = moneyClause;
                CompositeClause compositeClause = new CompositeClause(zhm.v.k(clauseArr), new DotDividerClause((Integer) null), null, null, 12);
                ArrayList<PlanOption> arrayList = priceOption.f185369b;
                ArrayList arrayList2 = new ArrayList();
                for (PlanOption planOption : arrayList) {
                    ArrayList<OptionValue> arrayList3 = planOption.d;
                    nr7.b bVar = planOption.f75283a;
                    int i6 = ip7.k.f167676a[(arrayList3.size() == i2 ? d1.SIMPLE : d1.SELECTOR).ordinal()];
                    if (i6 == i2) {
                        OptionValue optionValue = (OptionValue) d0.K0(arrayList3);
                        boolean zContains = set.contains(optionValue);
                        String str = planOption.f75284b;
                        layeredImage = null;
                        RowDelegate.Model.MainImage.Image40 image40B = sr7.e.b(bVar, zContains, null, 14);
                        TextClause textClause = new TextClause(planOption.f75284b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        TextClause textClause2 = new TextClause(planOption.f75285c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        boolean z4 = optionValue.d;
                        List listC = zhm.u.c(new RowDelegate.Model(str, image40B, textClause, null, 0, textClause2, xl7.n.n(ip7.l.b(optionValue, f1Var, z), R$drawable.uikit_icn_24_price_tag, 0, null, null, 14), null, 0, new vf(zContains, optionValue.d), z4, null, false, z4 ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, optionValue, null, 0, 0, 0, 0, 532657048));
                        yp0.b.k(listC, 0, 0, 0, 0, 31);
                        listJ = listC;
                    } else {
                        if (i6 != i) {
                            throw new NoWhenBranchMatchedException();
                        }
                        RowDelegate.Model model = new RowDelegate.Model(planOption.f75284b, sr7.e.b(bVar, z3, layeredImage2, 15), new TextClause(planOption.f75284b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(planOption.f75285c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        for (OptionValue optionValue2 : arrayList3) {
                            String str2 = optionValue2.f75269a;
                            vd0 vd0Var = vd0.RADIO;
                            kg kgVar = kg.SMALL;
                            qd0 qd0Var = set.contains(optionValue2) ? qd0.SELECTED : qd0.UNSELECTED;
                            SelectableDelegate.b aVar = optionValue2.d ? SelectableDelegate.b.C0424b.f53319a : new SelectableDelegate.b.a(z3);
                            String str3 = optionValue2.f75269a;
                            String str4 = optionValue2.f75271c;
                            if (str4 == null) {
                                str4 = "";
                            }
                            arrayList4.add(new SelectableDelegate.Model(str2, new CellDetailsDelegate.Model(str3, new TextClause(str4, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), ip7.l.b(optionValue2, f1Var, z), null, null, false, 0, null, optionValue2, null, null, 0, null, false, null, 0, 0, 0, 0, 1048040), qd0Var, aVar, vd0Var, false, null, null, kgVar, false, 32224));
                            z3 = false;
                        }
                        listJ = ue0.e.J(model, arrayList4);
                        yp0.b.k(listJ, 0, 0, 0, 0, 31);
                        layeredImage = null;
                    }
                    zhm.a0.x(listJ, arrayList2);
                    layeredImage2 = layeredImage;
                    z3 = false;
                    i = 2;
                    i2 = 1;
                }
                return new ip7.i(compositeClause, arrayList2, true);
            }
            Object next = it8.next();
            int i21 = i3 + 1;
            if (i3 < 0) {
                zhm.v.s();
                throw null;
            }
            dVarO = i3 == 0 ? ((OptionValue) next).f75270b : pyd.c.O(dVarO, ((OptionValue) next).f75270b);
            i3 = i21;
        }
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        koi.j um0Var;
        Float f;
        iqg.g gVar = (iqg.g) this.f161215b;
        iqg.h data = (iqg.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        iqg.j jVar = data.f167840a;
        Integer num = gVar.f167839b;
        yvh.b bVar = jVar.f167842a;
        Integer numValueOf = (bVar == null || (f = bVar.i) == null) ? null : Integer.valueOf((int) f.floatValue());
        koi.j[] jVarArr = new koi.j[2];
        hqg.b.Companion.getClass();
        Integer[] numArrA = b.a.a();
        int i = 6;
        ArrayList arrayList = new ArrayList(6);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            int i5 = i3 + 1;
            int iIntValue = numArrA[i2].intValue();
            hqg.b.Companion.getClass();
            arrayList.add(new ActionsView.Item(a0.d.n("SPARE_CHANGE_MULTIPLIER_ITEM_ID", iIntValue), num != null && num.intValue() == iIntValue ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(new Integer[]{Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_spare_change_boost_x1), Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_spare_change_boost_x2), Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_spare_change_boost_x3), Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_spare_change_boost_x4), Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_spare_change_boost_x5), Integer.valueOf(com.revolut.feature.vaults.R$string.vaults_spare_change_boost_x10)}[i3].intValue(), null, null, 14), null, null, null, null, false, null, null, Integer.valueOf(iIntValue), null, 24476));
            i2++;
            i3 = i5;
            i = 6;
        }
        ip0.z zVar = new ip0.z("SPARE_CHANGE_MULTIPLIER_ITEM_ID", arrayList, null, mx0.l.FLEXBOX, 0, 0, 116);
        yp0.b.l(zVar, 0, 0, 0, 0, null, false, 63);
        jVarArr[0] = zVar;
        yvh.b bVar2 = jVar.f167843b;
        yvh.b bVar3 = jVar.f167842a;
        if (bVar2 == null || !bVar2.equals(bVar3)) {
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("SAVE_SPARE_CHANGE_BUTTON_ITEM_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_spare_change_bottom_sheet_buttons_save, null, null, 14), false, null, null, null, null, 744);
            int i6 = R$attr.uikit_dp16;
            yp0.b.p(model, i6, i6, i6, i6);
            um0Var = model;
        } else {
            um0Var = new um0("HORIZONTAL_BUTTONS_ITEM_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_spare_change_bottom_sheet_buttons_deactivate, null, null, 14), true, null, null, 48), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_spare_change_bottom_sheet_buttons_save, null, null, 14), (Intrinsics.f(numValueOf, num) || num == null) ? false : true, null, null, 48), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016);
        }
        jVarArr[1] = um0Var;
        return zhm.v.k(jVarArr);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        ej0.b bVar;
        ej0.b bVar2;
        ej0.b bVar3;
        dj0.d dVar;
        isl.m mVar = (isl.m) this.f161215b;
        isl.e orderPriceDescription = (isl.e) obj2;
        ((Boolean) obj3).getClass();
        ((isl.n) mVar.f168319p).getClass();
        Intrinsics.checkNotNullParameter(orderPriceDescription, "orderPriceDescription");
        jel.c cVar = orderPriceDescription.f168308a;
        CellDetailsDelegate.Model modelA = null;
        jel.m mVar2 = cVar instanceof jel.m ? (jel.m) cVar : null;
        rp0.t tVar = new rp0.t(new TextLocalisedQuantityClause(R$plurals.wealth_orders_bonds_header_description_unit, (Number) 1, zhm.v.k(1, new MoneyClause(orderPriceDescription.f168309b.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), (Style) null, 24), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_description, null, null, 14), null, 28);
        CellDetailsDelegate.Model modelA2 = (mVar2 == null || (dVar = mVar2.d.d) == null) ? null : isl.n.a("FACE_VALUE", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_face_value, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new isl.f(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_face_value, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_face_value_description, null, null, 14)));
        CellDetailsDelegate.Model modelA3 = (mVar2 == null || (bVar3 = mVar2.f173501g.f173479a) == null) ? null : isl.n.a("CLEAN_PRICE", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_clean_price, null, null, 14), new MoneyClause(mif.a.Q(bVar3), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new isl.f(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_clean_price, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_clean_price_description, null, null, 14)));
        CellDetailsDelegate.Model modelA4 = (mVar2 == null || (bVar2 = mVar2.f173501g.f173481c) == null) ? null : isl.n.a("ACCRUED_INTEREST", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_accrued_interest, null, null, 14), new MoneyClause(mif.a.Q(bVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new isl.f(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_accrued_interest, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_accrued_interest_description, null, null, 14)));
        if (mVar2 != null && (bVar = mVar2.f173501g.f173480b) != null) {
            modelA = isl.n.a("DIRTY_PRICE", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_dirty_price, null, null, 14), new MoneyClause(mif.a.Q(bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new isl.f(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_dirty_price, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_dirty_price_description, null, null, 14)));
        }
        CellDetailsDelegate.Model[] elements = {modelA2, modelA3, modelA4, modelA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new rp0.y(listL, tVar, rp0.l.WINDOW, null, null, null, 1016);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        iuj.b bVar = (iuj.b) this.f161215b;
        d0j.f rewardsHub = (d0j.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rewardsHub, "rewardsHub");
        ArrayList arrayList = rewardsHub.d;
        if (arrayList.isEmpty()) {
            return yp0.b.i(new FullScreenStateDelegate.Model("EMPTY_STATE_ITEM_ID", new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_home_challenges_empty_description, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_trophy, null, null, 6)), null, zj.REGULAR, false, null, null, null, 1988), iuj.b.a(), null, 0, 0, 126);
        }
        boolean z = rewardsHub.f110392b > 6;
        Float fValueOf = Float.valueOf(16.0f);
        ListSubheaderDelegate.Model modelA = iuj.b.a();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int i = 0;
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            ChallengeMediumImageCardDelegate.Model modelA2 = bVar.f168629a.a((d0j.h) obj5, i);
            yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(modelA2);
            i = i2;
        }
        int i3 = R$attr.uikit_dp0;
        int i5 = R$attr.uikit_dp4;
        qv0.i[] elements = {modelA, new xk("CHALLENGES_GRID_ID", arrayList2, 2, fValueOf, fValueOf, i3, i3, i5, i5, 63584), z ? new LargeActionButtonDelegate.Model("CHALLENGES_SEE_ALL_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_home_challenges_see_all, null, null, 14), false, null, null, null, null, 1000) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        iv4.h hVar = (iv4.h) this.f161215b;
        List transactions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        ArrayList arrayListB = hVar.f168720b.b(transactions, true);
        yp0.b.k(arrayListB, 0, 0, 0, 0, 31);
        return arrayListB;
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        iv6.h hVar = (iv6.h) this.f161215b;
        od0.i transactionsContentOptional = (od0.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionsContentOptional, "transactionsContentOptional");
        if (!transactionsContentOptional.d()) {
            return f0.f322471a;
        }
        return ((anf.k) hVar.f168757a).q(((whf.p) transactionsContentOptional.c()).f297646a, ((whf.p) transactionsContentOptional.c()).f297647b, new thf.f(false, 3));
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        ivk.p pVar = (ivk.p) this.f161215b;
        rzj.k news = (rzj.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(news, "news");
        ArrayList arrayListA = pVar.f168881b.a(d0.V0(news.f258697a, 4));
        return arrayListA.isEmpty() ? f0.f322471a : yp0.b.g(arrayListA, new ListSubheaderDelegate.Model("global-news-header-list-id", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_news_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_common_see_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) ivk.h.f168875a, (Parcelable) null, 0, 0, 0, 0, 64426), null, 0, 0, 126);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        iw4.t tVar = (iw4.t) this.f161215b;
        iw4.k content = (iw4.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        CreditCardStatementDeferralQuote creditCardStatementDeferralQuote = content.f168949c;
        List listK = zhm.v.k(new CellDetailsActionDelegate.Model("id_credit_card_statement_financing_setup_down_payment", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_down_payment, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), sx4.f.b(3, null, null, creditCardStatementDeferralQuote.f68802b), null, false, false, null, null, null, 0, 0, 0, 0, 4194276), new CellDetailsDelegate.Model("id_credit_card_statement_financing_setup_left_to_repay", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_left_to_repay, null, null, 14), sx4.f.b(3, null, null, creditCardStatementDeferralQuote.e), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        if (content.d) {
            l1 l1Var = new l1(new AppTipUIModel("id_credit_card_statement_financing_setup_minimum_repayment_info", null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_min_paid_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_min_paid_description, null, null, 14), new aw0.s(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_lightbulb, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10)), null, null, null, 994));
            yp0.b.l(l1Var, 0, 0, 0, 0, null, false, 63);
            eVarB.add(l1Var);
        }
        int i = creditCardStatementDeferralQuote.f68801a;
        List list = content.f168947a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(Integer.valueOf(((CreditCardStatementDeferralQuote) it8.next()).f68801a));
        }
        eVarB.addAll(cm4.l.a(tVar.f168960a, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_suggestions_finance_in, null, null, 14), new TextLocalisedQuantityClause(com.revolut.feature.credit.core.R$plurals.credit_card_instalment_repay_choose_future_instalments_instalments, Integer.valueOf(i), zhm.u.c(Integer.valueOf(i)), (Style) null, 24), i, arrayList, zhm.v.k(3, 6, 9, 12), 32));
        List listK2 = zhm.v.k(new CellDetailsDelegate.Model("id_credit_card_statement_financing_setup_monthly_instalment", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_monthly_instalment, null, null, 14), sx4.f.b(3, null, null, creditCardStatementDeferralQuote.k.f68810a), 0, null, null, j2.H3, null, null, false, 0, 0, 32696), new CellDetailsDelegate.Model("id_credit_card_statement_financing_setup_total_to_repay", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_total_to_repay, null, null, 14), sx4.f.b(3, null, null, creditCardStatementDeferralQuote.f68805h), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        eVarB.addAll(listK2);
        TextDelegate.Model model = new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_month_rate, zhm.u.c(creditCardStatementDeferralQuote.i), null, 12), "id_credit_card_statement_financing_setup_interest");
        yp0.b.r(model, R$attr.uikit_dp0, 0, 0, 0, 14);
        eVarB.add(model);
        return new iw4.p(zhm.u.a(eVarB), new iw4.o(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_action, null, null, 14), true), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_title, null, null, 14));
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        TextDelegate.Model model;
        com.revolut.feature.credit.card.impl.ui.statement_financing.setup.c cVar = (com.revolut.feature.credit.card.impl.ui.statement_financing.setup.c) this.f161215b;
        iw4.k content = (iw4.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        CreditCardStatementDeferralQuote creditCardStatementDeferralQuote = content.f168949c;
        ll4.u uVar = content.e;
        dj0.d dVar = new dj0.d(uVar.f196543n, uVar.f196542m);
        Long l2 = uVar.i;
        long jLongValue = l2 != null ? l2.longValue() : uVar.f196538g;
        ZoneOffset UTC = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
        CounterTextDelegate.Model modelA = CounterTextDelegate.Model.Companion.a(CounterTextDelegate.Model.INSTANCE, "id_credit_card_statement_financing_screen_amount_header", new x4(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_balance_title, zhm.u.c(com.revolut.core.ui_kit.models.j.b(c7.Companion, oc.c.H(jLongValue, UTC), new LocalDateClause$DateFormat.Month(0))), null, 12)), sx4.f.b(3, null, null, dVar), null, null, null, 0, 0, 4088);
        yp0.b.r(modelA, 0, 0, 0, 0, 15);
        eVarB.add(modelA);
        List listK = zhm.v.k(new CellDetailsActionDelegate.Model("id_credit_card_statement_financing_setup_pay_now", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_down_payment, null, null, 14), R$drawable.uikit_icn_16_info_outline, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), sx4.f.b(3, null, null, creditCardStatementDeferralQuote.f68802b), false, false, null, new CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel.DownPayment(creditCardStatementDeferralQuote.f68803c), 0, 0, 32224), new CellDetailsDelegate.Model("id_credit_card_statement_financing_setup_amount_to_finance", new t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_amount_to_finance, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), sx4.f.b(3, null, null, creditCardStatementDeferralQuote.e), null, CreditCardStatementFinancingSetupScreenContract$ItemExplainerParcel.AmountToFinance.f69769a, null, null, 0, null, false, false, null, null, 32696));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        if (content.d) {
            l1 l1Var = new l1(new AppTipUIModel("id_credit_card_statement_financing_setup_minimum_repayment_info", null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_min_paid_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_min_paid_description, null, null, 14), new aw0.s(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_lightbulb, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10)), null, null, null, 994));
            yp0.b.l(l1Var, 0, 0, 0, 0, null, false, 63);
            eVarB.add(l1Var);
        }
        int i = creditCardStatementDeferralQuote.f68801a;
        List list = content.f168947a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(Integer.valueOf(((CreditCardStatementDeferralQuote) it8.next()).f68801a));
        }
        eVarB.addAll(cm4.l.a(cVar.f69780a, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_suggestions_finance_over, null, null, 14), new TextLocalisedQuantityClause(com.revolut.feature.credit.core.R$plurals.credit_card_instalment_repay_choose_future_instalments_instalments, Integer.valueOf(i), zhm.u.c(Integer.valueOf(i)), (Style) null, 24), i, arrayList, zhm.v.k(3, 6, 9, 12), 32));
        List listC = zhm.u.c(new CellDetailsDelegate.Model("id_credit_card_statement_financing_setup_monthly_payment", new t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_monthly_payment, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, creditCardStatementDeferralQuote.k.f68810a), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_item_monthly_payment_total, zhm.u.c(sx4.f.b(3, null, null, creditCardStatementDeferralQuote.f68805h)), null, 12), null, null, null, 0, null, false, false, null, null, 30704));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        eVarB.addAll(listC);
        String str = creditCardStatementDeferralQuote.f68808m;
        if (str == null) {
            model = null;
        } else {
            TextDelegate.Model model2 = new TextDelegate.Model(0, 0, 1020, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "id_credit_card_statement_financing_disclaimer_item");
            yp0.b.r(model2, R$attr.uikit_dp0, 0, 0, 0, 14);
            model = model2;
        }
        n14.e.b(eVarB, model);
        return new iw4.p(zhm.u.a(eVarB), new iw4.o(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_review_financing_plan, null, null, 14), true), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_screen_title, null, null, 14));
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        iw6.p pVar = (iw6.p) this.f161215b;
        FreelancerCustomer customer = (FreelancerCustomer) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(customer, "customer");
        String str = customer.f73282b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        iw6.g gVar = new iw6.g(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new UserAvatarImage(new UserNamePlaceholder.Default(str2, 0), null, null, 6));
        aim.e eVarB = zhm.u.b();
        String str3 = customer.d;
        if (str3 != null) {
            eVarB.add(new CellDetailsDelegate.Model("LIST_ID_PHONE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_phone_title, null, null, 14), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        String str4 = customer.f73283c;
        if (str4 != null) {
            eVarB.add(new CellDetailsDelegate.Model("LIST_ID_EMAIL", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_email, null, null, 14), new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        String str5 = customer.e;
        if (str5 != null) {
            eVarB.add(new CellDetailsDelegate.Model("LIST_ID_VAT_NUMBER", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_number, null, null, 14), new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        Address address = customer.f;
        if (address != null) {
            eVarB.add(new CellDetailsNoteDelegate.Model("LIST_ID_ADDRESS", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_billing_address_title, null, null, 14), null, new TextClause(o51.a.a(address, ((s80.b) pVar.f168985a).a()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        e0 e0Var = e0.OUTSIDE_BOX;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        boolean zIsEmpty = eVarA.isEmpty();
        List listD = eVarA;
        if (!zIsEmpty) {
            listD = yp0.b.d(eVarA, new ListSubheaderDelegate.Model("LIST_ID_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_details, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_action_edit, null, null, 14), true, (Object) new iw6.o(customer), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898), e0Var, i, i, i2, i2);
        }
        return new iw6.k(gVar, listD);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        iwk.e eVar = (iwk.e) this.f161215b;
        StatsSection statsSection = eVar.f169182h;
        iwk.g gVar = eVar.f169183j;
        afl.a stats = (afl.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(stats, "stats");
        if (stats instanceof afl.q) {
            afl.q qVar = (afl.q) stats;
            return eVar.N(gVar.c(qVar), new iwk.i(statsSection, qVar));
        }
        if (stats instanceof afl.a0) {
            afl.a0 a0Var = (afl.a0) stats;
            return eVar.N(gVar.a(a0Var), new iwk.j(statsSection, a0Var));
        }
        if (!(stats instanceof afl.f)) {
            throw new NoWhenBranchMatchedException();
        }
        afl.f fVar = (afl.f) stats;
        return eVar.N(gVar.b(fVar), new iwk.h(statsSection, fVar));
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        ixj.b bVar = (ixj.b) this.f161215b;
        e7l.f config = (e7l.f) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(config, "config");
        String str = config.f123403x1;
        r0j.a aVar = null;
        if (str != null) {
            r0j.a[] aVarArrValues = r0j.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                r0j.a aVar2 = aVarArrValues[i];
                if (kotlin.text.a0.z(aVar2.name(), str, true)) {
                    aVar = aVar2;
                    break;
                }
                i++;
            }
        }
        bVar.getClass();
        int i2 = aVar == null ? -1 : ixj.a.f169570a[aVar.ordinal()];
        if (i2 == -1) {
            return r0j.a.TWO_BUTTONS_UI;
        }
        if (i2 == 1 || i2 == 2) {
            return aVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        j1e.b bVar = (j1e.b) this.f161215b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty()) {
            bVar.getClass();
            return j1e.b.b();
        }
        dj0.d.Companion.getClass();
        dj0.d dVar = dj0.d.e;
        int i = 0;
        dj0.d dVarO = dVar;
        for (Object obj5 : content) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarO = i == 0 ? ((c1e.a) obj5).f20460b : pyd.c.O(dVarO, ((c1e.a) obj5).f20460b);
            i = i2;
        }
        t4 t4Var = new t4(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12));
        bVar.getClass();
        return j1e.b.a(t4Var);
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        j2c.x xVar = (j2c.x) this.f161215b;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
        jte.d dVar = (jte.d) xVar.f170833a;
        Iterable iterableK = dVar.c(RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest2A.f84112c) ? zhm.v.k(new RevPointsSpareChangeFullListStateMapper$DescriptionItem(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_boost_balance_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_boost_balance_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new RevPointsSpareChangeFullListStateMapper$DescriptionItem(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_go_places_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_go_places_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_travel, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new RevPointsSpareChangeFullListStateMapper$DescriptionItem(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_switcher_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_switcher_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_switch_off, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : dVar.c(RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest2B.f84113c) ? zhm.v.k(new RevPointsSpareChangeFullListStateMapper$DescriptionItem(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_miles_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_miles_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_travel, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new RevPointsSpareChangeFullListStateMapper$DescriptionItem(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_lounges_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_lounges_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_lounges, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new RevPointsSpareChangeFullListStateMapper$DescriptionItem(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_fast_track_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_steps_fast_track_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_turbo_transfer, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : f0.f322471a;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterableK, 10));
        int i = 0;
        for (Object obj5 : iterableK) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            RevPointsSpareChangeFullListStateMapper$DescriptionItem revPointsSpareChangeFullListStateMapper$DescriptionItem = (RevPointsSpareChangeFullListStateMapper$DescriptionItem) obj5;
            arrayList.add(new RowDelegate.Model(a0.d.n("STEP_ITEM_ID_PREFIX_", i), new RowDelegate.Model.MainImage.Image24(revPointsSpareChangeFullListStateMapper$DescriptionItem.f84164c, false, false, 6), revPointsSpareChangeFullListStateMapper$DescriptionItem.f84162a, null, 0, revPointsSpareChangeFullListStateMapper$DescriptionItem.f84163b, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i = i2;
        }
        yp0.b.q(arrayList, 0, 0, 0, 0, 15);
        return arrayList;
    }

    private final Object x(Object obj2, Object obj3, Object obj4) {
        Object next;
        j2c.f fVar = (j2c.f) this.f161215b;
        SpareChangeCalculations calculations = (SpareChangeCalculations) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        Iterator it8 = calculations.f84086c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((SpareChangeCalculation) next).f84081a == fVar.f170807b.a()) {
                break;
            }
        }
        SpareChangeCalculation spareChangeCalculation = (SpareChangeCalculation) next;
        if (spareChangeCalculation == null) {
            spareChangeCalculation = (SpareChangeCalculation) d0.b0(calculations.f84086c);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_title, null, null, 14);
        int i = com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_description;
        SpareChangeAmount spareChangeAmount = calculations.f84085b;
        long j2 = spareChangeAmount.f84079a;
        xi0.a aVar = xi0.b.Companion;
        String str = spareChangeAmount.f84080b;
        aVar.getClass();
        dj0.d dVar = new dj0.d(j2, xi0.a.a(str));
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var = o9.NON_SENSITIVE;
        MoneyClause moneyClause = new MoneyClause(dVar, defaults, null, o9Var, 4);
        SpareChangeAmount spareChangeAmount2 = spareChangeCalculation.f84082b;
        RevPoints revPoints = spareChangeCalculation.f84083c;
        return new j2c.g(textLocalisedClause, new TextLocalisedClause(i, zhm.v.k(moneyClause, new MoneyClause(new dj0.d(spareChangeAmount2.f84079a, xi0.a.a(spareChangeAmount2.f84080b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4), new CompositeClause(zhm.v.k(new TextLocalisedQuantityClause(com.revolut.feature.rev_points.api.R$plurals.rev_points_day0_spare_change_description_points, Integer.valueOf(revPoints.b().setScale(0, RoundingMode.HALF_UP).intValue()), zhm.u.c(new NumberClause(revPoints.b(), null, null, null, 14)), (Style) null, 24), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_spare_change_description_learn_more, null, new Click(30, (Integer) null, (Object) null, "SPARE_CHANGE_POINTS_LEARN_MORE_ITEM_ID", false), 10)), new TextClause(". ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)), null, 12), zhm.u.c(new u0(new NavBarWithContainerBackground.ImageBackground(new CdnImage("opt_in_header", "mobile/loyalty/spare_change", null, null, null, null, Constants.TAG_FC_SPEED_MODE), (s8) null, (Color.SolidRes) null, 14), new z0(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_day0_spare_change_title, null, null, 14), false), null, null)));
    }

    private final Object y(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model model;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        j37.e eVar = (j37.e) this.f161215b;
        g37.k calendarEventsInfo = (g37.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(calendarEventsInfo, "calendarEventsInfo");
        aim.e eVarB = zhm.u.b();
        List list = calendarEventsInfo.f140217a;
        do3.n nVar = calendarEventsInfo.f140219c;
        List list2 = list;
        ListSubheaderDelegate.Model modelA = j37.e.a(!list2.isEmpty());
        ft6.w wVar = eVar.f170982a;
        eVarB.add(modelA);
        ds6.k kVar = calendarEventsInfo.f140218b;
        if (kVar.f117243a.isEmpty()) {
            FullScreenStateDelegate.Model modelA2 = wVar.a(j37.d.f170981a);
            yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(modelA2);
        } else {
            if (list2.isEmpty()) {
                RowDelegate.Model modelC = wVar.c();
                yp0.b.l(modelC, 0, 0, 0, 0, null, false, 63);
                eVarB.add(modelC);
            } else {
                ArrayList arrayListB = wVar.b(list, do3.q.y(nVar), new j1.e(22));
                yp0.b.k(arrayListB, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayListB);
            }
            for (ds6.j taxType : ds6.j.a()) {
                if (kVar.d.contains(taxType)) {
                    wi0.b countryCode = do3.q.y(nVar);
                    String strName = taxType.name();
                    Intrinsics.checkNotNullParameter(taxType, "taxType");
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    int i = i37.a.f158107a[taxType.ordinal()];
                    if (i == 1) {
                        wi0.b.Companion.getClass();
                        if (countryCode.equals(wi0.b.f297750h0)) {
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_calendar_not_set_income_es_title, null, null, 14);
                        } else if (countryCode.equals(wi0.b.f297760n0)) {
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_calendar_not_set_income_fr_title, null, null, 14);
                        } else if (countryCode.equals(wi0.b.p0)) {
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_calendar_not_set_income_gb_title, null, null, 14);
                        } else if (countryCode.equals(wi0.b.L0)) {
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_calendar_not_set_income_ie_title, null, null, 14);
                        } else {
                            if (countryCode.equals(wi0.b.T0)) {
                                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_calendar_not_set_income_it_title, null, null, 14);
                            }
                            textLocalisedClause2 = null;
                        }
                        textLocalisedClause2 = textLocalisedClause;
                    } else if (i == 2) {
                        wi0.b.Companion.getClass();
                        if (countryCode.equals(wi0.b.f297760n0)) {
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_calendar_not_set_social_security_fr_title, null, null, 14);
                            textLocalisedClause2 = textLocalisedClause;
                        }
                        textLocalisedClause2 = null;
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        wi0.b.Companion.getClass();
                        if (countryCode.equals(wi0.b.f297750h0)) {
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_calendar_not_set_vat_es_title, null, null, 14);
                        } else if (countryCode.equals(wi0.b.p0)) {
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_calendar_not_set_vat_gb_title, null, null, 14);
                        } else if (countryCode.equals(wi0.b.L0)) {
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_calendar_not_set_vat_ie_title, null, null, 14);
                        } else {
                            if (countryCode.equals(wi0.b.T0)) {
                                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_calendar_not_set_vat_it_title, null, null, 14);
                            }
                            textLocalisedClause2 = null;
                        }
                        textLocalisedClause2 = textLocalisedClause;
                    }
                    if (textLocalisedClause2 == null) {
                        model = null;
                    } else {
                        model = new RowDelegate.Model(strName, null, textLocalisedClause2, null, 0, null, null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_calendar_not_set_action_set_dates, null, null, 14), null, null, false, taxType, null, 478), false, null, false, null, null, null, null, null, null, null, new AnalyticsContext(x47.a.a(taxType)), 0, 0, 0, 0, 528479226);
                        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    }
                    if (model != null) {
                        eVarB.add(model);
                    }
                }
            }
        }
        return zhm.u.a(eVarB);
    }

    private final Object z(Object obj2, Object obj3, Object obj4) {
        j37.h hVar = (j37.h) this.f161215b;
        whf.p content = (whf.p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        List list = content.f297646a;
        if (list.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_TRANSACTIONS_EMPTY", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_payments_no_payments_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_payments_no_payments_subtitle, null, null, 14), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 52, 52, 31), (Clause) null, 190)), null, null, false, null, null, false, 0, 0, 32752);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        } else {
            aim.e eVarB2 = zhm.u.b();
            zhm.a0.x(((anf.k) hVar.f170984a).q(d0.V0(list, 3), content.f297647b, new thf.f(false, 3)), eVarB2);
            if (list.size() > 3) {
                eVarB2.add(new TextDelegate.Model("LIST_ID_TRANSACTIONS_SEE_ALL", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_hub_section_payments_see_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), true, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2032));
            }
            aim.e eVarA = zhm.u.a(eVarB2);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            eVarB.addAll(eVarA);
        }
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47, types: [com.revolut.core.ui_kit.models.Style, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v85 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v18 j4c.n, still in use, count: 5, list:
          (r14v18 j4c.n) from 0x022e: MOVE (r28v10 j4c.n) = (r14v18 j4c.n)
          (r14v18 j4c.n) from 0x01e0: MOVE (r28v12 j4c.n) = (r14v18 j4c.n)
          (r14v18 j4c.n) from 0x017f: MOVE (r28v13 j4c.n) = (r14v18 j4c.n)
          (r14v18 j4c.n) from 0x01ae: MOVE (r28v14 j4c.n) = (r14v18 j4c.n)
          (r14v18 j4c.n) from 0x0147: MOVE (r28v16 j4c.n) = (r14v18 j4c.n)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(java.lang.Object r78, java.lang.Object r79, java.lang.Object r80) {
        /*
            Method dump skipped, instruction units count: 3818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: igh.o.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ o(Object obj2, int i) {
        this.f161214a = i;
        this.f161215b = obj2;
    }

    public /* synthetic */ o(Object obj2, Object obj3, int i) {
        this.f161214a = i;
        this.f161215b = obj3;
    }
}
