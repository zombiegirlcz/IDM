package op0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.StatItemView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j1 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ResizableTileHeaderView f227314j;
    public final AppCompatImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final StatItemView f227315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StatItemView f227316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final StatItemView f227317n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.earthMapWidget_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ResizableTileHeaderView resizableTileHeaderView = (ResizableTileHeaderView) viewFindViewById;
        this.f227314j = resizableTileHeaderView;
        View viewFindViewById2 = itemView.findViewById(R$id.earthMapWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (AppCompatImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.earthMapWidget_stat1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227315l = (StatItemView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.earthMapWidget_stat2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f227316m = (StatItemView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.earthMapWidget_stat3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f227317n = (StatItemView) viewFindViewById5;
        F(q.DYNAMIC);
        resizableTileHeaderView.setBottomSubtitle(null);
    }
}
