package ip0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends koi.b {
    public final com.revolut.core.ui_kit.delegates.zf f;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(com.revolut.core.ui_kit.delegates.zf rowDelegateViewHolder) {
        Intrinsics.checkNotNullParameter(rowDelegateViewHolder, "rowDelegateViewHolder");
        View itemView = rowDelegateViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        super(itemView);
        this.f = rowDelegateViewHolder;
    }
}
