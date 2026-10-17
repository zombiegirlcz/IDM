package j28;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements e {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n28.d f170730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f170731b;

    public m(n28.d widgetAvailabilityProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f170730a = widgetAvailabilityProvider;
        this.f170731b = featureToggleInteractor;
    }

    @Override // j28.e
    public final int a() {
        return 1;
    }

    @Override // j28.e
    public final Flow b(InvestWidgetContext widgetContext, String widgetType) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new go.g(new Data(new RowDelegate.Model("LIST_ID_AUTOMATIONS_RECURRING_BUY", new RowDelegate.Model.MainImage.Image40(c.b(R$drawable.uikit_icn_24_calendar_recurring), null, null, false, null, false, 60), new TextLocalisedClause(R$string.wealth_invest_widget_automations_item_recurring_buy_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_invest_widget_automations_item_recurring_buy_subtitle, null, null, 14), null, null, 0, c.a(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848), null, false, 6, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // j28.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof j28.l
            if (r4 == 0) goto L13
            r4 = r5
            j28.l r4 = (j28.l) r4
            int r0 = r4.f170729w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f170729w = r0
            goto L1a
        L13:
            j28.l r4 = new j28.l
            gim.c r5 = (gim.c) r5
            r4.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f170729w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r5 = com.revolut.shared.feature.wealth.models.account.WealthAccountType.SECURITIES
            r4.f170729w = r2
            n28.d r1 = r3.f170730a
            java.lang.Object r5 = r1.d(r5, r4)
            if (r5 != r0) goto L41
            return r0
        L41:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L56
            com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub r4 = com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c
            gte.a r5 = r3.f170731b
            jte.d r5 = (jte.d) r5
            boolean r4 = r5.c(r4)
            if (r4 == 0) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j28.m.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
