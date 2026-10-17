package ip0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ga0 extends koi.b {
    public final CutoutImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f164384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CircleBadgeView f164385h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f164386j;
    public final LinearLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SmallActionButton f164387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f164388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ix0.l0 f164389n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.referralStatus_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CutoutImageView cutoutImageView = (CutoutImageView) viewFindViewById;
        this.f = cutoutImageView;
        View viewFindViewById2 = itemView.findViewById(R$id.referralStatus_badgeTop);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164384g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.referralStatus_badgeBottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164385h = (CircleBadgeView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.referralStatus_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.referralStatus_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164386j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.referralStatus_stagesContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.referralStatus_valueButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f164387l = (SmallActionButton) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.referralStatus_valueImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f164388m = (ImageView) viewFindViewById8;
        this.f164389n = new ix0.l0((ViewGroup) itemView, zhm.u.c(cutoutImageView));
    }
}
