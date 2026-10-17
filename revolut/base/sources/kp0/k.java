package kp0;

import android.view.View;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends com.revolut.core.ui_kit.delegates.chat.a {
    public final LinearLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z4l.j f188028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final UIKitTextView f188029q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ChatSwipeToReplyLayout itemView, LinearLayout contentView, z4l.j attachmentsAdapter, UIKitTextView anchor) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(attachmentsAdapter, "attachmentsAdapter");
        Intrinsics.checkNotNullParameter(anchor, "captionView");
        this.o = contentView;
        this.f188028p = attachmentsAdapter;
        this.f188029q = anchor;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.k = anchor;
        UIKitTextView uIKitTextView = this.f53954j;
        if (uIKitTextView != null) {
            this.i.setOverlapViews(anchor, uIKitTextView);
        }
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.o;
    }
}
