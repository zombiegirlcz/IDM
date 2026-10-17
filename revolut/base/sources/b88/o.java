package b88;

import android.os.Parcelable;
import aw0.aa;
import aw0.ca;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.s8;
import aw0.t0;
import aw0.v1;
import bnh.e0;
import bnh.s;
import bnh.t;
import c55.n0;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTextProgressDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.fa;
import com.revolut.core.ui_kit.delegates.mh;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.core.ui_kit.delegates.v8;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardStatementFinancingRedesign;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentDocument;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardStatementDeferralQuote;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetTransferInfoInputData;
import com.revolut.feature.crypto.gift.asset.impl.R$string;
import com.revolut.feature.external_accounts.impl.domain.pse.model.PseInstitutions;
import com.revolut.feature.external_accounts.impl.domain.pse.model.PseProvider;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentOption;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import com.revolut.feature.shared.savings.models.product.ProductGroupOptions;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import ip0.am;
import ip0.c50;
import ip0.ej;
import ip0.f50;
import ip0.g50;
import ip0.iq;
import ip0.j50;
import ip0.qd0;
import ip0.vd0;
import ip0.z;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import mx0.v5;
import org.jmrtd.cbeff.ISO781611;
import yhm.r;
import zh9.x;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13140b;

    public /* synthetic */ o(int i, cli.j jVar, cli.n nVar) {
        this.f13139a = i;
        this.f13140b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj2, Object obj3, Object obj4) {
        bh5.c cVar = (bh5.c) this.f13140b;
        ng5.c unlockProgress = (ng5.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(unlockProgress, "unlockProgress");
        xi0.a aVar = xi0.b.Companion;
        String str = unlockProgress.f215115a;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        long j2 = unlockProgress.f215117c;
        int i = 2;
        MoneyClause moneyClause = new MoneyClause(new dj0.d(j2, bVarA), new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 13), null, null, 12);
        long j3 = unlockProgress.f215116b;
        MoneyClause moneyClause2 = new MoneyClause(new dj0.d(j3, bVarA), new MoneyClause.Format.Defaults(null, null, false, false, 13), null, null, 12);
        CellDetailsTextProgressDelegate.Model model = new CellDetailsTextProgressDelegate.Model("CRYPTO_GIFT_ASSET_TRANSFER_INFO_PROGRESS", new t0((Clause) new TextLocalisedClause(R$string.crypto_gifted_assets_pocket_details_gift_transfer_amount_title_progress, u.c(moneyClause2), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.crypto_gifted_assets_pocket_details_gift_transfer_amount_value, v.k(moneyClause, moneyClause2), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), null, new CellDetailsTextProgressDelegate.a(false, j3 <= 0 ? 0 : (int) (kotlin.ranges.f.e(j2 / j3, 0.0d, 1.0d) * ((double) 100)), i, 0 == true ? 1 : 0), 1000);
        int i2 = R$attr.uikit_dp0;
        yp0.b.l(model, i2, i2, 0, 0, null, false, 60);
        List listC = u.c(model);
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.crypto_gifted_assets_pocket_details_gift_transfer_title, null, null, 14), new TextLocalisedClause(R$string.crypto_gifted_assets_pocket_details_gift_transfer_description, u.c(new MoneyClause(new dj0.d(j3, xi0.a.a(unlockProgress.f215115a)), new MoneyClause.Format.Defaults(null, null, false, false, 13), null, null, 12)), null, 12), null, null, false, 28);
        m6 m6Var = n6.Companion;
        int i3 = R$string.crypto_gifted_assets_pocket_details_gift_transfer_buy;
        CryptoGiftAssetTransferInfoInputData cryptoGiftAssetTransferInfoInputData = cVar.f15227a;
        n6 n6VarC = m6.c(m6Var, new TextLocalisedClause(i3, u.c(new CurrencyClause(cryptoGiftAssetTransferInfoInputData.f70862a, CurrencyClause.Format.DisplayName.f57755a, null, 4)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, "CRYPTO_GIFT_ASSET_TRANSFER_INFO_BUY", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        return new r(listC, aVar2, cryptoGiftAssetTransferInfoInputData.f70863b ? new aw0.h(false, n6VarC, m6.c(m6Var, new TextLocalisedClause(R$string.crypto_gifted_assets_pocket_details_gift_transfer_send_from_another_wallet, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "CRYPTO_GIFT_ASSET_TRANSFER_INFO_SEND", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, null, 121) : new aw0.e(false, null, null, n6VarC, null, null, 55));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj2, Object obj3, Object obj4) {
        bi2.q qVar = (bi2.q) this.f13140b;
        bi2.b content = (bi2.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        v02.a aVar = qVar.f15393a;
        Object model = new ListSubheaderDelegate.Model("ITEM_ALIAS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.wero.api.R$string.wero_settings_section_alias_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        RowDelegate.Model model2 = new RowDelegate.Model("ITEM_ALIAS_NEW", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_plus, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.apm.wero.api.R$string.wero_settings_section_alias_new, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        List<Alias> list = content.f15375a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Alias alias : list) {
            AliasType aliasType = alias.f61878a;
            boolean zF = Intrinsics.f(alias.f61880c, AliasStatus.ACTIVE.f61885b);
            j12.a aVar2 = (j12.a) aVar;
            Clause[] elements = {aVar2.d(alias), zF ? new TextLocalisedClause(com.revolut.feature.apm.wero.api.R$string.wero_settings_alias_registered, null, null, 14) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            m70.a.a(kotlin.jvm.internal.t0.f186434a);
            arrayList.add(new RowDelegate.Model(j6.a.q("ITEM_ALIAS_ID_", alias.f61879b), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(aVar2.a(aliasType), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), zF ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), aVar2.c(aliasType), null, 0, new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, alias, null, 0, 0, 0, 0, 532675544));
        }
        List<RegisterAlias$Alias> list2 = content.f15376b;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (RegisterAlias$Alias registerAlias$Alias : list2) {
            AliasType aliasType2 = registerAlias$Alias.f61898a;
            j12.a aVar3 = (j12.a) aVar;
            NewBadgeContent newBadgeContent = null;
            boolean z = false;
            arrayList2.add(new RowDelegate.Model(j6.a.q("ITEM_ALIAS_ID_", registerAlias$Alias.f61899b), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(aVar3.a(aliasType2), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, z, newBadgeContent, false, 60), aVar3.c(aliasType2), null, 0, new TextClause(registerAlias$Alias.f61899b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_available_action_add, null, null, 14), 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, newBadgeContent, null, 510), false, null, false, null, null, null, null, null, null, registerAlias$Alias, null, 0, 0, 0, 0, 532675544));
        }
        aim.e eVarB = u.b();
        eVarB.add(model);
        aim.e eVarB2 = u.b();
        eVarB2.addAll(arrayList);
        eVarB2.addAll(arrayList2);
        eVarB2.add(model2);
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        return u.a(eVarB);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayListE0;
        Iterable iterable;
        TextLocalisedClause textLocalisedClause;
        bk9.f fVar = (bk9.f) this.f13140b;
        x content = (x) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        PayLaterPaymentOption payLaterPaymentOption = fVar.f16284a;
        zh9.w wVar = fVar.f16286c;
        ArrayList arrayList = content.f322362b;
        ArrayList<zh9.u> arrayList2 = new ArrayList();
        for (Object obj5 : arrayList) {
            if (payLaterPaymentOption.f78818c.contains(((zh9.u) obj5).f322349a)) {
                arrayList2.add(obj5);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (zh9.u uVar : arrayList2) {
            zh9.w wVar2 = uVar.f322349a;
            boolean z = wVar == wVar2;
            String strQ = j6.a.q("instalment_type_option_", wVar2.name());
            qd0 qd0Var = z ? qd0.SELECTED : qd0.UNSELECTED;
            vd0 vd0Var = vd0.RADIO;
            String strQ2 = j6.a.q("instalment_type_row_", wVar2.name());
            int i = bk9.k.f16294b[wVar2.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_30_days, null, null, 14);
            } else {
                if (i != 2 && i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_months, u.c(Integer.valueOf(wVar2.a())), null, 12);
            }
            arrayList3.add(new SelectableDelegate.Model(strQ, new RowDelegate.Model(strQ2, null, textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868858), qd0Var, null, vd0Var, true, null, uVar.f322349a, null, true, 31432));
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        xi0.b bVar = content.f322361a;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("how_it_works_id", new t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_select_schedule_how_it_works_title, null, null, 14), (Image) null, 0, false, 30), null, null, null, null, null, 0, null, false, false, null, null, 32760);
        int i2 = bk9.k.f16294b[wVar.ordinal()];
        if (i2 == 1) {
            arrayListE0 = d0.E0(v.k(new StreakStepVerticalDelegate.Model("timeline_item__30_days_1", new aa(new GlyphImage(R$drawable.uikit_icn_24_cards, null, null, 6)), pi9.b.a(new dj0.d(0L, bVar), null, 3), new mh(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_today, null, null, 14)), false, false, null, null, 1008), new StreakStepVerticalDelegate.Model("timeline_item__30_days_2", new ca(new GlyphImage(R$drawable.uikit_icn_24_time, null, null, 6)), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_pay_in_full, null, null, 14), new mh(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_in_thirty_days, null, null, 14)), true, false, null, null, 992)), u.c(model));
            yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
        } else {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                iterable = f0.f322471a;
                return d0.E0(iterable, arrayList3);
            }
            arrayListE0 = d0.E0(v.k(new StreakStepVerticalDelegate.Model("timeline_item__in_3_1", new aa(new GlyphImage(R$drawable.uikit_icn_24_cards, null, null, 6)), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_n_payment, u.c(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_first, null, null, 14)), null, 12), new mh(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_today, null, null, 14)), false, false, null, null, 1008), new StreakStepVerticalDelegate.Model("timeline_item__in_3_2", new ca(new GlyphImage(R$drawable.uikit_icn_24_time, null, null, 6)), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_n_payment, u.c(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_second, null, null, 14)), null, 12), new mh(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_in_one_month, null, null, 14)), false, false, null, null, 1008), new StreakStepVerticalDelegate.Model("timeline_item__in_3_3", new ca(new GlyphImage(R$drawable.uikit_icn_24_time, null, null, 6)), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_n_payment, u.c(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_third, null, null, 14)), null, 12), new mh(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_timeline_in_two_months, null, null, 14)), true, false, null, null, 992)), u.c(model));
            yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
        }
        iterable = arrayListE0;
        return d0.E0(iterable, arrayList3);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        List listN;
        bl6.g gVar = (bl6.g) this.f13140b;
        PseInstitutions bankData = (PseInstitutions) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(bankData, "bankData");
        String str = gVar.f16480b;
        if (str.length() == 0) {
            ArrayList arrayList = bankData.f72416a;
            ArrayList arrayList2 = bankData.f72417b;
            aim.e eVarB = u.b();
            if (!arrayList.isEmpty()) {
                eVarB.addAll(bl6.m.d(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_net_banking_selection_popular, "LIST_ID_POPULAR_BANK_SUBHEADER", arrayList));
            }
            if (!arrayList2.isEmpty()) {
                eVarB.addAll(bl6.m.d(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_net_banking_selection_all_banks, "LIST_ID_OTHER_BANK_SUBHEADER", arrayList2));
            }
            listN = c6d.b.N(u.a(eVarB));
        } else {
            ArrayList arrayListA = bl6.m.a(str, bankData.f72416a);
            ArrayList arrayList3 = new ArrayList(w.t(arrayListA, 10));
            Iterator it8 = arrayListA.iterator();
            while (it8.hasNext()) {
                arrayList3.add(bl6.m.b((PseProvider) it8.next()));
            }
            ArrayList arrayListA2 = bl6.m.a(str, bankData.f72417b);
            ArrayList arrayList4 = new ArrayList(w.t(arrayListA2, 10));
            Iterator it9 = arrayListA2.iterator();
            while (it9.hasNext()) {
                arrayList4.add(bl6.m.b((PseProvider) it9.next()));
            }
            aim.e eVarB2 = u.b();
            eVarB2.addAll(arrayList3);
            eVarB2.addAll(arrayList4);
            aim.e eVarA = u.a(eVarB2);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            listN = c6d.b.N(eVarA);
        }
        if (listN != null) {
            return listN;
        }
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_EMPTY_SEARCH", new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_net_banking_selection_no_results_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_net_banking_selection_no_results_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_binoculars, null, null, 6)), null, zj.REGULAR, false, null, null, null, 1856);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        u8 u8Var;
        ArrayList arrayList;
        bmb.w wVar = (bmb.w) this.f13140b;
        bmb.m screenContent = (bmb.m) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        ProductGroupOptions productGroupOptions = screenContent.f16794a;
        bmb.c cVar = screenContent.f16795b;
        if (cVar != null) {
            u8 u8Var2 = new u8("SAVINGS_CHALLENGE_OPTION_LIST_ID", v04.b.Q(new TextClause(cVar.f16785a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), com.revolut.feature.retail.savings.api.R$string.savings_onboarding_product_selection), new TextClause(cVar.f16786b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new CdnImage("banner", "mobile/savings/challenge/onboarding/entrypoint", null, null, null, null, Constants.TAG_FC_SPEED_MODE), null, new v8(new TagViewData(null, pbd.a.a(wVar.f16809a, cVar.f16787c, new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), 4), new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorBlack)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorBlack), false, null, null, null, 0, null, 2024)), null, v1.DARK, null, false, false, false, bmb.j.f16792a, 64936);
            yp0.b.l(u8Var2, 0, 0, 0, 0, null, false, 63);
            u8Var = u8Var2;
        } else {
            u8Var = null;
        }
        List list = productGroupOptions.e;
        if (list != null) {
            arrayList = new ArrayList();
            int i = 0;
            for (Object obj5 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                ProductGroupOptions.GroupSection groupSection = (ProductGroupOptions.GroupSection) obj5;
                String str = groupSection.f86604a;
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                for (Object obj6 : groupSection.f86605b) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        v.s();
                        throw null;
                    }
                    RowDelegate.Model modelA = wVar.a((ProductGroupOptions.GroupOption) obj6);
                    if (i3 != 0 || str == null) {
                        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                        arrayList2.add(modelA);
                    } else {
                        arrayList2.addAll(yp0.b.i(modelA, new ListSubheaderDelegate.Model(a0.d.n("SUBHEADER_LIST_ID_", i), (Image) null, (Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                    }
                    i3 = i5;
                }
                a0.x(arrayList2, arrayList);
                i = i2;
            }
        } else {
            List<ProductGroupOptions.GroupOption> list2 = productGroupOptions.d;
            arrayList = new ArrayList();
            for (ProductGroupOptions.GroupOption groupOption : list2) {
                a0.x(yp0.b.i(wVar.a(groupOption), new ListSubheaderDelegate.Model("SUBHEADER_LIST_ID", (Image) null, (Clause) new TextClause(groupOption.f86598b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList);
            }
        }
        String str2 = productGroupOptions.f86596c;
        List listP = i2b.a.p(i2b.a.q(u8Var, arrayList), str2 != null ? new ej("SAVINGS_OPTION_SELECTION_DISCLAIMER_LIST_ID", new c7(new HtmlClause(0, 30, (Integer) null, (Object) null, str2), false, null, 6)) : null);
        TextLocalisedClause textLocalisedClauseQ = v04.b.Q(new TextClause(productGroupOptions.f86594a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), com.revolut.feature.retail.savings.api.R$string.savings_onboarding_product_option_selection);
        String str3 = productGroupOptions.f86595b;
        return new bmb.r(listP, new bmb.n(textLocalisedClauseQ, str3 != null ? new HtmlClause(0, 30, (Integer) null, (Object) null, str3) : null));
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        bnh.c cVar = ((e0) this.f13140b).f17180a;
        bnh.v contentState = (bnh.v) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        if (contentState instanceof bnh.r) {
            return yp0.b.g(u.c(new HeroBannerDelegate.Model("strategies-promo-banner", (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_strategies_promo_banner_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_strategies_promo_banner_description, null, null, 14), (Media) new CdnImage("wnt_strategies_s4u", "mobile/trading/invest", null, null, null, null, Constants.TAG_FC_SPEED_MODE), (HeroBannerDelegate.b) null, false, am.AUTO, (Object) null, (AnalyticsContext) null, 1872)), e0.a(), null, 0, 0, 126);
        }
        if (contentState instanceof s) {
            return yp0.b.g(u.c(new ActionWidgetDelegate.Model("NOT_ONBOARDED_ACTION_WIDGET_DELEGATE_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_getting_started_widget_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_getting_started_widget_description, null, null, 14), new com.revolut.core.ui_kit.delegates.m(new GlyphImage(R$drawable.uikit_icn_24_revolut, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), ActionWidgetDelegate.Model.b.C0394b.f51606a, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_getting_started_widget_action, null, null, 14), null, false), com.revolut.core.ui_kit.delegates.q.REGULAR, null, null, false, 8064)), e0.a(), null, 0, 0, 126);
        }
        if (contentState instanceof bnh.u) {
            bnh.u uVar = (bnh.u) contentState;
            ArrayList arrayListB = cVar.b(new Data(new bnh.g(uVar.f17217a, uVar.f17218b), null, false, 6, null), null, false);
            return arrayListB.isEmpty() ? f0.f322471a : yp0.b.g(arrayListB, e0.a(), null, 0, 0, 126);
        }
        if (!(contentState instanceof t)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayListB2 = cVar.b(new Data(new bnh.f(((t) contentState).f17216a), null, false, 6, null), null, false);
        return arrayListB2.isEmpty() ? f0.f322471a : yp0.b.g(arrayListB2, e0.a(), null, 0, 0, 126);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object h(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r54v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: Removed duplicated region for block: B:185:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r51, java.lang.Object r52, java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 1942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b88.o.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b88.o.j(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj2, Object obj3, Object obj4) {
        z zVar;
        bt9.d dVar = (bt9.d) this.f13140b;
        bt9.k content = (bt9.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        oq9.i bill = content.f18466b;
        PaymentGroup group = content.f18465a;
        do3.n user = content.f18467c;
        if (content.d) {
            mx0.d dVar2 = mx0.d.SEMIACCENT;
            ActionsView.Item[] elements = {new ActionsView.Item("ITEM_ID_ACTIONS_BILL_REMOVE", dVar2, false, null, null, new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_bill_action_remove, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, bt9.b.REMOVE, null, 24476), new ActionsView.Item("ITEM_ID_ACTIONS_BILL_EDIT", dVar2, false, null, null, new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_bill_action_edit, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, 0 == true ? 1 : 0, null, bt9.b.EDIT, null, 24476)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            zVar = new z("ITEM_ID_ACTIONS", kotlin.collections.d.L(elements), null, mx0.l.NON_SCROLLABLE, 0, 0, 116);
        } else {
            zVar = null;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ITEM_ID_MEMBERS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_bill_members_title, u.c(Integer.valueOf(bill.k().size())), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        ArrayList arrayListA = ((tr9.i) dVar.f18460b).a(bill.k(), bill.h(), user, false);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        List listQ = i2b.a.q(model, arrayListA);
        bt9.a aVar = dVar.f18461c;
        Intrinsics.checkNotNullParameter(bill, "bill");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(user, "user");
        List listC = aVar.f18457a.c(new w0a.e(bill.i(), aVar.f18458b.a(group, bill.f()), (bill.i() == null || !oi0.d.G(bill.h(), user)) ? null : new ItemizationReceiptDeletionData.GroupBill(bill.e(), bill.getId())));
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("ITEM_ID_ISSUE_REPORT", new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_bill_report_issue, null, null, 14), 0, true, "ITEM_ID_ISSUE_REPORT", null, null, 2020);
        yp0.b.l(model2, R$attr.uikit_dp24, 0, 0, 0, null, false, 62);
        aim.e eVarB = u.b();
        if (zVar != null) {
            eVarB.add(zVar);
        }
        eVarB.addAll(listQ);
        eVarB.addAll(listC);
        eVarB.add(model2);
        aim.e eVarA = u.a(eVarB);
        oq9.i iVar = content.f18466b;
        tr9.b bVar = (tr9.b) dVar.f18459a;
        return new bt9.n(eVarA, new bt9.l(bVar.b(iVar), bVar.a(iVar, user), new MoneyClause(iVar.a().l(), new MoneyClause.Format.Headers(null, null, null, false, false, 31), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), new TimeClause(iVar.b().getMillis(), new TimeClause.Format.Pretty(0), null, null, 12), new TextClause(iVar.getTitle(), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)));
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        btl.f fVar = (btl.f) this.f13140b;
        hdh.e actions = (hdh.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new btl.e(fVar.f18652a.a(actions));
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        bv4.j jVar = (bv4.j) this.f13140b;
        List settings = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        List<ul4.a> list = settings;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ul4.a aVar : list) {
            if (aVar == null) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z = false;
            arrayList.add(new RowDelegate.Model("id_credit_card_settings_repayment_preference", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar_date, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_settings_item_statement_due_date_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_settings_item_statement_due_date_subtitle, u.c(new TextClause(jVar.f18967a.a("{0,ordinal}", Integer.valueOf(aVar.f280883a)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, bv4.f.f18962a, null, 0, 0, 0, 0, 532675544));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new bv4.g(arrayList);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        List list;
        bw4.v vVar = (bw4.v) this.f13140b;
        bw4.e content = (bw4.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        CreditCardStatementDeferralQuote creditCardStatementDeferralQuote = content.f19222a;
        vt4.d dVar = content.f19224c;
        aim.e eVarB2 = u.b();
        dj0.d dVar2 = creditCardStatementDeferralQuote.f68802b;
        int i = creditCardStatementDeferralQuote.f68801a;
        CreditCardStatementDeferralQuote.ScheduleExcerpt scheduleExcerpt = creditCardStatementDeferralQuote.k;
        eVarB2.add(new ProgressStepVerticalV2Delegate.Model("id_credit_card_statement_financing_down_payment", sx4.f.b(3, null, null, dVar2), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_section_schedule_down_payment, null, null, 14), new f50(j50.NORMAL, c50.FIRST, false), false, null, R$attr.uikit_dp12, 0, 0, null, false, false, 32624));
        gte.a aVar = vVar.f19240a;
        CreditCardApi$Toggles$CreditCardStatementFinancingRedesign creditCardApi$Toggles$CreditCardStatementFinancingRedesign = CreditCardApi$Toggles$CreditCardStatementFinancingRedesign.f68687c;
        jte.d dVar3 = (jte.d) aVar;
        if (dVar3.c(creditCardApi$Toggles$CreditCardStatementFinancingRedesign)) {
            eVarB2.add(new ProgressStepVerticalV2Delegate.Model("id_credit_card_statement_financing_first_and_last_instalment", new TextLocalisedQuantityClause(R$plurals.credit_card_statement_financing_confirmation_section_schedule_months, Integer.valueOf(i), v.k(sx4.f.b(3, null, null, scheduleExcerpt.f68810a), Integer.valueOf(i)), (Style) null, 24), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_section_schedule_first_due_last_due, v.k(sx4.g.b(scheduleExcerpt.f68812c, null), sx4.g.b(scheduleExcerpt.d, null)), null, 12), new g50(c50.LAST), false, null, 0, 0, 0, null, false, false, 32752));
        } else {
            eVarB2.add(new ProgressStepVerticalV2Delegate.Model("id_credit_card_statement_financing_first_instalment", new TextLocalisedQuantityClause(R$plurals.credit_card_statement_financing_confirmation_section_schedule_months, Integer.valueOf(i), v.k(sx4.f.b(3, null, null, scheduleExcerpt.f68810a), Integer.valueOf(i)), (Style) null, 24), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_section_schedule_first_instalment, u.c(sx4.g.b(scheduleExcerpt.f68812c, null)), null, 12), new g50(c50.LAST), false, null, 0, 0, 0, null, false, false, 32752));
        }
        eVarB.addAll(yp0.b.g(u.a(eVarB2), new ListSubheaderDelegate.Model("id_credit_card_statement_financing_schedule_title", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_section_schedule_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        CreditCardStatementDeferralQuote creditCardStatementDeferralQuote2 = content.f19222a;
        List list2 = creditCardStatementDeferralQuote2.f68807l;
        eVarB.addAll((!dVar3.c(creditCardApi$Toggles$CreditCardStatementFinancingRedesign) || (list = list2) == null || list.isEmpty()) ? yp0.b.g(v.k(new CellDetailsDelegate.Model("id_credit_card_statement_financing_summary_total_to_repay", new t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_section_summary_total_repay, null, null, 14), (Image) bw4.v.a(vVar), 0, false, 28), sx4.f.b(3, null, null, creditCardStatementDeferralQuote2.f68805h), null, null, null, null, 0, null, false, true, null, null, 28664), new CellDetailsDelegate.Model("id_credit_card_statement_financing_summary_interest_rate", new t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_section_summary_interest_rate, null, null, 14), (Image) bw4.v.a(vVar), 0, false, 28), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_section_summary_month_rate, u.c(new TextClause(creditCardStatementDeferralQuote2.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, null, null, 0, null, false, true, null, null, 28664), new CellDetailsDelegate.Model("id_credit_card_statement_financing_summary_total_cost", new t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_section_summary_total_cost, null, null, 14), (Image) bw4.v.a(vVar), 0, false, 28), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_section_summary_year_rate, u.c(new TextClause(creditCardStatementDeferralQuote2.f68806j, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, null, null, 0, null, false, true, null, null, 28664)), bw4.v.b(), null, 0, 0, 126) : yp0.b.g(vVar.f19241b.h("ID_SECTION_PLAN_SUMMARY", list2), bw4.v.b(), null, 0, 0, 126));
        List<CreditCardInstalmentDocument> list3 = content.d;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (CreditCardInstalmentDocument document : list3) {
            Intrinsics.checkNotNullParameter(document, "document");
            arrayList.add(gs4.l.a(document.f68799a));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        eVarB.addAll(yp0.b.i(vt4.e.a(dVar), new ListSubheaderDelegate.Model("id_credit_card_statement_financing_payment_from_title", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_section_from_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        return new bw4.p(u.a(eVarB), new bw4.l(dVar.f291902b ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_action_add_money, null, null, 14) : dVar3.c(CreditCardApi$Toggles$CreditCardStatementFinancingRedesign.f68687c) ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_action_confirm_plan, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_confirmation_action_confirm, u.c(sx4.f.b(3, null, null, content.f19223b)), null, 12)));
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        bw6.g gVar = (bw6.g) this.f13140b;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((FreelancerInvoice) obj2, "<unused var>");
        String str = gVar.f19247c;
        boolean z = gVar.f19246b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_optional, null, null, 14);
        InputTextDelegate.Model model = new InputTextDelegate.Model("ID_ITEM_INPUT_NOTES", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_note_input_note_title, null, null, 14), textLocalisedClause, null, null, false, null, false, false, 0, false, 0, false, false, true, null, false, false, 0, false, false, null, -1090519180, 131071);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        InputChecklistDelegate.Model model2 = new InputChecklistDelegate.Model("ID_ITEM_CHECKBOX_DEFAULT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_note_input_make_default_title, null, null, 14), z, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new bw6.i(v.k(model, model2));
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        bx5.i iVar = (bx5.i) this.f13140b;
        xzg.k collection = (xzg.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(collection, "collection");
        xzg.d dVarC = collection.c();
        f01.c cVar = iVar.f19491a;
        String str = dVarC.f309979g;
        if (str == null) {
            str = "";
        }
        int iA = cVar.a(str);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        Integer numValueOf = Integer.valueOf(iA);
        if (iA == 0) {
            numValueOf = null;
        }
        return companion.i(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_apps, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        aim.e eVarA;
        bx6.k kVar = (bx6.k) this.f13140b;
        bx6.f shopifyData = (bx6.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(shopifyData, "shopifyData");
        int i = 6;
        if (shopifyData.f19496a) {
            List list = shopifyData.f19497b;
            l71.d dVar = shopifyData.f19498c;
            aim.e eVarB = u.b();
            boolean z = false;
            boolean z3 = false;
            boolean z4 = false;
            List listK = v.k(new RowDelegate.Model("LIST_ID_REVOLUT_PAY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_secure_seal, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_manage_items_revolut_pay_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_manage_items_revolut_pay_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("LIST_ID_CARD_PAYMENT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, i), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_manage_items_card_payment_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_manage_items_card_payment_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("LIST_ID_SHOPIFY_REFUND", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_refresh, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, i), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_manage_items_refunds_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_manage_items_refunds_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            eVarB.addAll(listK);
            List<as6.b> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (as6.b bVar : list2) {
                arrayList.add(kVar.f19506a.a(bVar.f8797a, w.u(bVar.f8798b)));
            }
            eVarB.addAll(yp0.b.g(w.u(arrayList), new ListSubheaderDelegate.Model("LIST_ID_FEE_SUB_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_manage_processing_fees_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
            if (!list.isEmpty() && l71.f.g(dVar)) {
                eVarB.add(new TextDelegate.Model("LIST_ID_PT_FEE_FOOTER", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_processing_fees_disclaimer_additional_taxes, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
            }
            eVarA = u.a(eVarB);
        } else {
            aim.e eVarB2 = u.b();
            PlainTextDelegate.Model model = new PlainTextDelegate.Model("LIST_ID_HOW_IT_WORKS", (UrlImage) null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_how_does_it_work_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_how_does_it_work_description, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(model);
            eVarB2.addAll(yp0.b.g(v.k(bx6.k.a(1, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_how_to_install_step_access_store, null, null, 14), "LIST_ID_ACCESS_SHOPIFY"), bx6.k.a(2, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_how_to_install_step_click_install, null, null, 14), "LIST_ID_CLICK_INSTALL"), bx6.k.a(3, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_how_to_install_step_inform_url, null, null, 14), "LIST_ID_SHOPIFY_URL"), bx6.k.a(4, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_how_to_install_step_install_plugin, null, null, 14), "LIST_ID_INSTALL_PLUGIN"), bx6.k.a(5, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_how_to_install_step_log_in, null, null, 14), "LIST_ID_LOGIN_REVOLUT"), bx6.k.a(6, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_how_to_install_step_authorise_integration, null, null, 14), "LIST_ID_AUTHORISE")), new ListSubheaderDelegate.Model("LIST_ID_TUTORIAL_SUB_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_how_to_install_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
            eVarA = u.a(eVarB2);
        }
        return new bx6.g(eVarA, new xw6.b(new com.revolut.core.ui_kit.views.navbar.z("LIST_ID_SHOPIFY_HEADER_STORY", new NavBarWithContainerBackground.ImageBackground(new CdnImage("background", "mobile/freelancer/e_commerce/shopify", null, null, null, null, Constants.TAG_FC_SPEED_MODE), s8.MULTICOLOR, (Color.SolidRes) null, 12), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_manage_header_title, null, null, 14), null, 56)), shopifyData.f19496a ? new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_manage_action_manage_on_shopify, null, null, 14) : new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_action_go_to_shopify, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_terms_template, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_terms_action, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "LIST_ID_FREELANCER_TERMS_CLICKABLE_PART", false), 10)), null, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r50, java.lang.Object r51, java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b88.o.r(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, java.util.Map] */
    private final Object s(Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        by6.g gVar = (by6.g) this.f13140b;
        by6.f invoiceInfo = (by6.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(invoiceInfo, "invoiceInfo");
        Set set = gVar.f19747a;
        aim.e eVarB = u.b();
        Set set2 = invoiceInfo.f19744a;
        Set set3 = invoiceInfo.f19745b;
        if (!set2.isEmpty()) {
            eVarB.add(new ListSubheaderDelegate.Model("LIST_ID_INVOICE_PAYMENT_METHOD_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_payment_method_setup_section_payment_types_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        }
        Set set4 = invoiceInfo.f19744a;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : set4) {
            if (((sr6.i) obj5) != sr6.i.UNKNOWN) {
                arrayList.add(obj5);
            }
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        List<sr6.i> listP0 = d0.P0(arrayList, new yv6.b());
        ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
        for (sr6.i paymentMethod : listP0) {
            String str = "LIST_ID_INVOICE_PAYMENT_METHOD_" + paymentMethod.name();
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            int[] iArr = ey6.a.f130581a;
            switch (iArr[paymentMethod.ordinal()]) {
                case 1:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_payment_method_revolut_pay_title;
                    break;
                case 2:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_payment_method_card_title;
                    break;
                case 3:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_payment_method_bank_transfer_title;
                    break;
                case 4:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_payment_method_open_banking_title;
                    break;
                case 5:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_payment_method_click_to_pay_title;
                    break;
                case 6:
                    throw new IllegalArgumentException("Unknown invoice payment method.");
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            switch (iArr[paymentMethod.ordinal()]) {
                case 1:
                    i2 = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_payment_method_revolut_pay_subtitle;
                    break;
                case 2:
                    i2 = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_payment_method_card_subtitle;
                    break;
                case 3:
                    i2 = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_payment_method_bank_transfer_subtitle;
                    break;
                case 4:
                    i2 = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_payment_method_open_banking_subtitle;
                    break;
                case 5:
                    i2 = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_payment_method_click_to_pay_subtitle;
                    break;
                case 6:
                    throw new IllegalArgumentException("Unknown invoice payment method.");
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
            Object obj6 = by6.n.f19759a;
            Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
            sr6.i iVar = (sr6.i) by6.n.f19759a.get(paymentMethod);
            arrayList2.add(new RowDelegate.Model(str, null, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new vf(set.contains(paymentMethod) && (iVar != null ? set.contains(iVar) : true) && set3.contains(paymentMethod), true), false, null, false, set3.contains(paymentMethod) ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, paymentMethod, null, 0, 0, 0, 0, 532657114));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList2);
        return u.a(eVarB);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        byi.l lVar = (byi.l) this.f13140b;
        r rVar = (r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        svi.k kVar = (svi.k) rVar.f314201a;
        fa faVar = new fa("ID_ITEM_PASS_CARD", lVar.a(), null, lVar.f19840b.invoke((fyi.e) rVar.f314202b), dyi.a.a((do3.n) rVar.f314203c, kVar));
        yp0.b.l(faVar, 0, 0, 0, 0, null, false, 63);
        return u.c(faVar);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        c2f.o oVar = (c2f.o) this.f13140b;
        u2f.d agent = (u2f.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(agent, "agent");
        List listC = u.c(new CellDetailsDelegate.Model("TAX_ID_ITEM_ID", new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_airline_details_account_linking_tax_id_label, null, null, 14), new TextClause(oVar.f20781a.f91134a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        String str = agent.d;
        return new c2f.i(listC, new lw0.a(new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_airline_details_account_linking_tax_id_title, u.c(str), null, 12), new CompositeClause(v.k(new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_airline_details_account_linking_tax_id_description, v.k(str, str), null, 12), new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_airline_details_account_linking_tax_id_sign_up, null, new Click(30, (Integer) null, (Object) null, "SIGN_UP_TEXT_CLICK_ID", false), 10)), new TextClause(m70.a.o(kotlin.jvm.internal.t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new lw0.b(new UrlImage(agent.f276624m.e, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), null), null, false, 24));
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        c75.h hVar = (c75.h) this.f13140b;
        List loans = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(loans, "loans");
        List<Loan> list = loans;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Loan loan : list) {
            String strQ = j6.a.q("loan_product_item:", loan.f70108a);
            n0 n0Var = (n0) hVar.f21883a;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(n0Var.h(loan.o), n0Var.a(loan), null, false, null, false, 60);
            Clause clauseF = sx4.g.f(n0Var.c(loan), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254));
            MoneyClause moneyClauseB = n0Var.b(loan, true);
            Custom custom = loan.i instanceof LoanState.Repaid ? new Custom(Integer.valueOf(R$attr.uikit_colorGrey50_60), false, null, false, null, 254) : new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
            TextLocalisedClause textLocalisedClauseG = n0Var.g(loan);
            arrayList.add(new RowDelegate.Model(strQ, image40, clauseF, null, 0, sx4.g.f(n0Var.i(loan), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254)), null, null, 0, new RowDelegate.Model.c.b(moneyClauseB, textLocalisedClauseG != null ? sx4.g.f(textLocalisedClauseG, custom) : null, null, false, 124), false, null, false, null, null, null, null, null, null, loan, null, 0, 0, 0, 0, 532675544));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp24, 0, 0, 29);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08ae A[LOOP:7: B:225:0x08a8->B:227:0x08ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0981 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0e05  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0e0a  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0e0f  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0e12  */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7, types: [ip0.qg] */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9, types: [ip0.vg] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5, types: [ip0.sg] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4, types: [com.revolut.feature.rev_points.models.RevPoints] */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r4v26, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v10, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r59, java.lang.Object r60, java.lang.Object r61) {
        /*
            Method dump skipped, instruction units count: 3902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b88.o.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ o(Object obj2, int i) {
        this.f13139a = i;
        this.f13140b = obj2;
    }
}
