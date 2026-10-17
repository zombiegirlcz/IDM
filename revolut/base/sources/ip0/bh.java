package ip0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bh extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f163608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f163609h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f163610j;
    public final View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.extraLargeListingCardLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.extraLargeListingCardLoading_headerImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163608g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.extraLargeListingCardLoading_secondSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163609h = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.extraLargeListingCardLoading_secondDetailsItem);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.extraLargeListingCardLoading_secondDetailsValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163610j = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.extraLargeListingCardLoading_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = viewFindViewById6;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorAccentNeutral_20);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        viewFindViewById6.setBackground(dr0.l.h(context, kli.a.v(R$attr.uikit_large_button_corner_radius, context2), solid, 0, null));
    }
}
