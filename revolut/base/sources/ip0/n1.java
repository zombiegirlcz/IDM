package ip0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.AppTipView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n1 extends koi.b {
    public final AppTipView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (AppTipView) itemView;
    }
}
