package ip0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r9 extends koi.b {
    public final ConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShimmerFrameLayout f166148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f166149h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f166150j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.centeredContentTileLoading_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.centeredContentTileLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166148g = (ShimmerFrameLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.centeredContentTileLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166149h = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.centeredContentTileLoading_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.centeredContentTileLoading_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166150j = viewFindViewById5;
    }
}
