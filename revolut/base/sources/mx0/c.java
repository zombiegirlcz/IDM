package mx0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActionsView f209620a;

    public c(ActionsView actionsView) {
        this.f209620a = actionsView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 1) {
            ActionsView actionsView = this.f209620a;
            actionsView.f58304n = null;
            actionsView.o = false;
        }
    }
}
