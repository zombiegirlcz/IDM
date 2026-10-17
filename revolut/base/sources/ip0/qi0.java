package ip0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.swipeablecards.SwipeableCardContentHeaderView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qi0 extends koi.b {
    public final SwipeableCardContentHeaderView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f165986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f165987h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.swipeableCardFullSizeContent_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (SwipeableCardContentHeaderView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.swipeableCardFullSizeContent_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165986g = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.swipeableCardFullSizeContent_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165987h = (AppCompatImageView) viewFindViewById3;
    }
}
