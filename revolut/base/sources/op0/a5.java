package op0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LinearTrackingProgressBar;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a5 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearTrackingProgressBar f227166j;
    public final TagView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f227167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f227168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f227169n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f227170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f227171q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.trackingProgressWidget_trackingProgressView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        LinearTrackingProgressBar linearTrackingProgressBar = (LinearTrackingProgressBar) viewFindViewById;
        this.f227166j = linearTrackingProgressBar;
        View viewFindViewById2 = view.findViewById(R$id.trackingProgressWidget_badgeStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (TagView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.trackingProgressWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227167l = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.trackingProgressWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f227168m = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.trackingProgressWidget_mainValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f227169n = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.trackingProgressWidget_secondaryValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.o = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R$id.trackingProgressWidget_footerTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f227170p = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R$id.trackingProgressWidget_footerValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f227171q = (TextView) viewFindViewById8;
        linearTrackingProgressBar.setIcon(R$drawable.uikit_icn_24_delivery_car);
    }
}
