package ip0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e2 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f164007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f164008h;
    public final ViewGroup i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.avatarLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.avatarLoading_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164007g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.avatarLoading_cardImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164008h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.avatarLoading_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ViewGroup) viewFindViewById4;
    }
}
