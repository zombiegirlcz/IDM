package j37;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import ft6.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f170982a;

    public e(x47.a analyticsContextProvider, i37.b calendarEventsClauseFactory, w calendarEventMapper) {
        Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
        Intrinsics.checkNotNullParameter(calendarEventsClauseFactory, "calendarEventsClauseFactory");
        Intrinsics.checkNotNullParameter(calendarEventMapper, "calendarEventMapper");
        this.f170982a = calendarEventMapper;
    }

    public static ListSubheaderDelegate.Model a(boolean z) {
        Clause[] elements = {new TextLocalisedClause(R$string.freelancer_tax_hub_hub_section_calendar_title, null, null, 14), z ? new ImageClause(R$drawable.uikit_icn_24_info_legacy, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(t0.f186434a);
        return new ListSubheaderDelegate.Model("LIST_ID_CALENDAR_SUBHEADER", (Image) null, (Clause) new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), (ResourceImage) null, false, z, (Clause) null, false, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 262106);
    }
}
