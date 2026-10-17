package og7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.incentive_reward.impl.R$string;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.flow.IncentiveSelectionFlowContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncentiveSelectionFlowContract$InputData f225054a;

    public h(IncentiveSelectionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f225054a = inputData;
    }

    public final List a() {
        return this.f225054a.f74868a ? u.c(new TextNavBarMenuItem("SKIP_BUTTON_ID", new TextLocalisedClause(R$string.incentive_reward_common_action_not_now, null, null, 14), null, null, 12)) : f0.f322471a;
    }
}
