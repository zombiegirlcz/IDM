package q3i;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import jf0.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p3i.b;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f241974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f241975b;

    public a(gte.a featureToggleInteractor, m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f241974a = navigator;
        this.f241975b = featureToggleInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "feedback");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.retail.core.navigation.FeatureCommand b(jf0.c r11) {
        /*
            r10 = this;
            java.util.HashMap r11 = r11.d
            java.lang.String r0 = "entityId"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 != 0) goto Lf
            goto L8d
        Lf:
            java.lang.String r2 = "entityType"
            java.lang.Object r11 = r11.get(r2)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L8d
            kotlin.enums.EnumEntries r2 = yo6.d.a()
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r2.next()
            r4 = r3
            yo6.d r4 = (yo6.d) r4
            java.lang.String r4 = r4.b()
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r11)
            if (r4 == 0) goto L21
            goto L3a
        L39:
            r3 = r1
        L3a:
            yo6.d r3 = (yo6.d) r3
            if (r3 != 0) goto L3f
            goto L8d
        L3f:
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r11 = new com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.f160140a
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r4 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action r5 = new com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload$Action
            com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction$Success r6 = new com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction$Success
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r8 = com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_success_v2
            r9 = 14
            r7.<init>(r8, r1, r1, r9)
            r6.<init>(r7, r1)
            r5.<init>(r6)
            r4.<init>(r1, r5)
            r5 = 12
            r11.<init>(r2, r4, r1, r5)
            yo6.d r2 = yo6.d.WORKFLOW_STEP
            if (r3 != r2) goto L7b
            com.revolut.feature.feedback.api.di.FeedbackApi$FeedbackToggles$WorkflowStepNpsRedesign r2 = com.revolut.feature.feedback.api.di.FeedbackApi$FeedbackToggles$WorkflowStepNpsRedesign.f73123c
            gte.a r4 = r10.f241975b
            jte.d r4 = (jte.d) r4
            boolean r2 = r4.c(r2)
            if (r2 == 0) goto L7b
            com.revolut.feature.feedback.api.navigation.OneClickFeedbackDestination r2 = new com.revolut.feature.feedback.api.navigation.OneClickFeedbackDestination
            com.revolut.feature.feedback.api.navigation.OneClickFeedbackDestination$InputData r3 = new com.revolut.feature.feedback.api.navigation.OneClickFeedbackDestination$InputData
            r3.<init>(r11, r0)
            r2.<init>(r3)
            goto L85
        L7b:
            com.revolut.feature.feedback.api.navigation.FeedbackDestination r2 = new com.revolut.feature.feedback.api.navigation.FeedbackDestination
            com.revolut.feature.feedback.api.navigation.FeedbackDestination$InputData r4 = new com.revolut.feature.feedback.api.navigation.FeedbackDestination$InputData
            r4.<init>(r0, r3)
            r2.<init>(r4, r11)
        L85:
            yhi.b r11 = yhi.b.BOTTOM_DIALOG
            r0 = 0
            com.revolut.retail.core.navigation.FeatureCommand r11 = vhi.c.c(r2, r11, r1, r0, r5)
            return r11
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q3i.a.b(jf0.c):com.revolut.retail.core.navigation.FeatureCommand");
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        FeatureCommand featureCommandB = b(cVar);
        if (featureCommandB == null) {
            return null;
        }
        return new h(new BridgeDestination(featureCommandB), null);
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new pu9.a(this, deeplink, 3), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
