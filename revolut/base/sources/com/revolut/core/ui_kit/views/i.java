package com.revolut.core.ui_kit.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import au0.a2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.m5;
import mx0.n5;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public class i extends FrameLayout {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f59068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f59069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f59070c;
    public final ArrayList d;
    public final ArrayList e;
    public fr0.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f59071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f59072h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f59073j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Path f59074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f59075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ValueAnimator f59076n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f59077p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f59078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f59079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f59080s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f59081t;
    public float u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f59082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f59083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AppCompatEditText f59084y;
    public String z;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setFont$default(i iVar, m5 m5Var, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFont");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        iVar.setFont(m5Var, z);
    }

    private final void setupCurrentSprite(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y2 = motionEvent.getY();
        ArrayList arrayList = this.f59070c;
        fr0.i iVar = (fr0.i) d0.o0(arrayList);
        ArrayList arrayList2 = this.e;
        if (iVar != null && iVar.h(x3, y2)) {
            arrayList2.add(null);
            this.f = (fr0.i) d0.m0(arrayList);
            return;
        }
        if (this.o) {
            return;
        }
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((fr0.i) arrayList.get(size)).h(x3, y2)) {
                    this.f = (fr0.i) arrayList.remove(size);
                    arrayList2.add(Integer.valueOf(size));
                    fr0.i iVar2 = this.f;
                    Intrinsics.h(iVar2);
                    arrayList.add(iVar2);
                    return;
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        this.f = null;
    }

    public boolean a() {
        if (this.f59082w || this.f == null) {
            return false;
        }
        Region region = new Region();
        Region region2 = new Region();
        Region region3 = new Region(0, 0, getWidth(), getHeight());
        fr0.i iVar = this.f;
        Intrinsics.h(iVar);
        region.setPath(iVar.g(), region3);
        region2.setPath(this.f59074l, region3);
        return region2.quickReject(region);
    }

    public final void b() {
        if (this.f59084y == null) {
            return;
        }
        setTextEditingEnabled(false);
        ArrayList arrayList = this.f59070c;
        fr0.i iVar = (fr0.i) d0.o0(arrayList);
        if (iVar != null && (iVar instanceof fr0.n)) {
            fr0.n nVar = (fr0.n) iVar;
            nVar.F = kotlin.text.d0.F0(nVar.F).toString();
            nVar.o();
            if (nVar.F.length() == 0) {
                arrayList.remove(zhm.v.j(arrayList));
                g();
            } else {
                nVar.z = false;
                if (Intrinsics.f(this.z, nVar.F) && this.f59079r) {
                    e();
                } else if (this.z.length() > 0) {
                    a0.I(iVar.f137346c);
                    String previousText = this.z;
                    Intrinsics.checkNotNullParameter(previousText, "previousText");
                    nVar.f137346c.add(new fr0.l(previousText));
                }
                m70.a.c(t0.f186434a);
                this.z = "";
            }
        }
        removeView(this.f59084y);
        this.f59084y = null;
    }

    public final void c(fr0.i sprite) {
        Intrinsics.checkNotNullParameter(sprite, "sprite");
        if (sprite instanceof fr0.d) {
            this.f59071g = false;
        }
        this.f59070c.remove(sprite);
        g();
        invalidate();
    }

    public final void d(String str) {
        this.z = str;
        AppCompatEditText appCompatEditText = new AppCompatEditText(getContext());
        this.f59084y = appCompatEditText;
        appCompatEditText.setBackgroundColor(0);
        appCompatEditText.setTextColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(1, -1);
        layoutParams.gravity = 16;
        appCompatEditText.setLayoutParams(layoutParams);
        appCompatEditText.setCursorVisible(false);
        appCompatEditText.setFocusable(true);
        appCompatEditText.setClickable(true);
        appCompatEditText.addTextChangedListener(new a2(this, 6));
        appCompatEditText.setFilters(new n5[]{new n5()});
        addView(this.f59084y);
        setDrawingEnabled(false);
        setTextEditingEnabled(true);
        AppCompatEditText appCompatEditText2 = this.f59084y;
        if (appCompatEditText2 != null) {
            appCompatEditText2.setText(str);
            appCompatEditText2.setSelection(str.length());
            appCompatEditText2.requestFocus();
        }
    }

    public void e() {
        ArrayList arrayList = this.e;
        Integer num = (Integer) d0.o0(arrayList);
        if (num == null || num.intValue() != -1) {
            f();
            return;
        }
        arrayList.remove(zhm.v.j(arrayList));
        Pair pair = (Pair) a0.I(this.d);
        if (pair != null) {
            fr0.i iVar = (fr0.i) pair.f186385a;
            Integer num2 = (Integer) pair.f186386b;
            iVar.n();
            ArrayList arrayList2 = this.f59070c;
            if (num2 != null) {
                arrayList2.add(num2.intValue(), iVar);
            } else {
                arrayList2.add(iVar);
            }
            invalidate();
        }
    }

    public final void f() {
        ArrayList arrayList = this.f59070c;
        fr0.i sprite = (fr0.i) d0.o0(arrayList);
        if (sprite != null) {
            sprite.n();
            Intrinsics.checkNotNullParameter(sprite, "sprite");
            if (sprite.m()) {
                c(sprite);
                return;
            }
            Integer num = (Integer) a0.I(this.e);
            if (num != null) {
                arrayList.remove(sprite);
                arrayList.add(num.intValue(), sprite);
            }
            invalidate();
        }
    }

    public final void g() {
        ArrayList arrayList = this.f59070c;
        int size = arrayList.size();
        if (size == 0) {
            this.f59071g = false;
            arrayList.clear();
            this.d.clear();
            this.e.clear();
        }
        this.f59068a.onNext(Integer.valueOf(size));
    }

    public final boolean getBringToTopReversible() {
        return this.f59078q;
    }

    public float getCenterX() {
        return getWidth() / 2.0f;
    }

    public float getCenterY() {
        return getHeight() / 2.0f;
    }

    public final int getCurrentColor() {
        return this.f59081t;
    }

    public final fr0.i getCurrentSprite() {
        return this.f;
    }

    public final boolean getDrawingEnabled() {
        return this.f59082w;
    }

    public final boolean getEditingEnabled() {
        return this.f59083x;
    }

    public final boolean getEraserModeEnabled() {
        return this.v;
    }

    public final m5 getFont() {
        fr0.i iVar = (fr0.i) d0.o0(this.f59070c);
        if (iVar == null || !(iVar instanceof fr0.n)) {
            return null;
        }
        return ((fr0.n) iVar).f137371y;
    }

    public final boolean getGlobalUndoAvailable() {
        return this.f59079r;
    }

    public final float getLastStartX() {
        return this.f59072h;
    }

    public final float getLastStartY() {
        return this.i;
    }

    public float getLineSize() {
        return this.u;
    }

    public final boolean getMultipleDrawingsEnabled() {
        return this.f59077p;
    }

    @NotNull
    public final List<Integer> getPreviousIndexes() {
        return this.e;
    }

    @NotNull
    public final List<Pair<fr0.i, Integer>> getRemovedSprites() {
        return this.d;
    }

    @NotNull
    public final List<fr0.i> getSprites() {
        return this.f59070c;
    }

    public final int getSpritesCount() {
        return this.f59070c.size();
    }

    public final boolean getTextEditingEnabled() {
        return this.o;
    }

    public final float getTextSize() {
        return this.f59080s;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f59070c;
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof fr0.d) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((fr0.d) it8.next()).d(canvas);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!(((fr0.i) obj3) instanceof fr0.d)) {
                arrayList3.add(obj3);
            }
        }
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            ((fr0.i) it9.next()).d(canvas);
        }
        if (this.o) {
            postInvalidateDelayed(500L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (z) {
            RectF rectF = this.f59075m;
            rectF.left = BitmapDescriptorFactory.HUE_RED;
            rectF.top = BitmapDescriptorFactory.HUE_RED;
            rectF.right = getWidth();
            rectF.bottom = getHeight();
            Path path = this.f59074l;
            path.reset();
            path.addRect(rectF, Path.Direction.CW);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i5) {
        float f = i / i3;
        Iterator it8 = this.f59070c.iterator();
        while (it8.hasNext()) {
            ((fr0.i) it8.next()).i(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.i.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBringToTopReversible(boolean z) {
        this.f59078q = z;
    }

    public final void setCurrentColor(int i) {
        this.f59081t = i;
        fr0.i iVar = (fr0.i) d0.o0(this.f59070c);
        if (iVar instanceof fr0.d) {
            fr0.d dVar = (fr0.d) iVar;
            float lineSize = getLineSize();
            int i2 = this.f59081t;
            dVar.f137330p = lineSize;
            dVar.f137332r = i2;
        }
    }

    public final void setCurrentSprite(fr0.i iVar) {
        this.f = iVar;
    }

    public final void setDrawingEnabled(boolean z) {
        fr0.i iVar;
        setEraserModeEnabled(false);
        boolean z3 = this.f59082w;
        ArrayList arrayList = this.f59070c;
        if (!z3 && z) {
            if (this.f59077p || (arrayList != null && arrayList.isEmpty())) {
                this.f59071g = false;
            } else {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    if (((fr0.i) it8.next()) instanceof fr0.d) {
                        break;
                    }
                }
                this.f59071g = false;
            }
        }
        if (!z && (iVar = (fr0.i) d0.o0(arrayList)) != null && iVar.m()) {
            c((fr0.i) d0.m0(arrayList));
        }
        this.f59082w = z;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof fr0.d) {
                arrayList2.add(obj2);
            }
        }
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            ((fr0.d) it9.next()).f137333s = this.f59082w;
        }
        invalidate();
    }

    public final void setEditingEnabled(boolean z) {
        this.f59083x = z;
        if (this.o) {
            b();
        }
        invalidate();
    }

    public final void setEraserModeEnabled(boolean z) {
        if (this.f59077p) {
            return;
        }
        this.v = z;
    }

    public final void setFont(@NotNull m5 font, boolean z) {
        Intrinsics.checkNotNullParameter(font, "font");
        fr0.i iVar = (fr0.i) d0.o0(this.f59070c);
        if (iVar == null || !(iVar instanceof fr0.n)) {
            return;
        }
        fr0.n nVar = (fr0.n) iVar;
        Intrinsics.checkNotNullParameter(font, "font");
        nVar.f137367s.setTypeface(font.f209834a);
        nVar.f137371y = font;
        nVar.o = z;
        nVar.o();
        invalidate();
    }

    public final void setGlobalUndoAvailable(boolean z) {
        this.f59079r = z;
    }

    public final void setLastStartX(float f) {
        this.f59072h = f;
    }

    public final void setLastStartY(float f) {
        this.i = f;
    }

    public void setLineSize(float f) {
        this.u = f;
        fr0.i iVar = (fr0.i) d0.o0(this.f59070c);
        if (iVar instanceof fr0.d) {
            fr0.d dVar = (fr0.d) iVar;
            float lineSize = getLineSize();
            int i = this.f59081t;
            dVar.f137330p = lineSize;
            dVar.f137332r = i;
        }
    }

    public final void setMultipleDrawingsEnabled(boolean z) {
        this.f59077p = z;
    }

    public final void setSingleTapEvent(boolean z) {
        this.f59073j = z;
    }

    public final void setTextEditingEnabled(boolean z) {
        this.o = z;
        invalidate();
    }

    public final void setTextSize(float f) {
        this.f59080s = f;
        fr0.i iVar = (fr0.i) d0.o0(this.f59070c);
        if (iVar == null || !(iVar instanceof fr0.n)) {
            return;
        }
        fr0.n nVar = (fr0.n) iVar;
        nVar.f137367s.setTextSize(f);
        nVar.o();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59068a = v0.a.d("create(...)");
        this.f59069b = v0.a.d("create(...)");
        this.f59070c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.k = kli.a.k(context, 1.0f);
        this.f59074l = new Path();
        this.f59075m = new RectF();
        this.f59077p = true;
        this.f59078q = true;
        this.f59079r = true;
        this.f59080s = kli.a.B(context, 32.0f);
        this.f59081t = -16777216;
        this.u = kli.a.k(context, 4.0f);
        m70.a.c(t0.f186434a);
        this.z = "";
        setLayerType(2, null);
        setClickable(true);
        setFocusable(true);
    }

    public /* synthetic */ i(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
