package zl7;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.OnScrollListener implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f323193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f323194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f323195c;
    public boolean d;

    public d(RecyclerView recyclerView, Function1 action) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f323193a = recyclerView;
        this.f323194b = action;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        this.d = !this.f323193a.canScrollVertically(1);
        boolean z = Math.abs(i) == appBarLayout.getTotalScrollRange();
        this.f323195c = z;
        this.f323194b.invoke(Boolean.valueOf(z && this.d));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        boolean zCanScrollVertically = recyclerView.canScrollVertically(1);
        this.d = !zCanScrollVertically;
        this.f323194b.invoke(Boolean.valueOf(this.f323195c && !zCanScrollVertically));
    }
}
