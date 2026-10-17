package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.RichVideoPlayerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hj0 extends koi.b {
    public final RichVideoPlayerView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.swipeableCardVideoDelegate_playerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (RichVideoPlayerView) viewFindViewById;
    }
}
