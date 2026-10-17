package com.revolut.core.ui_kit.internal.views.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import ix0.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tt0.a;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/input/CenteredAmountContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltt0/a;", "heightMode", "", "force", "", "setHeightMode$ui_kit_components_release", "(Ltt0/a;Z)V", "setHeightMode", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "Lcom/revolut/core/ui_kit/views/CenteredAmountView;", "a", "Lcom/revolut/core/ui_kit/views/CenteredAmountView;", "getCenteredAmountView", "()Lcom/revolut/core/ui_kit/views/CenteredAmountView;", "centeredAmountView", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CenteredAmountContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final CenteredAmountView centeredAmountView;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f57211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57212c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CenteredAmountContainerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final CenteredAmountView getCenteredAmountView() {
        return this.centeredAmountView;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        WindowInsets rootWindowInsets = getRootWindowInsets();
        boolean zC = rootWindowInsets != null ? x0.c(rootWindowInsets) : false;
        if (this.f57211b == a.MATCH_PARENT) {
            int i6 = i5 - i2;
            CenteredAmountView centeredAmountView = this.centeredAmountView;
            int height = i6 - centeredAmountView.getHeight();
            int i21 = height / 2;
            int i22 = i21 >= 0 ? i21 : 0;
            if (zC) {
                int i32 = this.f57212c;
                if (i32 == -1 || height - i32 < 0) {
                    this.f57212c = i22;
                }
                i22 = this.f57212c;
            } else {
                this.f57212c = -1;
            }
            centeredAmountView.offsetTopAndBottom(i22);
        }
    }

    public final void setHeightMode$ui_kit_components_release(@NotNull a heightMode, boolean force) {
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        if (heightMode != this.f57211b || force) {
            this.f57211b = heightMode;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, heightMode.b());
            this.f57212c = -1;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = heightMode.a();
            }
            setPadding(0, iK, 0, iK);
            if (isLayoutRequested()) {
                return;
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        super.setLayoutParams(params);
        if (params != null) {
            params.height = this.f57211b.a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CenteredAmountContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenteredAmountContainerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        CenteredAmountView centeredAmountView = new CenteredAmountView(context, null, 6, 0);
        this.centeredAmountView = centeredAmountView;
        this.f57211b = a.WRAP_CONTENT_WITH_PADDINGS;
        this.f57212c = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 49;
        addView(centeredAmountView, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setHeightMode$ui_kit_components_release(this.f57211b, true);
    }

    public /* synthetic */ CenteredAmountContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
