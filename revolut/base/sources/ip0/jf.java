package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jf extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f164832h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.loadingDropDown_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.loadingDropDown_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164831g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.loadingDropDown_mainIconView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164832h = (ImageView) viewFindViewById3;
    }
}
