package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g70 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f164360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164361h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f164362j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f164363l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f164364m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f164365n;
    public final View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f164366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f164367q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g70(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.qrCode_logo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.qrCode_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164360g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.qrCode_emptyStateTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164361h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.qrCode_emptyStateSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.qrCode_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164362j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.qrCode_caption);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.qrCode_overlayImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f164363l = (ImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.qrCode_overlayText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f164364m = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.qrCode_overlayCaption);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f164365n = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.qrCode_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.qrCode_overlayContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f164366p = viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.qrCode_boxContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f164367q = viewFindViewById12;
    }
}
