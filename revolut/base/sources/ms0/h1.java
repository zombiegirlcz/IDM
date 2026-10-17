package ms0;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h1 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ImageView imageView = (ImageView) itemView.findViewById(R$id.indexBarLoading_bar);
        this.f = (ShimmerFrameLayout) itemView.findViewById(R$id.indexBarLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(imageView.getContext(), "getContext(...)");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new ShapeAppearanceModel().withCornerSize(kli.a.k(r4, 2.0f)));
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(-16777216));
        imageView.setImageDrawable(materialShapeDrawable);
    }
}
