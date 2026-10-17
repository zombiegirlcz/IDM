package op0;

import android.view.View;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t1 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ShimmerConstraintLayout f227422j;
    public final UIKitTextView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.goalProgressLoadingTileWidget_shimmeringLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227422j = (ShimmerConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.goalProgressLoadingTileWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (UIKitTextView) viewFindViewById2;
    }
}
