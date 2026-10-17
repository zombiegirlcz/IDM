package ft0;

import com.revolut.core.ui_kit.internal.views.SuggestionView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends koi.b {
    public final SuggestionView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SuggestionView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "toggleView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
