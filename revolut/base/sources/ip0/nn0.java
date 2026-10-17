package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ActionStatusView;
import com.revolut.core.ui_kit.internal.views.LazyInflatableCachedView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.StatusProgressBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nn0 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f165544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LazyInflatableCachedView f165545h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f165546j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f165547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StatusProgressBarView f165548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SmallActionButton f165549n;
    public final ActionStatusView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.leftTopText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.vaultsProgressLeftTopText_endTextImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165544g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.vaultsProgress_endTopValueContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165545h = (LazyInflatableCachedView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.vaultsProgress_leftTopDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.internalDelegateVaultsProgress_bottomTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f165546j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.startBottomText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.endBottomText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f165547l = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f165548m = (StatusProgressBarView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.vaultsProgress_actionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f165549n = (SmallActionButton) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.bottomActionStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = (ActionStatusView) viewFindViewById10;
    }
}
