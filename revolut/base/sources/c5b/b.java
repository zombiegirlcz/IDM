package c5b;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.asset.trade.actions.ui.api.SwipeAssetTradeActionsApi$Toggles$SwipeActions;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xh0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import qv0.l;
import y49.h;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f21545a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f21545a = featureToggleInteractor;
    }

    public static SwipeToActionDelegate.SwipeAction a(String str, String str2, BigDecimal bigDecimal, n nVar) {
        return new SwipeToActionDelegate.SwipeAction("swipe-cfd-close-position", new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.wealth_invest_swipe_actions_close, null, null, 14), xh0.NEGATIVE, null, new b2b.b(str, str2, bigDecimal, nVar), null, 80);
    }

    public final l b(RowDelegate.Model item, h positionsPerformance, String portfolioId) {
        List list = positionsPerformance.f310853l;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(positionsPerformance, "positionsPerformance");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        if (!((jte.d) this.f21545a).c(SwipeAssetTradeActionsApi$Toggles$SwipeActions.f86033c) || list.size() != 1) {
            return item;
        }
        y49.e eVar = (y49.e) d0.b0(list);
        String strQ = j6.a.q("swipe-", item.f53228a);
        n nVar = positionsPerformance.f310847a;
        String str = eVar.f310837a;
        BigDecimal bigDecimal = eVar.f310842j;
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        Intrinsics.h(bigDecimal);
        return new wh(strQ, item, u.c(a(portfolioId, str, bigDecimal, nVar)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
