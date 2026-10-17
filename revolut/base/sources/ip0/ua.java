package ip0;

import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.chat.ChatTimestampBubbleView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ua extends koi.b {
    public final ChatTimestampBubbleView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f166638g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.chatTimestampBubble_chatTimestampBubble);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ChatTimestampBubbleView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.chatTimeStampBubble_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166638g = (FrameLayout) viewFindViewById2;
    }
}
