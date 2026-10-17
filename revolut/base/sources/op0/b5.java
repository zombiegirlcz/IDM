package op0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b5 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ShimmerFrameLayout f227196j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.travelModeLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227196j = (ShimmerFrameLayout) viewFindViewById;
    }
}
