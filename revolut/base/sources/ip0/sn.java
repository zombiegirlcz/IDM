package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sn extends koi.b {
    public final ChartHeaderView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f166370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f166371h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.histogramEmpty_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ChartHeaderView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.histogramEmpty_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166370g = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.histogramEmpty_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166371h = (ImageView) viewFindViewById3;
    }
}
