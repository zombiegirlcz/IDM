package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.timer.CountDownTimerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fd extends koi.b {
    public final CountDownTimerView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.countDownTimerCompact_timer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (CountDownTimerView) viewFindViewById;
    }
}
