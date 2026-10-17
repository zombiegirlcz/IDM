package op0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x4 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f227480j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f227481l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.trackingProgressEmptyWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227480j = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.trackingProgressEmptyWidget_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.trackingProgressEmptyWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f227481l = imageView;
        rd0.e.r(imageView, new yp0.o(yp0.n.FACTOR_100, 0));
    }
}
