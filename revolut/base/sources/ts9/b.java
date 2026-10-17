package ts9;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import tr9.h;
import ur9.f;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f274056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ss9.b f274057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2a.b f274058c;
    public final gte.a d;

    public b(f balanceMapper, h paymentsGroupsSmartSettlementItemsMapper, ss9.b transactionsItemsMapper, r2a.b wallpaperSettingsMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(balanceMapper, "balanceMapper");
        Intrinsics.checkNotNullParameter(paymentsGroupsSmartSettlementItemsMapper, "paymentsGroupsSmartSettlementItemsMapper");
        Intrinsics.checkNotNullParameter(transactionsItemsMapper, "transactionsItemsMapper");
        Intrinsics.checkNotNullParameter(wallpaperSettingsMapper, "wallpaperSettingsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f274056a = balanceMapper;
        this.f274057b = transactionsItemsMapper;
        this.f274058c = wallpaperSettingsMapper;
        this.d = featureToggleInteractor;
    }

    public static i a(String str, TextLocalisedClause textLocalisedClause, Clause clause, boolean z, ResourceImage resourceImage) {
        return z ? new CellDetailsActionDelegate.Model(str, textLocalisedClause, 0, resourceImage, clause, false, false, null, null, 0, 0, 32736) : new CellDetailsDelegate.Model(str, textLocalisedClause, clause, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static LargeActionButtonDelegate.Model c(boolean z) {
        return new LargeActionButtonDelegate.Model("SEE_MORE_MEMBERS_BUTTON_ID", LargeActionButton.ButtonStyle.o, null, z ? new TextLocalisedClause(R.string.common_action_see_less, null, null, 14) : new TextLocalisedClause(R.string.common_action_see_more, null, null, 14), false, null, null, null, null, 1000);
    }
}
