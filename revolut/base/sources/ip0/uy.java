package ip0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class uy extends koi.b {
    public final ConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f166739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f166740h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ShapeableImageView f166741j;
    public final ShapeableImageView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.newsLoading_contentContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.newsLoading_straps);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166739g = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.newsLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166740h = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.newsLoading_footer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.newsLoading_defaultImage);
        ShapeableImageView shapeableImageView = (ShapeableImageView) viewFindViewById5;
        ShapeAppearanceModel.Builder builder = shapeableImageView.getShapeAppearanceModel().toBuilder();
        Intrinsics.checkNotNullExpressionValue(shapeableImageView.getContext(), "getContext(...)");
        shapeableImageView.setShapeAppearanceModel(builder.setAllCorners(0, kli.a.w(R$attr.uikit_dp8, r3)).build());
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "apply(...)");
        this.f166741j = shapeableImageView;
        View viewFindViewById6 = view.findViewById(R$id.newsLoading_highlightedImage);
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) viewFindViewById6;
        ShapeAppearanceModel.Builder builder2 = shapeableImageView2.getShapeAppearanceModel().toBuilder();
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2.getContext(), "getContext(...)");
        ShapeAppearanceModel.Builder topLeftCorner = builder2.setTopLeftCorner(0, kli.a.w(R$attr.uikit_dp8, r3));
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2.getContext(), "getContext(...)");
        shapeableImageView2.setShapeAppearanceModel(topLeftCorner.setTopRightCorner(0, kli.a.w(R$attr.uikit_dp8, r3)).setBottomLeftCorner(0, BitmapDescriptorFactory.HUE_RED).setBottomRightCorner(0, BitmapDescriptorFactory.HUE_RED).build());
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "apply(...)");
        this.k = shapeableImageView2;
    }
}
