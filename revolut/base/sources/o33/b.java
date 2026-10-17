package o33;

import android.content.Context;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.CardOrderFeatureApi$Toggles;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.api.navigation.OrderNewCardDestination;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardContract$Configuration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import n33.j;
import n33.z;
import sri.m;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f221684a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f221684a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CardOrderNewFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        CardOrderNewFeatureConfig config = (CardOrderNewFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (((d) this.f221684a).c(CardOrderFeatureApi$Toggles.OrderNewCardKompotMigration.f64948c)) {
            navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new OrderNewCardDestination(config.f64956a, config.f64957b, config.f64958c, config.d, config.e, config.f, config.f64959g, config.f64960h, config.i, config.f64961j, config.k, config.f64962l, config.f64963m, config.f64964n, null, 16384), false, (Integer) null, 0, 61)));
            return;
        }
        z.Companion.getClass();
        ExplicitActivityDestination explicitActivityDestination = j.f211740b;
        SelectedTab selectedTab = config.f64956a;
        boolean z = config.f64958c;
        CardOrderAccountWrapper cardOrderAccountWrapper = config.f64957b;
        NaviCommand naviCommand = config.e;
        NaviCommand naviCommand2 = config.f;
        NaviCommand naviCommand3 = config.d;
        boolean z3 = config.f64959g;
        navigator.c(new ActivityNavigateCommand(explicitActivityDestination, new OrderNewCardContract$Configuration(selectedTab, z, cardOrderAccountWrapper, naviCommand3, naviCommand, naviCommand2, config.f64960h, config.f64964n, z3, config.i, config.f64961j, config.k, config.f64963m, (AnalyticsProduct) null, 20480), null, null, 0, null, null, null, null, false, 1020));
    }
}
