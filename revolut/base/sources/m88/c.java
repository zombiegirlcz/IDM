package m88;

import android.os.Parcelable;
import aw0.ka;
import aw0.o9;
import aw0.r2;
import aw0.t0;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.Creditor;
import com.revolut.feature.apm.core.models.payments_authorisations.DeactivationReason;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentAuthorisationState;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.bank_transfer.models.PaymentVendorCorridor;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingTicket;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionControllerContract$InputData;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.expansion.ExpansionFieldDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.common.mapper.backend_fields.input.LocaleExtraData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$ExpansionDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.RecurringBuySettings;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$Parcel$BalanceBreakdown;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$Parcel$FaqParcel;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.workflow.engine.api.WorkflowEngineApi$Toggles$AlternativeDocuments;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.AlternativeDocumentGroups;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.AlternativeDocumentSection;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ApplicableDocuments;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import com.youTransactor.uCube.rpc.Constants;
import d9.e1;
import do3.n;
import fnc.s;
import g9j.x;
import h30.q;
import ip0.ae0;
import ip0.an0;
import ip0.bk0;
import ip0.ck0;
import ip0.cn0;
import ip0.l1;
import ip0.l70;
import ip0.xh0;
import ip0.y10;
import ip0.yj0;
import ip0.zj;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.text.d0;
import m98.k;
import m9j.i;
import m9j.j;
import m9j.r;
import mg2.m;
import mhd.o;
import mk5.a0;
import mk5.c0;
import mk5.l;
import mk5.p;
import ms0.h4;
import mx0.d7;
import n1g.t;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import q35.e0;
import qv0.c;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f203449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f203450c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f203448a = i;
        this.f203449b = obj2;
        this.f203450c = obj3;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        aim.e eVar;
        CellDetailsDelegate.Model model;
        HeaderDelegate.Model model2;
        Clause rateClause;
        List listO;
        CellDetailsSwitcherDelegate.Model model3;
        List listB;
        BigDecimal bigDecimal;
        Address address;
        r rVar = (r) this.f203449b;
        m9j.h hVar = (m9j.h) this.f203450c;
        i holdingDetails = (i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(holdingDetails, "holdingDetails");
        StakingProduct stakingProduct = hVar.f203802b;
        Boolean bool = hVar.f203803c;
        boolean z = hVar.e;
        n nVar = hVar.f203804g;
        Data data = hVar.i;
        dj0.d dVar = data != null ? (dj0.d) data.getContent() : null;
        TextClause textClause = r.f;
        io3.g gVar = holdingDetails.f203806a;
        ej0.b bVar = holdingDetails.f203807b;
        ej0.b bVar2 = holdingDetails.f203808c;
        x xVarA = yoj.b.A(gVar, dVar, new k(holdingDetails, 2));
        dj0.d dVar2 = xVarA.f141952c;
        io3.d dVar3 = gVar.f163163a;
        aim.e eVarB = u.b();
        Clause rateClause2 = textClause;
        HeaderDelegate.Model model4 = new HeaderDelegate.Model("TOTAL_BALANCE_SECTION_LIST_ITEM_ID", null, new r2(g9j.a.a(xVarA), null), new TextLocalisedClause(R$string.crypto_asset_details_section_investment_total_value, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, false, null, false, false, 125904);
        model4.f52412x = R$attr.uikit_dp12;
        CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model("BALANCE_CELL_DETAILS_LIST_ID", new TextLocalisedClause(R$string.crypto_asset_details_currency_account_value_balance, null, null, 14), new MoneyClause(xVarA.f141950a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        if (Intrinsics.f(xVarA.f141950a, dVar2)) {
            eVar = eVarB;
            model = null;
        } else {
            eVar = eVarB;
            model = new CellDetailsDelegate.Model("AVAILABLE_CELL_DETAILS_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.wealthcore_pocket_details_available_balance, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8), null, CryptoHoldingScreenContract$Parcel$BalanceBreakdown.f100008a, null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.wealthcore_pocket_details_available_balance_accessibility, null, null, 14), LDSFile.EF_DG4_TAG), true, false, null, null, 29624);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_asset_details_section_investment_unrealised_return, null, null, 14);
        Clause[] elements = {rVar.f203822a.a(xVarA.d, bVar, bVar2), rVar.f203823b.f(bVar2, bVar)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        CellDetailsDelegate.Model model6 = new CellDetailsDelegate.Model("UNREALISED_RETURN_CELL_DETAILS_LIST_ID", textLocalisedClause, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        xi0.b bVarL = z92.f.l(dVar3);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealthcore_pocket_details_currency_account_value_current_price, null, null, 14);
        if (bVar != null) {
            model2 = model4;
            rateClause = new RateClause(bVar.f126703a, bVar.f126704b, new RateClause.Format.Default(bVarL, true), null);
        } else {
            model2 = model4;
            rateClause = rateClause2;
        }
        CellDetailsDelegate.Model model7 = new CellDetailsDelegate.Model("CURRENT_PRICE_CELL_DETAILS_LIST_ID", textLocalisedClause2, rateClause, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        xi0.b bVarL2 = z92.f.l(dVar3);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealthcore_pocket_details_currency_account_value_average_price, null, null, 14);
        if (bVar2 != null) {
            rateClause2 = new RateClause(bVar2.f126703a, bVar2.f126704b, new RateClause.Format.Default(bVarL2, true), null);
        }
        qv0.i[] elements2 = {model2, model5, model, model6, model7, new CellDetailsDelegate.Model("AVERAGE_ENTRY_PRICE_PRICE_CELL_DETAILS_LIST_ID", textLocalisedClause3, rateClause2, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        eVar.addAll(kotlin.collections.d.L(elements2));
        aim.e eVarA = u.a(eVar);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        if (stakingProduct == null || !stakingProduct.b() || (!stakingProduct.d() && (bool != null || stakingProduct.c()))) {
            listO = f0.f322471a;
        } else {
            wi0.b bVarG = (nVar == null || (address = nVar.k) == null) ? null : nz8.d.g(address);
            boolean zK = com.bumptech.glide.d.k(bVarG);
            if (bool == null && !stakingProduct.c()) {
                boolean zD = stakingProduct.d();
                model3 = new CellDetailsSwitcherDelegate.Model("CONSENT_CELL_DETAILS_SWITCHER_LIST_ID", new TextLocalisedClause(R$string.crypto_asset_details_section_investment_holding_auto_earn, null, null, 14), zD, !z, zK ? R$drawable.uikit_icn_16_info_outline : 0, null, new j(stakingProduct, zD), null, 4000);
            } else {
                model3 = null;
            }
            List listL = v.l(model3);
            vtd.c cVar = holdingDetails.d;
            if (cVar == null || (listB = rVar.f203824c.b(cVar, stakingProduct)) == null) {
                listB = f0.f322471a;
            }
            wwd.d dVar4 = rVar.d;
            Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
            StakingModes.Auto auto = stakingProduct.f88088c.f88072b;
            if (auto == null || (bigDecimal = auto.f88073a) == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            Intrinsics.h(bigDecimal);
            listO = i2b.a.o(i2b.a.p(listL, dVar4.a(bigDecimal, stakingProduct, bVarG, new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_tier_rates_auto_earn_rate, null, null, 14))), listB);
            yp0.b.k(listO, 0, 0, 0, 0, 31);
        }
        List listO2 = i2b.a.o(eVarA, listO);
        CellDetailsChevronDelegate.Model model8 = new CellDetailsChevronDelegate.Model("FAQ_CELL_DETAILS_LIST_ID", new TextLocalisedClause(com.revolut.feature_crypto_order_flow.api.R$string.cryptobuysell_order_detail_get_help_title, null, null, 14), 0, true, CryptoHoldingScreenContract$Parcel$FaqParcel.f100009a, null, null, 2020);
        yp0.b.l(model8, 0, 0, 0, 0, null, false, 63);
        return i2b.a.p(listO2, model8);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r51, java.lang.Object r52, java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        Clause moneyClause;
        m mVar = (m) this.f203449b;
        mg2.d dVar = (mg2.d) this.f203450c;
        mg2.k upiData = (mg2.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(upiData, "upiData");
        aim.e eVarB = u.b();
        i80.a qrCode = upiData.f205147a;
        jg2.f fVar = mVar.f205149a;
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        l70 l70Var = new l70("ID_QR_CODE", new QrCodeImage(qrCode.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(900, mif.a.w(qrCode, 30), new QrCodeAppearance.Layer.Image(fVar.d, false)), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28), false, R$attr.uikit_dp72, 112);
        yp0.b.r(l70Var, R$attr.uikit_dp72, 0, 0, 0, 14);
        eVarB.add(l70Var);
        String str = upiData.f205148b;
        if (str != null) {
            eVarB.add(new TextDelegate.Model("ID_USERNAME", new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), true, new bk0(0), null, null, R$attr.uikit_dp16, 0, 0, 0, 1904));
        }
        eVarB.add(new TextDelegate.Model("ID_EXPLAINER", new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_qr_code_footer_additional_info, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp8, R$attr.uikit_dp24, 0, 0, 1648));
        Long l2 = dVar.f205142b;
        if (l2 == null) {
            moneyClause = new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_qr_code_actions_add_amount_empty, null, null, 14);
        } else {
            long jLongValue = l2.longValue();
            xi0.b.Companion.getClass();
            moneyClause = new MoneyClause(new dj0.d(jLongValue, xi0.b.E), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        h4 h4Var = h4.SEMIACCENT;
        cn0 primaryButton = new cn0(SyslogConstants.LOG_CLOCK, new TextLocalisedClause(R.string.common_share, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share_android, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4Var);
        cn0 secondaryButton = new cn0(SyslogConstants.LOG_CLOCK, moneyClause, new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4Var);
        Intrinsics.checkNotNullParameter("ID_ACTIONS", "listId");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        an0 an0Var = new an0("ID_ACTIONS", primaryButton, secondaryButton, null);
        int i = R$attr.uikit_dp40;
        an0Var.f163478l = i;
        an0Var.f163479m = i;
        eVarB.add(an0Var);
        return u.a(eVarB);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object e(Object obj2, Object obj3, Object obj4) throws Throwable {
        Object next;
        mhd.f0 f0Var = (mhd.f0) this.f203449b;
        mhd.n nVar = (mhd.n) this.f203450c;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList<WatchlistItem> arrayList = new ArrayList();
        for (Object obj5 : content) {
            WatchlistItem watchlistItem = (WatchlistItem) obj5;
            String str = nVar.e;
            t70.b bVar = f0Var.d;
            if (str.length() != 0) {
                xi0.a aVar = xi0.b.Companion;
                FavouritesAssetDetails favouritesAssetDetails = watchlistItem.f86898a;
                String str2 = favouritesAssetDetails.f86864b;
                aVar.getClass();
                if (jli.g.h(bVar.c(xi0.a.a(str2)), str) || jli.g.h(bVar.c(xi0.a.a(watchlistItem.f86899b)), str) || jli.g.h(favouritesAssetDetails.f86864b, str) || jli.g.h(favouritesAssetDetails.f86865c, str)) {
                }
            }
            arrayList.add(obj5);
        }
        boolean z = nVar.f;
        Data data = nVar.f205518g;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (WatchlistItem watchlistItem2 : arrayList) {
            arrayList2.add(new wh(watchlistItem2.getId(), ((n3d.d) f0Var.f205496b).e(watchlistItem2.f86898a.d, watchlistItem2, watchlistItem2.getId()), u.c(new SwipeToActionDelegate.SwipeAction("LIST_ID_ACTION_DELETE", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_watchlist_screen_item_swipe_action_delete, null, null, 14), xh0.NEGATIVE, null, new rfd.b(watchlistItem2), null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            z = z;
        }
        List listL = v.l((arrayList.isEmpty() || z) ? null : new RowDelegate.Model("LIST_ID_ADD_TO_WATCHLIST", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_plus, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_widget_empty_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        List list = arrayList2;
        if (data != null) {
            List listA = f0Var.e.a(data, arrayList2);
            list = arrayList2;
            if (listA != null) {
                list = listA;
            }
        }
        List listO = i2b.a.o(listL, list);
        yp0.b.k(listO, 0, 0, 0, 0, 31);
        String str3 = nVar.d;
        if (str3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj6 : listO) {
                if (obj6 instanceof wh) {
                    arrayList3.add(obj6);
                }
            }
            Iterator it8 = arrayList3.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                Object obj7 = ((RowDelegate.Model) ((wh) next).f54925b).u;
                if ((obj7 instanceof ifd.g) && Intrinsics.f(((ifd.g) obj7).a().getId(), str3)) {
                    break;
                }
            }
            wh whVar = (wh) next;
            if (whVar != null) {
                c.b bVar2 = c.b.f249511a;
                Intrinsics.checkNotNullParameter(bVar2, "<set-?>");
                whVar.e = bVar2;
            }
        }
        List listC = listO;
        if (listC.isEmpty()) {
            String str4 = nVar.e;
            FullScreenStateDelegate.Model model = str4.length() > 0 ? new FullScreenStateDelegate.Model("LIST_ID_EMPTY_STATE", new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_assets_search_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_assets_search_empty_state_description, u.c(str4), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_assets_search_empty_state_button_clear_search, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, o.f205520a, null, null, 1600) : new FullScreenStateDelegate.Model("LIST_ID_EMPTY_STATE", new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_rev10_watchlist_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_rev10_watchlist_empty_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D241", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_watchlist_screen_empty_watchlist_add_new_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, rfd.c.f253759a, null, null, 1600);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model);
        }
        return listC;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        mj6.k kVar = (mj6.k) this.f203449b;
        mj6.g gVar = (mj6.g) this.f203450c;
        so6.a content = (so6.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Set set = gVar.f205930b;
        aim.e eVarB = u.b();
        ne6.b bVar = kVar.f205934a;
        eVarB.addAll(ne6.b.a(bVar, content.e, set, new m84.e(kVar, 20), null, null, 24));
        RowDelegate.Model model = new RowDelegate.Model("ID_REVOKE_ITEM", null, new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_finance_authrization_details_revoke_action, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        String str = content.f;
        if (str != null) {
            eVarB.add(((hj6.a) bVar).d(str));
        }
        return u.a(eVarB);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        List listC;
        Object next;
        c0 c0Var = (c0) this.f203449b;
        mk5.m mVar = (mk5.m) this.f203450c;
        List currencies = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : currencies) {
            l lVar = (l) obj5;
            String query = mVar.f206190b;
            lVar.getClass();
            Intrinsics.checkNotNullParameter(query, "query");
            String string = d0.F0(query).toString();
            if (d0.W(string) || d0.J(lVar.f206187b.f306286a, string, true) || d0.J(lVar.f206186a, string, true)) {
                arrayList.add(obj5);
            }
        }
        ArrayList arrayListF1 = zhm.d0.f1(arrayList);
        List listK = null;
        if (!arrayListF1.isEmpty()) {
            aim.e eVarB = u.b();
            Iterator it8 = arrayListF1.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((l) next).f206187b.equals(c0Var.f206182a.f70946c)) {
                    break;
                }
            }
            l lVar2 = (l) next;
            u0.a(arrayListF1).remove(lVar2);
            if (lVar2 != null) {
                eVarB.add(c0Var.b(lVar2, true));
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayListF1, 10));
            Iterator it9 = arrayListF1.iterator();
            while (it9.hasNext()) {
                arrayList2.add(c0Var.b((l) it9.next(), false));
            }
            eVarB.addAll(arrayList2);
            aim.e eVarA = u.a(eVarB);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            if (mVar.f206192g) {
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CryptoCurrencyChooser_DirectDepositButton_ListId", LargeActionButton.ButtonStyle.f58726b, new ResourceImage(R$drawable.uikit_icn_24_link, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.crypto.remittance.impl.R$string.crypto_receive_screen_destination_connect_wallet_exchange_button, null, null, 14), false, null, null, null, null, 1000);
                yp0.b.r(model, 0, 0, 0, 0, 15);
                ae0 ae0Var = new ae0(new TextLocalisedClause(com.revolut.feature.crypto.remittance.impl.R$string.crypto_receive_screen_destination_connect_wallet_exchange_separator, null, null, 14), "CryptoCurrencyChooser_DirectDepositSeparator_ListId");
                yp0.b.r(ae0Var, 0, 0, 0, 0, 15);
                listK = v.k(model, ae0Var);
            }
            if (listK == null) {
                listK = f0.f322471a;
            }
            listC = zhm.d0.E0(eVarA, listK);
        } else if (zBooleanValue) {
            listC = c0.a();
        } else if (d0.W(mVar.f206190b)) {
            listC = f0.f322471a;
        } else {
            a0 a0Var = c0.Companion;
            String query2 = mVar.f206190b;
            a0Var.getClass();
            Intrinsics.checkNotNullParameter(query2, "query");
            FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("NO_SEARCH_RESULT_LIST_ID", new TextLocalisedClause(com.revolut.feature.crypto.remittance.impl.R$string.crypto_withdrawals_common_search_no_results_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.balance_picker_search_no_result_title, u.c(query2), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model2);
        }
        return new p(listC, mVar.d, mVar.f206189a, mVar.f206190b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ed  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final java.lang.Object j(java.lang.Object r78, java.lang.Object r79, java.lang.Object r80) {
        /*
            Method dump skipped, instruction units count: 2319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.j(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0483  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.MoneyClause$Format, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r66, java.lang.Object r67, java.lang.Object r68) {
        /*
            Method dump skipped, instruction units count: 1341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.k(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        List arrayList;
        mth.r rVar = (mth.r) this.f203449b;
        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = rVar.f208841a;
        mth.i iVar = (mth.i) this.f203450c;
        ApplicableDocuments applicableDocuments = (ApplicableDocuments) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(applicableDocuments, "applicableDocuments");
        atb.b bVar = rVar.f208842b;
        DocumentGroup documentGroupH = z92.f.h(applicableDocuments);
        AlternativeDocumentGroups alternativeDocumentGroups = applicableDocuments.f105574b;
        if (documentGroupH != null) {
            gte.a aVar = bVar.f9021a;
            WorkflowEngineApi$Toggles$AlternativeDocuments workflowEngineApi$Toggles$AlternativeDocuments = WorkflowEngineApi$Toggles$AlternativeDocuments.f105372c;
            if (((jte.d) aVar).c(workflowEngineApi$Toggles$AlternativeDocuments) || !mth.r.e(applicableDocuments)) {
                if (!mth.r.e(applicableDocuments)) {
                    koi.j[] elements = {documentSelectionControllerContract$InputData.f96423c ? mth.r.a(iVar.f208830a, false) : null, mth.r.b()};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    List listL = kotlin.collections.d.L(elements);
                    ArrayList arrayListA = kth.a.a(iVar.f208832c, applicableDocuments.f105573a);
                    if (((jte.d) aVar).c(workflowEngineApi$Toggles$AlternativeDocuments) && documentSelectionControllerContract$InputData.f96421a.f96392a.f != null && alternativeDocumentGroups != null && !alternativeDocumentGroups.f105570a.isEmpty()) {
                        model = new LargeActionButtonDelegate.Model("ALTERNATIVE_METHODS_BUTTON_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_list_of_documents_alternative_documents_button, null, null, 14), false, null, null, null, null, 1000);
                    }
                    List listO = i2b.a.o(arrayListA, v.l(model));
                    yp0.b.k(listO, 0, 0, 0, 0, 31);
                    return i2b.a.o(listL, listO);
                }
                koi.j[] elements2 = {documentSelectionControllerContract$InputData.f96423c ? mth.r.a(iVar.f208830a, false) : null, mth.r.b()};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL2 = kotlin.collections.d.L(elements2);
                if (alternativeDocumentGroups != null) {
                    ArrayList arrayList2 = alternativeDocumentGroups.f105570a;
                    arrayList = new ArrayList();
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        zhm.a0.x(((AlternativeDocumentSection) it8.next()).f105572b, arrayList);
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                ArrayList arrayListA2 = kth.a.a(iVar.f208832c, arrayList);
                yp0.b.k(arrayListA2, 0, 0, 0, 0, 31);
                return i2b.a.o(listL2, arrayListA2);
            }
        }
        List listC = u.c(new FullScreenStateDelegate.Model("EMPTY_STATE_LIST_ITEM_ID", new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_list_of_documents_no_methods_supported_label, null, null, 14), rVar.d(new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_list_of_documents_no_methods_supported_description, null, null, 14)), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_issue, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 52, 52, 31), (Clause) null, 190)), null, null, false, null, null, null, YearClass.CLASS_2016));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    private final Object m(Object obj2, Object obj3, Object obj4) throws Throwable {
        Object next;
        List listB;
        mul.m mVar = (mul.m) this.f203449b;
        mul.h hVar = (mul.h) this.f203450c;
        mul.g breakdownContent = (mul.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(breakdownContent, "breakdownContent");
        Iterator it8 = mVar.f209064a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((nul.a) next).a(breakdownContent)) {
                break;
            }
        }
        nul.a aVar = (nul.a) next;
        if (aVar != null && (listB = aVar.b(breakdownContent, hVar.f209055a, hVar.f209057c)) != null) {
            return listB;
        }
        hx7.e.n(new IllegalStateException(j6.a.q("No mapper for ", o0.f186429a.b(breakdownContent.getClass()).m())));
        return f0.f322471a;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0661  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r47, java.lang.Object r48, java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 2434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.n(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        List listK;
        n1g.u uVar = (n1g.u) this.f203449b;
        n1g.e eVar = (n1g.e) this.f203450c;
        TravelExperiencesBooking booking = (TravelExperiencesBooking) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(booking, "booking");
        if (t.f211351a[booking.f92747b.ordinal()] != 1) {
            s0 s0Var = new s0(5);
            s0Var.a(n1g.u.f(booking));
            s0Var.a(n1g.u.b(booking));
            s0Var.a(n1g.u.d(booking));
            s0Var.a(n1g.u.e(booking));
            s0Var.b(uVar.g(eVar).toArray(new qv0.i[0]));
            ArrayList arrayList = s0Var.f186433a;
            return new n1g.g(v.m(arrayList.toArray(new qv0.i[arrayList.size()])));
        }
        s0 s0Var2 = new s0(7);
        s0Var2.a(n1g.u.f(booking));
        s0Var2.a(n1g.u.b(booking));
        s0Var2.a(n1g.u.d(booking));
        TravelExperienceBookingTicket travelExperienceBookingTicket = booking.i;
        CellDetailsChevronDelegate.Model model = null;
        if (travelExperienceBookingTicket != null) {
            myf.h hVar = travelExperienceBookingTicket.f92802b;
            int[] iArr = t.f211352b;
            RowDelegate.Model model2 = new RowDelegate.Model("EXPERIENCE_TICKET_ITEM", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, iArr[hVar.ordinal()] == 1 ? R$drawable.uikit_icn_24_printer : R$drawable.uikit_icn_24_smartphone, Integer.valueOf(R$attr.uikit_colorBlue), R$attr.uikit_colorBlue_10, 8.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(iArr[hVar.ordinal()] == 1 ? com.revolut.feature.travel.experiences.api.R$string.experiences_booking_ticket_paper_title : com.revolut.feature.travel.experiences.api.R$string.experiences_booking_ticket_mobile_title, null, null, 14), null, 0, new TextLocalisedClause(iArr[hVar.ordinal()] == 1 ? com.revolut.feature.travel.experiences.api.R$string.experiences_booking_ticket_paper_description : com.revolut.feature.travel.experiences.api.R$string.experiences_booking_ticket_mobile_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_booking_action_open_ticket, null, null, 14);
            String str = travelExperienceBookingTicket.f92801a;
            int i = R$attr.uikit_dp16;
            listK = v.k(model2, new LargeActionButtonDelegate.Model("EXPERIENCE_TICKET_BUTTON_ITEM", defaultFilledButton, null, textLocalisedClause, false, null, str, 0, i, i, i, 880));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
        } else {
            listK = f0.f322471a;
        }
        s0Var2.b(listK.toArray(new qv0.i[0]));
        if (booking.f92747b == iyf.c.CONFIRMED && booking.f92754n != null) {
            CellDetailsChevronDelegate.Model model3 = new CellDetailsChevronDelegate.Model("EXPERIENCE_MANAGE_BOOKING_ITEM", new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_booking_manage_booking_title, null, null, 14), 0, false, booking, null, null, 2028);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            model = model3;
        }
        s0Var2.a(model);
        s0Var2.a(n1g.u.e(booking));
        s0Var2.b(uVar.g(eVar).toArray(new qv0.i[0]));
        ArrayList arrayList2 = s0Var2.f186433a;
        return new n1g.g(v.m(arrayList2.toArray(new qv0.i[arrayList2.size()])));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[LOOP:2: B:23:0x0079->B:25:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.p(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        FixedTabsDelegate.Model modelA;
        InputTextDelegate.Model model;
        InputTextDelegate.Model modelA2;
        InputTextDelegate.Model modelA3;
        ListSubheaderDelegate.Model model2;
        n3j.p pVarA;
        TextLocalisedClause textLocalisedClause;
        Field$ExpansionDefinition field$ExpansionDefinition;
        cq9.m mVar = (cq9.m) this.f203449b;
        n3j.n nVar = (n3j.n) this.f203450c;
        n3j.l content = (n3j.l) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        RowDelegate.Model modelA4 = ty9.b.a((ty9.b) mVar.e);
        if (modelA4 != null) {
            yp0.b.c(modelA4, R$attr.uikit_dp16);
        } else {
            modelA4 = null;
        }
        q qVar = (q) mVar.f108058b;
        BeneficiaryInfoState beneficiaryInfo = content.f212142a;
        n3j.o extraData = content.f212143b;
        n61.c cVar = nVar.f212147b;
        Data suggestionData = nVar.d;
        Intrinsics.checkNotNullParameter(beneficiaryInfo, "infoState");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(suggestionData, "suggestionData");
        aim.e eVarB = u.b();
        j4j.f fVar = (j4j.f) qVar.f148941b;
        Intrinsics.checkNotNullParameter(beneficiaryInfo, "infoState");
        if (fVar.f171417a.f99673a.getF99649b().contains(BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.HideAccountTypeSelector.f99628a)) {
            modelA = null;
        } else if (beneficiaryInfo instanceof BeneficiaryInfoState.BankRecipient) {
            int i = j4j.e.f171416a[((BeneficiaryInfoState.BankRecipient) beneficiaryInfo).f99707h.ordinal()];
            if (i == 1) {
                modelA = fVar.a(u2j.d.BUSINESS);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                modelA = fVar.a(u2j.d.PERSONAL);
            }
        } else if (beneficiaryInfo instanceof BeneficiaryInfoState.MobileWallet) {
            int i2 = j4j.e.f171416a[((BeneficiaryInfoState.MobileWallet) beneficiaryInfo).i.ordinal()];
            if (i2 == 1) {
                modelA = fVar.a(u2j.d.BUSINESS);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                modelA = fVar.a(u2j.d.PERSONAL);
            }
        } else {
            if (!(beneficiaryInfo instanceof BeneficiaryInfoState.CreditCardBeneficiary) && !(beneficiaryInfo instanceof BeneficiaryInfoState.PaymentVendor)) {
                throw new NoWhenBranchMatchedException();
            }
            modelA = null;
        }
        if (modelA != null) {
            eVarB.add(modelA);
        }
        j4j.h hVar = (j4j.h) qVar.f148942c;
        Field$Country countryField = beneficiaryInfo.getD();
        Intrinsics.checkNotNullParameter(countryField, "countryField");
        if (countryField.f99724b) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.transfer_bank_accounts_new_country, null, null, 14);
            InputTextDelegate.Model modelA5 = yp0.r.a(new InputTextDelegate.Model("COUNTRY_EDIT_TEXT_ID", new TextClause(((o8b.g) hVar.f171419a).a(countryField.f99723a.f297794a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause2, textLocalisedClause2, false, null, null, null, null, null, null, false, null, null, false, true, 524288, 0, null, false, false, null, false, null, false, false, false, countryField, null, 0, -35913744, 65023));
            yp0.b.l(modelA5, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, null, false, 60);
            model = modelA5;
        } else {
            model = null;
        }
        if (model != null) {
            eVarB.add(model);
        }
        Field$Currency currencyField = beneficiaryInfo.getE();
        Intrinsics.checkNotNullParameter(currencyField, "currencyField");
        if (currencyField.f99727b) {
            modelA2 = yp0.r.a(new InputTextDelegate.Model("CURRENCY_EDIT_TEXT_ID", new CurrencyClause(currencyField.f99726a, null, null, 6), new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.currency_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.currency_title, null, null, 14), false, null, null, null, null, null, null, false, null, null, false, true, 524288, 0, null, false, false, null, false, null, false, false, false, currencyField, null, 0, -35913744, 65023));
            yp0.b.l(modelA2, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, null, false, 60);
        } else {
            modelA2 = null;
        }
        if (modelA2 != null) {
            eVarB.add(modelA2);
        }
        Intrinsics.checkNotNullParameter(beneficiaryInfo, "infoState");
        boolean z = beneficiaryInfo instanceof BeneficiaryInfoState.BankRecipient;
        if (!z || (field$ExpansionDefinition = ((BeneficiaryInfoState.BankRecipient) beneficiaryInfo).i) == null) {
            modelA3 = null;
        } else {
            ExpansionFieldDefinition expansionFieldDefinition = field$ExpansionDefinition.f99729a;
            Clause clause = expansionFieldDefinition.f.f99657c;
            Clause clause2 = expansionFieldDefinition.f99653b;
            modelA3 = yp0.r.a(new InputTextDelegate.Model("EXPANSION_FIELD_LIST_ID", clause, clause2, clause2, false, null, null, null, null, null, null, false, null, null, false, true, 524288, 0, null, false, false, null, false, null, false, false, false, field$ExpansionDefinition, null, 0, -35913744, 65023));
            yp0.b.l(modelA3, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, null, false, 60);
        }
        if (modelA3 != null) {
            eVarB.add(modelA3);
        }
        Field$RouteSelector routeSelector = beneficiaryInfo.getF();
        Intrinsics.checkNotNullParameter(routeSelector, "routeSelector");
        if (routeSelector.f99730a.size() > 1) {
            String str = routeSelector.f99731b.f60287a.d;
            if (str == null) {
                str = "";
            }
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.bank_transfer_add_beneficiary_recipient_details_title, null, null, 14);
            TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            m70.a.t(kotlin.jvm.internal.t0.f186434a);
            model2 = new ListSubheaderDelegate.Model("RECIPIENT_DETAILS_HEADER_ID", (Image) null, (Clause) textLocalisedClause3, (Image) null, (Clause) new CompositeClause(v.k(textClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_16_chevron_down, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28)), null, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) routeSelector, (Parcelable) null, 0, 0, 0, 0, 64426);
        } else {
            model2 = null;
        }
        if (model2 != null) {
            eVarB.add(model2);
        }
        p4j.a aVar = (p4j.a) qVar.d;
        j4j.c cVar2 = (j4j.c) qVar.e;
        List backendDefinitions = beneficiaryInfo.getF99711g();
        Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
        if (cVar2.f171415a.f99673a.getF99649b().contains(BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.HideEmail.f99629a)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : backendDefinitions) {
                if (!((Field$BackendDefinition) obj5).getF99718a().f60277l) {
                    arrayList.add(obj5);
                }
            }
            backendDefinitions = arrayList;
        }
        eVarB.addAll(aVar.a(backendDefinitions, new LocaleExtraData(beneficiaryInfo.getD().f99723a, beneficiaryInfo.getE().f99726a, extraData.f212149a), cVar, suggestionData));
        aim.e eVarA = u.a(eVarB);
        aim.e eVarB2 = u.b();
        if (modelA4 != null) {
            eVarB2.add(modelA4);
        }
        eVarB2.addAll(eVarA);
        aim.e eVarA2 = u.a(eVarB2);
        j4j.k kVar = (j4j.k) mVar.f108059c;
        Intrinsics.checkNotNullParameter(beneficiaryInfo, "infoState");
        BeneficiaryCreationKompotInputData.CreationConfiguration config = kVar.f171420a.f99673a;
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof BeneficiaryCreationKompotInputData.CreationConfiguration.Edit) {
            pVarA = j4j.k.a(kVar, new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.edit_beneficiary_header_title, null, null, 14), null, null, null, 14);
        } else if (z || (beneficiaryInfo instanceof BeneficiaryInfoState.MobileWallet)) {
            pVarA = j4j.k.a(kVar, new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.create_beneficiary_header_title, null, null, 14), null, null, null, 14);
        } else if (beneficiaryInfo instanceof BeneficiaryInfoState.PaymentVendor) {
            PaymentVendor paymentVendor = ((BeneficiaryInfoState.PaymentVendor) beneficiaryInfo).f99712h.f99589a;
            String str2 = paymentVendor.f64080b;
            ArrayList arrayList2 = paymentVendor.f;
            pVarA = j4j.k.a(kVar, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new UrlImage(paymentVendor.d, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), arrayList2.size() == 1 ? ((PaymentVendorCorridor) zhm.d0.b0(arrayList2)).f64082a : null, 2);
        } else {
            if (!(beneficiaryInfo instanceof BeneficiaryInfoState.CreditCardBeneficiary)) {
                throw new NoWhenBranchMatchedException();
            }
            pVarA = j4j.k.a(kVar, new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.balance_transfer_transfer_account_details_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.balance_transfer_transfer_account_details_subtitle, null, null, 14), null, null, 12);
        }
        jul.o oVar = (jul.o) mVar.d;
        Intrinsics.checkNotNullParameter(beneficiaryInfo, "beneficiaryInfo");
        k4j.a aVar2 = (k4j.a) oVar.f178696c;
        Intrinsics.checkNotNullParameter(beneficiaryInfo, "beneficiaryInfoState");
        BeneficiaryCreationKompotInputData.CreationConfiguration config2 = aVar2.f180926a.f99673a;
        Intrinsics.checkNotNullParameter(config2, "config");
        if (config2 instanceof BeneficiaryCreationKompotInputData.CreationConfiguration.Edit) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.retail_main_bank_transfer_beneficiary_edit_button_finish, null, null, 14);
        } else if (beneficiaryInfo instanceof BeneficiaryInfoState.CreditCardBeneficiary) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.balance_transfer_transfer_account_details_button, null, null, 14);
        } else {
            if (!z && !(beneficiaryInfo instanceof BeneficiaryInfoState.MobileWallet) && !(beneficiaryInfo instanceof BeneficiaryInfoState.PaymentVendor)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.retail_main_bank_transfer_add_beneficiary_button_finish, null, null, 14);
        }
        s sVar = (s) oVar.f178695b;
        Intrinsics.checkNotNullParameter(beneficiaryInfo, "beneficiaryInfo");
        return new n3j.s(eVarA2, pVarA, new n3j.m(textLocalisedClause, ((n4j.a) sVar.f136657b).a(beneficiaryInfo.getF99711g())));
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) this.f203449b;
        n7j.i iVar = (n7j.i) ((kgm.c) this.f203450c).f184018b;
        OrderQuote content = (OrderQuote) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        wd6.h hVar = exchangeOrderDraft.e;
        wd6.e eVar = exchangeOrderDraft.f99887c;
        switch (n7j.k.f213170a[hVar.ordinal()]) {
            case 1:
                String str = e1.t(content).f104720b;
                List listK = v.k(iVar.c(content), iVar.d(content), iVar.e(content, str), iVar.b(content, str), iVar.a(content, eVar, str));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 2:
            case 3:
                String str2 = e1.t(content).f104720b;
                List listK2 = v.k(iVar.c(content), iVar.d(content), iVar.e(content, str2), iVar.b(content, str2), iVar.a(content, eVar, str2));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                List listC = u.c(new CellDetailsDelegate.Model("SUMMARY_EXPIRY", new TextLocalisedClause(com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_common_cell_expire, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.commodity.order_flow.impl.R$string.fx_orders_summary_never, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return zhm.d0.E0(listC, listK2);
            case 4:
                String str3 = e1.t(content).f104720b;
                RecurringBuySettings recurringBuySettings = exchangeOrderDraft.f99892m;
                if (recurringBuySettings == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                CellDetailsDelegate.Model modelC = iVar.c(content);
                qv0.i iVarB = iVar.b(content, str3);
                CellDetailsDelegate.Model modelE = iVar.e(content, str3);
                Intrinsics.checkNotNullParameter(recurringBuySettings, "recurringBuySettings");
                qv0.i[] elements = {modelC, iVarB, modelE, iVar.f213169a.b(recurringBuySettings.f99906a, recurringBuySettings.f99907b, false)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                return listL;
            case 5:
            case 6:
            case 7:
                throw new IllegalStateException(hVar + " order type is not supported in commodity exchange");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        Pair pair;
        n85.m mVar = (n85.m) this.f203449b;
        n85.f fVar = (n85.f) this.f203450c;
        yhm.r rVar = (yhm.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        LoanDetails loanDetails = (LoanDetails) rVar.f314201a;
        List repayments = (List) rVar.f314202b;
        Loan loan = loanDetails.f70144a;
        q35.j jVar = loan.f70120s;
        int i = loan.f70118q;
        String str = fVar.d;
        b95.a product = loan.o;
        aim.e eVarB = u.b();
        if (jVar != null) {
            aim.e eVarB2 = u.b();
            eVarB2.add(new n85.l(new ListSubheaderDelegate.Model("upcoming_subheader", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_repayments_header_subtitle_upcoming, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_repayments_header_subtitle_upcoming_left, u.c(Integer.valueOf(i)), null, 12), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514), null));
            RowDelegate.Model modelA = ((c55.p) mVar.f213223a).a(jVar, product);
            yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(new n85.l(modelA, jVar.f241828c.atStartOfDay(ZoneId.systemDefault())));
            eVarB.addAll(u.a(eVarB2));
        }
        int i2 = 0;
        boolean z = jVar != null;
        aim.e eVarB3 = u.b();
        if (!repayments.isEmpty()) {
            if (z) {
                eVarB3.add(new n85.l(new ListSubheaderDelegate.Model("repayments_subheader", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_repayments_header_subtitle_repaid, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null));
            }
            c55.c0 c0Var = (c55.c0) mVar.f213224b;
            c0Var.getClass();
            Intrinsics.checkNotNullParameter(repayments, "repayments");
            Intrinsics.checkNotNullParameter(product, "product");
            List list = repayments;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(c0Var.a((e0) it8.next(), product));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            int i3 = 0;
            for (Object obj5 : arrayList) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                arrayList2.add(new n85.l((RowDelegate.Model) obj5, ((e0) repayments.get(i3)).f241806c));
                i3 = i5;
            }
            eVarB3.addAll(arrayList2);
        }
        eVarB.addAll(u.a(eVarB3));
        aim.e eVarA = u.a(eVarB);
        ArrayList arrayList3 = new ArrayList(w.t(eVarA, 10));
        ListIterator listIterator = eVarA.listIterator(0);
        while (true) {
            aim.b bVar = (aim.b) listIterator;
            if (!bVar.hasNext()) {
                break;
            }
            arrayList3.add(((n85.l) bVar.next()).f213221a);
        }
        ArrayList arrayList4 = new ArrayList();
        ListIterator listIterator2 = eVarA.listIterator(0);
        while (true) {
            aim.b bVar2 = (aim.b) listIterator2;
            if (!bVar2.hasNext()) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : arrayList4) {
                    if (hashSet.add((YearMonth) ((Pair) obj6).f186386b)) {
                        arrayList5.add(obj6);
                    }
                }
                List listI0 = zhm.d0.I0(arrayList5);
                ArrayList arrayList6 = new ArrayList(w.t(listI0, 10));
                Iterator it9 = listI0.iterator();
                while (it9.hasNext()) {
                    arrayList6.add((com.revolut.core.ui_kit.views.q) ((Pair) it9.next()).f186385a);
                }
                return new n85.h(str, arrayList3, arrayList6);
            }
            Object next = bVar2.next();
            int i6 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            ZonedDateTime zonedDateTime = ((n85.l) next).f213222b;
            if (zonedDateTime != null) {
                String strValueOf = String.valueOf(i2);
                long epochSecond = zonedDateTime.toEpochSecond() * ((long) 1000);
                pair = new Pair(new com.revolut.core.ui_kit.views.q(strValueOf, new com.revolut.core.ui_kit.views.t(Year.from(Instant.ofEpochMilli(epochSecond).atZone(ZoneId.systemDefault())).getValue() == Year.now().getValue() ? new TimeClause(epochSecond, new TimeClause.Format.Month(ka.SHORT), null, null, 12) : new TimeClause(epochSecond, new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12)), 58), YearMonth.of(zonedDateTime.getYear(), zonedDateTime.getMonth()));
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList4.add(pair);
            }
            i2 = i6;
        }
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        n87.k kVar = (n87.k) this.f203449b;
        n87.t tVar = (n87.t) this.f203450c;
        List collectionItems = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(collectionItems, "collectionItems");
        aim.e eVarB = u.b();
        if (!kVar.f213256c) {
            l1 l1Var = new l1(new AppTipUIModel("global-markets-collection.draggable-assets-tip", null, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_markets_screen_tip_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_markets_screen_tip_description, null, null, 14), new aw0.s(new ResourceImage(R$drawable.uikit_icn_24_hand, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, null, null, 994));
            yp0.b.l(l1Var, 0, 0, 0, 0, null, false, 63);
            eVarB.add(l1Var);
        }
        List list = collectionItems;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(tVar.f213269a.a((vel.f) it8.next()));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        eVarB.addAll(((aah.m) tVar.f213270b).b(kVar.e));
        return u.a(eVarB);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        n8f.q qVar = (n8f.q) this.f203449b;
        n8f.h hVar = (n8f.h) this.f203450c;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((Template) obj2, "<unused var>");
        ArrayList arrayListE0 = zhm.d0.E0(((j6f.c) qVar.d.c(hVar.e)).f171742a, zhm.d0.E0(((qoc.s0) qVar.f213384a).a(hVar.f213371b), zhm.d0.E0(((r6f.g) qVar.e.c(hVar.d)).f251831a, ((b7f.e) qVar.f213386c.c(hVar.f213372c)).f13036a)));
        List listC = ((gah.g) qVar.f).c(hVar.f, d7.DEFAULT);
        int i = R$attr.uikit_dp32;
        yp0.b.q(listC, 0, 0, i, i, 3);
        return zhm.d0.E0(listC, arrayListE0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x031e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.v(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026d  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.w(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj2, Object obj3, Object obj4) {
        CellDetailsDelegate.Model modelP;
        char c2;
        char c3;
        CellDetailsDelegate.Model model;
        CellDetailsDelegate.Model modelV;
        Data data;
        Creditor.Details details;
        LocalDate localDate;
        TimeClause timeClause;
        nbe.d dVar = (nbe.d) this.f203449b;
        nbe.a aVar = (nbe.a) this.f203450c;
        ApmPaymentAuthorisationSummary content = (ApmPaymentAuthorisationSummary) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        a9e.b bVar = dVar.f214077b;
        PaymentMethodDetails paymentMethodDetails = content.f61995g;
        Intrinsics.i(paymentMethodDetails, "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Giro");
        PaymentMethodDetails.Giro giro = (PaymentMethodDetails.Giro) paymentMethodDetails;
        ArrayList arrayList = new ArrayList();
        PaymentAuthorisationState paymentAuthorisationState = content.f61993b;
        boolean z = paymentAuthorisationState == PaymentAuthorisationState.PENDING;
        boolean z3 = paymentAuthorisationState == PaymentAuthorisationState.DEACTIVATED && content.i == DeactivationReason.CANCELED;
        if (z) {
            sa saVar = new sa("ID_PENDING_WARNING", (Clause) new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.mandate_details_warning_pending_giro_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.mandate_details_warning_pending_giro_subtitle, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (y10) null, (Object) null, 4056);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
            arrayList.add(saVar);
        }
        if (z3) {
            LocalDateTime localDateTime = content.f61996h;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.mandate_details_warning_cancelled_giro_title, null, null, 14);
            int i = com.revolut.feature.subscriptionscommon.impl.R$string.mandate_details_warning_cancelled_giro_subtitle;
            if (localDateTime != null) {
                long jR = oi0.d.R(localDateTime);
                TimeClause.Format.INSTANCE.getClass();
                timeClause = new TimeClause(jR, TimeClause.Format.f57959a, null, null, 12);
            } else {
                timeClause = null;
            }
            sa saVar2 = new sa("ID_CANCELLED_WARNING", (Clause) textLocalisedClause, (Clause) new TextLocalisedClause(i, u.c(c8g.c.p(timeClause)), null, 12), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (y10) null, (Object) null, 4056);
            yp0.b.l(saVar2, 0, 0, 0, 0, null, false, 63);
            arrayList.add(saVar2);
        }
        qua.p pVar = aVar.f214072a;
        Data data2 = aVar.f214073b;
        i9e.f fVar = (i9e.f) bVar;
        qv0.i iVarR = fVar.r(pVar, false);
        if (paymentAuthorisationState != PaymentAuthorisationState.ACTIVE) {
            iVarR = null;
        }
        LocalDateTime localDateTime2 = content.k;
        CellDetailsDelegate.Model modelF = fVar.F((localDateTime2 == null || (localDate = localDateTime2.toLocalDate()) == null) ? null : jli.b.i(localDate));
        LocalDateTime localDateTime3 = content.f61998l;
        if (localDateTime3 != null) {
            LocalDate localDate2 = localDateTime3.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
            modelP = fVar.p(jli.b.i(localDate2));
        } else {
            modelP = null;
        }
        dj0.d dVar2 = content.f62001p;
        if (dVar2 != null) {
            c2 = 0;
            c3 = 1;
            model = new CellDetailsDelegate.Model("ID_SINGLE_TRANSFER_LIMIT", new t0((Clause) new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.mandate_details_single_transaction_limit_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        } else {
            c2 = 0;
            c3 = 1;
            model = null;
        }
        LocalDateTime localDateTime4 = content.e;
        if (localDateTime4 != null) {
            LocalDate localDate3 = localDateTime4.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate3, "toLocalDate(...)");
            modelV = fVar.v(jli.b.i(localDate3), aVar.f214072a);
        } else {
            modelV = null;
        }
        qv0.i[] elements = new qv0.i[5];
        elements[c2] = iVarR;
        elements[c3] = modelF;
        elements[2] = modelP;
        elements[3] = model;
        elements[4] = modelV;
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        arrayList.addAll(listL);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_CONSUMER_ID", new t0((Clause) new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.mandate_details_consumer_id_title, null, null, 14), (Image) null, 0, false, 30), new TextClause(giro.f62033a.f62035a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        t0 t0Var = new t0((Clause) new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.mandate_details_creditor_id_title, null, null, 14), (Image) null, 0, false, 30);
        Creditor creditor = content.d;
        String str = (creditor == null || (details = creditor.f62012c) == null) ? null : details.f62013a;
        if (str == null) {
            str = "";
        }
        List listK = v.k(model2, new CellDetailsDelegate.Model("ID_CREDITOR_ID", t0Var, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        arrayList.addAll(listK);
        try {
            Object content2 = data2.getContent();
            data = new Data(content2 != null ? ((hce.d) content2).f150888a : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        k71.q qVar = aVar.d;
        hce.d dVar3 = (hce.d) data2.getContent();
        List listD = fVar.d(data, qVar, dVar3 != null ? dVar3.f150889b : null);
        if (listD != null) {
            arrayList.addAll(listD);
        }
        CellDetailsChevronDelegate.Model modelS = fVar.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        arrayList.add(modelS);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:238:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a7c A[EDGE_INSN: B:258:0x0a7c->B:259:0x0a7d BREAK  A[LOOP:9: B:250:0x0a59->B:288:?], EDGE_INSN: B:283:0x0a7c->B:258:0x0a7c BREAK  A[LOOP:8: B:239:0x0a29->B:284:?]] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0334  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r55, java.lang.Object r56, java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 2695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.y(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object z(java.lang.Object r29, java.lang.Object r30, java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.z(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v4 njj.k0, still in use, count: 2, list:
          (r5v4 njj.k0) from 0x01fb: MOVE (r45v0 njj.k0) = (r5v4 njj.k0)
          (r5v4 njj.k0) from 0x01bc: MOVE (r45v2 njj.k0) = (r5v4 njj.k0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(java.lang.Object r92, java.lang.Object r93, java.lang.Object r94) {
        /*
            Method dump skipped, instruction units count: 3840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m88.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
