package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatTextViewAutoSizeHelperProxy;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0010\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002&'B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/DynamicWidthHeightAutosizeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "Landroid/widget/TextView$BufferType;", "type", "", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "maxPixels", "setMaxHeight", "(I)V", "getMaxHeight", "()I", "autoSizeTextType", "setAutoSizeTextTypeWithDefaults", "", "presetSizes", "unit", "setAutoSizeTextTypeUniformWithPresetSizes", "([II)V", "autoSizeMinTextSize", "autoSizeMaxTextSize", "autoSizeStepGranularity", "setAutoSizeTextTypeUniformWithConfiguration", "(IIII)V", "getAutoSizeMaxTextSize", "getAutoSizeMinTextSize", "getAutoSizeStepGranularity", "Companion", "a", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DynamicWidthHeightAutosizeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56165c;
    public final RectF d;
    public final ArrayList e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f56167h;
    public Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f56168j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f56169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f56170b;

        public a() {
            this(0);
        }

        public a(int i) {
            this.f56169a = 0;
            this.f56170b = 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicWidthHeightAutosizeTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final a b() {
        int i;
        int i2 = this.f56163a;
        int i3 = this.f56165c;
        if (i2 > 0 && i3 > 0) {
            int totalPaddingLeft = (i2 - getTotalPaddingLeft()) - getTotalPaddingRight();
            int extendedPaddingBottom = (i3 - getExtendedPaddingBottom()) - getExtendedPaddingTop();
            if (totalPaddingLeft > 0 && extendedPaddingBottom > 0) {
                RectF rectF = this.d;
                rectF.setEmpty();
                rectF.right = totalPaddingLeft;
                rectF.bottom = extendedPaddingBottom;
                ArrayList arrayList = this.e;
                int i5 = 1;
                if (arrayList.isEmpty()) {
                    int i6 = this.f56167h;
                    if (i6 < 1) {
                        i6 = 1;
                    }
                    arrayList.ensureCapacity(((this.f56166g - this.f) / i6) + 2);
                    int i21 = 0;
                    while (true) {
                        int i22 = (i6 * i21) + this.f;
                        i = this.f56166g;
                        if (i22 >= i) {
                            break;
                        }
                        arrayList.add(Integer.valueOf(i22));
                        i21++;
                    }
                    arrayList.add(Integer.valueOf(i));
                }
                int size = arrayList.size();
                if (size == 0) {
                    throw new IllegalStateException("No available text sizes to choose from.");
                }
                int i32 = size - 1;
                int i33 = 0;
                while (i5 <= i32) {
                    int i43 = (i5 + i32) / 2;
                    Object obj2 = arrayList.get(i43);
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    int iIntValue = ((Number) obj2).intValue();
                    CharSequence text = getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    StaticLayout staticLayoutD = d(text, iIntValue, rectF);
                    if ((getMaxLines() == -1 || staticLayoutD.getLineCount() <= getMaxLines()) && staticLayoutD.getHeight() <= rectF.bottom) {
                        int i59 = i43 + 1;
                        i33 = i5;
                        i5 = i59;
                    } else {
                        i33 = i43 - 1;
                        i32 = i33;
                    }
                }
                Object obj3 = arrayList.get(i33);
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                int iIntValue2 = ((Number) obj3).intValue();
                CharSequence text2 = getText();
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                StaticLayout staticLayoutD2 = d(text2, iIntValue2, rectF);
                a aVar = this.f56168j;
                aVar.f56169a = iIntValue2;
                aVar.f56170b = staticLayoutD2.getLineCount();
                if (aVar.f56169a == getTextSize()) {
                    return aVar;
                }
                setTextSize(0, aVar.f56169a);
                return aVar;
            }
        }
        return null;
    }

    public final StaticLayout d(CharSequence charSequence, int i, RectF rectF) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextPaint textPaint = new TextPaint();
        textPaint.set(getPaint());
        textPaint.setTextSize(i);
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.round(rectF.right));
        Intrinsics.checkNotNullExpressionValue(builderObtain, "obtain(...)");
        AppCompatTextViewAutoSizeHelperProxy appCompatTextViewAutoSizeHelperProxy = AppCompatTextViewAutoSizeHelperProxy.INSTANCE;
        builderObtain.setAlignment((Layout.Alignment) appCompatTextViewAutoSizeHelperProxy.invokeAndReturnWithDefault(this, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency()).setMaxLines(getMaxLines());
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = getTextDirectionHeuristic();
            } else {
                TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
                textDirectionHeuristic = (TextDirectionHeuristic) appCompatTextViewAutoSizeHelperProxy.invokeAndReturnWithDefault(this, "getTextDirectionHeuristic", FIRSTSTRONG_LTR);
            }
            Intrinsics.h(builderObtain.setTextDirection(textDirectionHeuristic));
        } catch (ClassCastException unused) {
        }
        int i2 = Build.VERSION.SDK_INT;
        builderObtain.setJustificationMode(getJustificationMode());
        if (i2 >= 33) {
            builderObtain.setLineBreakConfig(t.a.d().setLineBreakStyle(getLineBreakStyle()).setLineBreakWordStyle(getLineBreakWordStyle()).build());
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return this.f56166g;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return this.f;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return this.f56167h;
    }

    @Override // android.widget.TextView
    public int getMaxHeight() {
        Integer num = this.i;
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f56163a = rr0.i.d(i);
        this.f56164b = View.MeasureSpec.getMode(i) == 1073741824;
        this.f56165c = Math.min(rr0.i.d(i2), getMaxHeight());
        b();
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        this.e.clear();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f = kli.a.H(context, unit, autoSizeMinTextSize);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f56166g = kli.a.H(context2, unit, autoSizeMaxTextSize);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f56167h = kli.a.H(context3, unit, autoSizeStepGranularity);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NotNull int[] presetSizes, int unit) {
        Intrinsics.checkNotNullParameter(presetSizes, "presetSizes");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        this.e.clear();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f = kli.a.B(context, 12.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f56166g = kli.a.B(context2, 112.0f);
        this.f56167h = 1;
    }

    @Override // android.widget.TextView
    public void setMaxHeight(int maxPixels) {
        Integer num = this.i;
        if (num != null && num.intValue() == maxPixels) {
            return;
        }
        this.i = Integer.valueOf(maxPixels);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        int lineCount = getLineCount();
        super.setText(text, type);
        a aVarB = b();
        if (!this.f56164b) {
            requestLayout();
        } else {
            if (aVarB == null || aVarB.f56170b == lineCount) {
                return;
            }
            requestLayout();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicWidthHeightAutosizeTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicWidthHeightAutosizeTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = new RectF();
        this.e = new ArrayList(0);
        this.f56168j = new a(0);
        this.f = super.getAutoSizeMinTextSize();
        this.f56166g = super.getAutoSizeMaxTextSize();
        this.f56167h = super.getAutoSizeStepGranularity();
        if (getAutoSizeTextType() == 1) {
            super.setAutoSizeTextTypeWithDefaults(0);
        }
    }

    public /* synthetic */ DynamicWidthHeightAutosizeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
