package kp0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 extends com.revolut.core.ui_kit.delegates.chat.a {
    public final ConstraintLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final UIKitTextView f188096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final UIKitTextView f188097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rr0.g f188098r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ChatSwipeToReplyLayout itemView, ConstraintLayout contentView, UIKitTextView title, UIKitTextView description, UIKitImageView icon) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.o = contentView;
        this.f188096p = title;
        this.f188097q = description;
        this.f188098r = vc.s.d(this, new nq0.e(this.i), this.i.getHighlightTarget(), 8);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.o;
    }
}
