package d0i;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import ip0.a20;
import ip0.c20;
import ip0.y10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f110360a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f110360a = featureToggleInteractor;
    }

    public static sa a(Limit.UsageLimit usageLimit) {
        sa saVar = new sa("ACCOUNT_BALANCE_LIMIT_WARNING_ID", (Clause) new TextLocalisedClause(R$string.cryptobuysell_account_balance_limit_info_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.cryptobuysell_order_review_account_balance_limit_disclaimer, v.k(new MoneyClause(a.a.L(usageLimit.f104750b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) usageLimit, "ACCOUNT_LIMIT_LEARN_MORE_CLICK_ID", false), 10)), null, 12), (List) null, false, (c20) new a20(new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246)), (y10) null, (Object) null, 200);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        return saVar;
    }
}
