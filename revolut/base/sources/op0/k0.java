package op0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.barchart.HorizontalBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ResizableTileHeaderView f227324j;
    public final HorizontalBarView.HorizontalBar k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AppCompatTextView f227325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AppCompatTextView f227326m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellWithLinearProgressWidget_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227324j = (ResizableTileHeaderView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellWithLinearProgressWidget_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (HorizontalBarView.HorizontalBar) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellWithProgressWidget_bottomStartLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227325l = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellWithProgressWidget_bottomEndLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f227326m = (AppCompatTextView) viewFindViewById4;
    }
}
