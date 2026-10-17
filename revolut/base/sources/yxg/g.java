package yxg;

import ce9.m;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import java.util.List;
import jel.a3;
import kotlin.jvm.internal.Intrinsics;
import y5g.l;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vxg.b f317690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f317691b;

    public g(vxg.b allocationMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(allocationMapper, "allocationMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f317690a = allocationMapper;
        this.f317691b = featureToggleInteractor;
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        a3 a3Var = domainState.f317684a;
        WealthUiApi$Toggles.RoboStrategies roboStrategies = WealthUiApi$Toggles.RoboStrategies.f95863c;
        gte.a aVar = this.f317691b;
        List list = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(m.p(a3Var, ((jte.d) aVar).c(roboStrategies)), null, null, 14);
        Data data = domainState.f317686c;
        CompositeClause compositeClause = data != null ? (CompositeClause) iii.c.f(data, new yv8.j(20), new yw9.j(19), new l(17)) : null;
        LayeredImage layeredImageK = LayeredImage.INSTANCE.k(m.m(domainState.f317684a, ((jte.d) aVar).c(roboStrategies)), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
        WidgetisedAnalyticsType analyticsType = domainState.f317685b;
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if (data != null) {
            vxg.b bVar = this.f317690a;
            list = (List) iii.c.f(data, new vw4.j(bVar, 12), new vv7.l(10), new vh2.o(bVar, analyticsType, 8));
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return new f(textLocalisedClause, compositeClause, layeredImageK, list);
    }
}
