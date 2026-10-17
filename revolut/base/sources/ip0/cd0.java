package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cd0 extends koi.b {
    public final LinearGaugeChartView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitTextView f163719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f163720h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.linearGaugeChartView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (LinearGaugeChartView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.startLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163719g = (UIKitTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.endLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163720h = (UIKitTextView) viewFindViewById3;
    }
}
