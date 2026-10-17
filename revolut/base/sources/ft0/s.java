package ft0;

import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends koi.b {
    public final UIKitTextView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(UIKitTextView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "textView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
