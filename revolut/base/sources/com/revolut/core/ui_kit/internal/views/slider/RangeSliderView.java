package com.revolut.core.ui_kit.internal.views.slider;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ou0.c;
import ou0.i;
import ou0.j;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R6\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/slider/RangeSliderView;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Lou0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "minRange", "maxRange", "", "setRange", "(II)V", "minSelection", "maxSelection", "setSelectionRange", "", "enabled", "setEnabled", "(Z)V", "Lkotlin/Function2;", "h", "Lkotlin/jvm/functions/Function2;", "getOnRangeSelectionChangeListener", "()Lkotlin/jvm/functions/Function2;", "setOnRangeSelectionChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "onRangeSelectionChangeListener", "getValueRange", "()I", "valueRange", "ou0/c", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RangeSliderView extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f57548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f57549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57550c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f57551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public Function2 onRangeSelectionChangeListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeSliderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getValueRange() {
        return this.d - this.f57550c;
    }

    @Override // ou0.i
    public final void a() {
        j jVar = this.f57549b;
        RectF rectF = jVar.i;
        float fHeight = rectF.height() / 2;
        Path path = jVar.f229759j;
        path.rewind();
        Path path2 = jVar.k;
        path2.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fHeight, fHeight, direction);
        RectF rectF2 = this.f57548a;
        path2.addRoundRect(rectF2.left, rectF.top, rectF2.right, rectF.bottom, fHeight, fHeight, direction);
    }

    public final boolean b(int i, int i2) {
        double valueRange = ((double) (i2 - i)) / ((double) getValueRange());
        float fWidth = this.f57549b.i.width();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (fWidth != BitmapDescriptorFactory.HUE_RED) {
            f = r0.f229760l / fWidth;
        }
        return valueRange > ((double) f);
    }

    public final Function2<Integer, Integer, Unit> getOnRangeSelectionChangeListener() {
        return this.onRangeSelectionChangeListener;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        j jVar = this.f57549b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = jVar.f229751b;
        paint.setColor(jVar.f);
        canvas.drawPath(jVar.f229759j, paint);
        paint.setColor(jVar.e);
        canvas.drawPath(jVar.k, paint);
        RectF rectF = this.f57548a;
        jVar.f(rectF.left, canvas);
        jVar.f(rectF.right, canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        j jVar = this.f57549b;
        AppCompatSeekBar appCompatSeekBar = jVar.f229758h;
        int iResolveSizeAndState = View.resolveSizeAndState(appCompatSeekBar.getPaddingRight() + appCompatSeekBar.getPaddingLeft(), i, 0);
        AppCompatSeekBar appCompatSeekBar2 = jVar.f229758h;
        setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(Math.max(jVar.f229761m, jVar.f229760l * 2) + appCompatSeekBar2.getPaddingBottom() + appCompatSeekBar2.getPaddingTop(), i2, 0));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Function2 function2;
        if (z) {
            int i2 = this.f57550c;
            int i3 = i + i2;
            int iAbs = Math.abs(i - (this.e - i2));
            int iAbs2 = Math.abs(i - (this.f - this.f57550c));
            if (iAbs < iAbs2) {
                if (this.f57551g == c.RIGHT || !b(i3, this.f)) {
                    return;
                }
                this.f57551g = c.LEFT;
                Function2 function22 = this.onRangeSelectionChangeListener;
                if (function22 != null) {
                    function22.invoke(Integer.valueOf(i3), Integer.valueOf(this.f));
                    return;
                }
                return;
            }
            if (iAbs > iAbs2) {
                if (this.f57551g == c.LEFT || !b(this.e, i3)) {
                    return;
                }
                this.f57551g = c.RIGHT;
                Function2 function23 = this.onRangeSelectionChangeListener;
                if (function23 != null) {
                    function23.invoke(Integer.valueOf(this.e), Integer.valueOf(i3));
                    return;
                }
                return;
            }
            if (this.f57551g == c.LEFT && b(i3, this.f)) {
                Function2 function24 = this.onRangeSelectionChangeListener;
                if (function24 != null) {
                    function24.invoke(Integer.valueOf(i3), Integer.valueOf(this.f));
                    return;
                }
                return;
            }
            if (this.f57551g == c.RIGHT && b(this.e, i3) && (function2 = this.onRangeSelectionChangeListener) != null) {
                function2.invoke(Integer.valueOf(this.e), Integer.valueOf(i3));
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        if (i == 0 || i2 == 0) {
            return;
        }
        j jVar = this.f57549b;
        RectF rectF = jVar.i;
        AppCompatSeekBar appCompatSeekBar = jVar.f229758h;
        rectF.set(appCompatSeekBar.getPaddingStart(), BitmapDescriptorFactory.HUE_RED, appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingEnd(), BitmapDescriptorFactory.HUE_RED);
        jVar.g();
        setSelectionRange(this.e, this.f);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f57551g = c.NONE;
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zOnTouchEvent = super.onTouchEvent(event);
        this.f57549b.d(event, zOnTouchEvent);
        return zOnTouchEvent;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        j jVar = this.f57549b;
        if (enabled) {
            jVar.getClass();
        } else {
            jVar.a(false);
        }
    }

    public final void setOnRangeSelectionChangeListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.onRangeSelectionChangeListener = function2;
    }

    public final void setRange(int minRange, int maxRange) {
        this.f57550c = minRange;
        this.d = maxRange;
        this.e = minRange;
        this.f = maxRange;
        setMax(getValueRange());
    }

    public final void setSelectionRange(int minSelection, int maxSelection) {
        this.e = minSelection;
        this.f = maxSelection;
        float f = 100;
        j jVar = this.f57549b;
        float fE = j.e(jVar, ((minSelection - this.f57550c) / getValueRange()) * f);
        RectF rectF = this.f57548a;
        rectF.left = fE;
        rectF.right = j.e(jVar, ((this.f - this.f57550c) / getValueRange()) * f);
        a();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeSliderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeSliderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57548a = new RectF();
        j jVar = new j(this);
        this.f57549b = jVar;
        this.d = 100;
        this.f = 100;
        this.f57551g = c.NONE;
        setThumb(null);
        setProgressDrawable(null);
        setBackgroundColor(0);
        setOnSeekBarChangeListener(this);
        jVar.b();
    }

    public /* synthetic */ RangeSliderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
