package hrb;

import aw0.q;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.tips.R$string;
import hl7.ma;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements wse.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f154805a = j.b(new ma(18));

    public static final class a {
        private a() {
        }
    }

    @Override // wse.a
    public final AppTipUIModel a(cte.a appTip) {
        Intrinsics.checkNotNullParameter(appTip, "appTip");
        return new AppTipUIModel("watchlistRearrangeItems", null, new TextLocalisedClause(R$string.retail_tips_watchlist_rearrange_title, null, null, 14), new TextLocalisedClause(R$string.retail_tips_watchlist_rearrange_subtitle, null, null, 14), new q(new LottieImage(uc0.b.a("mobile/app_tips/animations", "customise_home_tip"), R$attr.uikit_colorAccent, 222)), null, null, new wse.b(), 738);
    }

    @Override // wse.a
    public final void b(cte.a appTip) {
        Intrinsics.checkNotNullParameter(appTip, "appTip");
    }

    @Override // wse.a
    public final cte.a c() {
        return (cte.a) this.f154805a.getValue();
    }
}
