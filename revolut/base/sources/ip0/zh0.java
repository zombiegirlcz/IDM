package ip0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zh0 extends koi.b {
    public final SwipeToActionLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView.ViewHolder f167466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yh0 f167467h;
    public AnimationRequest i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public bi0 f167468j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh0(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.swipeLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (SwipeToActionLayout) viewFindViewById;
    }

    public final Object F() {
        RecyclerView.ViewHolder viewHolder = this.f167466g;
        if (viewHolder != null) {
            return viewHolder;
        }
        Intrinsics.r("innerViewHolder");
        throw null;
    }
}
