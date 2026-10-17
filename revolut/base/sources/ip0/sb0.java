package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sb0 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f166333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f166334h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f166335j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.rowLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.rowLoading_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166333g = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.rowLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166334h = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.rowLoading_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.rowLoading_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166335j = viewFindViewById5;
    }
}
