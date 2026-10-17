package com.revolut.core.ui_kit.internal.views.chat;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import dr0.l;
import et0.c0;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import pd.b;
import zi0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0013\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleMetaView;", "Lcom/revolut/core/ui_kit/internal/views/framelayout/UIKitFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setTimestamp", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "icon", "setStatusIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Let0/c0;", "newModel", "setModel", "(Let0/c0;)V", "", "getTimestampText", "()Ljava/lang/CharSequence;", "timestampText", "getCurrentModel", "()Let0/c0;", "currentModel", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatBubbleMetaView extends UIKitFrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UIKitTextView f56803h;
    public LottieAnimationView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c0 f56804j;
    public GradientDrawable k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBubbleMetaView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setStatusIcon(Image icon) {
        if (icon == null && this.i == null) {
            return;
        }
        LottieAnimationView lottieAnimationView = this.i;
        if (lottieAnimationView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = a.k(context, 16.0f);
            LottieAnimationView lottieAnimationView2 = new LottieAnimationView(getContext());
            lottieAnimationView2.setId(R$id.chatBubble_statusIcon);
            lottieAnimationView2.setLayoutParams(new FrameLayout.LayoutParams(iK, iK, 8388661));
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            lottieAnimationView2.setBackground(l.c(context2, new Color.Solid(R$attr.uikit_colorBlack_50)));
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iK2 = a.k(context3, 3.0f);
            lottieAnimationView2.setPaddingRelative(iK2, iK2, iK2, iK2);
            this.i = lottieAnimationView2;
            addView(lottieAnimationView2);
            lottieAnimationView = lottieAnimationView2;
        }
        c.g(lottieAnimationView, icon);
    }

    private final void setTimestamp(Clause clause) {
        if (clause == null && this.f56803h == null) {
            return;
        }
        UIKitTextView uIKitTextView = this.f56803h;
        if (uIKitTextView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uIKitTextView = new UIKitTextView(context, null, 6, 0);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.k = l.h(context2, 8.0f, new Color.Solid(R$attr.uikit_colorBlack_50), 0, null);
            uIKitTextView.setId(R$id.chatBubble_timestamp);
            jb3.l.e(uIKitTextView, R$attr.internal_textAppearanceBody3);
            b.q(uIKitTextView, false);
            uIKitTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388661));
            this.f56803h = uIKitTextView;
            addView(uIKitTextView);
        }
        ty0.c.b(u.k(this).b0(), clause, uIKitTextView, null, null, 12);
    }

    /* JADX INFO: renamed from: getCurrentModel, reason: from getter */
    public final c0 getF56804j() {
        return this.f56804j;
    }

    public final CharSequence getTimestampText() {
        UIKitTextView uIKitTextView = this.f56803h;
        if (uIKitTextView != null) {
            return uIKitTextView.getText();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setModel(@org.jetbrains.annotations.NotNull et0.c0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "newModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            et0.c0 r0 = r8.f56804j
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r9, r0)
            if (r0 == 0) goto Le
            return
        Le:
            et0.c0 r0 = r8.f56804j
            com.revolut.core.ui_kit.models.Clause r1 = r9.f129013a
            boolean r2 = r9.d
            com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle r3 = r9.f129015c
            com.revolut.core.ui_kit_core.displayers.image.Image r4 = r9.f129014b
            r5 = 0
            if (r0 == 0) goto L1e
            com.revolut.core.ui_kit.models.Clause r6 = r0.f129013a
            goto L1f
        L1e:
            r6 = r5
        L1f:
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r6 != 0) goto L28
            r8.setTimestamp(r1)
        L28:
            if (r0 == 0) goto L2d
            com.revolut.core.ui_kit_core.displayers.image.Image r6 = r0.f129014b
            goto L2e
        L2d:
            r6 = r5
        L2e:
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r4, r6)
            if (r6 != 0) goto L37
            r8.setStatusIcon(r4)
        L37:
            if (r0 == 0) goto L3c
            com.revolut.core.ui_kit.models.Clause r6 = r0.f129013a
            goto L3d
        L3c:
            r6 = r5
        L3d:
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            r7 = 0
            if (r6 == 0) goto L54
            if (r0 == 0) goto L49
            com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle r6 = r0.f129015c
            goto L4a
        L49:
            r6 = r5
        L4a:
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r3, r6)
            if (r6 == 0) goto L54
            boolean r0 = r0.d
            if (r2 == r0) goto L87
        L54:
            com.revolut.core.ui_kit.internal.views.UIKitTextView r0 = r8.f56803h
            if (r0 != 0) goto L59
            goto L87
        L59:
            r3.d(r0, r2)
            if (r2 == 0) goto L81
            android.content.Context r2 = r8.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r5 = 1090519040(0x41000000, float:8.0)
            int r2 = kli.a.k(r2, r5)
            android.content.Context r6 = r8.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            int r3 = kli.a.k(r6, r5)
            r0.setPaddingRelative(r2, r7, r3, r7)
            android.graphics.drawable.GradientDrawable r2 = r8.k
            r0.setBackground(r2)
            goto L87
        L81:
            r0.setPaddingRelative(r7, r7, r7, r7)
            r0.setBackground(r5)
        L87:
            com.revolut.core.ui_kit.internal.views.UIKitTextView r0 = r8.f56803h
            if (r0 == 0) goto L97
            if (r1 != 0) goto L90
            r7 = 8
            goto L94
        L90:
            if (r4 != 0) goto L93
            goto L94
        L93:
            r7 = 4
        L94:
            r0.setVisibility(r7)
        L97:
            r8.f56804j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.chat.ChatBubbleMetaView.setModel(et0.c0):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBubbleMetaView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBubbleMetaView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChatBubbleMetaView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
