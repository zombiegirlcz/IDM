package ft6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f137955a;

    public w(x47.a analyticsContextProvider, i37.b calendarEventsClauseFactory, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
        Intrinsics.checkNotNullParameter(calendarEventsClauseFactory, "calendarEventsClauseFactory");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f137955a = dateProvider;
    }

    public final FullScreenStateDelegate.Model a(Object obj2) {
        return new FullScreenStateDelegate.Model("LIST_ID_DELISTED_ALL_TYPES", new TextLocalisedClause(R$string.freelancer_tax_hub_hub_section_calendar_not_set_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_tax_hub_hub_section_calendar_not_set_subtitle, null, null, 14), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 52, 52, 31), (Clause) null, 190)), new l6(12, new TextLocalisedClause(R$string.freelancer_tax_hub_hub_section_calendar_not_set_action_set_dates, null, null, 14), null, h4.ACCENT), null, false, obj2, null, null, 1760);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(java.util.List r38, wi0.b r39, kotlin.jvm.functions.Function1 r40) {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft6.w.b(java.util.List, wi0.b, kotlin.jvm.functions.Function1):java.util.ArrayList");
    }

    public final RowDelegate.Model c() {
        boolean z = false;
        return new RowDelegate.Model("LIST_ID_CALENDAR_EVENTS_EMPTY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(R$string.freelancer_tax_hub_hub_section_calendar_no_upcoming_events, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
    }
}
