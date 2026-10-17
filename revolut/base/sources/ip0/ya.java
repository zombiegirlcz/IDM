package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ya extends koi.b {
    public final CircleActionButtonsBarView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.circleButtonsBar_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (CircleActionButtonsBarView) viewFindViewById;
    }
}
