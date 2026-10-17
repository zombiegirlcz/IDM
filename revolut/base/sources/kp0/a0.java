package kp0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends com.revolut.core.ui_kit.delegates.chat.a {
    public final ConstraintLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f187961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f187962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f187963r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ChatSwipeToReplyLayout itemView, ConstraintLayout contentView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.o = contentView;
        View viewFindViewById = contentView.findViewById(R$id.chatCallBubble_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f187961p = (ImageView) viewFindViewById;
        View viewFindViewById2 = contentView.findViewById(R$id.chatCallBubble_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f187962q = (TextView) viewFindViewById2;
        View viewFindViewById3 = contentView.findViewById(R$id.chatCallBubble_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f187963r = (TextView) viewFindViewById3;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.o;
    }
}
