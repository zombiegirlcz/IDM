package kp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z0 extends com.revolut.core.ui_kit.delegates.chat.a {
    public final View o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ChatSwipeToReplyLayout itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewInflate = LayoutInflater.from(itemView.getContext()).inflate(R$layout.internal_delegate_smart_tile_send_money_loading, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        this.o = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R$id.smartTileSendMoneyLoading_shimmerContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        io3.h.s((ShimmerConstraintLayout) viewFindViewById);
        View viewFindViewById2 = viewInflate.findViewById(R$id.smartTileSendMoneyLoading_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        LargeActionButton largeActionButton = (LargeActionButton) viewFindViewById2;
        largeActionButton.G = null;
        largeActionButton.n(largeActionButton.f58720s);
        largeActionButton.o(LargeActionButton.ButtonStyle.f58737s);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.o;
    }
}
