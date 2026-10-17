package ip0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.drawables.LoadingMapGridDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class uw extends koi.b {

    @NotNull
    private static final tw Companion = new tw();
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f166733g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.mapLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.mapLoading_itemsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        this.f166733g = frameLayout;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        frameLayout.setBackground(new LoadingMapGridDrawable(context));
    }
}
