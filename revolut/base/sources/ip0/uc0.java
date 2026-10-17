package ip0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class uc0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc0 f166642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScrollerDelegate f166643b;

    public uc0(ScrollerDelegate scrollerDelegate, vc0 transformer) {
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f166643b = scrollerDelegate;
        this.f166642a = transformer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        ScrollerDelegate.p(this.f166643b, recyclerView, this.f166642a);
    }
}
