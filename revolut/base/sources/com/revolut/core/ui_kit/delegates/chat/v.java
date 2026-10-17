package com.revolut.core.ui_kit.delegates.chat;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.animation.BlinkingDotsAnimation;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends a {
    public final ConstraintLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final UIKitTextView f53997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ShimmerConstraintLayout f53998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final UIKitTextView f53999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final BlinkingDotsAnimation f54000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fp0.p f54001t;
    public boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ChatSwipeToReplyLayout itemView, ConstraintLayout contentView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.o = contentView;
        View viewFindViewById = contentView.findViewById(R$id.shimmeringTextBubble_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        UIKitTextView uIKitTextView = (UIKitTextView) viewFindViewById;
        this.f53997p = uIKitTextView;
        View viewFindViewById2 = contentView.findViewById(R$id.shimmeringTextBubble_shimmerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f53998q = (ShimmerConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = contentView.findViewById(R$id.shimmeringTextBubble_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        UIKitTextView uIKitTextView2 = (UIKitTextView) viewFindViewById3;
        this.f53999r = uIKitTextView2;
        View viewFindViewById4 = contentView.findViewById(R$id.shimmeringTextBubble_typingIndicator);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f54000s = (BlinkingDotsAnimation) viewFindViewById4;
        fp0.p.Companion.getClass();
        this.f54001t = fp0.m.a(uIKitTextView, gp0.b.f145198a);
        pd.b.q(uIKitTextView2, false);
        pd.b.q(uIKitTextView, false);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.o;
    }

    public final void M() {
        if (this.u) {
            return;
        }
        ShimmerConstraintLayout layout = this.f53998q;
        Intrinsics.checkNotNullParameter(layout, "layout");
        layout.h0(oq0.c.a());
        layout.setShimmerMode(c9.f.ALL_CHILDREN_MASK);
        this.u = true;
    }
}
