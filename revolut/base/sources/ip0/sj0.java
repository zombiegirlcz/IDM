package ip0;

import android.view.View;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sj0 extends koi.b {
    public final LinearLayout f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.tabsLoading_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (LinearLayout) viewFindViewById;
    }
}
