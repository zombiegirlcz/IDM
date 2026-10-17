package d8b;

import androidx.content.internal.NavDestinationImpl;
import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanScreenId;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureDestination;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import grl.t9;
import ip0.c2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f112199b;

    public /* synthetic */ h(k kVar, String str, int i) {
        this.f112198a = i;
        this.f112199b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f112198a) {
            case 0:
                String widgetId = this.f112199b;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.LOADING, AnalyticsContext.INSTANCE);
                return new AvatarWidgetLoadingDelegate.Model(widgetId, new AnalyticsContext(w0VarE), new zn.b(widgetId, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE)));
            case 1:
                String widgetId2 = this.f112199b;
                Intrinsics.checkNotNullParameter(widgetId2, "widgetId");
                w0 w0VarE2 = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.LOADING, AnalyticsContext.INSTANCE);
                ContactsWidgetDelegate.Model.Companion companion = ContactsWidgetDelegate.Model.INSTANCE;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cobrand_widget_catalogue_title, null, null, 14);
                c2 c2Var = c2.CIRCLE;
                zn.b bVar = new zn.b(widgetId2, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE2));
                AnalyticsContext analyticsContext = new AnalyticsContext(w0VarE2);
                companion.getClass();
                return ContactsWidgetDelegate.Model.Companion.a(widgetId2, textLocalisedClause, c2Var, analyticsContext, bVar);
            case 2:
                String widgetId3 = this.f112199b;
                Intrinsics.checkNotNullParameter(widgetId3, "widgetId");
                w0 w0VarE3 = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.ERROR, AnalyticsContext.INSTANCE);
                return new ErrorWidgetDelegate.Model(widgetId3, null, new TextLocalisedClause(R$string.cobrand_widget_error_could_not_load_points, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_retry, null, null, 14), q.MEDIUM, new AnalyticsContext(w0VarE3), new zn.b(widgetId3, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE3)), 130);
            case 3:
                String widgetId4 = this.f112199b;
                Intrinsics.checkNotNullParameter(widgetId4, "widgetId");
                w0 w0VarE4 = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.ERROR, AnalyticsContext.INSTANCE);
                return new ErrorWidgetDelegate.Model(widgetId4, null, new TextLocalisedClause(R$string.cobrand_widget_error_could_not_load_points, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_retry, null, null, 14), q.MEDIUM, new AnalyticsContext(w0VarE4), new zn.b(widgetId4, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE4)), 130);
            case 4:
                return new AnalyticsContext(m72.b.h("logout", com.bumptech.glide.c.g(new nj8.b(this.f112199b, 9)), AnalyticsContext.INSTANCE));
            case 5:
                return gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, u0.f(new KompotPricingPlanFeatureConfig.StudentDestination(new KompotPricingPlanFeatureConfig.StudentDestination.Mode.VerificationCode(this.f112199b))), 2)));
            case 6:
                return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new InternalPricingPlanFeatureConfig.PlanTerms(this.f112199b, true), false, (Integer) null, 0, 61));
            case 7:
                return gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, u0.f(new KompotPricingPlanFeatureConfig.StudentDestination(new KompotPricingPlanFeatureConfig.StudentDestination.Mode.VerificationCode(this.f112199b))), 2)));
            case 8:
                return new InternalPricingPlanFeatureDestination.PlanOffer(this.f112199b);
            case 9:
                return new FeatureCommand(new KompotPricingPlanFeatureConfig.PlanTemplateScreen(new PricingPlanScreenId(this.f112199b), null));
            case 10:
                return NavDestinationImpl._set_route_$lambda$3(this.f112199b);
            case 11:
                return this.f112199b;
            default:
                xi0.b.Companion.getClass();
                return xi0.a.a(this.f112199b);
        }
    }

    public /* synthetic */ h(String str, int i) {
        this.f112198a = i;
        this.f112199b = str;
    }
}
