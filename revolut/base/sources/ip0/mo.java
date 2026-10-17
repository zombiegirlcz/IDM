package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.TileHeaderView;
import com.revolut.core.ui_kit.internal.views.barchart.HorizontalBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mo extends koi.b {
    public final TileHeaderView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HorizontalBarView f165409g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.horizontalHistogramTile_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TileHeaderView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.horizontalHistogramTile_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165409g = (HorizontalBarView) viewFindViewById2;
    }
}
