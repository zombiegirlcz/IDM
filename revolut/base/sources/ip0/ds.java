package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ds extends koi.b {
    public final LargeActionButton f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.largeActionButtonLoadingDelegate_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (LargeActionButton) viewFindViewById;
    }
}
