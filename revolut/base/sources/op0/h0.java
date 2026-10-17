package op0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.widgets.v f227285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f227286b;

    public h0(View view, com.revolut.core.ui_kit.delegates.widgets.v vVar) {
        this.f227285a = vVar;
        this.f227286b = view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 0) {
            com.revolut.core.ui_kit.delegates.widgets.v.H(this.f227286b, this.f227285a);
        }
    }
}
