package cgd;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedFavouritesCounterpartChooserScreen f23938a;

    public j(SharedFavouritesCounterpartChooserScreen sharedFavouritesCounterpartChooserScreen) {
        this.f23938a = sharedFavouritesCounterpartChooserScreen;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 1) {
            ((n60.a) ((ned.k) this.f23938a.f86834d0.getValue()).f214474c.get()).Q();
        }
    }
}
