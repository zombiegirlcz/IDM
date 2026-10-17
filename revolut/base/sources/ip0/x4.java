package ip0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x4 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f167092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f167093h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.bigTileLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.bigTileLoading_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167092g = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.bigTileLoading_cardBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167093h = (ImageView) viewFindViewById3;
    }
}
