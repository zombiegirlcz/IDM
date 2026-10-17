package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.views.BadgeStatusView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k60 extends koi.b {
    public final UiKitMediaView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164968h;
    public final BadgeStatusView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f164969j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f164970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SmallActionButton f164971m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.promotionalMediumTile_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById;
        this.f = uiKitMediaView;
        View viewFindViewById2 = itemView.findViewById(R$id.promotionalMediumTile_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164967g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.promotionalMediumTile_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164968h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.promotionalMediumTile_topLeftBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (BadgeStatusView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.promotionalMediumTile_topLeftStatusIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164969j = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.promotionalMediumTile_topLeftStatusLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.promotionalMediumTile_closeIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f164970l = (ImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.promotionalMediumTile_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f164971m = (SmallActionButton) viewFindViewById8;
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
    }
}
