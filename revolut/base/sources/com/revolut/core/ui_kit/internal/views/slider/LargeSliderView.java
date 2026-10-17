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
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import zhm.w;
import zhm.z;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0000\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0002:;B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0012R<\u0010(\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00103\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR$\u00106\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010\u001c\u001a\u0004\b5\u0010\u001eR\u0014\u00108\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001e¨\u0006<"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/slider/LargeSliderView;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "min", "max", "", "setRange", "(II)V", "value", "setValue", "(I)V", "", "points", "setStickyValues", "(Ljava/util/List;)V", "", "enabled", "setEnabled", "(Z)V", "r", "I", "getCurrentValue", "()I", "setCurrentValue", "currentValue", "Lkotlin/Function3;", "s", "Lkotlin/jvm/functions/Function3;", "getOnProgressChangeListener", "()Lkotlin/jvm/functions/Function3;", "setOnProgressChangeListener", "(Lkotlin/jvm/functions/Function3;)V", "onProgressChangeListener", "", "t", "F", "getStickyDistance", "()F", "setStickyDistance", "(F)V", "stickyDistance", "u", "getMinValue", "minValue", "v", "getMaxValue", "maxValue", "getValueRange", "valueRange", "Companion", "ou0/b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LargeSliderView extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57519c;
    public final float d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f57520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f57521h;
    public final Path i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f57522j;
    public final Path k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Path f57523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f57524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f57525n;
    public cy0.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f57526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f57527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public int currentValue;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Function3 onProgressChangeListener;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public float stickyDistance;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public int minValue;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public int maxValue;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ou0.b f57531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f57532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f57533y;

    public static final class a {
        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Integer.valueOf(((cy0.b) obj2).f110017a), Integer.valueOf(((cy0.b) obj3).f110017a));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeSliderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getValueRange() {
        return this.maxValue - this.minValue;
    }

    public final float b(float f) {
        return ((((getWidth() - getPaddingStart()) - getPaddingEnd()) * f) / 100) + getPaddingStart();
    }

    public final void d(ArrayList arrayList) {
        RectF rectF = this.f57521h;
        float f = 2;
        float fHeight = rectF.height() / f;
        Path path = this.i;
        path.rewind();
        RectF rectF2 = this.f57520g;
        rectF2.set(rectF);
        rectF2.right = rectF.right;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, fHeight, fHeight, direction);
        Path path2 = this.f57522j;
        path2.rewind();
        rectF2.set(rectF);
        rectF2.right = (this.f57527q / f) + this.f57524m;
        path2.addRoundRect(rectF2, fHeight, fHeight, direction);
        Path path3 = this.k;
        path3.rewind();
        Path path4 = this.f57523l;
        path4.rewind();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            float fB = b(((cy0.b) it8.next()).f110018b);
            float f4 = this.f57524m;
            float f5 = this.d;
            if (fB < f4) {
                path4.addCircle(fB, rectF.centerY(), f5, Path.Direction.CW);
            } else {
                path3.addCircle(fB, rectF.centerY(), f5, Path.Direction.CW);
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(ev10);
        this.f57531w.d(ev10, zDispatchTouchEvent);
        return zDispatchTouchEvent;
    }

    public final void e() {
        int height = getHeight();
        float paddingTop = (((height - getPaddingTop()) - getPaddingBottom()) - this.f57527q) / 2;
        this.f57521h.set(this.e - this.f57526p, getPaddingTop() + paddingTop, getWidth(), (height - getPaddingBottom()) - paddingTop);
    }

    public final int getCurrentValue() {
        return this.currentValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final Function3 getOnProgressChangeListener() {
        return this.onProgressChangeListener;
    }

    public final float getStickyDistance() {
        return this.stickyDistance;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ou0.b bVar = this.f57531w;
        Paint paint = bVar.f229751b;
        paint.setColor(bVar.f);
        canvas.drawPath(this.i, paint);
        paint.setColor(bVar.e);
        canvas.drawPath(this.f57522j, paint);
        paint.setColor(this.f57532x);
        canvas.drawPath(this.k, paint);
        paint.setColor(this.f57533y);
        canvas.drawPath(this.f57523l, paint);
        float f = this.f57526p;
        float fCenterY = this.f57521h.centerY();
        float f4 = this.f57524m;
        Paint paint2 = bVar.f229752c;
        if (paint2 != null) {
            if (paint2.getAlpha() == 0) {
                paint2 = null;
            }
            if (paint2 != null) {
                canvas.drawCircle(f4, fCenterY, f, paint2);
            }
        }
        paint.setColor(this.f57517a);
        canvas.drawCircle(f4, fCenterY, f, paint);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft(), i, 0), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + this.f57518b, i2, 0));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float valueRange = (i / getValueRange()) * 100;
        this.currentValue = this.minValue + i;
        Object obj2 = null;
        cy0.b bVar = null;
        ArrayList arrayList = this.f57525n;
        boolean z3 = false;
        if (z) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cy0.b bVar2 = (cy0.b) arrayList.get(i2);
                float fAbs = Math.abs(bVar2.f110018b - valueRange);
                if (fAbs <= this.stickyDistance && (bVar == null || fAbs < Math.abs(bVar.f110018b - valueRange))) {
                    bVar = bVar2;
                }
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i3);
                if (((cy0.b) obj3).f110017a == i) {
                    obj2 = obj3;
                    break;
                }
                i3++;
            }
            bVar = (cy0.b) obj2;
        }
        if (bVar != null) {
            valueRange = bVar.f110018b;
            this.currentValue = bVar.f110017a + this.minValue;
            boolean zEquals = bVar.equals(this.o);
            z3 = !zEquals;
            if (zEquals) {
                return;
            }
        }
        this.o = bVar;
        this.f57524m = b(valueRange);
        d(arrayList);
        invalidate();
        Function3 function3 = this.onProgressChangeListener;
        if (function3 != null) {
            function3.invoke(Integer.valueOf(this.currentValue), Boolean.valueOf(z), Boolean.valueOf(z3));
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        if (i == 0 || i2 == 0) {
            return;
        }
        e();
        this.f57524m = b((getProgress() / getValueRange()) * 100);
        d(this.f57525n);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public final void setCurrentValue(int i) {
        this.currentValue = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ou0.b bVar = this.f57531w;
        if (enabled) {
            bVar.getClass();
        } else {
            bVar.a(false);
        }
    }

    public final void setOnProgressChangeListener(Function3 function3) {
        this.onProgressChangeListener = function3;
    }

    public final void setRange(int min, int max) {
        this.minValue = min;
        this.maxValue = max;
        ArrayList arrayList = this.f57525n;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(Integer.valueOf(((cy0.b) it8.next()).f110017a + this.minValue));
        }
        setStickyValues(arrayList2);
        setMax(getValueRange());
    }

    public final void setStickyDistance(float f) {
        this.stickyDistance = f;
    }

    public final void setStickyValues(@NotNull List<Integer> points) {
        Intrinsics.checkNotNullParameter(points, "points");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = points.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue() - this.minValue;
            arrayList.add(new cy0.b(iIntValue, (iIntValue / getValueRange()) * 100));
        }
        if (arrayList.size() > 1) {
            z.w(arrayList, new b());
        }
        ArrayList arrayList2 = this.f57525n;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        d(arrayList2);
        invalidate();
    }

    public final void setValue(int value) {
        int iG = f.g(value, this.minValue, this.maxValue);
        int i = this.minValue;
        int i2 = iG - i;
        this.currentValue = i + i2;
        if (i2 != getProgress()) {
            setProgress(i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeSliderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeSliderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int iS = kli.a.s(R$attr.uikit_colorOnAccent, context);
        this.f57517a = iS;
        int iK = kli.a.k(context, 32.0f);
        this.f57518b = iK;
        this.f57519c = kli.a.k(context, 36.0f);
        this.d = kli.a.l(context, 2.0f);
        int iK2 = kli.a.k(context, 13.0f);
        this.e = iK2;
        this.f = kli.a.k(context, 15.0f);
        this.f57520g = new RectF();
        this.f57521h = new RectF();
        this.i = new Path();
        this.f57522j = new Path();
        this.k = new Path();
        this.f57523l = new Path();
        this.f57525n = new ArrayList();
        this.f57526p = iK2;
        this.f57527q = iK;
        this.currentValue = getProgress();
        this.stickyDistance = 2.0f;
        this.maxValue = 100;
        ou0.b bVar = new ou0.b(this, 0);
        this.f57531w = bVar;
        setWillNotDraw(false);
        setThumb(null);
        setProgressDrawable(null);
        setBackgroundColor(0);
        setOnSeekBarChangeListener(this);
        bVar.b();
        this.f57532x = kli.a.s(R$attr.uikit_colorGreyTone20, context);
        this.f57533y = iS;
        int i2 = ((iK / 2) - iK2) + iK2;
        setPadding(i2, 0, i2, 0);
    }

    public /* synthetic */ LargeSliderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
