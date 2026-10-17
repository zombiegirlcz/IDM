package jp6;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.delegates.uf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.feedback.impl.R$string;
import ip0.c0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements bp6.b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // bp6.b
    public final List a(Feedback feedback, AnalyticsContext analyticsContext, bp6.a style) {
        int i;
        Custom custom;
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        Intrinsics.checkNotNullParameter(style, "style");
        int i2 = c.f177204a[style.ordinal()];
        if (i2 == 1) {
            i = R$string.cx_feedback_feedback_widget_title;
            custom = new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254);
        } else if (i2 == 2) {
            i = R$string.cx_feedback_feedback_ticketor_widget_title;
            custom = new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.cx_feedback_feedback_widget_title_v2;
            custom = null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, custom, 10);
        of ofVar = of.SMALL;
        int i3 = R$attr.uikit_dp0;
        return u.c(new RowDelegate.Model("FAQ_FEEDBACK_ITEM_ID", null, textLocalisedClause, ofVar, 0, null, null, null, 0, new uf(new ResourceImage(R$drawable.uikit_icn_24_dislike, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new ResourceImage(R$drawable.uikit_icn_24_like, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246)), false, null, false, null, null, null, null, null, null, null, analyticsContext, i3, i3, 0, i3, 343929842));
    }

    @Override // bp6.b
    public final List b() {
        return u.c(new c0("FEEDBACK_LOADING_ITEM_ID", new u.a(2, 2), R$attr.uikit_dp16, 0, 56));
    }

    @Override // bp6.b
    public final List c() {
        return zhm.u.c(new c0("FEEDBACK_LOADING_ITEM_ID", new u.a(2, 2), R$attr.uikit_dp72, 0, 56));
    }
}
