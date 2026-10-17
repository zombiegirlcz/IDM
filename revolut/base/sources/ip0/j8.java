package ip0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j8 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f164802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164803h;
    public final SmallActionButton i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsTitle_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f = textView;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsTitle_endImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById2;
        this.f164802g = imageView;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsSingleButton_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164803h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsSingleButton_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        SmallActionButton smallActionButton = (SmallActionButton) viewFindViewById4;
        this.i = smallActionButton;
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 24.0f);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.goneEndMargin = iA;
        textView.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.endToStart = smallActionButton.getId();
        layoutParams4.setMarginEnd(iA);
        imageView.setLayoutParams(layoutParams4);
    }
}
