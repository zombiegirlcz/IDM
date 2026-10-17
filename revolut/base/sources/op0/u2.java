package op0;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.views.DraggableWidgetRootFrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u2 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ov0.a f227443j;

    public u2(ov0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DraggableWidgetRootFrameLayout draggableWidgetRootFrameLayout = new DraggableWidgetRootFrameLayout(context, null, 6, 0);
        draggableWidgetRootFrameLayout.addView(view);
        draggableWidgetRootFrameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        super(draggableWidgetRootFrameLayout);
        this.f227443j = view;
    }
}
