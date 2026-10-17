package smd;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.m5;
import com.revolut.core.ui_kit.delegates.p5;
import com.revolut.core.ui_kit.delegates.qf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i3;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f264440a;

    public x(thf.c categoryResourcesMapper) {
        Intrinsics.checkNotNullParameter(categoryResourcesMapper, "categoryResourcesMapper");
        this.f264440a = categoryResourcesMapper;
    }

    public final DraggableDelegate.Model a(g gVar, lzi.h hVar, String str) {
        int i;
        TextLocalisedClause textLocalisedClause;
        i3 i3Var = gVar.f264414a;
        String id10 = i3Var.getId();
        dj0.d dVar = gVar.f264415b;
        xi0.b bVar = dVar.f115083b;
        dj0.d dVar2 = gVar.d;
        i iVar = new i(id10, bVar, dVar2);
        wjf.e eVar = (wjf.e) this.f264440a;
        String strK = eVar.k(i3Var);
        String strR = a0.d.r(str, ":CATEGORY_BUDGETS_INNER_CATEGORY_ROW");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(eVar.i(i3Var, Integer.valueOf(R$attr.uikit_colorAccentNeutral_10), Integer.valueOf(R$attr.uikit_colorAccentNeutral)), null, null, false, null, false, 62);
        TextClause textClause = new TextClause(strK, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (dVar.k()) {
            textLocalisedClause = null;
        } else {
            if ((hVar instanceof lzi.c) || (hVar instanceof lzi.e)) {
                i = R$string.analytics_budget_categories_month_average;
            } else {
                if (!(hVar instanceof lzi.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.analytics_budget_categories_week_average;
            }
            textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(otd.f.d(dVar)), null, 12);
        }
        return new DraggableDelegate.Model(str, new RowDelegate.Model(strR, image40, textClause, null, 0, textLocalisedClause, null, null, 0, dVar2 != null ? new qf(dVar2, null, false, false, 30) : null, false, null, false, null, null, null, null, null, null, iVar, null, 0, 0, 0, 0, 532673496), new ResourceImage(dVar2 == null ? R$drawable.uikit_icn_24_plus_circle : R$drawable.uikit_icn_24_minus_circle, (Integer) null, (Integer) null, Integer.valueOf(dVar2 == null ? R$attr.uikit_colorStatusSuccess : R$attr.uikit_colorStatusDanger), (List) null, (ImageTransformations) null, (Clause) null, 246), new p5(m5.f54459a), false, iVar, 976);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f264423a, new sl3.i(15), new sl5.g(4), new sa5.b(this, 9));
    }
}
