package com.rd;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.text.TextUtilsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.rd.draw.data.PositionSavedState;
import es0.x;
import gc0.c;
import mp.p;
import r10.q;
import sgm.j1;
import tnb.g0;
import uc.d;
import ul.a;
import zl.b;

/* JADX INFO: loaded from: classes17.dex */
public class PageIndicatorView extends View implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener, View.OnTouchListener {
    public static final Handler f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f50256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f50257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewPager f50258c;
    public boolean d;
    public final j1 e;

    public PageIndicatorView(Context context) {
        super(context);
        this.e = new j1(this, 7);
        b(null);
    }

    public final void a(ViewParent viewParent) {
        View viewFindViewById;
        if (viewParent == null || !(viewParent instanceof ViewGroup) || ((ViewGroup) viewParent).getChildCount() <= 0) {
            return;
        }
        int i = ((p) this.f50256a.f278952a).m().u;
        ViewGroup viewGroup = (ViewGroup) viewParent;
        ViewPager viewPager = null;
        if (viewGroup.getChildCount() > 0 && (viewFindViewById = viewGroup.findViewById(i)) != null && (viewFindViewById instanceof ViewPager)) {
            viewPager = (ViewPager) viewFindViewById;
        }
        if (viewPager != null) {
            setViewPager(viewPager);
        } else {
            a(viewParent.getParent());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01e3 A[PHI: r6
      0x01e3: PHI (r6v13 float) = (r6v5 float), (r6v6 float) binds: [B:49:0x01e1, B:52:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.util.AttributeSet r14) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView.b(android.util.AttributeSet):void");
    }

    public final boolean c() {
        int[] iArr = a.f280844a;
        cm.a aVarM = ((p) this.f50256a.f278952a).m();
        if (aVarM.f25102x == null) {
            aVarM.f25102x = cm.d.Off;
        }
        int i = iArr[aVarM.f25102x.ordinal()];
        if (i != 1) {
            return i == 3 && TextUtilsCompat.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) == 1;
        }
        return true;
    }

    public final void d() {
        ViewPager viewPager;
        if (this.f50257b != null || (viewPager = this.f50258c) == null || viewPager.getAdapter() == null) {
            return;
        }
        this.f50257b = new x(this, 1);
        try {
            this.f50258c.getAdapter().registerDataSetObserver(this.f50257b);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public final void e() {
        Handler handler = f;
        j1 j1Var = this.e;
        handler.removeCallbacks(j1Var);
        handler.postDelayed(j1Var, ((p) this.f50256a.f278952a).m().o);
    }

    public final void f() {
        f.removeCallbacks(this.e);
        animate().cancel();
        animate().alpha(1.0f).setDuration(250L);
    }

    public final void g() {
        ViewPager viewPager;
        if (this.f50257b == null || (viewPager = this.f50258c) == null || viewPager.getAdapter() == null) {
            return;
        }
        try {
            this.f50258c.getAdapter().unregisterDataSetObserver(this.f50257b);
            this.f50257b = null;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public long getAnimationDuration() {
        return ((p) this.f50256a.f278952a).m().f25096p;
    }

    public int getCount() {
        return ((p) this.f50256a.f278952a).m().f25097q;
    }

    public int getPadding() {
        return ((p) this.f50256a.f278952a).m().f25088b;
    }

    public int getRadius() {
        return ((p) this.f50256a.f278952a).m().f25087a;
    }

    public float getScaleFactor() {
        return ((p) this.f50256a.f278952a).m().f25091h;
    }

    public int getSelectedColor() {
        return ((p) this.f50256a.f278952a).m().f25092j;
    }

    public int getSelection() {
        return ((p) this.f50256a.f278952a).m().f25098r;
    }

    public int getStrokeWidth() {
        return ((p) this.f50256a.f278952a).m().f25090g;
    }

    public int getUnselectedColor() {
        return ((p) this.f50256a.f278952a).m().i;
    }

    public final void h() {
        b bVar;
        Animator animator;
        ViewPager viewPager = this.f50258c;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        int count = this.f50258c.getAdapter().getCount();
        int currentItem = c() ? (count - 1) - this.f50258c.getCurrentItem() : this.f50258c.getCurrentItem();
        ((p) this.f50256a.f278952a).m().f25098r = currentItem;
        ((p) this.f50256a.f278952a).m().f25099s = currentItem;
        ((p) this.f50256a.f278952a).m().f25100t = currentItem;
        ((p) this.f50256a.f278952a).m().f25097q = count;
        wl.b bVar2 = (wl.b) ((g0) this.f50256a.f278953b).f272384b;
        if (bVar2 != null && (bVar = bVar2.f298339c) != null && (animator = bVar.f323137c) != null && animator.isStarted()) {
            bVar.f323137c.end();
        }
        i();
        requestLayout();
    }

    public final void i() {
        if (((p) this.f50256a.f278952a).m().f25093l) {
            int i = ((p) this.f50256a.f278952a).m().f25097q;
            int visibility = getVisibility();
            if (visibility != 0 && i > 1) {
                setVisibility(0);
            } else {
                if (visibility == 4 || i > 1) {
                    return;
                }
                setVisibility(4);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        x xVar;
        if (((p) this.f50256a.f278952a).m().f25094m) {
            if (pagerAdapter != null && (xVar = this.f50257b) != null) {
                pagerAdapter.unregisterDataSetObserver(xVar);
                this.f50257b = null;
            }
            d();
        }
        h();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(getParent());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        g();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i5;
        p pVar = (p) this.f50256a.f278952a;
        by5.a aVar = (by5.a) pVar.d;
        cm.a aVar2 = (cm.a) pVar.f207709b;
        aVar.getClass();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i6 = aVar2.f25097q;
        int i21 = aVar2.f25087a;
        int i22 = aVar2.f25090g;
        int i32 = aVar2.f25088b;
        int i33 = aVar2.f25089c;
        int i43 = aVar2.d;
        int i59 = aVar2.e;
        int i66 = aVar2.f;
        int i74 = i21 * 2;
        cm.b bVarB = aVar2.b();
        if (i6 != 0) {
            i5 = (i74 * i6) + (i22 * 2 * i6) + ((i6 - 1) * i32);
            i3 = i74 + i22;
            if (bVarB != cm.b.HORIZONTAL) {
                i5 = i3;
                i3 = i5;
            }
        } else {
            i3 = 0;
            i5 = 0;
        }
        if (aVar2.a() == zl.a.DROP) {
            if (bVarB == cm.b.HORIZONTAL) {
                i3 *= 2;
            } else {
                i5 *= 2;
            }
        }
        cm.b bVar = cm.b.HORIZONTAL;
        int i92 = i5 + i33 + i59;
        int i96 = i3 + i43 + i66;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i92, size) : i92;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i96, size2) : i96;
        }
        if (size < 0) {
            size = 0;
        }
        Pair pair = new Pair(Integer.valueOf(size), Integer.valueOf(size2 >= 0 ? size2 : 0));
        setMeasuredDimension(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            ((p) this.f50256a.f278952a).m().k = this.d;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f4, int i2) {
        cm.a aVarM = ((p) this.f50256a.f278952a).m();
        zl.a aVarA = aVarM.a();
        boolean z = aVarM.k;
        if ((getMeasuredHeight() == 0 && getMeasuredWidth() == 0) || !z || aVarA == zl.a.NONE) {
            return;
        }
        boolean zC = c();
        int i3 = aVarM.f25097q;
        int i5 = aVarM.f25098r;
        if (zC) {
            i = (i3 - 1) - i;
        }
        boolean z3 = false;
        if (i < 0) {
            i = 0;
        } else {
            int i6 = i3 - 1;
            if (i > i6) {
                i = i6;
            }
        }
        boolean z4 = i > i5;
        if (!zC ? i + 1 < i5 : i - 1 < i5) {
            z3 = true;
        }
        if (z4 || z3) {
            aVarM.f25098r = i;
            i5 = i;
        }
        if (i5 != i || f4 == BitmapDescriptorFactory.HUE_RED) {
            f4 = 1.0f - f4;
        } else {
            i = zC ? i - 1 : i + 1;
        }
        Pair pair = new Pair(Integer.valueOf(i), Float.valueOf(f4 <= 1.0f ? f4 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f4 : 1.0f));
        setProgress(((Integer) pair.first).intValue(), ((Float) pair.second).floatValue());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        cm.a aVarM = ((p) this.f50256a.f278952a).m();
        boolean z = (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
        int i2 = aVarM.f25097q;
        if (z) {
            if (c()) {
                i = (i2 - 1) - i;
            }
            setSelection(i);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof PositionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        cm.a aVarM = ((p) this.f50256a.f278952a).m();
        PositionSavedState positionSavedState = (PositionSavedState) parcelable;
        aVarM.f25098r = positionSavedState.f50259a;
        aVarM.f25099s = positionSavedState.f50260b;
        aVarM.f25100t = positionSavedState.f50261c;
        super.onRestoreInstanceState(positionSavedState.getSuperState());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        cm.a aVarM = ((p) this.f50256a.f278952a).m();
        PositionSavedState positionSavedState = new PositionSavedState(super.onSaveInstanceState());
        positionSavedState.f50259a = aVarM.f25098r;
        positionSavedState.f50260b = aVarM.f25099s;
        positionSavedState.f50261c = aVarM.f25100t;
        return positionSavedState;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!((p) this.f50256a.f278952a).m().f25095n) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            f();
        } else if (action == 1) {
            e();
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ((q) ((p) this.f50256a.f278952a).f207710c).getClass();
        if (motionEvent != null && motionEvent.getAction() == 1) {
            motionEvent.getX();
            motionEvent.getY();
        }
        return true;
    }

    public void setAnimationDuration(long j2) {
        ((p) this.f50256a.f278952a).m().f25096p = j2;
    }

    public void setAnimationType(zl.a aVar) {
        this.f50256a.m(null);
        if (aVar != null) {
            ((p) this.f50256a.f278952a).m().f25101w = aVar;
        } else {
            ((p) this.f50256a.f278952a).m().f25101w = zl.a.NONE;
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        ((p) this.f50256a.f278952a).m().f25093l = z;
        i();
    }

    public void setClickListener(bm.b bVar) {
        ((q) ((p) this.f50256a.f278952a).f207710c).getClass();
    }

    public void setCount(int i) {
        if (i < 0 || ((p) this.f50256a.f278952a).m().f25097q == i) {
            return;
        }
        ((p) this.f50256a.f278952a).m().f25097q = i;
        i();
        requestLayout();
    }

    public void setDynamicCount(boolean z) {
        ((p) this.f50256a.f278952a).m().f25094m = z;
        if (z) {
            d();
        } else {
            g();
        }
    }

    public void setFadeOnIdle(boolean z) {
        ((p) this.f50256a.f278952a).m().f25095n = z;
        if (z) {
            e();
        } else {
            f();
        }
    }

    public void setIdleDuration(long j2) {
        ((p) this.f50256a.f278952a).m().o = j2;
        if (((p) this.f50256a.f278952a).m().f25095n) {
            e();
        } else {
            f();
        }
    }

    public void setInteractiveAnimation(boolean z) {
        ((p) this.f50256a.f278952a).m().k = z;
        this.d = z;
    }

    public void setOrientation(cm.b bVar) {
        if (bVar != null) {
            ((p) this.f50256a.f278952a).m().v = bVar;
            requestLayout();
        }
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        ((p) this.f50256a.f278952a).m().f25088b = c.h(i);
        invalidate();
    }

    public void setProgress(int i, float f4) {
        cm.a aVarM = ((p) this.f50256a.f278952a).m();
        if (aVarM.k) {
            int i2 = aVarM.f25097q;
            if (i2 <= 0 || i < 0) {
                i = 0;
            } else {
                int i3 = i2 - 1;
                if (i > i3) {
                    i = i3;
                }
            }
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                f4 = 0.0f;
            } else if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            if (f4 == 1.0f) {
                aVarM.f25100t = aVarM.f25098r;
                aVarM.f25098r = i;
            }
            aVarM.f25099s = i;
            wl.b bVar = (wl.b) ((g0) this.f50256a.f278953b).f272384b;
            if (bVar != null) {
                bVar.f = true;
                bVar.e = f4;
                bVar.a();
            }
        }
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        ((p) this.f50256a.f278952a).m().f25087a = c.h(i);
        invalidate();
    }

    public void setRtlMode(cm.d dVar) {
        cm.a aVarM = ((p) this.f50256a.f278952a).m();
        if (dVar == null) {
            aVarM.f25102x = cm.d.Off;
        } else {
            aVarM.f25102x = dVar;
        }
        if (this.f50258c == null) {
            return;
        }
        int currentItem = aVarM.f25098r;
        if (c()) {
            currentItem = (aVarM.f25097q - 1) - currentItem;
        } else {
            ViewPager viewPager = this.f50258c;
            if (viewPager != null) {
                currentItem = viewPager.getCurrentItem();
            }
        }
        aVarM.f25100t = currentItem;
        aVarM.f25099s = currentItem;
        aVarM.f25098r = currentItem;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v6 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setScaleFactor(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto L10
        L8:
            r0 = 1050253722(0x3e99999a, float:0.3)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L10
            goto L6
        L10:
            uc.d r0 = r2.f50256a
            java.lang.Object r0 = r0.f278952a
            mp.p r0 = (mp.p) r0
            cm.a r0 = r0.m()
            r0.f25091h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView.setScaleFactor(float):void");
    }

    public void setSelected(int i) {
        cm.a aVarM = ((p) this.f50256a.f278952a).m();
        zl.a aVarA = aVarM.a();
        aVarM.f25101w = zl.a.NONE;
        setSelection(i);
        aVarM.f25101w = aVarA;
    }

    public void setSelectedColor(int i) {
        ((p) this.f50256a.f278952a).m().f25092j = i;
        invalidate();
    }

    public void setSelection(int i) {
        Animator animator;
        cm.a aVarM = ((p) this.f50256a.f278952a).m();
        int i2 = ((p) this.f50256a.f278952a).m().f25097q - 1;
        if (i < 0) {
            i = 0;
        } else if (i > i2) {
            i = i2;
        }
        int i3 = aVarM.f25098r;
        if (i == i3 || i == aVarM.f25099s) {
            return;
        }
        aVarM.k = false;
        aVarM.f25100t = i3;
        aVarM.f25099s = i;
        aVarM.f25098r = i;
        wl.b bVar = (wl.b) ((g0) this.f50256a.f278953b).f272384b;
        if (bVar != null) {
            b bVar2 = bVar.f298339c;
            if (bVar2 != null && (animator = bVar2.f323137c) != null && animator.isStarted()) {
                bVar2.f323137c.end();
            }
            bVar.f = false;
            bVar.e = BitmapDescriptorFactory.HUE_RED;
            bVar.a();
        }
    }

    public void setStrokeWidth(float f4) {
        int i = ((p) this.f50256a.f278952a).m().f25087a;
        if (f4 < BitmapDescriptorFactory.HUE_RED) {
            f4 = 0.0f;
        } else {
            float f5 = i;
            if (f4 > f5) {
                f4 = f5;
            }
        }
        ((p) this.f50256a.f278952a).m().f25090g = (int) f4;
        invalidate();
    }

    public void setUnselectedColor(int i) {
        ((p) this.f50256a.f278952a).m().i = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f50258c;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this);
            this.f50258c.removeOnAdapterChangeListener(this);
            this.f50258c = null;
        }
        if (viewPager == null) {
            return;
        }
        this.f50258c = viewPager;
        viewPager.addOnPageChangeListener(this);
        this.f50258c.addOnAdapterChangeListener(this);
        this.f50258c.setOnTouchListener(this);
        ((p) this.f50256a.f278952a).m().u = this.f50258c.getId();
        setDynamicCount(((p) this.f50256a.f278952a).m().f25094m);
        h();
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new j1(this, 7);
        b(attributeSet);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new j1(this, 7);
        b(attributeSet);
    }

    public void setPadding(float f4) {
        if (f4 < BitmapDescriptorFactory.HUE_RED) {
            f4 = 0.0f;
        }
        ((p) this.f50256a.f278952a).m().f25088b = (int) f4;
        invalidate();
    }

    public void setRadius(float f4) {
        if (f4 < BitmapDescriptorFactory.HUE_RED) {
            f4 = 0.0f;
        }
        ((p) this.f50256a.f278952a).m().f25087a = (int) f4;
        invalidate();
    }

    public void setStrokeWidth(int i) {
        int iH = c.h(i);
        int i2 = ((p) this.f50256a.f278952a).m().f25087a;
        if (iH < 0) {
            iH = 0;
        } else if (iH > i2) {
            iH = i2;
        }
        ((p) this.f50256a.f278952a).m().f25090g = iH;
        invalidate();
    }
}
