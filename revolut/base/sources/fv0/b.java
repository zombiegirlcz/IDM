package fv0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.views.toolbox.ToolboxView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ToolboxView f138302a;

    public b(ToolboxView toolboxView) {
        this.f138302a = toolboxView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 1) {
            this.f138302a.h0();
        }
    }
}
