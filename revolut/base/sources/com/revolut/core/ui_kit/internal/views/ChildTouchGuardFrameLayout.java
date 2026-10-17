package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ChildTouchGuardFrameLayout;", "Landroid/widget/FrameLayout;", "", "a", "Z", "getDispatchTouchToChildren", "()Z", "setDispatchTouchToChildren", "(Z)V", "dispatchTouchToChildren", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChildTouchGuardFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean dispatchTouchToChildren;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChildTouchGuardFrameLayout(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(this.dispatchTouchToChildren && z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.dispatchTouchToChildren && super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getDispatchTouchToChildren() {
        return this.dispatchTouchToChildren;
    }

    public final void setDispatchTouchToChildren(boolean z) {
        this.dispatchTouchToChildren = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChildTouchGuardFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChildTouchGuardFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChildTouchGuardFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, 0);
        this.dispatchTouchToChildren = true;
    }
}
