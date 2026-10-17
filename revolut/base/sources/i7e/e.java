package i7e;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.c1;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import com.revolut.feature.retail.goals.api.navigation.GoalsContract$Account;
import com.revolut.feature.retail.goals.api.navigation.GoalsDestination;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;
import pcd.e0;
import pcd.s;
import pfm.m;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f159281a;

    public e(k39.b navigationCommandDispatcher) {
        Intrinsics.checkNotNullParameter(navigationCommandDispatcher, "navigationCommandDispatcher");
        this.f159281a = navigationCommandDispatcher;
    }

    public final efm.b b(s sVar) {
        if (sVar == null) {
            return m.f235744a;
        }
        String str = sVar.f234881a;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return this.f159281a.a(u0.f(new GoalsDestination(sVar.f234885h instanceof e0 ? new GoalsContract$Account.SavingsAccount(str, null) : new GoalsContract$Account.Vault(str, null))));
    }

    @Override // csh.f
    public final Class j() {
        return VaultWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        VaultWidgetContext widgetContext2 = (VaultWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof i) {
            BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
            GoalProgressWidgetDelegate.Model model2 = model instanceof GoalProgressWidgetDelegate.Model ? (GoalProgressWidgetDelegate.Model) model : null;
            Object obj2 = model2 != null ? model2.f55148j : null;
            return b(obj2 instanceof s ? (s) obj2 : null);
        }
        if (event instanceof c1) {
            Object obj3 = ((c1) event).f55312c.f55148j;
            return b(obj3 instanceof s ? (s) obj3 : null);
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
