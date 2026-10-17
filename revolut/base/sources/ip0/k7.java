package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k7 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f164973h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsImage_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsImage_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164972g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsImage_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164973h = (ImageView) viewFindViewById3;
    }
}
