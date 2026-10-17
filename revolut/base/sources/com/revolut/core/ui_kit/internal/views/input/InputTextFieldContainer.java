package com.revolut.core.ui_kit.internal.views.input;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fR0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/input/InputTextFieldContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "hasError", "", "setError", "(Z)V", "checked", "setChecked", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "j", "Lkotlin/jvm/functions/Function1;", "getOnDrawLabel", "()Lkotlin/jvm/functions/Function1;", "setOnDrawLabel", "(Lkotlin/jvm/functions/Function1;)V", "onDrawLabel", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputTextFieldContainer extends ConstraintLayout implements Checkable {

    @NotNull
    private static final a Companion = new a();
    public static final int[] k = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f57213b;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f57214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f57215h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Function1 onDrawLabel;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTextFieldContainer(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        Function1 function1 = this.onDrawLabel;
        if (function1 != null) {
            function1.invoke(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        View viewFindViewById;
        boolean z = true;
        if (!isPressed() && ((viewFindViewById = findViewById(R$id.inputText_EditText)) == null || !viewFindViewById.isPressed())) {
            z = false;
        }
        if (z != this.f57215h) {
            if (!z) {
                this.f57214g = false;
            } else if (this.f57214g) {
                Drawable background = getBackground();
                if (background != null) {
                    background.setHotspot(this.f57213b, this.f);
                }
            } else {
                Drawable background2 = getBackground();
                if (background2 != null) {
                    background2.setHotspot(getWidth() / 2.0f, getHeight() / 2.0f);
                }
            }
            this.f57215h = z;
        }
        super.drawableStateChanged();
    }

    public final Function1<Canvas, Unit> getOnDrawLabel() {
        return this.onDrawLabel;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.i) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, k);
        }
        Intrinsics.h(iArrOnCreateDrawableState);
        if (!d.G(iArrOnCreateDrawableState, R.attr.state_focused)) {
            return iArrOnCreateDrawableState;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArrOnCreateDrawableState) {
            if (i2 != 16842908) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return d0.c1(arrayList);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        if (ev10.getActionMasked() == 0) {
            this.f57213b = ev10.getX();
            this.f = ev10.getY();
            this.f57214g = true;
        }
        return super.onInterceptTouchEvent(ev10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        setError(checked);
    }

    public final void setError(boolean hasError) {
        if (this.i != hasError) {
            this.i = hasError;
            refreshDrawableState();
        }
    }

    public final void setOnDrawLabel(Function1<? super Canvas, Unit> function1) {
        this.onDrawLabel = function1;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setError(!this.i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTextFieldContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputTextFieldContainer(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setAddStatesFromChildren(true);
    }

    public /* synthetic */ InputTextFieldContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
