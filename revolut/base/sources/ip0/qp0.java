package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qp0 extends koi.b {
    public final View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp0(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = this.itemView.findViewById(R$id.cardHeaderLoading_shimmeringLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = viewFindViewById;
    }
}
