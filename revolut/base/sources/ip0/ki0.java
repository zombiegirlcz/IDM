package ip0;

import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.swipeablecards.cover.SwipeableCardCoverHeaderView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ki0 extends koi.b {
    public final UiKitMediaView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SwipeableCardCoverHeaderView f165023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ActionFooterView f165024h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.swipeableCardCoverItemDelegate_mediaView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById;
        this.f = uiKitMediaView;
        View viewFindViewById2 = itemView.findViewById(R$id.swipeableCardCoverItemDelegate_headerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165023g = (SwipeableCardCoverHeaderView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.swipeableCardCoverItemDelegate_actionFooter);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165024h = (ActionFooterView) viewFindViewById3;
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
        uiKitMediaView.setVideoShutter(new VideoShutter.Colored(new Color.SolidInt(uiKitMediaView.getContext().getColor(R$color.internal_color_swipeable_cards_cover))));
    }
}
