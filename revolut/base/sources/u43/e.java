package u43;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s43.n;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e implements s43.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f277038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f277039b;

    public e(n searchMatcher, a visibilityPolicy) {
        Intrinsics.checkNotNullParameter(searchMatcher, "searchMatcher");
        Intrinsics.checkNotNullParameter(visibilityPolicy, "visibilityPolicy");
        this.f277038a = searchMatcher;
        this.f277039b = visibilityPolicy;
    }

    public static RowDelegate.Model b(String id10, dj0.d dVar, Clause title, Clause clause, int i, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new RowDelegate.Model(id10, new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, Float.valueOf(24.0f), null, 32), d8l.d.b(z), null, false, null, false, 60), title, null, 0, clause, null, null, 0, dVar != null ? new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126) : null, false, null, z, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536861656);
    }

    public static ListSubheaderDelegate.Model c(TextLocalisedClause title, String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new ListSubheaderDelegate.Model(id10, (Image) null, (Clause) title, z ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, z, false, (Clause) null, false, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 262114);
    }

    public abstract d a(s43.f fVar);

    public abstract c d(s43.f fVar, d dVar);
}
