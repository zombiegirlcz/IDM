package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LimitProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ff extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164248h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f164249j;
    public final LimitProgressBar k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.drivingScore_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.drivingScore_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164247g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.drivingScore_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164248h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.drivingScore_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.drivingScore_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164249j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.drivingScore_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (LimitProgressBar) viewFindViewById6;
    }
}
