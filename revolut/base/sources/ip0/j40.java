package ip0;

import com.revolut.core.ui_kit.internal.views.HorizontalProgressView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j40 extends koi.b {
    public final HorizontalProgressView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(HorizontalProgressView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "progressView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
