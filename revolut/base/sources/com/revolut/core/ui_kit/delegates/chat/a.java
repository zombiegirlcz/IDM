package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au0.p2;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleContainer;
import com.revolut.core.ui_kit.internal.views.chat.ChatParentLayout;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.m4;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a extends uw0.j implements fu0.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChatSwipeToReplyLayout f53952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ChatParentLayout f53953h;
    public final ChatBubbleContainer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UIKitTextView f53954j;
    public UIKitTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GradientDrawable f53955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f53956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m4 f53957n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.chatBubbleBase_replyLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ChatSwipeToReplyLayout chatSwipeToReplyLayout = (ChatSwipeToReplyLayout) viewFindViewById;
        this.f53952g = chatSwipeToReplyLayout;
        View viewFindViewById2 = itemView.findViewById(R$id.chatBubbleBase_chatParentLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f53953h = (ChatParentLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.chatBubbleBase_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ChatBubbleContainer chatBubbleContainer = (ChatBubbleContainer) viewFindViewById3;
        this.i = chatBubbleContainer;
        this.f53957n = (m4) chatBubbleContainer.findViewById(R$id.chatBubble_reply);
        chatSwipeToReplyLayout.setAnchorViewId(Integer.valueOf(R$id.chatBubbleBase_chatParentLayout));
    }

    public final void F() {
        TextView overlapAnchor;
        UIKitTextView uIKitTextView = this.f53954j;
        if (uIKitTextView == null || (overlapAnchor = this.i.getOverlapAnchor()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = overlapAnchor.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int iA = marginLayoutParams.bottomMargin;
            if (overlapAnchor.getVisibility() != 0) {
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 12.0f);
            }
            or0.u.z(uIKitTextView, 0, 0, 0, iA, false, 23);
        }
    }

    public final void H() {
        GradientDrawable gradientDrawableK;
        UIKitTextView uIKitTextView = this.f53954j;
        if (uIKitTextView == null) {
            return;
        }
        if (this.f53956m) {
            gradientDrawableK = this.f53955l;
            if (gradientDrawableK == null) {
                gradientDrawableK = v7.k(0);
                Context context = I().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gradientDrawableK.setColor(kli.a.s(R$attr.uikit_colorGroupedBackground_40, context));
                Intrinsics.checkNotNullExpressionValue(I().getContext(), "getContext(...)");
                gradientDrawableK.setCornerRadius(kli.a.k(r2, 16.0f));
                this.f53955l = gradientDrawableK;
            }
        } else {
            gradientDrawableK = null;
        }
        if (Intrinsics.f(uIKitTextView.getBackground(), gradientDrawableK)) {
            return;
        }
        uIKitTextView.setBackground(gradientDrawableK);
    }

    public abstract View I();

    public final List J() {
        return zhm.v.k(this.i, this.f53953h, I());
    }

    public final void K(boolean z, Function0 function0) {
        ChatBubbleContainer chatBubbleContainer = this.i;
        or0.m.a(chatBubbleContainer);
        if (z) {
            chatBubbleContainer.setOnClickListener(new p2(function0, 1));
        } else {
            or0.u.o(chatBubbleContainer);
        }
    }

    @Override // fu0.i
    public final fu0.h getHighlightTarget() {
        return this.i.getHighlightTarget();
    }

    @Override // ioi.a
    public final boolean x(List payloads) {
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        return !payloads.isEmpty();
    }
}
