package com.revolut.core.ui_kit.views.slider;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.slider.RangeSliderView;
import com.revolut.core.ui_kit.models.Clause;
import cwj.h;
import e8.q;
import kli.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ty0.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u000eJ\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015R6\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010(¨\u0006-"}, d2 = {"Lcom/revolut/core/ui_kit/views/slider/RangeSliderTitledView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "minSelectionRange", "maxSelectionRange", "", "setSelectionRange", "(II)V", "minRange", "maxRange", "setRange", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "setStartLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setEndLabel", "Lkotlin/Function2;", "b", "Lkotlin/jvm/functions/Function2;", "getOnRangeSelectionChangeListener", "()Lkotlin/jvm/functions/Function2;", "setOnRangeSelectionChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "onRangeSelectionChangeListener", "Lcom/revolut/core/ui_kit/internal/views/slider/RangeSliderView;", "f", "Le8/q;", "getSlider", "()Lcom/revolut/core/ui_kit/internal/views/slider/RangeSliderView;", "slider", "Lcom/revolut/core/ui_kit/internal/views/UIKitTextView;", "g", "getLabelStart", "()Lcom/revolut/core/ui_kit/internal/views/UIKitTextView;", "labelStart", "h", "getLabelEnd", "labelEnd", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RangeSliderTitledView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Function2 onRangeSelectionChangeListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q slider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q labelStart;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q labelEnd;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeSliderTitledView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final UIKitTextView getLabelEnd() {
        return (UIKitTextView) this.labelEnd.f();
    }

    private final UIKitTextView getLabelStart() {
        return (UIKitTextView) this.labelStart.f();
    }

    private final RangeSliderView getSlider() {
        return (RangeSliderView) this.slider.f();
    }

    public final Function2<Integer, Integer, Unit> getOnRangeSelectionChangeListener() {
        return this.onRangeSelectionChangeListener;
    }

    public final void setEndLabel(@NotNull Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        c.b(u.k(this).b0(), text, getLabelEnd(), null, null, 12);
    }

    public final void setOnRangeSelectionChangeListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.onRangeSelectionChangeListener = function2;
    }

    public final void setRange(int minRange, int maxRange) {
        getSlider().setRange(minRange, maxRange);
    }

    public final void setSelectionRange(int minSelectionRange, int maxSelectionRange) {
        getSlider().setSelectionRange(minSelectionRange, maxSelectionRange);
    }

    public final void setStartLabel(@NotNull Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        c.b(u.k(this).b0(), text, getLabelStart(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeSliderTitledView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeSliderTitledView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.slider = a.J(R$id.rangeSliderView_slider, this);
        this.labelStart = a.J(R$id.rangeSliderView_labelStart, this);
        this.labelEnd = a.J(R$id.rangeSliderView_labelEnd, this);
        View.inflate(context, R$layout.internal_range_slider_titled_view, this);
        getSlider().setOnRangeSelectionChangeListener(new h(this, 2));
        setClipChildren(false);
    }

    public /* synthetic */ RangeSliderTitledView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
