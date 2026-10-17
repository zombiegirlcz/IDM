package ip0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.OrderBookItemDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xz extends koi.b {
    public final SmallActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecyclerView f167224g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.orderBookRestricted_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (SmallActionButton) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.orderBookRestricted_recycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f167224g = recyclerView;
        recyclerView.setAdapter(new z4l.j(7, zhm.u.c(new OrderBookItemDelegate()), false));
    }
}
