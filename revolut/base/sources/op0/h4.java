package op0;

import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h4 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f227291j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.supportTileWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f227291j = imageView;
        View viewFindViewById2 = itemView.findViewById(R$id.supportTileWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = itemView.findViewById(R$id.supportTileWidget_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        rd0.e.r(imageView, new yp0.o(yp0.n.FACTOR_60, 0));
    }
}
