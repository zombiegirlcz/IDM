package op0;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import ip0.r40;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class x3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RowsWidgetDelegate f227478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RowsWidgetDelegate.Model f227479c;

    public /* synthetic */ x3(RowsWidgetDelegate rowsWidgetDelegate, RowsWidgetDelegate.Model model, int i) {
        this.f227477a = i;
        this.f227478b = rowsWidgetDelegate;
        this.f227479c = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227477a) {
            case 0:
                RowDelegate.Model rowModel = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(rowModel, "rowModel");
                RowsWidgetDelegate.Model model = this.f227479c;
                this.f227478b.r(model, new com.revolut.core.ui_kit.delegates.widgets.i3(model.e, rowModel));
                break;
            case 1:
                RowDelegate.Model rowModel2 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(rowModel2, "rowModel");
                RowsWidgetDelegate.Model model2 = this.f227479c;
                this.f227478b.r(model2, new com.revolut.core.ui_kit.delegates.widgets.m3(model2.e, rowModel2));
                break;
            case 2:
                SmallActionButtonDelegate.Model footerModel = (SmallActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(footerModel, "footerModel");
                RowsWidgetDelegate.Model model3 = this.f227479c;
                this.f227478b.r(model3, new com.revolut.core.ui_kit.delegates.widgets.g3(model3.e, footerModel.f53342j));
                break;
            case 3:
                LargeActionButtonDelegate.Model footerModel2 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(footerModel2, "footerModel");
                RowsWidgetDelegate.Model model4 = this.f227479c;
                this.f227478b.r(model4, new com.revolut.core.ui_kit.delegates.widgets.g3(model4.e, footerModel2.i));
                break;
            case 4:
                r40 progressStepModel = (r40) obj2;
                Intrinsics.checkNotNullParameter(progressStepModel, "progressStepModel");
                RowsWidgetDelegate.Model model5 = this.f227479c;
                this.f227478b.r(model5, new com.revolut.core.ui_kit.delegates.widgets.h3(model5.e, progressStepModel));
                break;
            case 5:
                vh clickData = (vh) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                RowsWidgetDelegate.Model model6 = this.f227479c;
                this.f227478b.r(model6, new com.revolut.core.ui_kit.delegates.widgets.j3(model6.e, clickData));
                break;
            default:
                g6 selectedData = (g6) obj2;
                Intrinsics.checkNotNullParameter(selectedData, "selectedData");
                RowsWidgetDelegate.Model model7 = this.f227479c;
                this.f227478b.r(model7, new com.revolut.core.ui_kit.delegates.widgets.k3(model7.e, selectedData));
                break;
        }
        return Unit.f186387a;
    }
}
