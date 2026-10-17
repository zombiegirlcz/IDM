package ynk;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        CompositeClause compositeClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Instant instant = domainState.f315496a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.student_plans_status_still_a_student_subtitle, null, null, 14);
        if (instant != null) {
            compositeClause = new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_16_sand_watch, new ImageClauseTint.Color(new Color.Solid(R$attr.uikit_colorStatusWarning)), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.student_plans_status_still_a_student_complete_by, u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DateMedium(0), null, null, 12)), null, 12)), null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorStatusWarning), false, false, 254), null, 10);
        } else {
            compositeClause = null;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.student_plans_status_still_a_student_title, null, null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_student;
        int i2 = R$attr.uikit_colorForeground;
        RowDelegate.Model model = new RowDelegate.Model("still_a_student_row", new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2)), null, null, false, null, false, 62), textLocalisedClause2, null, 0, textLocalisedClause, compositeClause, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867736);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.student_plans_status_not_a_student_anymore_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.student_plans_status_not_a_student_anymore_subtitle, null, null, 14);
        int i3 = R$drawable.uikit_icn_24_services;
        int i5 = R$attr.uikit_colorForeground;
        RowDelegate.Model model2 = new RowDelegate.Model("not_a_student_row", new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i5), 0.1f, companion, i3, new Color.Solid(i5)), null, null, false, null, false, 62), textLocalisedClause3, null, 0, textLocalisedClause4, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new g(v.k(model, model2));
    }
}
