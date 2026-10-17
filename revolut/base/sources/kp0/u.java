package kp0;

import android.widget.LinearLayout;
import androidx.core.view.GestureDetectorCompat;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleReactionView;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView;
import com.revolut.core.ui_kit.internal.views.chat.ChatParentLayout;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends koi.b implements fu0.i {
    public final ChatSwipeToReplyLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChatParentLayout f188099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f188100h;
    public final ChatBubbleView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ChatBubbleReactionView f188101j;
    public UIKitTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Function0 f188102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function0 f188103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function0 f188104n;
    public GestureDetectorCompat o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ChatSwipeToReplyLayout itemView, ChatParentLayout chatParentLayout, LinearLayout contentLayout, ChatBubbleView bubbleView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "chatSwipeToReplyLayout");
        Intrinsics.checkNotNullParameter(chatParentLayout, "chatParentLayout");
        Intrinsics.checkNotNullParameter(contentLayout, "contentLayout");
        Intrinsics.checkNotNullParameter(bubbleView, "bubbleView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
        this.f188099g = chatParentLayout;
        this.f188100h = contentLayout;
        this.i = bubbleView;
        this.f188102l = new kl7.w0(14);
        this.f188103m = new kl7.w0(15);
        this.f188104n = new kl7.w0(16);
        bubbleView.setOnTouchListener(new gzl.b(this, 6));
    }

    @Override // fu0.i
    public final fu0.h getHighlightTarget() {
        return this.i.getHighlightTarget();
    }
}
