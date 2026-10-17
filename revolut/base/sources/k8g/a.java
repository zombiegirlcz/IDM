package k8g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xh0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static qv0.l a(u2f.d agent, boolean z) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        RowDelegate.Model model = new RowDelegate.Model(j6.a.q("AGENT_ITEM_ID_", agent.f276617a), new RowDelegate.Model.MainImage.Image40(new UrlImage(agent.f276621h, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), z ? new AccentCircleBadge(dw0.a.Link) : null, null, false, null, false, 60), new TextClause(agent.f276619c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(agent.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, agent, null, 0, 0, 0, 0, 532676568);
        if (z) {
            return new wh(j6.a.q("AGENT_ITEM_ID_", agent.f276617a), model, zhm.u.c(new SwipeToActionDelegate.SwipeAction("ACCOUNT_UNLINK_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_logout_door, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.trade_rev_points_providers_action_unlink_account, null, null, 14), xh0.PRIMARY, null, null, null, 112)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        }
        return model;
    }
}
