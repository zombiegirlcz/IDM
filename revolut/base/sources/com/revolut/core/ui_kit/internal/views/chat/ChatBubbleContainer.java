package com.revolut.core.ui_kit.internal.views.chat;

import a0.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import et0.a0;
import et0.b0;
import fu0.h;
import fu0.i;
import fu0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.b;
import org.jetbrains.annotations.NotNull;
import xo0.g;
import xo0.l;
import xo0.m;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00031(2B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010 \u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR.\u0010'\u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u001f\u001a\u0004\b$\u0010%R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lfu0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "anchor", "Landroid/view/View;", "target", "", "setOverlapViews", "(Landroid/widget/TextView;Landroid/view/View;)V", "Lxo0/g;", "position", "setChatPosition", "(Lxo0/g;)V", "Lfu0/h;", "getHighlightTarget", "()Lfu0/h;", "Lxo0/m;", "n", "Lxo0/m;", "getChatShapeMask", "()Lxo0/m;", "getChatShapeMask$annotations", "()V", "chatShapeMask", "value", "o", "Landroid/widget/TextView;", "getOverlapAnchor", "()Landroid/widget/TextView;", "getOverlapAnchor$annotations", "overlapAnchor", "Let0/b0;", "r", "Let0/b0;", "getOnLongTapListener", "()Let0/b0;", "setOnLongTapListener", "(Let0/b0;)V", "onLongTapListener", "Companion", "et0/a0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ChatBubbleContainer extends ConstraintLayout implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f56793b;
    public final Handler f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f56794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f56795h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f56796j;
    public final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f56797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f56798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final m chatShapeMask;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView overlapAnchor;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f56800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f56801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public b0 onLongTapListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBubbleContainer(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(ChatBubbleContainer chatBubbleContainer) {
        chatBubbleContainer.f56796j = false;
        b0 b0Var = chatBubbleContainer.onLongTapListener;
        if (b0Var == null) {
            return;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        super.dispatchTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        b bVar = (b) b0Var;
        BaseChatBubbleDelegate baseChatBubbleDelegate = (BaseChatBubbleDelegate) bVar.f187968b;
        baseChatBubbleDelegate.d.onNext((BaseChatBubbleDelegate.BaseModel) bVar.f187969c);
    }

    public static /* synthetic */ void getChatShapeMask$annotations() {
    }

    public static /* synthetic */ void getOverlapAnchor$annotations() {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f56797l != null) {
            canvas.drawPath(this.chatShapeMask.a(), this.f56793b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.getActionMasked()
            a0.a r1 = r7.k
            android.os.Handler r2 = r7.f
            r3 = 1
            if (r0 == 0) goto L54
            r4 = 0
            if (r0 == r3) goto L4a
            r3 = 2
            if (r0 == r3) goto L1a
            r3 = 3
            if (r0 == r3) goto L4a
            goto L6f
        L1a:
            float r0 = r8.getRawX()
            float r3 = r7.f56794g
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r8.getRawY()
            float r5 = r7.f56795h
            float r3 = r3 - r5
            float r3 = java.lang.Math.abs(r3)
            float r0 = r0 * r0
            float r3 = r3 * r3
            float r3 = r3 + r0
            double r5 = (double) r3
            double r5 = java.lang.Math.sqrt(r5)
            float r0 = (float) r5
            int r3 = r7.i
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6f
            boolean r0 = r7.f56796j
            if (r0 == 0) goto L6f
            r7.f56796j = r4
            r2.removeCallbacks(r1)
            goto L6f
        L4a:
            boolean r0 = r7.f56796j
            if (r0 == 0) goto L6f
            r7.f56796j = r4
            r2.removeCallbacks(r1)
            goto L6f
        L54:
            float r0 = r8.getRawX()
            r7.f56794g = r0
            float r0 = r8.getRawY()
            r7.f56795h = r0
            et0.b0 r0 = r7.onLongTapListener
            if (r0 == 0) goto L6f
            boolean r0 = r7.f56796j
            if (r0 != 0) goto L6f
            r7.f56796j = r3
            r3 = 300(0x12c, double:1.48E-321)
            r2.postDelayed(r1, r3)
        L6f:
            boolean r8 = super.dispatchTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.chat.ChatBubbleContainer.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @NotNull
    public final m getChatShapeMask() {
        return this.chatShapeMask;
    }

    @Override // fu0.i
    @NotNull
    public h getHighlightTarget() {
        g gVar = this.f56797l;
        if (gVar != null) {
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            int i = xo0.h.f307544a[gVar.ordinal()];
            if (i == 11 || i == 12) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iK = kli.a.k(context, BitmapDescriptorFactory.HUE_RED);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iK2 = kli.a.k(context2, 8.0f);
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return new j(this, iK, iK2, kli.a.l(context3, 12.0f));
            }
        }
        return new a0(this);
    }

    public final b0 getOnLongTapListener() {
        return this.onLongTapListener;
    }

    public final TextView getOverlapAnchor() {
        return this.overlapAnchor;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f56796j) {
            this.f56796j = false;
            this.f.removeCallbacks(this.k);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        Layout layout;
        View view;
        super.onLayout(z, i, i2, i3, i5);
        if (this.f56801q > 0) {
            TextView textView = this.overlapAnchor;
            View view2 = this.f56800p;
            if (textView == null || textView.getVisibility() != 0 || view2 == null || view2.getVisibility() != 0 || (layout = textView.getLayout()) == null) {
                return;
            }
            int left = textView.getLeft();
            Object parent = textView.getParent();
            while ((parent instanceof View) && parent != this) {
                View view3 = (View) parent;
                left += view3.getLeft();
                parent = view3.getParent();
            }
            float lineRight = layout.getLineRight(layout.getLineCount() - 1) + left;
            int left2 = view2.getLeft();
            Object parent2 = view2.getParent();
            while ((parent2 instanceof View) && parent2 != this) {
                View view4 = (View) parent2;
                left2 += view4.getLeft();
                parent2 = view4.getParent();
            }
            Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
            if (lineRight + kli.a.k(r4, 4.0f) <= left2 || (view = this.f56800p) == null) {
                return;
            }
            view.offsetTopAndBottom(this.f56801q);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            this.f56801q = 0;
        }
        super.onMeasure(i, i2);
        TextView textView = this.overlapAnchor;
        View view = this.f56800p;
        if (textView == null || textView.getVisibility() != 0 || view == null || view.getVisibility() != 0) {
            this.f56801q = 0;
            return;
        }
        Layout layout = textView.getLayout();
        if (layout == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 4.0f);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        float lineWidth = layout.getLineWidth(layout.getLineCount() - 1) + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r6.getMarginStart() : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int measuredWidth = (getMeasuredWidth() - (marginLayoutParams != null ? marginLayoutParams.getMarginEnd() : 0)) - view.getMeasuredWidth();
        int measuredHeight = getMeasuredHeight() - this.f56801q;
        int measuredHeight2 = lineWidth + ((float) iK) > ((float) measuredWidth) ? view.getMeasuredHeight() : 0;
        this.f56801q = measuredHeight2;
        if (measuredHeight2 > 0) {
            setMeasuredDimension(getMeasuredWidth(), measuredHeight + this.f56801q);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        int i = bundle.getInt("STATE_KEY_POSITION", -1);
        if (i != -1) {
            setChatPosition((g) g.a().get(i));
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        g gVar = this.f56797l;
        if (gVar != null) {
            bundle.putInt("STATE_KEY_POSITION", gVar.ordinal());
        }
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        if (i == i3 && i2 == i5) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        m mVar = this.chatShapeMask;
        mVar.f307563h = width;
        mVar.i = height;
        mVar.f307564j = true;
        this.f56798m++;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z && this.f56796j) {
            this.f56796j = false;
            this.f.removeCallbacks(this.k);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setChatPosition(@NotNull g position) {
        Intrinsics.checkNotNullParameter(position, "position");
        if (position == this.f56797l) {
            return;
        }
        this.f56797l = position;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l shape = xo0.j.a(position, context);
        m mVar = this.chatShapeMask;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(shape, "shape");
        mVar.f = shape;
        mVar.f307564j = true;
        this.f56798m++;
    }

    public final void setOnLongTapListener(b0 b0Var) {
        this.onLongTapListener = b0Var;
    }

    public final void setOverlapViews(@NotNull TextView anchor, @NotNull View target) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(target, "target");
        this.overlapAnchor = anchor;
        this.f56800p = target;
        this.f56801q = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBubbleContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBubbleContainer(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f56793b = paint;
        this.f = new Handler(Looper.getMainLooper());
        this.i = kli.a.k(context, 6.0f);
        this.k = new a(this, 27);
        this.chatShapeMask = new m(kli.a.k(context, 5.0f), kli.a.k(context, 20.0f), kli.a.k(context, 2.0f), kli.a.k(context, 20.0f), kli.a.k(context, 20.0f));
        setFocusable(true);
        setClickable(true);
        setLayerType(2, null);
    }

    public /* synthetic */ ChatBubbleContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
