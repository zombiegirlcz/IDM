package pb0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowWidgetProgression;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WidgetProgressionItem f234601b;

    public /* synthetic */ j(WidgetProgressionItem widgetProgressionItem, int i) {
        this.f234600a = i;
        this.f234601b = widgetProgressionItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BackendFlowWidgetProgression widgetProgression = (BackendFlowWidgetProgression) obj2;
        switch (this.f234600a) {
            case 0:
                Intrinsics.checkNotNullParameter(widgetProgression, "widgetProgression");
                break;
            default:
                Intrinsics.checkNotNullParameter(widgetProgression, "widgetProgression");
                break;
        }
        return WidgetProgressionItem.d(this.f234601b, widgetProgression);
    }
}
