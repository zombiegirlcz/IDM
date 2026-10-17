package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fb0 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164233h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f164234j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f164235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f164236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f164237n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f164238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TagView f164239q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.roomPreviewCard_previewImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.roomPreviewCard_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164232g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.roomPreviewCard_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164233h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.roomPreviewCard_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.roomPreviewCard_detailsTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164234j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.roomPreviewCard_detailsSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.roomPreviewCard_detailsAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f164235l = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.cellDetailsPrice_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f164236m = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.cellDetailsPrice_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f164237n = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.cellDetailsPrice_strikethroughPrice);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = (TextView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.roomPreviewCard_cashbackTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f164238p = (TextView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.roomPreviewCard_cashbackBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f164239q = (TagView) viewFindViewById12;
    }
}
