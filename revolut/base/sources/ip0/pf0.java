package ip0;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pf0 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f165820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f165821h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f165822j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.constraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165820g = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.backgroundImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165821h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        View viewFindViewById5 = itemView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.i = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f165822j = viewFindViewById6;
    }
}
