package tw0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f274887a = v0.a.d("create(...)");

    public final void a(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == -1) {
            return;
        }
        hp3.j jVar = new hp3.j(1, recyclerView.getContext(), this);
        jVar.setTargetPosition(i);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(jVar);
        }
    }
}
