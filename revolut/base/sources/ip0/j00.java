package ip0;

import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j00 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f164771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f164772h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f164773j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j00(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.passCardLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.passCardLoading_logo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.passCardLoading_headerTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164771g = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.passCardLoading_headerValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f164772h = viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.passCardLoading_headerIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.i = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.passCardLoading_contentImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f164773j = (ImageView) viewFindViewById6;
    }
}
