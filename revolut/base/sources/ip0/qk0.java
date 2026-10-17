package ip0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qk0 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f166011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShapeableImageView f166012h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.themeSwitcherRounded_itemLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f = textView;
        View viewFindViewById2 = itemView.findViewById(R$id.themeSwitcherRounded_itemSelection);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166011g = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.themeSwitcherRounded_itemBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ShapeableImageView shapeableImageView = (ShapeableImageView) viewFindViewById3;
        this.f166012h = shapeableImageView;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setBackground(new RoundedBackgroundDrawable(context, 0, 6));
        ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
        Intrinsics.checkNotNullExpressionValue(shapeableImageView.getContext(), "getContext(...)");
        shapeableImageView.setShapeAppearanceModel(shapeAppearanceModel.withCornerSize(kli.a.k(r1, 16.0f)));
    }
}
