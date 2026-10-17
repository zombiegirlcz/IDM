package o69;

import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.MapLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.R$string;
import com.revolut.feature.nearby.rewards.api.widget.NearbyRewardsWidgetContext;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsNearbyRewardsWidget;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import grl.t9;
import jid.x;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import op0.q;
import org.jetbrains.annotations.NotNull;
import vkm.v1;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements csh.e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f222530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w39.b f222531c;
    public final mjd.b d;
    public final h4g.g e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineScope f222532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f222533h;

    public g(x shopsOutletsInteractor, w39.b locationInteractor, mjd.b shopsNearbyDraggableWidgetMapper, h4g.g shopsFeatureAvailabilityInteractor, gte.a featureToggleInteractor, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(shopsOutletsInteractor, "shopsOutletsInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(shopsNearbyDraggableWidgetMapper, "shopsNearbyDraggableWidgetMapper");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f222530b = shopsOutletsInteractor;
        this.f222531c = locationInteractor;
        this.d = shopsNearbyDraggableWidgetMapper;
        this.e = shopsFeatureAvailabilityInteractor;
        this.f = featureToggleInteractor;
        this.f222532g = rd0.e.a(dispatcher);
        this.f222533h = j.b(new o10.c(this, 6));
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "NearbyRewardsMedium")) {
            throw new IllegalArgumentException();
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof o69.d
            if (r4 == 0) goto L13
            r4 = r5
            o69.d r4 = (o69.d) r4
            int r0 = r4.f222525w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f222525w = r0
            goto L1a
        L13:
            o69.d r4 = new o69.d
            gim.c r5 = (gim.c) r5
            r4.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f222525w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            h4g.g r5 = r3.e
            efm.r r5 = r5.d()
            r4.f222525w = r2
            java.lang.Object r5 = nim.a.c(r5, r4)
            if (r5 != r0) goto L43
            return r0
        L43:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o69.g.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String listId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        TextLocalisedClause title = new TextLocalisedClause(R$string.home_feed_widget_title_nearby_rewards, null, null, 14);
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.LOADING, AnalyticsContext.INSTANCE);
        MapLoadingWidgetDelegate.Model.Companion companion = MapLoadingWidgetDelegate.Model.INSTANCE;
        zn.b bVar = new zn.b(listId, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE));
        AnalyticsContext analyticsContext = new AnalyticsContext(w0VarE);
        companion.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new MapLoadingWidgetDelegate.Model(listId, yh5.b.a(title), q.MEDIUM, analyticsContext, bVar);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.valueOf(((jte.d) this.f).c(ShopsApi$Toggles$ShopsNearbyRewardsWidget.f87002c));
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return vkm.q.x(new mle.x((StateFlow) this.f222533h.getValue(), this, str, 4), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        NearbyRewardsWidgetContext widgetContext2 = (NearbyRewardsWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new v1(new f(this, widgetType, id10, null));
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((NearbyRewardsWidgetContext) widgetContext, str, eVar);
        return null;
    }
}
