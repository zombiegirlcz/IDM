package com.revolut.core.ui_kit.internal.views.slider;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import cy0.b;
import cy0.c;
import ix0.f2;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import m8b.o;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ou0.d;
import ou0.e;
import ou0.f;
import ou0.g;
import ou0.h;
import ou0.i;
import ou0.j;
import zhm.b0;
import zhm.f0;
import zhm.v;
import zhm.w0;
import zhm.z;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005\u0017$UVVB'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\tH\u0017¢\u0006\u0004\b \u0010\u0014J\u0019\u0010\"\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00105\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0014R$\u00108\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R$\u0010;\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u00103R<\u0010C\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u00103¨\u0006W"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/slider/SliderView;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lou0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "min", "max", "", "setRange", "(II)V", "value", "setValue", "(I)V", "", "points", "Lou0/e;", "stickyValueType", "setStickyValues", "(Ljava/util/List;Lou0/e;)V", "", "enabled", "setEnabled", "(Z)V", "progress", "setProgress", "l", "setOnSeekBarChangeListener", "(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V", "Lou0/g;", "tooltipMode", "setTooltipMode", "(Lou0/g;)V", "Landroid/os/Parcelable;", "b", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "h", "I", "getCurrentValue", "()I", "setCurrentValue", "currentValue", "i", "getMinValue", "minValue", "j", "getMaxValue", "maxValue", "Lkotlin/Function3;", "k", "Lkotlin/jvm/functions/Function3;", "getOnProgressChangeListener", "()Lkotlin/jvm/functions/Function3;", "setOnProgressChangeListener", "(Lkotlin/jvm/functions/Function3;)V", "onProgressChangeListener", "Lcy0/c;", "Lcy0/c;", "getPointDecorator", "()Lcy0/c;", "setPointDecorator", "(Lcy0/c;)V", "pointDecorator", "", "m", "F", "getStickyDistance", "()F", "setStickyDistance", "(F)V", "stickyDistance", "getRange", "range", "m8b/o", "ou0/d", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SliderView extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener, TrackableItem, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f57553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f57555c;
    public e d;
    public o e;
    public b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f57556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int currentValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int minValue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int maxValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public Function3 onProgressChangeListener;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public c pointDecorator;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float stickyDistance;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f57561n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gv0.a f57562p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public et0.a f57563q;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Integer.valueOf(((b) obj2).f110017a), Integer.valueOf(((b) obj3).f110017a));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getRange() {
        return this.maxValue - this.minValue;
    }

    public static /* synthetic */ void setStickyValues$default(SliderView sliderView, List list, e eVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            eVar = e.OFFSET;
        }
        sliderView.setStickyValues(list, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ou0.i
    public final void a() {
        o oVar = this.e;
        ?? stickyPoints = this.f57555c;
        float f = this.f57556g;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(stickyPoints, "stickyPoints");
        j jVar = ((SliderView) oVar.d).f57553a;
        Path path = jVar.k;
        Path path2 = jVar.f229759j;
        RectF rectF = jVar.i;
        path.rewind();
        path2.rewind();
        RectF rectF2 = (RectF) oVar.f203465a;
        rectF2.set(rectF);
        float fHeight = jVar.i.height() / 2;
        float[] fArr = (float[]) oVar.f203466b;
        fArr[0] = fHeight;
        fArr[1] = fHeight;
        fArr[6] = fHeight;
        fArr[7] = fHeight;
        float[] fArr2 = (float[]) oVar.f203467c;
        fArr2[2] = fHeight;
        fArr2[3] = fHeight;
        fArr2[4] = fHeight;
        fArr2[5] = fHeight;
        oVar.c(stickyPoints, f, rectF2, path, path2);
    }

    public final o b(e eVar) {
        int i = h.f229757a[eVar.ordinal()];
        if (i == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new d(this, kli.a.k(context, 4.0f), 0);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new d(this, kli.a.k(context2, 2.0f), 1);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF53440j() {
        return this.analyticsContext;
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

    public final c getPointDecorator() {
        return this.pointDecorator;
    }

    public final float getStickyDistance() {
        return this.stickyDistance;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        j jVar = this.f57553a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = jVar.f229751b;
        paint.setColor(jVar.f);
        canvas.drawPath(jVar.f229759j, paint);
        paint.setColor(jVar.e);
        canvas.drawPath(jVar.k, paint);
        jVar.f(this.f57556g, canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        j jVar = this.f57553a;
        AppCompatSeekBar appCompatSeekBar = jVar.f229758h;
        int iResolveSizeAndState = View.resolveSizeAndState(appCompatSeekBar.getPaddingRight() + appCompatSeekBar.getPaddingLeft(), i, 0);
        AppCompatSeekBar appCompatSeekBar2 = jVar.f229758h;
        setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(Math.max(jVar.f229761m, jVar.f229760l * 2) + appCompatSeekBar2.getPaddingBottom() + appCompatSeekBar2.getPaddingTop(), i2, 0));
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Object obj2;
        b bVar;
        boolean z3;
        PercentageClause percentageClause;
        double d;
        Object obj3;
        float range = (i / getRange()) * 100;
        this.currentValue = this.minValue + i;
        if (z) {
            ?? r110 = this.f57555c;
            int size = r110.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj3 = null;
                    break;
                }
                obj3 = r110.get(i2);
                if (Math.abs(((b) obj3).f110018b - range) <= this.stickyDistance) {
                    break;
                } else {
                    i2++;
                }
            }
            bVar = (b) obj3;
        } else {
            ?? r62 = this.f57555c;
            int size2 = r62.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = r62.get(i3);
                if (((b) obj2).f110017a == i) {
                    break;
                } else {
                    i3++;
                }
            }
            bVar = (b) obj2;
        }
        if (bVar != null) {
            range = bVar.f110018b;
            this.currentValue = bVar.f110017a + this.minValue;
            boolean zEquals = bVar.equals(this.f);
            z3 = !zEquals;
            if (zEquals) {
                return;
            }
        } else {
            z3 = false;
        }
        this.f = bVar;
        this.f57556g = j.e(((SliderView) this.e.d).f57553a, range);
        if (this.o) {
            int i5 = this.currentValue;
            g gVar = this.f57561n;
            if (Intrinsics.f(gVar, f.f229756a)) {
                int i6 = this.maxValue;
                int i21 = this.minValue;
                if (i6 == i21) {
                    d = 0.0d;
                } else {
                    d = ((double) 100) * (((double) (i5 - i21)) / ((double) (i6 - i21)));
                }
                int i22 = 0;
                percentageClause = new PercentageClause(d, new PercentageClause.Format.Custom(i22, 12, null, null, RoundingMode.HALF_UP), (Custom) null, 4);
            } else {
                if (gVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                percentageClause = null;
            }
            if (percentageClause != null) {
                this.f57562p.setText(percentageClause);
                et0.a aVar = this.f57563q;
                if (aVar != null) {
                    aVar.f = Integer.valueOf(rim.d.c(this.f57556g));
                    aVar.f129004g = 0;
                }
            }
        }
        a();
        invalidate();
        Function3 function3 = this.onProgressChangeListener;
        if (function3 != null) {
            function3.invoke(Integer.valueOf(this.currentValue), Boolean.valueOf(z), Boolean.valueOf(z3));
        }
        if (z) {
            u.k(this).n0().a(this, this, null);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        if (i == 0 || i2 == 0) {
            return;
        }
        j jVar = this.f57553a;
        RectF rectF = jVar.i;
        AppCompatSeekBar appCompatSeekBar = jVar.f229758h;
        rectF.set(appCompatSeekBar.getPaddingStart(), BitmapDescriptorFactory.HUE_RED, appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingEnd(), BitmapDescriptorFactory.HUE_RED);
        jVar.g();
        this.f57556g = j.e(((SliderView) this.e.d).f57553a, ((this.currentValue - this.minValue) / getRange()) * 100);
        a();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        et0.a aVar;
        this.o = true;
        if (this.f57561n == null || (aVar = this.f57563q) == null) {
            return;
        }
        gv0.a view = this.f57562p;
        Intrinsics.checkNotNullParameter(view, "view");
        if (aVar.e == null) {
            aVar.e = view;
            aVar.d.a();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        et0.a aVar;
        this.o = false;
        if (this.f57561n == null || (aVar = this.f57563q) == null) {
            return;
        }
        f2 f2Var = aVar.d;
        View view = f2Var.f169234a;
        if (f2Var.d) {
            f2Var.d = false;
            view.removeOnAttachStateChangeListener(f2Var);
            f2Var.onViewDetachedFromWindow(view);
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zOnTouchEvent = super.onTouchEvent(event);
        this.f57553a.d(event, zOnTouchEvent);
        return zOnTouchEvent;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setCurrentValue(int i) {
        this.currentValue = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        j jVar = this.f57553a;
        if (enabled) {
            jVar.getClass();
        } else {
            jVar.a(false);
        }
    }

    public final void setOnProgressChangeListener(Function3 function3) {
        this.onProgressChangeListener = function3;
    }

    @Override // android.widget.SeekBar
    @yhm.d
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener l2) {
    }

    public final void setPointDecorator(c cVar) {
        this.pointDecorator = cVar;
    }

    @Override // android.widget.ProgressBar
    @yhm.d
    public void setProgress(int progress) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void setRange(int min, int max) {
        int i = this.currentValue;
        ?? r110 = this.f57555c;
        ArrayList arrayList = new ArrayList(r110.size());
        int size = r110.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(((b) r110.get(i2)).f110017a + this.minValue));
        }
        this.minValue = min;
        this.maxValue = max;
        setMax(getRange());
        setStickyValues(arrayList, this.d);
        setValue(i);
    }

    public final void setStickyDistance(float f) {
        this.stickyDistance = f;
    }

    public final void setStickyValues(@NotNull List<Integer> points, @NotNull e stickyValueType) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(stickyValueType, "stickyValueType");
        ArrayList points2 = new ArrayList();
        Iterator<T> it8 = points.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue() - this.minValue;
            points2.add(new b(iIntValue, (iIntValue / getRange()) * 100));
        }
        if (h.f229757a[stickyValueType.ordinal()] == 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : points2) {
                float f = ((b) obj2).f110018b;
                if (f != BitmapDescriptorFactory.HUE_RED && f != 100.0f) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() > 4) {
                throw new IllegalArgumentException("Component supports up to 4 sticky points with labels");
            }
        }
        if (points2.size() > 1) {
            z.w(points2, new a());
        }
        c cVar = this.pointDecorator;
        if (cVar != null) {
            float f4 = ((cy0.d) cVar).f110019a;
            Intrinsics.checkNotNullParameter(points2, "points");
            int i = 0;
            int i2 = 0;
            for (Object obj3 : points2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                b bVar = (b) obj3;
                float f5 = bVar.f110018b;
                float f6 = i2 == 0 ? 0.0f : ((b) points2.get(i2 - 1)).f110018b;
                if (f5 - f6 < f4) {
                    bVar.f110018b = f6 + f4;
                }
                i2 = i3;
            }
            m mVarL = b0.L(points2);
            Iterator it9 = mVarL.iterator();
            while (true) {
                ListIterator listIterator = ((w0) it9).f322483a;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Object objPrevious = listIterator.previous();
                int i5 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                b bVar2 = (b) objPrevious;
                float f32 = bVar2.f110018b;
                float f35 = i == 0 ? 100.0f : ((b) mVarL.get(i - 1)).f110018b;
                if (f32 < f35 && f35 - f32 >= f4) {
                    break;
                }
                bVar2.f110018b = f35 - f4;
                i = i5;
            }
        }
        this.f57555c = points2;
        this.d = stickyValueType;
        this.e = b(stickyValueType);
        a();
        invalidate();
    }

    public final void setTooltipMode(g tooltipMode) {
        this.f57561n = tooltipMode;
        if (this.f57563q == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Activity activityI = z92.f.i(context);
            if (activityI != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this.f57563q = new et0.a(activityI, this, kli.a.k(context2, 2.0f));
            }
        }
    }

    public final void setValue(int value) {
        int iG = kotlin.ranges.f.g(value, this.minValue, this.maxValue);
        int i = this.minValue;
        int i2 = iG - i;
        this.currentValue = i + i2;
        if (i2 != getProgress()) {
            super.setProgress(i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        j jVar = new j(this);
        this.f57553a = jVar;
        this.f57555c = f0.f322471a;
        e eVar = e.OFFSET;
        this.d = eVar;
        this.e = b(eVar);
        this.currentValue = getProgress();
        this.maxValue = 100;
        this.stickyDistance = 2.0f;
        this.f57562p = new gv0.a(context, null, 6, 0);
        setThumb(null);
        setProgressDrawable(null);
        setBackgroundColor(0);
        super.setOnSeekBarChangeListener(this);
        jVar.b();
    }

    public /* synthetic */ SliderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
