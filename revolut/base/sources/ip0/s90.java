package ip0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class s90 extends koi.b {

    @NotNull
    private static final r90 Companion = new r90();
    public final LinearGaugeChartView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f166325g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s90(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.ratingBar_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (LinearGaugeChartView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.ratingBar_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166325g = (AppCompatTextView) viewFindViewById2;
    }
}
