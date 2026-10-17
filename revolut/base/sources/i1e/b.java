package i1e;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.stock_lending.impl.R$string;
import com.revolut.feature.stock_lending.impl.ui.screens.details.StockLendingDetailsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rp0.q0;
import rp0.r0;
import rp0.u0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) obj2;
        h hVar = (h) this.receiver;
        KProperty[] kPropertyArr = StockLendingDetailsScreen.f88403h0;
        s sVar = (s) hVar;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51822a, "ID_LEARN_MORE")) {
            sVar.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("topic.stock-lending", 2))));
        } else if (Intrinsics.f(model.f51822a, "ID_DISABLE_LENDING")) {
            r60.b bVar = sVar.f157628r;
            ((j1e.a) sVar.f157630t).getClass();
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            Clause clause = null;
            Clause clause2 = null;
            ResourceImage resourceImage2 = null;
            q0 q0Var = null;
            AnalyticsContext analyticsContext = null;
            AnalyticsContext analyticsContext2 = null;
            r60.d dVar = (r60.d) bVar;
            dVar.R(new u0(new TextLocalisedClause(R$string.wealth_stock_lending_disable_prompt_title, null, null, 14), new TextLocalisedClause(R$string.wealth_stock_lending_disable_prompt_description, null, null, 14), clause, new r0(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D043", null, null, null, 30)), clause2, resourceImage, resourceImage2, q0Var, new TextLocalisedClause(R$string.wealth_stock_lending_disable_prompt_disable_button, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), analyticsContext, analyticsContext2, null, null, null, null, null, null, null, 33552852));
        }
        return Unit.f186387a;
    }
}
