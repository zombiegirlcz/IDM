package com.revolut.core.ui_kit.internal.views;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.drawables.DottedUnderlineDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/UIKitTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/drawables/DottedUnderlineDrawable;", "getOrCreateUnderlineDrawable", "()Lcom/revolut/core/ui_kit/drawables/DottedUnderlineDrawable;", "", "visible", "", "setUnderlineVisible", "(Z)V", "color", "setUnderlineColor", "(I)V", "layoutDirection", "setLayoutDirection", "getLayoutDirection", "()I", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UIKitTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DottedUnderlineDrawable f56474c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIKitTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final DottedUnderlineDrawable getOrCreateUnderlineDrawable() {
        DottedUnderlineDrawable dottedUnderlineDrawable = this.f56474c;
        if (dottedUnderlineDrawable != null) {
            return dottedUnderlineDrawable;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DottedUnderlineDrawable dottedUnderlineDrawable2 = new DottedUnderlineDrawable(context);
        this.f56474c = dottedUnderlineDrawable2;
        return dottedUnderlineDrawable2;
    }

    public final void b() {
        DottedUnderlineDrawable orCreateUnderlineDrawable = getOrCreateUnderlineDrawable();
        orCreateUnderlineDrawable.setBounds(0, 0, (getWidth() - getPaddingLeft()) - getPaddingRight(), orCreateUnderlineDrawable.f55764b);
        Drawable[] compoundDrawables = getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        Drawable drawable = compoundDrawables[0];
        Drawable drawable2 = compoundDrawables[1];
        Drawable drawable3 = compoundDrawables[2];
        if (!this.f56473b) {
            orCreateUnderlineDrawable = null;
        }
        setCompoundDrawables(drawable, drawable2, drawable3, orCreateUnderlineDrawable);
    }

    @Override // android.view.View
    public int getLayoutDirection() {
        int i = this.f56472a;
        return i != Integer.MIN_VALUE ? i : super.getLayoutDirection();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        if (isLayoutDirectionResolved() && getLayoutDirection() == 1) {
            this.f56472a = getLayoutDirection();
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f56472a = Integer.MIN_VALUE;
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        this.f56472a = Integer.MIN_VALUE;
        super.onRtlPropertiesChanged(i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        if (!this.f56473b || i == i3) {
            return;
        }
        b();
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
        if (layoutDirection != this.f56472a) {
            this.f56472a = Integer.MIN_VALUE;
        }
        super.setLayoutDirection(layoutDirection);
    }

    public final void setUnderlineColor(int color) {
        DottedUnderlineDrawable orCreateUnderlineDrawable = getOrCreateUnderlineDrawable();
        Paint paint = orCreateUnderlineDrawable.f55765c;
        if (paint.getColor() != color) {
            paint.setColor(color);
            orCreateUnderlineDrawable.invalidateSelf();
        }
        if (this.f56473b) {
            invalidate();
        }
    }

    public final void setUnderlineVisible(boolean visible) {
        if (this.f56473b == visible) {
            return;
        }
        this.f56473b = visible;
        b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIKitTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIKitTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56472a = Integer.MIN_VALUE;
    }

    public /* synthetic */ UIKitTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.textViewStyle);
    }
}
