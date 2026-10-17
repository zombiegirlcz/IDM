package ip0;

import com.revolut.core.ui_kit.views.FooterTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gj extends koi.b {
    public final FooterTextView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(FooterTextView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "footerTextView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
