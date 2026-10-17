package by0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.shadow.BottomShadowScrollingViewBehavior;
import com.revolut.core.ui_kit.views.shadow.BottomShadowView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomShadowScrollingViewBehavior f19716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomShadowView f19717b;

    public a(BottomShadowScrollingViewBehavior bottomShadowScrollingViewBehavior, BottomShadowView bottomShadowView) {
        this.f19716a = bottomShadowScrollingViewBehavior;
        this.f19717b = bottomShadowView;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f19717b.setAlpha(Math.min(1.0f, recyclerView.computeVerticalScrollOffset() / ((Number) this.f19716a.f59647a.getValue()).intValue()));
    }
}
