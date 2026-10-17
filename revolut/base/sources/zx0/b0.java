package zx0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReactionsKeyboardView f325982a;

    public b0(ReactionsKeyboardView reactionsKeyboardView) {
        this.f325982a = reactionsKeyboardView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        ReactionsKeyboardView reactionsKeyboardView = this.f325982a;
        if (reactionsKeyboardView.getState() == j.SEMI_OPEN && i == 0) {
            boolean zV = ReactionsKeyboardView.v(reactionsKeyboardView, recyclerView.computeVerticalScrollOffset());
            reactionsKeyboardView.P(zV, true);
            reactionsKeyboardView.O(zV, true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        ReactionsKeyboardView reactionsKeyboardView = this.f325982a;
        if (reactionsKeyboardView.getState() == j.SEMI_OPEN) {
            ReactionsKeyboardView.x(reactionsKeyboardView, i2);
            ReactionsKeyboardView.w(reactionsKeyboardView, i2);
        }
    }
}
