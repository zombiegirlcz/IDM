package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.revolut.core.ui_kit.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ\u0019\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/revolut/core/ui_kit/views/StatusProgressBarView;", "Landroid/widget/ProgressBar;", "", "tallyMarkPercent", "", "setTallyMarkPercent", "(Ljava/lang/Integer;)V", "Landroid/graphics/Paint;", "d", "Lkotlin/Lazy;", "getTallyMarkPaint", "()Landroid/graphics/Paint;", "tallyMarkPaint", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatusProgressBarView extends ProgressBar {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f58875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f58876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f58877c;
    public final Object d;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.StatusProgressBarView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusProgressBarView(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Paint getTallyMarkPaint() {
        return (Paint) this.d.getValue();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Integer num = this.f58875a;
        if (num != null) {
            int width = (getWidth() * num.intValue()) / 100;
            int height = getHeight() / 2;
            float f = width;
            float f4 = 2;
            float f5 = this.f58877c;
            float f6 = height;
            float f32 = this.f58876b;
            canvas.drawRect(f - (f5 / f4), f6 - (f32 / f4), (f5 / f4) + f, (f32 / f4) + f6, getTallyMarkPaint());
        }
    }

    public final void setTallyMarkPercent(Integer tallyMarkPercent) {
        this.f58875a = tallyMarkPercent != null ? Integer.valueOf(kotlin.ranges.f.g(tallyMarkPercent.intValue(), 0, 100)) : null;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusProgressBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusProgressBarView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StatusProgressBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.StatusProgressBarView, 0, i);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.StatusProgressBarView_internal_tally_mark_percent, -1);
        Integer numValueOf = integer != -1 ? Integer.valueOf(kotlin.ranges.f.g(integer, 0, 100)) : null;
        typedArrayObtainStyledAttributes.recycle();
        this.f58875a = numValueOf;
        this.f58876b = kli.a.l(context, 8.0f);
        this.f58877c = kli.a.l(context, 2.0f);
        this.d = te0.w.y0(new lu0.a(context, 14));
    }
}
