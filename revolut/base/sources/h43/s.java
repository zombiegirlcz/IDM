package h43;

import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.card_payment_method.api.declaration.LinkCardFlowInputData;
import com.revolut.feature.card_payment_method.api.declaration.LinkCardToPocketNavigationDestination;
import com.revolut.feature.card_payment_method.impl.R$string;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreenContract$InputData;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import h93.f0;
import h93.j0;
import h93.l0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import wtc.b1;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends oki.h implements o {
    public final vii.b A;
    public final y B;
    public final u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ChooserScreenContract$InputData f149302p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.f f149303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f149304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n6e.b f149305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xua.a f149306t;
    public final mt8.d u;
    public final mre.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b1 f149307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ha3.k f149308x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e43.b f149309y;
    public final al4.b z;

    public s(u stateMapper, ChooserScreenContract$InputData inputData, l93.f cardsInteractor, j60.a bottomDialog, n6e.b pocketSubaccountsProvider, xua.a recurringPaymentInteractor, mt8.d kycInteractor, mre.c termsNavigationFactory, b1 wealthProtectionProductInteractor, ha3.k cardsTypeInfoInteractor, e43.b cardPocketVisibilityPolicy, al4.b comboCardInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(pocketSubaccountsProvider, "pocketSubaccountsProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(wealthProtectionProductInteractor, "wealthProtectionProductInteractor");
        Intrinsics.checkNotNullParameter(cardsTypeInfoInteractor, "cardsTypeInfoInteractor");
        Intrinsics.checkNotNullParameter(cardPocketVisibilityPolicy, "cardPocketVisibilityPolicy");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        this.o = stateMapper;
        this.f149302p = inputData;
        this.f149303q = cardsInteractor;
        this.f149304r = bottomDialog;
        this.f149305s = pocketSubaccountsProvider;
        this.f149306t = recurringPaymentInteractor;
        this.u = kycInteractor;
        this.v = termsNavigationFactory;
        this.f149307w = wealthProtectionProductInteractor;
        this.f149308x = cardsTypeInfoInteractor;
        this.f149309y = cardPocketVisibilityPolicy;
        this.z = comboCardInteractor;
        this.A = new vii.b();
        this.B = mra.d.b(this, new n(new Data(null, null, true, 3, null), inputData.f65271c, false), stateMapper, null, false, 12);
    }

    public final void I2(b93.e eVar) {
        l0 l0Var = null;
        j60.a.v(this.f149304r, false, null, 3);
        ChooserScreenContract$InputData chooserScreenContract$InputData = this.f149302p;
        String str = chooserScreenContract$InputData.f65269a.f65523a.f163146b;
        AccountId accountId = chooserScreenContract$InputData.f65270b;
        FeatureCommand featureCommandA = jbb.a.a(ibb.c.f160140a, null, null, null, 14);
        PocketWithSubaccount pocketWithSubaccount = chooserScreenContract$InputData.f65269a;
        CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(featureCommandA, u0.f(new LinkCardToPocketNavigationDestination(new LinkCardFlowInputData(pocketWithSubaccount, w33.a.PreselectLastCreated))));
        j0 j0Var = pocketWithSubaccount.f ? j0.PRO : null;
        m mVar = (m) ((n) ((j2) this.B.f22677a).getValue()).f149294a.getContent();
        if (mVar != null && mVar.d) {
            String str2 = chooserScreenContract$InputData.f65269a.f65523a.f163147c;
            xi0.b.Companion.getClass();
            l0Var = Intrinsics.f(str2, xi0.b.E.f306286a) ? l0.INDIA_LOCAL : l0.INDIA_GLOBAL;
        }
        C1(new BridgeDestination(new FeatureCommand(new CardDesignFeatureConfig(eVar, accountId, null, null, str, false, null, false, false, null, null, null, compositeCommandC, null, null, null, null, j0Var, l0Var, null, null, false, false, null, 524255194))));
    }

    public final void J2(FullScreenStateDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52373a, "EMPTY_STATE_LIST_ID")) {
            L2();
        } else {
            this.A.a();
        }
    }

    public final void K2() {
        String str;
        f0 f0Var = ((n) ((j2) this.B.f22677a).getValue()).f149295b;
        if (f0Var == null || (str = f0Var.f150110a) == null) {
            return;
        }
        C1(new SubscriptionsFlowDestination(new SubscriptionsFlowDestination.StartType.CardSubscriptionList(str, b9e.d.None)));
    }

    public final void L2() {
        this.o.getClass();
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.card_link_card_cards_list_order_new_card_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.card_link_card_cards_list_order_new_card_bottom_sheet_subtitle, null, null, 14), null, 28);
        rp0.l lVar = rp0.l.WINDOW;
        RowDelegate.Model model = new RowDelegate.Model("LIST_ID_ORDER_PHYSICAL_CARD", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D010", null, null, null, 30), null, null, new TextLocalisedClause(R$string.card_link_card_cards_list_order_new_card_bottom_sheet_physical_card_title, null, null, 14), new TextLocalisedClause(R$string.card_link_card_cards_list_order_new_card_bottom_sheet_physical_card_description, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073739628);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model2 = new RowDelegate.Model("LIST_ID_ORDER_VIRTUAL_CARD", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D379", null, null, null, 30), null, null, new TextLocalisedClause(R$string.card_link_card_cards_list_order_new_card_bottom_sheet_virtual_card_title, null, null, 14), new TextLocalisedClause(R$string.card_link_card_cards_list_order_new_card_bottom_sheet_virtual_card_description, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073739628);
        yp0.b.l(model2, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        this.f149304r.x(new rp0.y(v.k(model, model2), tVar, lVar, null, null, null, 1016));
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, vkm.q.Q(this.A, new g6f.l(null, this, 25)), null, new r(this, (Continuation) null), 3);
        yji.l.b1(this, ((om4.f) this.z).b(), null, new a2g.q(this, (Continuation) null, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.B;
    }
}
