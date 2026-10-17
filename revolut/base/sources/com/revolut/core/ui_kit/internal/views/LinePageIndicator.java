package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/LinePageIndicator;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "getLineView", "()Landroid/view/View;", "baseColor", "progressColor", "", "setColors", "(II)V", "setColorsInt", "count", "setPagesCount", "(I)V", "index", "setCurrentPage", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinePageIndicator extends LinearLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56232c;
    public int d;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinePageIndicator(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View getLineView() {
        View view = new View(getContext());
        view.setBackgroundResource(R$drawable.internal_line_progress_background);
        ViewCompat.setBackgroundTintList(view, ColorStateList.valueOf(this.f56232c));
        return view;
    }

    public final void a() {
        vim.f it8 = kotlin.ranges.f.o(0, this.f56230a).iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            int i = iNextInt == this.f56231b ? this.d : this.f56232c;
            View childAt = getChildAt(iNextInt);
            if (childAt != null) {
                ViewCompat.setBackgroundTintList(childAt, ColorStateList.valueOf(i));
            }
        }
    }

    public final void setColors(int baseColor, int progressColor) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(baseColor, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setColorsInt(iS, kli.a.s(progressColor, context2));
    }

    public final void setColorsInt(int baseColor, int progressColor) {
        this.f56232c = baseColor;
        this.d = progressColor;
        a();
    }

    public final void setCurrentPage(int index) {
        int i = this.f56231b;
        this.f56231b = index;
        View childAt = getChildAt(i);
        int i2 = this.f56232c;
        if (childAt != null) {
            ViewCompat.setBackgroundTintList(childAt, ColorStateList.valueOf(i2));
        }
        View childAt2 = getChildAt(this.f56231b);
        int i3 = this.d;
        if (childAt2 != null) {
            ViewCompat.setBackgroundTintList(childAt2, ColorStateList.valueOf(i3));
        }
    }

    public final void setPagesCount(int count) {
        int iK;
        if (this.f56230a != count) {
            this.f56230a = count;
            setWeightSum(count);
            removeAllViews();
            int i = 0;
            while (i < count) {
                View lineView = getLineView();
                boolean z = i == count + (-1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                if (z) {
                    iK = 0;
                } else {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    iK = kli.a.k(context, 2.0f);
                }
                layoutParams.setMarginEnd(iK);
                layoutParams.weight = 1.0f;
                addView(lineView, layoutParams);
                i++;
            }
            a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinePageIndicator(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinePageIndicator(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        this.f56231b = -1;
        this.f56232c = kli.a.s(R$attr.uikit_colorWhite_30, context);
        this.d = kli.a.s(R$attr.uikit_colorWhite, context);
    }

    public /* synthetic */ LinePageIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
