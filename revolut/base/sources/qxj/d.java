package qxj;

import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsKompotFeatureConfig;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.f;
import ish.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc7.a f250101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f250102b;

    public d(a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f250101a = homeFeedWidgetsEventDispatcher;
        this.f250102b = widgetsUiInteractor;
    }

    @Override // csh.f
    public final Class j() {
        return HomeFeedWidgetContext.Junior.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        Object appInvite;
        HomeFeedWidgetContext.Junior widgetContext2 = (HomeFeedWidgetContext.Junior) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q0) {
            h hVar = new h(new ly2.d(this, 26, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (!z) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
        if (!(model instanceof AvatarWidgetDelegate.Model)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        Object obj2 = ((AvatarWidgetDelegate.Model) model).f54968n;
        sxj.a aVar = obj2 instanceof sxj.a ? (sxj.a) obj2 : null;
        if (aVar == null) {
            return mVar;
        }
        String str = aVar.f266522b;
        int i = c.f250100a[aVar.f266521a.ordinal()];
        if (i == 1) {
            appInvite = new JuniorOnboardingDestination.AppInvite(new JuniorOnboardingDestination.AppInvite.InputData(aVar.f266523c, str, JuniorOnboardingDestination.AppInvite.InputData.NextStep.AppAccess.f76964a));
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            appInvite = new JuniorSettingsKompotFeatureConfig.DefaultDestination(str, JuniorSettingsKompotFeatureConfig.InitialStep.AppAccess.f77260a);
        }
        return new h(new phc.d(this, appInvite, 21), 2);
    }
}
