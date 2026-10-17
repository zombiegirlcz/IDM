package op0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s2 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ShimmerConstraintLayout f227411j;
    public final TextView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ShimmerConstraintLayout shimmerConstraintLayout = (ShimmerConstraintLayout) itemView.findViewById(R$id.inputWidgetLoading_container);
        this.f227411j = shimmerConstraintLayout;
        this.k = (TextView) itemView.findViewById(R$id.inputLoadingWidget_title);
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        shimmerConstraintLayout.h0(yp0.a0.a(context));
        shimmerConstraintLayout.setShimmerMode(c9.f.SHIMMERING_CHILDREN_ONLY);
        View viewFindViewById = itemView.findViewById(R$id.inputLoadingWidget_textBox);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        viewFindViewById.setBackground(dr0.l.h(context2, 16.0f, new Color.Solid(R$attr.uikit_colorSearchBackground), 0, null));
    }
}
