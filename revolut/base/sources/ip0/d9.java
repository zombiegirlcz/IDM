package ip0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.input.CenteredAmountContainerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d9 extends koi.b {
    public final CenteredAmountContainerView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (CenteredAmountContainerView) itemView;
    }
}
