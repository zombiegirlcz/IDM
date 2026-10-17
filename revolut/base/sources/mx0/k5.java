package mx0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k5 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DraggableTabsView f209790a;

    public k5(DraggableTabsView draggableTabsView) {
        this.f209790a = draggableTabsView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        DraggableTabsView draggableTabsView = this.f209790a;
        if (draggableTabsView.getDraggableTabs_tabs().getVisibility() == 8) {
            draggableTabsView.getDraggableTabs_tabs().getTabLayout$ui_kit_components_release().scrollBy(i, i2);
        }
    }
}
