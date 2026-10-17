package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.trend.TrendPreviewView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cm0 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f163761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TrendPreviewView f163762h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm0(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.trendPreview_valuePrimary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.trendPreview_valueSecondary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163761g = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.trendPreview_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163762h = (TrendPreviewView) viewFindViewById3;
    }
}
