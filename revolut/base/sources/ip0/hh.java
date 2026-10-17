package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hh extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164554h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f164555j;
    public final UiKitMediaView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f164556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ConstraintLayout f164557m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.extraSmallCard_topLeftIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.extraSmallCard_textTopLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164553g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.extraSmallCard_textBottomLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164554h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.extraSmallCard_topRightIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.extraSmallCard_topRightBadgeText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164555j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.extraSmallCard_BackgroundImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById6;
        this.k = uiKitMediaView;
        View viewFindViewById7 = itemView.findViewById(R$id.extraSmallCard_BackgroundImageGradientOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f164556l = viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.extraSmallCard_ConstraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f164557m = (ConstraintLayout) viewFindViewById8;
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
    }
}
