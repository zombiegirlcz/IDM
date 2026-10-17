package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.RadialGaugeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tf0 extends koi.b {
    public final RadialGaugeView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f166514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f166515h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.radialGaugeChart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (RadialGaugeView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.radialGaugeChart_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166514g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.radialGaugeChart_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166515h = (TextView) viewFindViewById3;
    }
}
