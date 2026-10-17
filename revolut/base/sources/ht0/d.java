package ht0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import com.revolut.core.ui_kit_resources.R$attr;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d extends FrameLayout {
    public final float A;
    public final float B;
    public float C;
    public b D;
    public boolean E;
    public final c F;
    public final int G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f155120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f155121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r10.w f155122c;
    public final Rect d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f155123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f155124h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f155125j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f155126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f155127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f155128n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f155129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f155130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f155131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f155132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f155133t;
    public boolean u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f155134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f155135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f155136y;
    public float z;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f155121b = new ArrayList();
        this.d = new Rect();
        this.k = -16777216;
        this.f155126l = 0.7f;
        this.f155127m = -16777216;
        this.f155128n = -16777216;
        this.o = -16777216;
        this.f155129p = ((Boolean) jo0.g.f176832p.getValue()).booleanValue() ? a.REV_10_REFRESH : a.DEFAULT;
        this.f155130q = -16777216;
        this.f155132s = new HashMap();
        this.f155133t = new ArrayList();
        this.u = true;
        this.v = false;
        this.f155134w = false;
        this.f155135x = BitmapDescriptorFactory.HUE_RED;
        this.f155136y = BitmapDescriptorFactory.HUE_RED;
        this.z = BitmapDescriptorFactory.HUE_RED;
        this.C = 0.5f;
        this.E = false;
        c cVar = new c(Looper.getMainLooper());
        cVar.f155116b = new WeakReference(this);
        this.F = cVar;
        this.G = 0;
        float fK = kli.a.k(context, BitmapDescriptorFactory.HUE_RED);
        this.A = kli.a.k(context, 12.0f);
        this.i = fK;
        this.f155131r = new m(context);
        this.B = kli.a.k(context, 4.0f);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.InternalAbsChartView, i, 0);
        float fK2 = kli.a.k(context, BitmapDescriptorFactory.HUE_RED);
        float fK3 = kli.a.k(context, 12.0f);
        this.u = typedArrayObtainStyledAttributes.getBoolean(R$styleable.InternalAbsChartView_internal_touch_enabled, true);
        this.A = typedArrayObtainStyledAttributes.getDimension(R$styleable.InternalAbsChartView_internal_y_space, fK3);
        this.f155127m = typedArrayObtainStyledAttributes.getColor(R$styleable.InternalAbsChartView_internal_pointer_color, -16777216);
        this.o = typedArrayObtainStyledAttributes.getColor(R$styleable.InternalAbsChartView_internal_line_color, -16777216);
        this.f155128n = typedArrayObtainStyledAttributes.getColor(R$styleable.InternalAbsChartView_internal_tips_color, -16777216);
        this.i = typedArrayObtainStyledAttributes.getDimension(R$styleable.InternalAbsChartView_internal_axis_space, fK2);
        this.k = typedArrayObtainStyledAttributes.getColor(R$styleable.InternalAbsChartView_internal_axis_color, -16777216);
        this.f155126l = typedArrayObtainStyledAttributes.getDimension(R$styleable.InternalAbsChartView_internal_axis_width, 0.7f);
        this.f155125j = typedArrayObtainStyledAttributes.getDimension(R$styleable.InternalAbsChartView_internal_rounding, kli.a.k(context, 10.0f));
        this.G = typedArrayObtainStyledAttributes.getInt(R$styleable.InternalAbsChartView_internal_gestures_handling_delay, this.G);
        this.v = typedArrayObtainStyledAttributes.getBoolean(R$styleable.InternalAbsChartView_internal_interval_selection_enabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(1, null);
    }

    public abstract float a();

    public final float b() {
        return ((this.f155124h - BitmapDescriptorFactory.HUE_RED) - this.i) - getAdditionalEndPadding();
    }

    public final Paint c() {
        Paint paint = new Paint();
        paint.setColor(this.f155127m);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(4.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    public final Paint d(int i) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setDither(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(this.f155125j));
        jb3.l.d(paint, getContext(), R$attr.internal_textAppearanceBody3);
        return paint;
    }

    public abstract void e();

    public final float f() {
        return this.f155123g - this.z;
    }

    public final void g(int i) {
        w wVar;
        if (i < 0 || i >= getCount() || (wVar = this.f155120a) == null) {
            return;
        }
        float f = ((hw0.k) this.f155121b.get(i)).f156007b;
        TrendView trendView = wVar.f155183b;
        int i2 = trendView.H / 2;
        List mDataLists = trendView.f155121b;
        Intrinsics.checkNotNullExpressionValue(mDataLists, "mDataLists");
        Integer numI = gj7.b.i(i, i2, trendView, mDataLists);
        if (numI != null) {
            int iIntValue = numI.intValue();
            if (wVar.f155182a != iIntValue) {
                trendView.A(iIntValue);
                trendView.x(iIntValue, true);
                int i3 = wVar.f155182a;
                trendView.A(i3);
                trendView.x(i3, false);
            }
            wVar.f155182a = iIntValue;
        } else {
            int i5 = wVar.f155182a;
            trendView.A(i5);
            trendView.x(i5, false);
            wVar.f155182a = -1;
        }
        ((com.revolut.core.ui_kit_core.displayers.haptic.b) or0.u.k(trendView).Y()).a(new Haptic.Effect(com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT, false));
        trendView.setChartDirty$ui_kit_components_release(trendView.getChartDirty() || trendView.getCursorLineHighlightEnabled());
    }

    public abstract int getAdditionalEndPadding();

    public a getChartStyle() {
        return this.f155129p;
    }

    public int getCount() {
        List list = this.f155121b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<Integer> getCursorLineIndexes() {
        ArrayList arrayList = this.f155133t;
        arrayList.clear();
        HashMap map = this.f155132s;
        boolean z = map.size() > 1;
        Iterator it8 = map.values().iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Integer) it8.next()).intValue();
            if (z) {
                TrendView trendView = (TrendView) this;
                if (g4i.a.l(trendView.f56904y1) && g4i.a.a(trendView.f56904y1, trendView.f155121b.size())) {
                    hw0.j jVar = trendView.f56904y1;
                    int size = trendView.f155121b.size();
                    iIntValue = kotlin.ranges.f.g(iIntValue, (jVar == null || !g4i.a.l(jVar) || size <= 0) ? 0 : g4i.a.d(jVar, size), g4i.a.p(trendView.f56904y1, trendView.f155121b.size()));
                }
            }
            if (o(Integer.valueOf(iIntValue)).booleanValue()) {
                arrayList.add(Integer.valueOf(iIntValue));
            }
        }
        Collections.sort(arrayList);
        while (arrayList.size() > 2) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    public float getMaxValue() {
        return this.e;
    }

    public float getMinValue() {
        return this.f;
    }

    public final void h(Integer num, Integer num2) {
        w wVar = this.f155120a;
        if (wVar != null) {
            num.getClass();
            num2.getClass();
            TrendView trendView = wVar.f155183b;
            int i = wVar.f155182a;
            trendView.A(i);
            trendView.x(i, false);
            wVar.f155182a = -1;
            ((com.revolut.core.ui_kit_core.displayers.haptic.b) or0.u.k(trendView).Y()).a(new Haptic.Effect(com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT, false));
            trendView.setChartDirty$ui_kit_components_release(true);
        }
    }

    public abstract void i(Canvas canvas, int i);

    public final void j(Canvas canvas, int i) {
        Paint paintA;
        canvas.save();
        float f = f();
        canvas.translate(BitmapDescriptorFactory.HUE_RED, f);
        hw0.k kVar = (hw0.k) this.f155121b.get(i);
        String strValueOf = String.valueOf(kVar.f156006a);
        float fS = s(i);
        ((Paint) this.f155122c.f250866b).getTextBounds(strValueOf, 0, strValueOf.length(), this.d);
        float fHeight = (-f) + r7.height() + this.B;
        a aVar = this.f155129p;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            paintA = (Paint) this.f155122c.f250865a;
        } else {
            if (iOrdinal != 1) {
                throw new AssertionError("Unhandled ChartStyle: " + aVar);
            }
            paintA = this.f155131r.a(fS, fHeight, m(kVar.f156007b), a(), this.f155130q, i);
        }
        canvas.drawLine(fS, BitmapDescriptorFactory.HUE_RED, fS, fHeight, paintA);
        canvas.restore();
    }

    public final float k(int i) {
        List list = this.f155121b;
        return a() * ((i < 0 || i >= list.size()) ? BitmapDescriptorFactory.HUE_RED : m(((hw0.k) list.get(i)).f156007b));
    }

    public final float l(float f) {
        return a() * m(f);
    }

    public final float m(float f) {
        float minValue = getMinValue();
        float fAbs = Math.abs(getMaxValue() - minValue);
        if (fAbs != BitmapDescriptorFactory.HUE_RED && Float.isFinite(fAbs) && Float.isFinite(f)) {
            return Math.abs(f - minValue) / fAbs;
        }
        return 0.5f;
    }

    public final int n(float f) {
        float fMax = (Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f, b() + BitmapDescriptorFactory.HUE_RED)) - BitmapDescriptorFactory.HUE_RED) / b();
        int size = this.f155121b.size() - 1;
        int i = 0;
        while (i <= size) {
            int iA = a10.b.a(size, i, 2, i);
            if (fMax < ((hw0.k) this.f155121b.get(iA)).f156008c) {
                size = iA - 1;
            } else {
                if (fMax <= ((hw0.k) this.f155121b.get(iA)).f156008c) {
                    return iA;
                }
                i = iA + 1;
            }
        }
        if (size < 0) {
            return 0;
        }
        return i >= this.f155121b.size() ? this.f155121b.size() - 1 : Math.abs(((hw0.k) this.f155121b.get(i)).f156008c - fMax) < Math.abs(((hw0.k) this.f155121b.get(size)).f156008c - fMax) ? i : size;
    }

    public final Boolean o(Integer num) {
        return Boolean.valueOf(num.intValue() >= 0 && num.intValue() < getCount());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        q(canvas);
        Iterator<Integer> it8 = getCursorLineIndexes().iterator();
        while (it8.hasNext()) {
            int iIntValue = it8.next().intValue();
            j(canvas, iIntValue);
            if (this.f155132s.size() == 1) {
                i(canvas, iIntValue);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        this.f155123g = i2;
        this.f155124h = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0224  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ht0.d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public abstract void p();

    public abstract void q(Canvas canvas);

    public final void r() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public final float s(int i) {
        return t(((hw0.k) this.f155121b.get(i)).f156008c);
    }

    public void setCursorLineColor(int i) {
        if (this.f155130q == i) {
            return;
        }
        this.f155130q = i;
        r();
    }

    public void setData(List<hw0.k> list) {
        if (this.f155121b != list) {
            this.f155121b = list;
            p();
            e();
            r();
        }
    }

    public void setIntervalSelectionEnabled(boolean z) {
        this.v = z;
        r();
    }

    public void setListener(b bVar) {
        this.D = bVar;
    }

    public void setMinMaxOverride(float f, float f4) {
        this.E = true;
        this.e = f4;
        this.f = f;
        r();
    }

    public void setOffset(float f) {
        this.C = f;
    }

    public void setPointerCircleColor(int i) {
        this.f155127m = i;
    }

    public void setTouchEnabled(boolean z) {
        this.u = z;
        r();
    }

    public final float t(float f) {
        return !Float.isFinite(f) ? this.C : (b() * f) + this.C;
    }
}
