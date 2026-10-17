package ip0;

import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u0 extends koi.b {
    public final com.revolut.core.ui_kit.delegates.zf f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t0 f166573g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(View itemView, RowDelegate rowDelegate, RowLoadingDelegate rowLoadingDelegate, AmountEditDelegate amountEditDelegate) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(rowLoadingDelegate, "rowLoadingDelegate");
        Intrinsics.checkNotNullParameter(amountEditDelegate, "amountEditDelegate");
        View viewFindViewById = itemView.findViewById(R$id.amountEditWithCell_cell);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        FrameLayout parent = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.amountEditWithCell_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        FrameLayout parent2 = (FrameLayout) viewFindViewById2;
        rowDelegate.getClass();
        com.revolut.core.ui_kit.delegates.zf zfVarA = RowDelegate.A(parent);
        this.f = zfVarA;
        rowLoadingDelegate.getClass();
        Intrinsics.checkNotNullParameter(parent, "parent");
        sb0 sb0Var = new sb0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_row_loading));
        amountEditDelegate.getClass();
        Intrinsics.checkNotNullParameter(parent2, "parent");
        t0 t0Var = new t0(kotlin.jvm.internal.s.r(parent2, R$layout.internal_delegate_amount_edit));
        this.f166573g = t0Var;
        parent.addView(sb0Var.itemView);
        View view = zfVarA.itemView;
        view.setVisibility(8);
        parent.addView(view);
        parent2.addView(t0Var.itemView);
    }
}
