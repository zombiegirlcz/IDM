package ip0;

import com.revolut.core.ui_kit.views.ProfileCardView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p30 extends koi.b {
    public final ProfileCardView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(ProfileCardView itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "profileCardView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
