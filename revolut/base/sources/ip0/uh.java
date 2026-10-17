package ip0;

import com.revolut.core.ui_kit.internal.views.FcaDisclaimerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class uh extends koi.b {
    public final FcaDisclaimerView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(FcaDisclaimerView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "disclaimerView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
