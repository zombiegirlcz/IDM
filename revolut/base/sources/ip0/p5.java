package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.card_design.CardDesign2dView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p5 extends koi.b {
    public final CardDesign2dView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.internalCardDesignViewDelegate_cardDesignView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (CardDesign2dView) viewFindViewById;
    }
}
