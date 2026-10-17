package et0;

import android.view.View;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u0 extends ViewDragHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChatSwipeToReplyLayout f129119a;

    public u0(ChatSwipeToReplyLayout chatSwipeToReplyLayout) {
        this.f129119a = chatSwipeToReplyLayout;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionHorizontal(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        ChatSwipeToReplyLayout chatSwipeToReplyLayout = this.f129119a;
        return MathUtils.clamp(i, chatSwipeToReplyLayout.getPaddingLeft() - chatSwipeToReplyLayout.f56847t, chatSwipeToReplyLayout.getPaddingLeft());
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionVertical(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        return this.f129119a.getPaddingTop();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int getViewHorizontalDragRange(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return this.f129119a.f56847t;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int getViewVerticalDragRange(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return 0;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i) {
        if (i == 0) {
            this.f129119a.o.f();
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View changedView, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        ChatSwipeToReplyLayout.c(this.f129119a, Math.abs(i - r1.getPaddingLeft()));
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewReleased(View releasedChild, float f, float f4) {
        Intrinsics.checkNotNullParameter(releasedChild, "releasedChild");
        int left = releasedChild.getLeft();
        ChatSwipeToReplyLayout chatSwipeToReplyLayout = this.f129119a;
        if (Math.abs(left - chatSwipeToReplyLayout.getPaddingLeft()) >= chatSwipeToReplyLayout.f56846s) {
            chatSwipeToReplyLayout.getOnReplyTriggered().invoke();
        }
        chatSwipeToReplyLayout.f56842n.settleCapturedViewAt(chatSwipeToReplyLayout.getPaddingLeft(), chatSwipeToReplyLayout.getPaddingTop());
        ViewCompat.postInvalidateOnAnimation(chatSwipeToReplyLayout);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View child, int i) {
        Intrinsics.checkNotNullParameter(child, "child");
        ChatSwipeToReplyLayout chatSwipeToReplyLayout = this.f129119a;
        return Intrinsics.f(child, chatSwipeToReplyLayout.k) && !chatSwipeToReplyLayout.isDragLocked;
    }
}
