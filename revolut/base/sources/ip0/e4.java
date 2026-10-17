package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.RadialGaugeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e4 extends koi.b {
    public final RadialGaugeView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164016h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f164017j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f164018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f164019m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.radialGaugeChart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (RadialGaugeView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.radialGaugeChart_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164015g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.radialGaugeChart_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164016h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.radialGaugeChart_leftLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.radialGaugeChart_leftTopLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164017j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.radialGaugeChart_topLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.radialGaugeChart_rightTopLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f164018l = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.radialGaugeChart_rightLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f164019m = (TextView) viewFindViewById8;
    }
}
