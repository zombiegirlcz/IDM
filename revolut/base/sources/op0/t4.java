package op0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.UIKitRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t4 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.widgets.o4 f227435a;

    public t4(com.revolut.core.ui_kit.delegates.widgets.o4 o4Var) {
        this.f227435a = o4Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z;
        com.revolut.core.ui_kit.delegates.widgets.o4 o4Var = this.f227435a;
        UIKitRecyclerView uIKitRecyclerView = o4Var.f55453a;
        bs0.c cVar = o4Var.d;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i != 0) {
            if (i == 1 && !o4Var.i) {
                cVar.attachToRecyclerView(uIKitRecyclerView);
                o4Var.i = true;
                return;
            }
            return;
        }
        boolean z3 = o4Var.i;
        if (z3 || (z = o4Var.f55457h) || z || z3) {
            return;
        }
        cVar.attachToRecyclerView(uIKitRecyclerView);
        o4Var.i = true;
    }
}
