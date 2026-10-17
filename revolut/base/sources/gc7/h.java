package gc7;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rewards.shops.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkc.a f142371a;

    public h(mkc.a perkListItemsMapper) {
        Intrinsics.checkNotNullParameter(perkListItemsMapper, "perkListItemsMapper");
        this.f142371a = perkListItemsMapper;
    }

    public final ErrorWidgetDelegate.Model a(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        q widgetSize = q.MEDIUM;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        return new ErrorWidgetDelegate.Model(listId, null, new TextLocalisedClause(R$string.perks_widget_nearby_rewards_error_title, null, null, 14), new TextLocalisedClause(R$string.perks_widget_nearby_rewards_error_button, null, null, 14), widgetSize, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }
}
