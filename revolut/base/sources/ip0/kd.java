package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.timer.CountDownTimerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class kd extends koi.b {
    public final UiKitMediaView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CountDownTimerView f164993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164994h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f164995j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.countDownTimer_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById;
        this.f = uiKitMediaView;
        View viewFindViewById2 = itemView.findViewById(R$id.countDownTimer_timer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164993g = (CountDownTimerView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.countDownTimer_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164994h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.countDownTimer_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.countDownTimer_translucentOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164995j = viewFindViewById5;
        uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        uiKitMediaView.setVideoScaleType(oz0.b.CENTER_CROP);
    }
}
