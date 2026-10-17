package ip0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.SwipeableCardInnerRecyclerItemDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wi0 extends koi.b {
    public final RecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LargeActionButton f167035g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi0(SwipeableCardInnerRecyclerItemDelegate swipeableCardInnerRecyclerItemDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.swipeableCardInnerRecyclerItemDelegate_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f = recyclerView;
        View viewFindViewById2 = itemView.findViewById(R$id.swipeableCardInnerRecyclerItemDelegate_largeButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167035g = (LargeActionButton) viewFindViewById2;
        yp0.y.h(recyclerView, new z4l.j(7, swipeableCardInnerRecyclerItemDelegate.f53512c, false), new LinearLayoutManager(itemView.getContext()));
    }
}
