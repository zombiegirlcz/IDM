package ms0;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f1 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f208246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f208247h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ImageView imageView = (ImageView) itemView.findViewById(R$id.indexBarDelegate_bar);
        this.f = imageView;
        this.f208246g = (TextView) itemView.findViewById(R$id.indexBarDelegate_title);
        this.f208247h = (TextView) itemView.findViewById(R$id.indexBarDelegate_subtitle);
        Intrinsics.checkNotNullExpressionValue(imageView.getContext(), "getContext(...)");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new ShapeAppearanceModel().withCornerSize(kli.a.k(r4, 2.0f)));
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(-16777216));
        imageView.setImageDrawable(materialShapeDrawable);
    }
}
