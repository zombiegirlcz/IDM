package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bt extends koi.b {
    public final SmallActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SmallActionButton f163655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.delegateLikeDislike_topLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.delegateLikeDislike_buttons);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = itemView.findViewById(R$id.delegateLikeDislike_primaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f = (SmallActionButton) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.delegateLikeDislike_secondaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f163655g = (SmallActionButton) viewFindViewById4;
    }
}
