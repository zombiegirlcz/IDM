package ip0;

import android.view.View;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bk extends koi.b {
    public final FullScreenStateView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (FullScreenStateView) itemView;
    }
}
