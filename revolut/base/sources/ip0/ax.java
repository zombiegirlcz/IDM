package ip0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.drawables.LoadingMapGridDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ax extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f163502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f163503h;
    public final View i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.mapPlainLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.mapPlainLoading_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163502g = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.mapPlainLoading_itemsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById3;
        this.f163503h = constraintLayout;
        View viewFindViewById4 = itemView.findViewById(R$id.mapPlainLoading_footer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintLayout.setBackground(new LoadingMapGridDrawable(context));
    }
}
