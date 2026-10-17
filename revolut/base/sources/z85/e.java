package z85;

import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.api.widget.LoanWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f320043a;

    public e(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f320043a = navigator;
    }

    @Override // csh.f
    public final Class j() {
        return LoanWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        LoanWidgetContext widgetContext2 = (LoanWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i;
        pfm.m mVar = pfm.m.f235744a;
        if (z) {
            BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
            AvatarWidgetDelegate.Model model2 = model instanceof AvatarWidgetDelegate.Model ? (AvatarWidgetDelegate.Model) model : null;
            if (model2 == null) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            Object obj2 = model2.f54968n;
            LoanDetails loanDetails = obj2 instanceof LoanDetails ? (LoanDetails) obj2 : null;
            if (loanDetails == null) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            if (loanDetails.f70144a.o == b95.a.MORTGAGE_LOAN) {
                this.f320043a.c(vhi.c.c(new LoanKompotFeatureConfig.InterestRateBreakdownDestination(loanDetails), yhi.b.BOTTOM_DIALOG, null, false, 12));
            }
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
