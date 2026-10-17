package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.NumberlessCardView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fz extends koi.b {
    public final NumberlessCardView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(View itemView, int i) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.internalDelegateNumberlessCard_cardView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        NumberlessCardView numberlessCardView = (NumberlessCardView) viewFindViewById;
        this.f = numberlessCardView;
        numberlessCardView.setCardWidth(i);
    }
}
