package yq0;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.delegates.scroller.lm.WrapContentScrollerLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends DefaultItemAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WrapContentScrollerLayoutManager f315965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f315966b;

    public f(WrapContentScrollerLayoutManager wrapContentScrollerLayoutManager, RecyclerView recyclerView) {
        this.f315965a = wrapContentScrollerLayoutManager;
        this.f315966b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void onAnimationFinished(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.onAnimationFinished(viewHolder);
        this.f315965a.f55878g = null;
        RecyclerView recyclerView = this.f315966b;
        recyclerView.post(new x.b(recyclerView, 13));
    }
}
