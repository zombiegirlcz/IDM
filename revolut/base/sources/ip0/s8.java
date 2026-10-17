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
public final class s8 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f166321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SmallActionButton f166322h;
    public final SmallActionButton i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsTitle_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f = textView;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsTitle_endImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById2;
        this.f166321g = imageView;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsTwinButtons_startButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        SmallActionButton smallActionButton = (SmallActionButton) viewFindViewById3;
        this.f166322h = smallActionButton;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsTwinButtons_endButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (SmallActionButton) viewFindViewById4;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.endToEnd = 0;
        imageView.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.bottomToTop = smallActionButton.getId();
        textView.setLayoutParams(layoutParams4);
    }
}
