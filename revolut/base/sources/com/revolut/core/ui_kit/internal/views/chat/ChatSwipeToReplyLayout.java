package com.revolut.core.ui_kit.internal.views.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ekd.i0;
import eqd.h;
import es.e;
import et0.u0;
import kli.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import vu0.d;
import yy0.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010%\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u0006'"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatSwipeToReplyLayout;", "Lcom/revolut/core/ui_kit/internal/views/framelayout/UIKitFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "anchorViewId", "", "setAnchorViewId", "(Ljava/lang/Integer;)V", "getAnchorEdgeInMainView", "()I", "Landroid/view/View;", "getAnchorView", "()Landroid/view/View;", "Lkotlin/Function0;", "h", "Lkotlin/jvm/functions/Function0;", "getOnReplyTriggered", "()Lkotlin/jvm/functions/Function0;", "setOnReplyTriggered", "(Lkotlin/jvm/functions/Function0;)V", "onReplyTriggered", "", "i", "Z", "isDragLocked", "()Z", "setDragLocked", "(Z)V", "w", "getSuppressLayoutCustom", "setSuppressLayoutCustom", "suppressLayoutCustom", "et0/u0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatSwipeToReplyLayout extends UIKitFrameLayout {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f56837x = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public Function0 onReplyTriggered;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isDragLocked;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f56839j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f56840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f56841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ViewDragHelper f56842n;
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f56843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f56844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f56845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f56846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f56847t;
    public final int u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public boolean suppressLayoutCustom;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatSwipeToReplyLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void c(ChatSwipeToReplyLayout chatSwipeToReplyLayout, float f) {
        int i = chatSwipeToReplyLayout.f56846s;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            ImageView imageView = chatSwipeToReplyLayout.f56839j;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            chatSwipeToReplyLayout.f56843p = false;
            return;
        }
        ImageView imageView2 = chatSwipeToReplyLayout.f56839j;
        if (imageView2 == null) {
            ImageView imageView3 = new ImageView(chatSwipeToReplyLayout.getContext());
            imageView3.setVisibility(4);
            imageView3.setScaleX(BitmapDescriptorFactory.HUE_RED);
            imageView3.setScaleY(BitmapDescriptorFactory.HUE_RED);
            imageView3.setAlpha(BitmapDescriptorFactory.HUE_RED);
            int i2 = chatSwipeToReplyLayout.u;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2, 19);
            layoutParams.leftMargin = chatSwipeToReplyLayout.v;
            imageView3.setLayoutParams(layoutParams);
            f.e(u.k(chatSwipeToReplyLayout).Q(), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_arrow_hook_left, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorWidgetBackground, 6.0f, Float.valueOf(16.0f), null, 32), imageView3, null, null, 12);
            chatSwipeToReplyLayout.f56839j = imageView3;
            chatSwipeToReplyLayout.addView(imageView3);
            imageView2 = imageView3;
        }
        imageView2.setVisibility(0);
        float f4 = i;
        float fClamp = MathUtils.clamp(f / f4, BitmapDescriptorFactory.HUE_RED, 1.0f);
        imageView2.setScaleX(fClamp);
        imageView2.setScaleY(fClamp);
        imageView2.setAlpha(fClamp);
        imageView2.setTranslationX(((chatSwipeToReplyLayout.k != null ? r4.getLeft() : chatSwipeToReplyLayout.getPaddingLeft()) + chatSwipeToReplyLayout.getAnchorEdgeInMainView()) - chatSwipeToReplyLayout.getPaddingLeft());
        if (fClamp == 1.0f && !chatSwipeToReplyLayout.f56843p) {
            chatSwipeToReplyLayout.performHapticFeedback(0);
            chatSwipeToReplyLayout.f56843p = true;
        } else if (f < f4) {
            chatSwipeToReplyLayout.f56843p = false;
        }
    }

    public static boolean d(int i, int i2, ViewGroup viewGroup) {
        int scrollX = viewGroup.getScrollX();
        int scrollY = viewGroup.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                int left = childAt.getLeft() - scrollX;
                int right = childAt.getRight() - scrollX;
                if (left <= i && i < right) {
                    int top = childAt.getTop() - scrollY;
                    int bottom = childAt.getBottom() - scrollY;
                    if (top <= i2 && i2 <= bottom) {
                        if (!childAt.canScrollHorizontally(1)) {
                            if (childAt instanceof ViewGroup) {
                                if (d(i - left, i2 - top, (ViewGroup) childAt)) {
                                }
                            } else {
                                continue;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final int getAnchorEdgeInMainView() {
        View anchorView = getAnchorView();
        return anchorView == this.k ? anchorView.getWidth() : anchorView.getRight();
    }

    private final View getAnchorView() {
        View viewFindViewById;
        View view = this.f56841m;
        if (view != null) {
            return view;
        }
        View view2 = this.k;
        if (view2 == null) {
            throw new IllegalArgumentException("Main view is required");
        }
        Integer num = this.f56840l;
        if (num == null || (viewFindViewById = view2.findViewById(num.intValue())) == null) {
            return view2;
        }
        this.f56841m = viewFindViewById;
        return viewFindViewById;
    }

    @Override // com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout
    public final void a(int i, int i2, int i3, int i5, boolean z) {
        if (this.suppressLayoutCustom) {
            return;
        }
        View view = this.k;
        if (view == null || this.f56842n.getViewDragState() == 0) {
            super.a(i, i2, i3, i5, z);
            return;
        }
        int left = view.getLeft();
        int top = view.getTop();
        super.a(i, i2, i3, i5, z);
        int left2 = left - view.getLeft();
        int top2 = top - view.getTop();
        if (left2 == 0 && top2 == 0) {
            return;
        }
        view.offsetLeftAndRight(left2);
        view.offsetTopAndBottom(top2);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f56842n.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.o.d(event);
        return super.dispatchTouchEvent(event);
    }

    @NotNull
    public final Function0<Unit> getOnReplyTriggered() {
        return this.onReplyTriggered;
    }

    public final boolean getSuppressLayoutCustom() {
        return this.suppressLayoutCustom;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        if (this.isDragLocked) {
            return false;
        }
        if (ev10.getAction() == 0) {
            this.f56844q = ev10.getX();
            this.f56845r = ev10.getY();
        }
        boolean zA = this.o.a(ev10);
        ViewDragHelper viewDragHelper = this.f56842n;
        if (!zA) {
            viewDragHelper.cancel();
            return false;
        }
        if (ev10.getAction() != 2 || !d((int) this.f56844q, (int) this.f56845r, this)) {
            return viewDragHelper.shouldInterceptTouchEvent(ev10);
        }
        viewDragHelper.cancel();
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isDragLocked) {
            return false;
        }
        int action = event.getAction();
        d dVar = this.o;
        if (action == 2) {
            dVar.c();
        }
        boolean zA = dVar.a(event);
        ViewDragHelper viewDragHelper = this.f56842n;
        if (zA) {
            viewDragHelper.processTouchEvent(event);
            return true;
        }
        viewDragHelper.cancel();
        return false;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.onViewAdded(child);
        if (getChildCount() > (this.f56839j == null ? 1 : 2)) {
            throw new IllegalStateException(a0.d.n("Only one child view (except replyIconView) is allowed inside of ChatSwipeToReplyLayout! Current: ", getChildCount()).toString());
        }
        if (Intrinsics.f(child, this.f56839j)) {
            return;
        }
        this.k = child;
        this.f56841m = null;
        this.o.f292140h = child;
        child.bringToFront();
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.k) {
            this.k = null;
            this.f56841m = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        d dVar = this.o;
        dVar.f292143m = z;
        ViewParent parent = dVar.f292136a.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(dVar.f292144n || dVar.f292143m);
        }
    }

    public final void setAnchorViewId(Integer anchorViewId) {
        this.f56840l = anchorViewId;
        this.f56841m = null;
    }

    public final void setDragLocked(boolean z) {
        this.isDragLocked = z;
    }

    public final void setOnReplyTriggered(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onReplyTriggered = function0;
    }

    public final void setSuppressLayoutCustom(boolean z) {
        this.suppressLayoutCustom = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatSwipeToReplyLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSwipeToReplyLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onReplyTriggered = new i0(27);
        this.f56846s = a.k(context, 64.0f);
        this.f56847t = a.k(context, 80.0f);
        this.u = a.k(context, 28.0f);
        this.v = a.k(context, 24.0f);
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(this, 1.0f, new u0(this));
        Intrinsics.checkNotNullExpressionValue(viewDragHelperCreate, "create(...)");
        this.f56842n = viewDragHelperCreate;
        setClipChildren(false);
        this.o = new d(this, new vu0.a(Float.valueOf(ViewConfiguration.get(context).getScaledTouchSlop()), new e(this, 4), null, null, new h(23), 44));
    }

    public /* synthetic */ ChatSwipeToReplyLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
