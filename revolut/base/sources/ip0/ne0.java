package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SimpleLimitProgressBarWithText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ne0 extends koi.b {
    public final SimpleLimitProgressBarWithText f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.simpleLimitProgressBarWithText_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (SimpleLimitProgressBarWithText) viewFindViewById;
    }
}
