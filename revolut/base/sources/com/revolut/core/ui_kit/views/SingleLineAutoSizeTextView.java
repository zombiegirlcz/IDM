package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import au0.y1;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.models.Clause;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/revolut/core/ui_kit/views/SingleLineAutoSizeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lkotlin/Function1;", "Landroid/view/View;", "listener", "setOnTextClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SingleLineAutoSizeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextPaint f58867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f58868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58869c;
    public final HashMap d;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.SingleLineAutoSizeTextView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleLineAutoSizeTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void b(float f, float f4) {
        setMaxLines(1);
        if (getMaxWidth() == -1) {
            throw new IllegalStateException("maxWidth has to be set explicitly");
        }
        TextPaint textPaint = new TextPaint(getPaint());
        textPaint.setTextSize(f4);
        this.f58867a = textPaint;
        d();
        CharSequence text = getText();
        int length = getText().length();
        TextPaint textPaint2 = this.f58867a;
        if (textPaint2 == null) {
            Intrinsics.r("maxTextSizePaint");
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(StaticLayout.Builder.obtain(text, 0, length, textPaint2, Integer.MAX_VALUE).setEllipsize(null).setMaxLines(1).build(), "build(...)");
        this.f58869c = (int) (r1.getHeight() * 0.98f);
        int i = (int) f;
        int i2 = (int) f4;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numValueOf = Integer.valueOf(kli.a.B(context, 1.0f));
        Integer num = numValueOf.intValue() > 0 ? numValueOf : null;
        setAutoSizeTextTypeUniformWithConfiguration(i, i2, num != null ? num.intValue() : 1, 0);
    }

    public final void d() {
        String string = getText().toString();
        HashMap map = this.d;
        Object objValueOf = map.get(string);
        if (objValueOf == null) {
            TextPaint textPaint = this.f58867a;
            if (textPaint == null) {
                Intrinsics.r("maxTextSizePaint");
                throw null;
            }
            objValueOf = Integer.valueOf((int) textPaint.measureText(getText().toString()));
            map.put(string, objValueOf);
        }
        this.f58868b = (int) (((Number) objValueOf).intValue() * 0.99f);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingRight;
        d();
        if (this.f58868b > getMaxWidth()) {
            paddingLeft = getPaddingLeft() + getMaxWidth();
            paddingRight = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft() + this.f58868b;
            paddingRight = getPaddingRight();
        }
        int iMin = paddingRight + paddingLeft;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            iMin = size;
        } else if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, size);
        }
        int iMin2 = this.f58869c;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            iMin2 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, size2);
        }
        setMeasuredDimension(iMin, iMin2);
    }

    public final void setOnTextClickListener(Function1<? super View, Unit> listener) {
        if (listener != null) {
            setOnClickListener(new y1(5, listener));
            setOnTouchListener(new j01.e(new View[]{this}));
        } else {
            setOnClickListener(null);
            setOnTouchListener(null);
            setClickable(false);
        }
    }

    public final void setText(Clause text) {
        ty0.c.b(or0.u.k(this).b0(), text, this, null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleLineAutoSizeTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleLineAutoSizeTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = new HashMap();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.uikit_SingleLineAutoSizeTextView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                b(typedArrayObtainStyledAttributes.getDimension(R$styleable.uikit_SingleLineAutoSizeTextView_uikit_autoSizeMinTextSize, kli.a.B(context, 5.0f)), typedArrayObtainStyledAttributes.getDimension(R$styleable.uikit_SingleLineAutoSizeTextView_uikit_autoSizeMaxTextSize, kli.a.B(context, 35.0f)));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public /* synthetic */ SingleLineAutoSizeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
