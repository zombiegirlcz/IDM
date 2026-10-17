package nle;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.wealth.resources.R$string;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nc1.j;
import vkm.i;
import w4l.h;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f217127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ael.b f217128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f217129n;

    public e(gte.a featureToggleInteractor, ael.b investBuyBlockInteractor, g modalFactory) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(investBuyBlockInteractor, "investBuyBlockInteractor");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        this.f217127l = featureToggleInteractor;
        this.f217128m = investBuyBlockInteractor;
        this.f217129n = modalFactory;
    }

    @Override // nle.a
    public final Flow Z2() {
        return ((jte.d) this.f217127l).c(WealthUiApi$Toggles.InvestBuyBlock.f95856c) ? this.f217128m.f3597a.d.b(Unit.f186387a, h.f294642c) : i.f290039a;
    }

    @Override // nle.a
    public final void b3(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (Intrinsics.f(clickData.f275445a, "INVEST_BUY_BLOCK_LEARN_MORE_ID")) {
            A2(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.what-is-the-buy-order-block", 2))));
        }
    }

    @Override // nle.a
    public final void c3(RowDelegate.Model model) {
        int i;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        if (obj2 instanceof c) {
            c parcel = (c) obj2;
            this.f217129n.getClass();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            wel.d dVar = parcel.f217124a;
            boolean z = dVar instanceof wel.a;
            int i2 = !z ? R$string.trading_settings_buy_block_block_title : R$string.trading_settings_buy_block_unblock_title;
            if (Intrinsics.f(dVar, wel.a.f296815a)) {
                i = R$string.trading_settings_buy_block_unblock_subtitle;
            } else if (Intrinsics.f(dVar, wel.b.f296816a)) {
                i = R$string.trading_settings_buy_block_block_subtitle;
            } else {
                if (!Intrinsics.f(dVar, wel.c.f296817a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.trading_settings_buy_block_reblock_subtitle;
            }
            PromptContentDelegate.Model model2 = new PromptContentDelegate.Model("prompt", new TextLocalisedClause(i2, null, null, 14), new TextLocalisedClause(i, null, null, 14), null, new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), false), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, new TextLocalisedClause(!z ? R$string.trading_settings_buy_block_block_action : R$string.trading_settings_buy_block_unblock_cancel, null, null, 14), new TextLocalisedClause(!z ? R$string.trading_common_action_cancel : R$string.trading_settings_buy_block_unblock_action, null, null, 14), null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536869320);
            k9 k9Var = k9.Trading;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            N2(new FullScreenPromptScreen(new d67.f(model2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, false)), ModalDestination.Style.POPUP.f98311a, new j(parcel, this, 16));
        }
    }
}
