package kp0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends com.revolut.core.ui_kit.delegates.chat.a {
    public final LinearLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final et0.l f188021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final UIKitTextView f188022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a5h.g f188023r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ChatSwipeToReplyLayout itemView, LinearLayout contentView, et0.l imagesGridView, UIKitTextView anchor) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(imagesGridView, "imagesGridView");
        Intrinsics.checkNotNullParameter(anchor, "captionView");
        this.o = contentView;
        this.f188021p = imagesGridView;
        this.f188022q = anchor;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.k = anchor;
        UIKitTextView uIKitTextView = this.f53954j;
        if (uIKitTextView != null) {
            this.i.setOverlapViews(anchor, uIKitTextView);
        }
        this.f188023r = new a5h.g((ViewGroup) itemView);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.o;
    }
}
