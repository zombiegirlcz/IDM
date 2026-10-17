package ip0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f166569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f166570h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f166571j;
    public final SmallActionButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SmallActionButton f166572l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.actionWidgetLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.actionWidgetLoading_imageStart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166569g = (AppCompatImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.actionWidgetLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166570h = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.actionWidgetLoading_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.actionWidgetLoading_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166571j = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.actionWidgetLoading_buttonPrimary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (SmallActionButton) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.actionWidgetLoading_buttonSecondary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f166572l = (SmallActionButton) viewFindViewById7;
    }
}
