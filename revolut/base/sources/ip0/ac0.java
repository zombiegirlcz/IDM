package ip0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ac0 extends koi.b {
    public final com.revolut.core.ui_kit.delegates.zf f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SmallActionButton f163418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SmallActionButton f163419h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FrameLayout f163420j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac0(View itemView, com.revolut.core.ui_kit.delegates.zf rowDelegateViewHolder) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(rowDelegateViewHolder, "rowDelegateViewHolder");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = rowDelegateViewHolder;
        View viewFindViewById = itemView.findViewById(R$id.rowQuantity_decreaseButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f163418g = (SmallActionButton) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.rowQuantity_increaseButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163419h = (SmallActionButton) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.rowQuantity_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (TextView) viewFindViewById3;
        this.f163420j = (FrameLayout) ((ConstraintLayout) itemView).findViewById(R$id.rowQuantity_rowContainer);
    }
}
