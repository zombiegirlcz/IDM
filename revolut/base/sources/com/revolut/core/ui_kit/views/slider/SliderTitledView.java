package com.revolut.core.ui_kit.views.slider;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import cf1.h;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.n7;
import com.revolut.core.ui_kit.delegates.o7;
import com.revolut.core.ui_kit.internal.views.slider.SliderView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.SliderLabelsView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import cy0.a;
import cy0.c;
import e8.q;
import ip0.xq;
import ip0.yq;
import ip0.zq;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ou0.e;
import ou0.f;
import yhm.d;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001d\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH\u0007¢\u0006\u0004\b\u001d\u0010 J\u0015\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\r2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010(J\u0015\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u000b¢\u0006\u0004\b+\u0010\u000fJ\u0017\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/R0\u00108\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\r\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010BR(\u0010I\u001a\u0004\u0018\u00010D2\b\u0010\u0018\u001a\u0004\u0018\u00010D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/revolut/core/ui_kit/views/slider/SliderTitledView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Lcy0/c;", "decorator", "setPointDecorator", "(Lcy0/c;)V", "min", "max", "setRange", "(II)V", "value", "setValue", "(I)V", "Lip0/zq;", "stickyValues", "setStickyValues", "(Lip0/zq;)V", "", "(Ljava/util/List;)V", "", "distance", "setStickyDistancePercentage", "(F)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "setStartLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setEndLabel", "isVisible", "setLabelsVisible", "Lcom/revolut/core/ui_kit/delegates/o7;", "tooltipMode", "setTooltipMode", "(Lcom/revolut/core/ui_kit/delegates/o7;)V", "Lkotlin/Function1;", "Lcy0/a;", "b", "Lkotlin/jvm/functions/Function1;", "getOnValueChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnValueChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "onValueChangeListener", "Lcom/revolut/core/ui_kit/internal/views/slider/SliderView;", "f", "Le8/q;", "getSliderInternal", "()Lcom/revolut/core/ui_kit/internal/views/slider/SliderView;", "sliderInternal", "Lcom/revolut/core/ui_kit/views/SliderLabelsView;", "g", "getLabelContainer", "()Lcom/revolut/core/ui_kit/views/SliderLabelsView;", "labelContainer", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SliderTitledView extends ConstraintLayout implements TrackableItem {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Function1 onValueChangeListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q sliderInternal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q labelContainer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderTitledView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final SliderLabelsView getLabelContainer() {
        return (SliderLabelsView) this.labelContainer.f();
    }

    private final SliderView getSliderInternal() {
        return (SliderView) this.sliderInternal.f();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext */
    public Parcelable getF59200c() {
        return getSliderInternal().getF59200c();
    }

    public final Function1<a, Unit> getOnValueChangeListener() {
        return this.onValueChangeListener;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        getSliderInternal().setAnalyticsContext(parcelable);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        getSliderInternal().setEnabled(enabled);
    }

    public final void setEndLabel(@NotNull Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        getLabelContainer().setEndLabel(text);
    }

    public final void setLabelsVisible(boolean isVisible) {
        getLabelContainer().setVisibility(isVisible ? 0 : 8);
    }

    public final void setOnValueChangeListener(Function1<? super a, Unit> function1) {
        this.onValueChangeListener = function1;
    }

    public final void setPointDecorator(c decorator) {
        getSliderInternal().setPointDecorator(decorator);
    }

    public final void setRange(int min, int max) {
        getSliderInternal().setRange(min, max);
    }

    public final void setStartLabel(@NotNull Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        getLabelContainer().setStartLabel(text);
    }

    public final void setStickyDistancePercentage(float distance) {
        getSliderInternal().setStickyDistance(distance);
    }

    public final void setStickyValues(zq stickyValues) {
        List listA;
        e eVar;
        if (stickyValues == null || (listA = stickyValues.a()) == null) {
            listA = f0.f322471a;
        }
        if (stickyValues == null || (eVar = stickyValues.f167534a) == null) {
            eVar = e.OFFSET;
        }
        getSliderInternal().setStickyValues(listA, eVar);
        if (stickyValues instanceof xq) {
            getLabelContainer().setLabels(((xq) stickyValues).f167204b, getSliderInternal().getMinValue(), getSliderInternal().getMaxValue());
        }
    }

    public final void setTooltipMode(o7 tooltipMode) {
        if (Intrinsics.f(tooltipMode, n7.f54499a)) {
            getSliderInternal().setTooltipMode(f.f229756a);
        } else {
            if (tooltipMode != null) {
                throw new NoWhenBranchMatchedException();
            }
            getSliderInternal().setTooltipMode(null);
        }
    }

    public final void setValue(int value) {
        getSliderInternal().setValue(value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderTitledView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderTitledView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.sliderInternal = kli.a.J(R$id.sliderTitled_sliderInternal, this);
        this.labelContainer = kli.a.J(R$id.sliderTitled_labelContainer, this);
        View.inflate(context, R$layout.internal_slider_titled_view, this);
        getSliderInternal().setOnProgressChangeListener(new h(this, 16));
        setClipChildren(false);
    }

    public /* synthetic */ SliderTitledView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @d
    public final void setStickyValues(@NotNull List<Integer> stickyValues) {
        Intrinsics.checkNotNullParameter(stickyValues, "stickyValues");
        setStickyValues(new yq(stickyValues));
    }
}
