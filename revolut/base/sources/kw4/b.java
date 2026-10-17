package kw4;

import com.revolut.cards.shared.ui.screen.catalogue.SharedCardDesignCatalogueController;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CardDesignCatalogueDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SliderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.TopupRequestDetailsScreen;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.ViaVerdeHomeScreen;
import com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.CardReplaceExpectationsController;
import com.revolut.feature.card_order_new.impl.brazil.CardSubtypePickerController;
import com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.ReactivateCardConfirmationBottomSheetScreen;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreen;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.junior.account_activation.impl.ui.screen.edit_name.EditNameController;
import com.revolut.feature.topup_screen.impl.flows.topup.amount_new.AmountNewScreen;
import com.revolut.feature.topup_screen.impl.mcy.india_topup_declaration.IndiaTopupDeclarationScreen;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.gifted_breakdown.AirportLoungesPassListGiftedBreakdownScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.request.PaymentLinksRequestSelectionScreen;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import qlm.d1;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190216a;

    public /* synthetic */ b(int i) {
        this.f190216a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f190216a) {
            case 0:
                KProperty[] kPropertyArr = CreditCardTopupScreen.X;
                return new SliderDelegate();
            case 1:
                KProperty[] kPropertyArr2 = CreditCardTopupScreen.X;
                return new CellDetailsActionDelegate();
            case 2:
                KProperty[] kPropertyArr3 = CreditCardTopupScreen.X;
                return new FullScreenStateDelegate();
            case 3:
                KProperty[] kPropertyArr4 = AmountNewScreen.f90823b0;
                return new TextDelegate();
            case 4:
                KProperty[] kPropertyArr5 = AmountNewScreen.f90823b0;
                return new FooterTextDelegate();
            case 5:
                KProperty[] kPropertyArr6 = AirportLoungesPassListGiftedBreakdownScreen.S;
                return new z4l.j(7, wp5.y.w(), false);
            case 6:
                KProperty[] kPropertyArr7 = CardReplaceExpectationsController.R;
                return new RowDelegate(null, null, 7);
            case 7:
                Pair pair = new Pair("SUITABILITY_STATEMENT", new PolicyDocument.Text(new TextLocalisedClause(R$string.pets_all_documents_suitability_statement_name, null, null, 14), zhm.v.k(new ResourceId.IntResourceId(R$string.pets_all_documents_suitability_statement_part1), new ResourceId.IntResourceId(R$string.pets_all_documents_suitability_statement_part2))));
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_all_documents_assumptions_name, null, null, 14);
                vz7.c.Companion.getClass();
                return r0.k(pair, new Pair("ASSUMPTIONS", new PolicyDocument.Custom(textLocalisedClause, new ActivityNavigateCommand(vz7.a.f293405b, null, null, null, 0, null, null, null, null, false, 1022))));
            case 8:
                KProperty[] kPropertyArr8 = IndiaTopupDeclarationScreen.Q;
                return new InputDisclosureDelegate();
            case 9:
                KProperty[] kPropertyArr9 = SharedCardDesignCatalogueController.U;
                return new CardDesignCatalogueDelegate();
            case 10:
                KProperty[] kPropertyArr10 = SharedCardDesignCatalogueController.U;
                return new RowDelegate(null, null, 7);
            case 11:
                KProperty[] kPropertyArr11 = CardSubtypePickerController.R;
                return new RowDelegate(null, null, 7);
            case 12:
                return new qlm.e(l19.c.f191493a);
            case 13:
                l19.l lVar = l19.l.INSTANCE;
                Intrinsics.checkNotNullParameter("contentType", "discriminator");
                return new d1("com.revolut.feature.lifestyle.content_gateway.api.model.slot.atoms.bottom_sheet.UnknownBottomSheetAction", lVar, new Annotation[]{new hi9.g(19, false)});
            case 14:
                KProperty[] kPropertyArr12 = TopupRequestDetailsScreen.S;
                return new ActionsDelegate();
            case 15:
                KProperty[] kPropertyArr13 = TopupRequestDetailsScreen.S;
                return new CellDetailsChevronDelegate();
            case 16:
                Lazy lazy = l57.a.f192185a;
                return ue0.e.b(Json.d, new l2d.a(25));
            case 17:
                return Unit.f186387a;
            case 18:
                KProperty[] kPropertyArr14 = EditNameController.S;
                return new InputTextDelegate(null);
            case 19:
                KProperty[] kPropertyArr15 = CommodityOrderReviewScreen.X;
                return new PlainTextDelegate();
            case 20:
                KProperty[] kPropertyArr16 = CommodityOrderReviewScreen.X;
                return new LargeActionButtonDelegate();
            case 21:
                KProperty[] kPropertyArr17 = CommodityOrderReviewScreen.X;
                return new RowDelegate(null, null, 7);
            case 22:
                KProperty[] kPropertyArr18 = CommodityOrderReviewScreen.X;
                return new HighlightTileDelegate();
            case 23:
                KProperty[] kPropertyArr19 = CommodityOrderReviewScreen.X;
                return new CellDetailsDelegate();
            case 24:
                KProperty[] kPropertyArr20 = CommodityOrderReviewScreen.X;
                return new CellDetailsActionDelegate();
            case 25:
                KProperty[] kPropertyArr21 = CommodityOrderReviewScreen.X;
                return new FullScreenStateDelegate();
            case 26:
                int i = ReactivateCardConfirmationBottomSheetScreen.V;
                return new LargeActionButtonDelegate();
            case 27:
                KProperty[] kPropertyArr22 = PaymentLinksRequestSelectionScreen.f102232b0;
                return new FullScreenStateDelegate();
            case 28:
                KProperty[] kPropertyArr23 = ViaVerdeHomeScreen.U;
                return new FullScreenStateDelegate();
            default:
                KProperty[] kPropertyArr24 = ViaVerdeHomeScreen.U;
                return new ListSubheaderDelegate();
        }
    }
}
