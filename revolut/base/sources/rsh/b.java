package rsh;

import aii.r;
import ash.i;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature.widgets.impl.ui.flow.customisation.WidgetCustomisationFlowContact$EmptyState;
import com.revolut.feature.widgets.impl.ui.flow.customisation.WidgetCustomisationFlowContact$EmptyStep;
import com.revolut.feature.widgets.impl.ui.flow.customisation.WidgetCustomisationFlowContact$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dki.g;
import dsh.j;
import dsh.k;
import dsh.m;
import dsh.n;
import h30.l;
import ish.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f257078t;
    public final ish.b u;
    public final WidgetCustomisationFlowContact$InputData v;

    public b(i widgetsInteractor, ish.b widgetContentInteractor, WidgetCustomisationFlowContact$InputData inputData) {
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(widgetContentInteractor, "widgetContentInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f257078t = widgetsInteractor;
        this.u = widgetContentInteractor;
        this.v = inputData;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        final k kVar;
        WidgetCustomisationFlowContact$EmptyStep step = (WidgetCustomisationFlowContact$EmptyStep) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        WidgetCustomisationFlowContact$InputData widgetCustomisationFlowContact$InputData = this.v;
        WidgetContext widgetContext = widgetCustomisationFlowContact$InputData.f96371b;
        String str = widgetCustomisationFlowContact$InputData.d;
        j jVarB = ((h) this.u).b(widgetContext, str, widgetCustomisationFlowContact$InputData.e);
        if (jVarB == null || (kVar = jVarB.f117327b) == null) {
            throw new IllegalStateException(l.r("Widget is not customisable ", str));
        }
        final rrd.l lVar = new rrd.l(this, 4);
        if (kVar instanceof m) {
            BaseScreen baseScreen = ((m) kVar).f117330a;
            final int i = 0;
            Function1 function1 = new Function1() { // from class: rsh.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    r it8 = (r) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            lVar.invoke(((m) kVar).f117331b.invoke(it8));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            lVar.invoke(((n) kVar).f117333b.invoke(it8));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            baseScreen.H = function1;
            return baseScreen;
        }
        if (!(kVar instanceof n)) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewController = ((n) kVar).f117332a;
        final int i2 = 1;
        Function1 block = new Function1() { // from class: rsh.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                r it8 = (r) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        lVar.invoke(((m) kVar).f117331b.invoke(it8));
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        lVar.invoke(((n) kVar).f117333b.invoke(it8));
                        break;
                }
                return Unit.f186387a;
            }
        };
        viewController.getClass();
        Intrinsics.checkNotNullParameter(block, "block");
        viewController.H = block;
        return viewController;
    }

    @Override // dki.g
    public final /* bridge */ /* synthetic */ FlowState x2() {
        return WidgetCustomisationFlowContact$EmptyState.f96368a;
    }

    @Override // dki.g
    public final /* bridge */ /* synthetic */ FlowStep y2() {
        return WidgetCustomisationFlowContact$EmptyStep.f96369a;
    }
}
