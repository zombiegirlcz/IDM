package op0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r1 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f227396j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f227397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f227398m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.goalProgressEmptyWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227396j = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.goalProgressEmptyWidget_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.goalProgressEmptyWidget_secondaryDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227397l = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.goalProgressEmptyWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f227398m = imageView;
        rd0.e.r(imageView, new yp0.o(yp0.n.FACTOR_100, 0));
    }
}
