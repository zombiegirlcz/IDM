package yr0;

import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends koi.b {
    public final UIKitTextView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(UIKitTextView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "title");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
