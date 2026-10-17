package v05;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsight;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();

    public j(g resourcesProvider) {
        Intrinsics.checkNotNullParameter(resourcesProvider, "resourcesProvider");
    }

    public final List a(List insights, boolean z) {
        ResourceImage resourceImage;
        Intrinsics.checkNotNullParameter(insights, "insights");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = insights.iterator();
        while (true) {
            RowDelegate.Model model = null;
            if (!it8.hasNext()) {
                if (arrayList.isEmpty()) {
                    return f0.f322471a;
                }
                aim.e eVarB = u.b();
                eVarB.addAll(arrayList);
                if (z) {
                    eVarB.add(new LargeActionButtonDelegate.Model("INSIGHTS_SEE_ALL_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.credit_score_insight_see_all, null, null, 14), false, null, null, null, null, 1000));
                }
                return u.a(eVarB);
            }
            CreditScoreInsight creditScoreInsight = (CreditScoreInsight) it8.next();
            e eVarA = g.a(creditScoreInsight);
            Clause clause = eVarA.f284743a;
            if (clause != null) {
                String strQ = j6.a.q("INSIGHTS_ITEM_ID_", creditScoreInsight.f69962a.name());
                int i = i.f284748a[creditScoreInsight.f69963b.ordinal()];
                if (i == 1) {
                    resourceImage = new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusSuccess), (List) null, (ImageTransformations) null, (Clause) null, 246);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    resourceImage = new ResourceImage(R$drawable.uikit_icn_24_exclamation_mark, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246);
                }
                model = new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image24(resourceImage, false, false, 6), clause, null, 0, eVarA.f284744b, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, creditScoreInsight, null, 0, 0, 0, 0, 532675544);
            }
            if (model != null) {
                arrayList.add(model);
            }
        }
    }
}
