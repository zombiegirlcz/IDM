package una;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("AUTO_EARN_SWITCH_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_percent, new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(R$attr.uikit_colorAccentNeutral_10)), null, null, false, null, false, 62), new TextLocalisedClause(R$string.profile_auto_earn_rewards_details_item_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.profile_auto_earn_rewards_details_item_subtitle, null, null, 14), null, null, 0, new vf(pd.b.j((Boolean) domainState.f281378a.getContent()), true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new e(u.c(model));
    }
}
