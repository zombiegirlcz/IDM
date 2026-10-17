package mx0;

import com.revolut.core.ui_kit.views.DraggableTabsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class i5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DraggableTabsView f209754b;

    public /* synthetic */ i5(DraggableTabsView draggableTabsView, int i) {
        this.f209753a = i;
        this.f209754b = draggableTabsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f209753a;
        DraggableTabsView draggableTabsView = this.f209754b;
        switch (i) {
            case 0:
                return DraggableTabsView.c(draggableTabsView, (String) obj2);
            case 1:
                return DraggableTabsView.g(draggableTabsView, (ar0.h) obj2);
            default:
                ar0.e model = (ar0.e) obj2;
                int i2 = DraggableTabsView.f58519q;
                Intrinsics.checkNotNullParameter(model, "model");
                draggableTabsView.i.onNext(model.f8486c);
                return Unit.f186387a;
        }
    }
}
