package glk;

import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pricingplans.models.subscribe_info.PricingPlanSubscribeInfoIneligibilityReason;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements cli.n {
    public m(b itemMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<PricingPlanSubscribeInfoIneligibilityReason> list = domainState.f144718a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (PricingPlanSubscribeInfoIneligibilityReason reason : list) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            if (a.f144715a[reason.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            RowDelegate.Model model = new RowDelegate.Model(reason.name(), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_briefcase_coins, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.plan_downgrade_ineligibility_reasons_private_advisory, null, null, 14), null, 0, null, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, null, false, null, null, null, null, null, null, reason, null, 0, 0, 0, 0, 532675576);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        return new k(new TextLocalisedClause(R$string.plan_downgrade_ineligibility_reasons_cancel, u.c(domainState.f144719b), null, 12), arrayList);
    }
}
