package ip0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s2 extends koi.b {
    public final ShapeableImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShapeableImageView f166269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f166270h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f166271j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f166272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f166273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final NewBadgeView f166274n;
    public final TextView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.backgroundSelectionItem_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ShapeableImageView shapeableImageView = (ShapeableImageView) viewFindViewById;
        this.f = shapeableImageView;
        View viewFindViewById2 = itemView.findViewById(R$id.backgroundSelectionItem_overlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) viewFindViewById2;
        this.f166269g = shapeableImageView2;
        View viewFindViewById3 = itemView.findViewById(R$id.backgroundSelectionItem_overlayIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166270h = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.backgroundSelectionItem_overlayText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.backgroundSelectionItem_selectionView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166271j = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.backgroundSelectionItem_videoIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (ImageView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.backgroundSelectionItem_themedIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f166272l = (ImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.backgroundSelectionItem_deleteIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById8;
        this.f166273m = imageView;
        View viewFindViewById9 = itemView.findViewById(R$id.backgroundSelectionItem_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f166274n = (NewBadgeView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.backgroundSelectionItem_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = (TextView) viewFindViewById10;
        Context context = itemView.getContext();
        ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
        Intrinsics.h(context);
        shapeableImageView.setShapeAppearanceModel(shapeAppearanceModel.withCornerSize(kli.a.k(context, 20.0f)));
        shapeableImageView2.setShapeAppearanceModel(new ShapeAppearanceModel().withCornerSize(kli.a.k(context, 20.0f)));
        shapeableImageView2.setImageDrawable(new ColorDrawable(kli.a.s(R$attr.uikit_colorBlack_40, context)));
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new iv0.s(kli.a.l(context, 10.0f), true));
        int iK = kli.a.k(context, 10.0f);
        or0.u.l(imageView, iK, iK, iK, iK);
    }
}
