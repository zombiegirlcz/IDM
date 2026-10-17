package ip0;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ChildTouchGuardFrameLayout;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xd0 extends koi.b {
    public final RecyclerView.ViewHolder f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SecondaryBackgroundConstraintLayout f167143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ChildTouchGuardFrameLayout f167144h;
    public vd0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f167145j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd0(View view, RecyclerView.ViewHolder innerViewHolder) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(innerViewHolder, "innerViewHolder");
        this.f = innerViewHolder;
        View viewFindViewById = this.itemView.findViewById(R$id.row_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f167143g = (SecondaryBackgroundConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.innerContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167144h = (ChildTouchGuardFrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.tickIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167145j = (ImageView) viewFindViewById3;
    }
}
