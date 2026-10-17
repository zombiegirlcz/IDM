package ip0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.swipeablecards.SwipeableCardContentHeaderView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class kj0 extends koi.b {
    public final SwipeableCardContentHeaderView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (SwipeableCardContentHeaderView) itemView;
    }
}
