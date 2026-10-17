package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gi extends koi.b {
    public final ImageView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.pagePreviewLoading_shimmering);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ShapeAppearanceModel shapeAppearanceModelWithCornerSize = shapeAppearanceModel.withCornerSize(kli.a.l(context, 40.0f));
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelWithCornerSize, "withCornerSize(...)");
        Drawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelWithCornerSize);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(shapeAppearanceModelWithCornerSize);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        materialShapeDrawable2.setStrokeWidth(kli.a.l(context2, 1.0f));
        Context context3 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        TransferAmountPagePreviewDelegate.INSTANCE.getClass();
        materialShapeDrawable2.setStrokeColor(ColorStateList.valueOf(kli.a.s(TransferAmountPagePreviewDelegate.d, context3)));
        materialShapeDrawable2.setFillColor(ColorStateList.valueOf(0));
        itemView.setBackground(materialShapeDrawable);
        itemView.setForeground(materialShapeDrawable2);
        itemView.setClipToOutline(true);
    }
}
