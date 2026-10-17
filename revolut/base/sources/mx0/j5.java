package mx0;

import com.revolut.core.ui_kit.views.DraggableTabsView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DraggableTabsView f209779b;

    public /* synthetic */ j5(DraggableTabsView draggableTabsView, int i) {
        this.f209778a = i;
        this.f209779b = draggableTabsView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f209778a;
        DraggableTabsView draggableTabsView = this.f209779b;
        switch (i) {
            case 0:
                int i2 = DraggableTabsView.f58519q;
                return new es0.c(new mnl.g(draggableTabsView, 24), new j5(draggableTabsView, 2));
            case 1:
                return DraggableTabsView.f(draggableTabsView);
            default:
                return DraggableTabsView.h(draggableTabsView);
        }
    }
}
