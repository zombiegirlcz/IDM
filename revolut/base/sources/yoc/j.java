package yoc;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.db;
import com.revolut.core.ui_kit.delegates.wa;
import com.revolut.core.ui_kit.delegates.ya;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmc.d f315648a;

    public j(nmc.d roboPortfolioUiMapper) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        this.f315648a = roboPortfolioUiMapper;
    }

    public final PlanTileDelegate.Model a(Template template, h hVar) {
        TagViewData tagViewData;
        Intrinsics.checkNotNullParameter(template, "template");
        db dbVar = new db(this.f315648a.g(template));
        Intrinsics.checkNotNullParameter(template, "template");
        ya yaVar = new ya(g.a(template.f95707b), wa.DEFAULT);
        TagViewData tagViewData2 = null;
        if (hVar != null) {
            int i = i.f315647a[hVar.ordinal()];
            if (i == 1) {
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_profile_current_portfolio, null, null, 14);
                int i2 = R$attr.uikit_colorAccent;
                tagViewData = new TagViewData(resourceImage, textLocalisedClause, i2, null, i2, null, 1000);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_lightning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_profile_recommended_portfolio, null, null, 14);
                int i3 = R$attr.uikit_colorAccent;
                tagViewData = new TagViewData(resourceImage2, textLocalisedClause2, i3, null, i3, null, 1000);
            }
            tagViewData2 = tagViewData;
        }
        PlanTileDelegate.Model model = new PlanTileDelegate.Model("RiskPlanTile", dbVar, yaVar, null, tagViewData2, null, YearClass.CLASS_2008);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
