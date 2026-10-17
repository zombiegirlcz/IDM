package p2c;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.tracking.v3.SpareChangeContext;
import ip0.bk0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ox5.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements cli.n {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f232227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jub.a f232228b;

    public y(gte.a featureToggleInteractor, jub.a revPointsDisclaimerProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsDisclaimerProvider, "revPointsDisclaimerProvider");
        this.f232227a = featureToggleInteractor;
        this.f232228b = revPointsDisclaimerProvider;
    }

    public static w0 a(int i) {
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        SpareChangeContext.a aVarNewBuilder = SpareChangeContext.newBuilder();
        aVarNewBuilder.h(String.valueOf(i));
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public static TextDelegate.Model b() {
        return new TextDelegate.Model("SPARE_CHANGE_TITLE_ITEM_ID", new TextLocalisedClause(R$string.rev_points_day0_spare_change_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new bk0(0), null, null, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, 1652);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new m((List) iii.c.f(t1.t(domainState.d, domainState.e), new p0g.b(this, 12), new d0(this, 23), new ox2.d(this, domainState, 4)));
    }
}
