package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010R(\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SecondaryBackgroundConstraintLayout;", "Lcom/revolut/core/ui_kit/internal/views/layout/UIKitConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setSecondaryBackground", "(Landroid/graphics/drawable/Drawable;)V", "resId", "(I)V", "value", "h", "Landroid/graphics/drawable/Drawable;", "getSecondaryBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "secondaryBackgroundDrawable", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecondaryBackgroundConstraintLayout extends UIKitConstraintLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public Drawable secondaryBackgroundDrawable;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecondaryBackgroundConstraintLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Drawable getSecondaryBackgroundDrawable() {
        return this.secondaryBackgroundDrawable;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = this.secondaryBackgroundDrawable;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    public final void setSecondaryBackground(Drawable drawable) {
        this.secondaryBackgroundDrawable = drawable;
        if (drawable != null) {
            setWillNotDraw(false);
        }
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecondaryBackgroundConstraintLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecondaryBackgroundConstraintLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SecondaryBackgroundConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public final void setSecondaryBackground(int resId) {
        setSecondaryBackground(getContext().getDrawable(resId));
    }
}
