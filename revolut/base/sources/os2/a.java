package os2;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import c43.i;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewScreen;
import com.revolut.feature.apm.blik.impl.ui.flow.BlikFlow;
import com.revolut.feature.blue_prompt.modal.ModalBluePromptActivity;
import com.revolut.feature.blue_prompt.modal.ModalBluePromptContract$Configuration;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.info.CardPaymentMethodInfoScreen;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.cash_topup.impl.ui.search.CashTopUpSearchLocationScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.members.GroupChatMembersScreen;
import com.revolut.feature.pockets.api.details_v2.domain.AccountDetailsQrCode;
import com.revolut.feature.pockets.impl.details_v2.qr.AccountQrCodeScreen;
import com.revolut.feature.pockets.impl.details_v2.qr.AccountQrCodeScreenContract$InputData;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreen;
import com.revolut.feature.selfserve.sow.impl.ui.SowActivity;
import com.revolut.feature.subscriptions.impl.block_card_subscription.what_will_happen.WhatWillHappenScreen;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.workflow.engine.rfi.impl.ui.multi_text.MultiTextQuestionScreen;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pda.impl.ui.selection.SelectionPdaFragment;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanBottomSheetDeeplinkNavigation;
import cu1.o;
import i9e.x;
import java.net.URI;
import java.util.concurrent.CopyOnWriteArrayList;
import jb3.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import kr9.u;
import mb3.t;
import os9.p;
import ot1.b0;
import p40.q;
import pf2.n;
import ub3.j;
import ub3.m;
import vc.s;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f229218b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f229217a = i;
        this.f229218b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f229217a;
        int i2 = 26;
        int i3 = 2;
        int i5 = 0;
        Continuation continuation = null;
        Object obj2 = this.f229218b;
        switch (i) {
            case 0:
                int i6 = ModalBluePromptActivity.f64315t0;
                String str = ((ModalBluePromptContract$Configuration) ((ModalBluePromptActivity) obj2).G0()).f64318a;
                return str == null ? "BLUE_PROMPT_FLOW" : str;
            case 1:
                KProperty[] kPropertyArr = GroupChatMembersScreen.f79369e0;
                return (p) ((u) ((GroupChatMembersScreen) obj2).Y.getValue()).v.get();
            case 2:
                KProperty[] kPropertyArr2 = BizumTransferReviewScreen.c0;
                return (b0) ((ms1.u) ((BizumTransferReviewScreen) obj2).f61629a0.getValue()).f208602j.get();
            case 3:
                ((b0) obj2).v2(ot1.f.f229400a);
                return Unit.f186387a;
            case 4:
                c90.c cVar = (c90.c) ((kdh.b) obj2).f182899b;
                int iS = kli.a.s(R$attr.uikit_colorWhite_20, cVar.f22265a);
                int i21 = R$attr.uikit_colorTransparent;
                Context context = cVar.f22265a;
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{iS, kli.a.s(i21, context), kli.a.s(R$attr.uikit_colorTransparent, context), kli.a.s(R$attr.uikit_colorWhite_20, context)});
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(kli.a.k(context, 24.0f));
                return gradientDrawable;
            case 5:
                return (ou1.a) ((o) ((mu1.a) ((BlikFlow) obj2).P.getValue())).d.get();
            case 6:
                int i22 = MultiTextQuestionScreen.U;
                return (ouh.c) ((euh.c) ((puh.a) ((MultiTextQuestionScreen) obj2).R.getValue())).d.get();
            case 7:
                int i32 = RevPointsExclusiveStoreProductCheckoutScreen.X;
                return (ovb.h) ((kvb.c) ((RevPointsExclusiveStoreProductCheckoutScreen) obj2).V.getValue()).d.get();
            case 8:
                int i33 = CollapsingActionButton.f58976h;
                ((CollapsingActionButton) obj2).f();
                return Unit.f186387a;
            case 9:
                return Boolean.valueOf(((jte.d) ((ox2.f) obj2).f230550c).c(CardsCoreApi$Toggles.CardPricingIncludingTaxes.f65560c));
            case 10:
                return Boolean.valueOf(((jte.d) ((oye.f) obj2).f231030a).c(TopupApi$Toggles.TopUpCardOwnerVerification.f90471c));
            case 11:
                SowActivity sowActivity = (SowActivity) obj2;
                return v.k(sowActivity.f85957w0, sowActivity.f85958x0);
            case 12:
                return CamcorderProfileResolutionQuirk.supportedResolution_delegate$lambda$0((CamcorderProfileResolutionQuirk) obj2);
            case 13:
                return CameraQuirks.quirks_delegate$lambda$0((CameraQuirks) obj2);
            case 14:
                p0l.v vVar = (p0l.v) obj2;
                vVar.l2(new p0l.p(vVar, null), new yi5.b(i2));
                return Unit.f186387a;
            case 15:
                return ((TextContextMenuDataProvider) obj2).data();
            case 16:
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$1$0((TextContextMenuSession) obj2);
            case 17:
                return Boolean.valueOf(((rf3.d) ((q) obj2).f232795c).c());
            case 18:
                KProperty[] kPropertyArr3 = CardPaymentMethodInfoScreen.f65289a0;
                return (p43.e) ((i) ((CardPaymentMethodInfoScreen) obj2).W.getValue()).f21033c.get();
            case 19:
                KProperty[] kPropertyArr4 = WhatWillHappenScreen.f89169a0;
                return (p9e.e) ((x) ((WhatWillHappenScreen) obj2).X.getValue()).f159757c.get();
            case 20:
                com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c cVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c) obj2;
                cVar2.l2(new omg.e(cVar2, continuation, 25), new yi5.b(i2));
                return Unit.f186387a;
            case 21:
                int i43 = SelectionPdaFragment.f102392h0;
                return (nak.a) l.q((SelectionPdaFragment) obj2);
            case 22:
                KProperty[] kPropertyArr5 = CashTopUpSearchLocationScreen.f65680a0;
                t tVar = (t) ((CashTopUpSearchLocationScreen) obj2).V.getValue();
                mb3.p pVar = tVar.f204104b;
                ub3.g gVar = new ub3.g((m) pVar.f204096j.get());
                ub3.h hVar = new ub3.h();
                j jVar = new j();
                ub3.i iVar = new ub3.i();
                l80.e eVarH = pVar.d.h();
                s.j(eVarH);
                return new pc3.g(new pc3.h(new ub3.e(gVar, hVar, jVar, iVar, eVarH)), pVar.f204093c.c(), tVar.f204103a);
            case 23:
                KProperty[] kPropertyArr6 = AccountQrCodeScreen.f80879e0;
                return (pea.l) ((oda.e) ((AccountQrCodeScreen) obj2).Z.getValue()).e.get();
            case 24:
                AccountDetailsQrCode accountDetailsQrCode = ((AccountQrCodeScreenContract$InputData) obj2).f80883a;
                return new pea.g(accountDetailsQrCode.f80767a, accountDetailsQrCode.f80768b, null);
            case 25:
                n nVar = (n) obj2;
                yji.l.a1(nVar, nVar.X1(new mii.i("COPIED_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, 28)), null, null, null, 7);
                return Unit.f186387a;
            case 26:
                pfk.s sVar = (pfk.s) obj2;
                return new x4l.c(new o29.l(sVar, continuation, 19), new pfk.f(sVar, i5), new pfk.g(sVar, 4), new pfk.n(sVar, continuation, i3), new pfk.q(sVar, continuation, i5), new pfk.n(sVar, continuation, 3));
            case 27:
                try {
                    String path = URI.create(((pgk.b) obj2).f235978a.f195039a).getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                    return d0.m0(d0.I0(d0.K0(path, '/'), '/'), new char[]{'/'}, 6);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "ParsedDeeplink", null, e, h0Var);
                    return f0.f322471a;
                }
            case 28:
                return new FeatureCommand(new KompotOverlayFeatureConfig(new KompotPricingPlanFeatureConfig.BottomSheetDestination(((igk.d) obj2).f161241a), yhi.b.BOTTOM_DIALOG, (Integer) null, 12));
            default:
                return new FeatureCommand(new KompotOverlayFeatureConfig(new KompotPricingPlanFeatureConfig.SavingsAccountsBottomSheetDestination((PlanBottomSheetDeeplinkNavigation.SavingsAccounts) obj2), yhi.b.BOTTOM_DIALOG, (Integer) null, 12));
        }
    }
}
