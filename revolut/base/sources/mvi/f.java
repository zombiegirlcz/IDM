package mvi;

import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressEmptyWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import grl.t9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zsi.i;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements eti.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zsi.e f209260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f209261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f209262c;
    public final jvi.c d;

    public f(zsi.e asftPassesInteractor, i termsInteractor, l80.e dateProvider, jvi.c asftPassAvailabilityMapper) {
        Intrinsics.checkNotNullParameter(asftPassesInteractor, "asftPassesInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(asftPassAvailabilityMapper, "asftPassAvailabilityMapper");
        this.f209260a = asftPassesInteractor;
        this.f209261b = termsInteractor;
        this.f209262c = dateProvider;
        this.d = asftPassAvailabilityMapper;
    }

    public static GoalProgressEmptyWidgetDelegate.Model a(String str) {
        w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.EMPTY, AnalyticsContext.INSTANCE);
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_turbo_transfer, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48);
        return new GoalProgressEmptyWidgetDelegate.Model(str, new TextLocalisedClause(R$string.asft_widget_title, null, null, 14), new TextLocalisedClause(R$string.asft_home_section_active_passes_empty_state_title, null, null, 14), layeredImageB, new AnalyticsContext(w0VarE), new zn.b(str, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE)));
    }
}
