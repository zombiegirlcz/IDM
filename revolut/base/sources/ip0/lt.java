package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LinearTrackingProgressBar;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lt extends koi.b {
    public final LinearTrackingProgressBar f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TagView f165258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f165259h;
    public final TextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.trackingProgressDelegate_trackingProgressView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (LinearTrackingProgressBar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.trackingProgressDelegate_badgeStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165258g = (TagView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.trackingProgressDelegate_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165259h = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.trackingProgressDelegate_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
    }
}
