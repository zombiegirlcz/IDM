package es0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.R$styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.util.Pools$SimplePool;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public class b0 extends HorizontalScrollView implements View.OnLongClickListener {
    public static final int R = R.style.Widget_Design_TabLayout;
    public static final Pools$SynchronizedPool S = new Pools$SynchronizedPool(16);
    public final int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public t G;
    public final ArrayList H;
    public e0 I;
    public ValueAnimator J;
    public ViewPager K;
    public PagerAdapter L;
    public x M;
    public c0 N;
    public s O;
    public boolean P;
    public final Pools$SimplePool Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f128789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FrameLayout f128790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f128791c;
    public final ArrayList d;
    public a e;
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f128792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f128793h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f128794j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f128795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f128796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f128797n;
    public ColorStateList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f128798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PorterDuff.Mode f128799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f128800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f128801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f128802t;
    public int u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f128803w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f128804x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f128805y;
    public int z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f128806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Drawable f128807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f128808c;
        public CharSequence d;
        public View f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b0 f128809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public d0 f128810h;
        public int e = -1;
        public boolean i = false;

        public final boolean a() {
            b0 b0Var = this.f128809g;
            if (b0Var != null) {
                return b0Var.getSelectedTabPosition() == this.e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public final void b() {
            b0 b0Var = this.f128809g;
            if (b0Var == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            b0Var.r(this, true);
        }

        public final void c() {
            d0 d0Var = this.f128810h;
            if (d0Var != null) {
                d0Var.f();
            }
        }
    }

    public b0(@NonNull Context context) {
        this(context, null);
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) arrayList.get(i);
            if (aVar != null && aVar.f128807b != null && !TextUtils.isEmpty(aVar.f128808c)) {
                return !this.D ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.v;
        if (i != -1) {
            return i;
        }
        int i2 = this.C;
        if (i2 == 0 || i2 == 2) {
            return this.f128804x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f128792g.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static float h(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static ColorStateList j(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    private void setSelectedTabView(int i) {
        a0 a0Var = this.f128792g;
        int childCount = a0Var.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = a0Var.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public final void a(t tVar) {
        ArrayList arrayList = this.H;
        if (arrayList.contains(tVar)) {
            return;
        }
        arrayList.add(tVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    public final void b(a aVar, int i, boolean z) {
        if (aVar.f128809g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        aVar.e = i;
        ArrayList arrayList = this.d;
        arrayList.add(i, aVar);
        int size = arrayList.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ((a) arrayList.get(i2)).e = i2;
        }
        d0 d0Var = aVar.f128810h;
        d0Var.f128822j = aVar.i;
        d0Var.setSelected(false);
        d0Var.setActivated(false);
        int i3 = aVar.e;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.C == 1 && this.z == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
        }
        this.f128792g.addView(d0Var, i3, layoutParams);
        if (aVar.f128810h.f128822j) {
            d0Var.setOnTouchListener(new j01.e(new View[]{d0Var}));
        } else {
            d0Var.setOnTouchListener(null);
        }
        if (z) {
            aVar.b();
        }
    }

    public final void c(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        a aVarM = m(false, false);
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            if (TextUtils.isEmpty(aVarM.d) && !TextUtils.isEmpty(charSequence)) {
                aVarM.f128810h.setContentDescription(charSequence);
            }
            aVarM.f128808c = charSequence;
            aVarM.c();
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            aVarM.f128807b = drawable;
            b0 b0Var = aVarM.f128809g;
            if (b0Var.z == 1 || b0Var.C == 2) {
                b0Var.u(true);
            }
            aVarM.c();
            if (BadgeUtils.USE_COMPAT_PARENT) {
                d0 d0Var = aVarM.f128810h;
                int i = d0.f128816n;
                BadgeDrawable badgeDrawable = d0Var.e;
                if (badgeDrawable != null && badgeDrawable.isVisible()) {
                    aVarM.f128810h.invalidate();
                }
            }
        }
        int i2 = tabItem.customLayout;
        if (i2 != 0) {
            aVarM.f = LayoutInflater.from(aVarM.f128810h.getContext()).inflate(i2, (ViewGroup) aVarM.f128810h, false);
            aVarM.c();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            aVarM.d = tabItem.getContentDescription();
            aVarM.c();
        }
        ArrayList arrayList = this.d;
        b(aVarM, arrayList.size(), arrayList.isEmpty());
    }

    public final void d(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && ViewCompat.isLaidOut(this)) {
            a0 a0Var = this.f128792g;
            int childCount = a0Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (a0Var.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iG = g(i, BitmapDescriptorFactory.HUE_RED);
            if (scrollX != iG && l(a0Var.f128784h)) {
                i();
                this.J.setIntValues(scrollX, iG);
                this.J.start();
            }
            ValueAnimator valueAnimator = a0Var.i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                a0Var.i.cancel();
            }
            a0Var.c(true, i, this.A);
            return;
        }
        setScrollPosition(i, BitmapDescriptorFactory.HUE_RED, true);
    }

    public final void f() {
        int i = this.C;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.f128805y - this.f128793h) : 0;
        a0 a0Var = this.f128792g;
        ViewCompat.setPaddingRelative(a0Var, iMax, 0, 0, 0);
        int i2 = this.C;
        if (i2 == 0) {
            int i3 = this.z;
            if (i3 != 0) {
                if (i3 == 1) {
                    a0Var.setGravity(1);
                } else if (i3 == 2) {
                }
            }
            a0Var.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.z == 2) {
            }
            a0Var.setGravity(1);
        }
        u(true);
    }

    public final int g(int i, float f) {
        int i2 = this.C;
        if ((i2 != 0 && i2 != 2) || !this.f128791c) {
            return 0;
        }
        a0 a0Var = this.f128792g;
        View childAt = a0Var.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < a0Var.getChildCount() ? a0Var.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int paddingLeft = ((width / 2) + (getPaddingLeft() + (childAt != null ? childAt.getLeft() : 0))) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * f);
        return ViewCompat.getLayoutDirection(this) == 0 ? paddingLeft + i5 : paddingLeft - i5;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.e;
        }
        return -1;
    }

    public int getTabCount() {
        return this.d.size();
    }

    public int getTabGravity() {
        return this.z;
    }

    public ColorStateList getTabIconTint() {
        return this.f128797n;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    public int getTabMaxWidth() {
        return this.u;
    }

    public int getTabMode() {
        return this.C;
    }

    public ColorStateList getTabRippleColor() {
        return this.o;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f128798p;
    }

    public ColorStateList getTabTextColors() {
        return this.f128796m;
    }

    public final void i() {
        if (this.J == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.J = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.J.setDuration(this.A);
            this.J.addUpdateListener(new dki.w(this, 1));
        }
    }

    public final a k(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (a) this.d.get(i);
    }

    public boolean l(int i) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a m(boolean z, boolean z3) {
        a aVar = (a) S.acquire();
        if (aVar == null) {
            aVar = new a();
        }
        aVar.i = z;
        aVar.f128809g = this;
        Pools$SimplePool pools$SimplePool = this.Q;
        d0 d0Var = pools$SimplePool != null ? (d0) pools$SimplePool.acquire() : null;
        if (d0Var == null) {
            d0Var = new d0(this, getContext(), aVar.i);
        }
        d0Var.setTab(aVar);
        d0Var.setFocusable(true);
        d0Var.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(aVar.d)) {
            d0Var.setContentDescription(aVar.f128808c);
        } else {
            d0Var.setContentDescription(aVar.d);
        }
        d0Var.setOnLongClickListener(this);
        aVar.f128810h = d0Var;
        d0Var.setFakeTab(z);
        aVar.f128810h.setLongClickEnabled(z3);
        return aVar;
    }

    public final void n() {
        int currentItem;
        o();
        PagerAdapter pagerAdapter = this.L;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                a aVarM = m(false, false);
                CharSequence pageTitle = this.L.getPageTitle(i);
                if (TextUtils.isEmpty(aVarM.d) && !TextUtils.isEmpty(pageTitle)) {
                    aVarM.f128810h.setContentDescription(pageTitle);
                }
                aVarM.f128808c = pageTitle;
                aVarM.c();
                b(aVarM, this.d.size(), false);
            }
            ViewPager viewPager = this.K;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            r(k(currentItem), true);
        }
    }

    public final void o() {
        for (int childCount = this.f128792g.getChildCount() - 1; childCount >= 0; childCount--) {
            q(childCount);
        }
        Iterator it8 = this.d.iterator();
        while (it8.hasNext()) {
            a aVar = (a) it8.next();
            it8.remove();
            aVar.f128809g = null;
            aVar.f128810h = null;
            aVar.f128806a = null;
            aVar.f128807b = null;
            aVar.f128808c = null;
            aVar.d = null;
            aVar.e = -1;
            aVar.f = null;
            S.release(aVar);
        }
        this.e = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.K == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                t((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P) {
            setupWithViewPager(null);
            this.P = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        d0 d0Var;
        Drawable drawable;
        int i = 0;
        while (true) {
            a0 a0Var = this.f128792g;
            if (i >= a0Var.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = a0Var.getChildAt(i);
            if ((childAt instanceof d0) && (drawable = (d0Var = (d0) childAt).i) != null) {
                drawable.setBounds(d0Var.getLeft(), d0Var.getTop(), d0Var.getRight(), d0Var.getBottom());
                d0Var.i.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = h(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f128803w
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = h(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.u = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.C
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: es0.b0.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z3) {
        if (l(this.f128792g.f128784h)) {
            super.onOverScrolled(i, i2, z, z3);
        }
    }

    public final void p(int i) {
        a aVar = this.e;
        int i2 = aVar != null ? aVar.e : 0;
        q(i);
        ArrayList arrayList = this.d;
        a aVar2 = (a) arrayList.remove(i);
        if (aVar2 != null) {
            aVar2.f128809g = null;
            aVar2.f128810h = null;
            aVar2.f128806a = null;
            aVar2.f128807b = null;
            aVar2.f128808c = null;
            aVar2.d = null;
            aVar2.e = -1;
            aVar2.f = null;
            S.release(aVar2);
        }
        int size = arrayList.size();
        for (int i3 = i; i3 < size; i3++) {
            ((a) arrayList.get(i3)).e = i3;
        }
        if (i2 == i) {
            r(arrayList.isEmpty() ? null : (a) arrayList.get(Math.max(0, i - 1)), true);
        }
    }

    public final void q(int i) {
        a0 a0Var = this.f128792g;
        d0 d0Var = (d0) a0Var.getChildAt(i);
        a0Var.removeViewAt(i);
        if (d0Var != null) {
            d0Var.setTab(null);
            d0Var.setSelected(false);
            this.Q.release(d0Var);
        }
        requestLayout();
    }

    public final void r(a aVar, boolean z) {
        a aVar2 = this.e;
        ArrayList arrayList = this.H;
        if (aVar2 == aVar) {
            if (aVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((t) arrayList.get(size)).d(aVar);
                }
                d(aVar.e);
                return;
            }
            return;
        }
        int i = aVar != null ? aVar.e : -1;
        if (z) {
            if ((aVar2 == null || aVar2.e == -1) && i != -1) {
                setScrollPosition(i, BitmapDescriptorFactory.HUE_RED, true);
            } else {
                d(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.e = aVar;
        if (aVar2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((t) arrayList.get(size2)).f(aVar2);
            }
        }
        if (aVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((t) arrayList.get(size3)).a(aVar);
            }
        }
    }

    public final void s(PagerAdapter pagerAdapter, boolean z) {
        x xVar;
        PagerAdapter pagerAdapter2 = this.L;
        if (pagerAdapter2 != null && (xVar = this.M) != null) {
            pagerAdapter2.unregisterDataSetObserver(xVar);
        }
        this.L = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.M == null) {
                this.M = new x(this, 0);
            }
            pagerAdapter.registerDataSetObserver(this.M);
        }
        n();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.D == z) {
            return;
        }
        this.D = z;
        int i = 0;
        while (true) {
            a0 a0Var = this.f128792g;
            if (i >= a0Var.getChildCount()) {
                f();
                return;
            }
            View childAt = a0Var.getChildAt(i);
            if (childAt instanceof d0) {
                d0 d0Var = (d0) childAt;
                d0Var.setOrientation(!d0Var.f128824m.D ? 1 : 0);
                TextView textView = d0Var.f128820g;
                if (textView == null && d0Var.f128821h == null) {
                    d0Var.h(d0Var.f128818b, d0Var.f128819c);
                } else {
                    d0Var.h(textView, d0Var.f128821h);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(w wVar) {
        setOnTabSelectedListener((t) wVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        i();
        this.J.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f128798p != drawable) {
            this.f128798p = drawable;
            ViewCompat.postInvalidateOnAnimation(this.f128792g);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        a0 a0Var = this.f128792g;
        Paint paint = a0Var.f128781b;
        if (paint.getColor() != i) {
            paint.setColor(i);
            ViewCompat.postInvalidateOnAnimation(a0Var);
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.B != i) {
            this.B = i;
            ViewCompat.postInvalidateOnAnimation(this.f128792g);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        a0 a0Var = this.f128792g;
        if (a0Var.f128780a != i) {
            a0Var.f128780a = i;
            ViewCompat.postInvalidateOnAnimation(a0Var);
        }
    }

    public void setTabGravity(int i) {
        if (this.z != i) {
            this.z = i;
            f();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f128797n != colorStateList) {
            this.f128797n = colorStateList;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((a) arrayList.get(i)).c();
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.E = z;
        ViewCompat.postInvalidateOnAnimation(this.f128792g);
    }

    public void setTabMode(int i) {
        if (i != this.C) {
            this.C = i;
            f();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.o == colorStateList) {
            return;
        }
        this.o = colorStateList;
        int i = 0;
        while (true) {
            a0 a0Var = this.f128792g;
            if (i >= a0Var.getChildCount()) {
                return;
            }
            View childAt = a0Var.getChildAt(i);
            if (childAt instanceof d0) {
                Context context = getContext();
                int i2 = d0.f128816n;
                ((d0) childAt).g(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f128796m != colorStateList) {
            this.f128796m = colorStateList;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((a) arrayList.get(i)).c();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        s(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.F == z) {
            return;
        }
        this.F = z;
        int i = 0;
        while (true) {
            a0 a0Var = this.f128792g;
            if (i >= a0Var.getChildCount()) {
                return;
            }
            View childAt = a0Var.getChildAt(i);
            if (childAt instanceof d0) {
                Context context = getContext();
                int i2 = d0.f128816n;
                ((d0) childAt).g(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void t(ViewPager viewPager, boolean z, boolean z3) {
        ViewPager viewPager2 = this.K;
        if (viewPager2 != null) {
            c0 c0Var = this.N;
            if (c0Var != null) {
                viewPager2.removeOnPageChangeListener(c0Var);
            }
            s sVar = this.O;
            if (sVar != null) {
                this.K.removeOnAdapterChangeListener(sVar);
            }
        }
        e0 e0Var = this.I;
        if (e0Var != null) {
            this.H.remove(e0Var);
            this.I = null;
        }
        if (viewPager != null) {
            this.K = viewPager;
            if (this.N == null) {
                this.N = new c0(this);
            }
            c0 c0Var2 = this.N;
            c0Var2.f128815c = 0;
            c0Var2.f128814b = 0;
            viewPager.addOnPageChangeListener(c0Var2);
            e0 e0Var2 = new e0(viewPager);
            this.I = e0Var2;
            a(e0Var2);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                s(adapter, z);
            }
            if (this.O == null) {
                this.O = new s(this);
            }
            s sVar2 = this.O;
            sVar2.f128846a = z;
            viewPager.addOnAdapterChangeListener(sVar2);
            setScrollPosition(viewPager.getCurrentItem(), BitmapDescriptorFactory.HUE_RED, true);
        } else {
            this.K = null;
            s(null, false);
        }
        this.P = z3;
    }

    public final void u(boolean z) {
        int i = 0;
        while (true) {
            a0 a0Var = this.f128792g;
            if (i >= a0Var.getChildCount()) {
                return;
            }
            View childAt = a0Var.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.C == 1 && this.z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    public b0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(t tVar) {
        t tVar2 = this.G;
        if (tVar2 != null) {
            this.H.remove(tVar2);
        }
        this.G = tVar;
        if (tVar != null) {
            a(tVar);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z3) {
        int iRound = Math.round(i + f);
        if (iRound >= 0) {
            a0 a0Var = this.f128792g;
            if (iRound >= a0Var.getChildCount()) {
                return;
            }
            if (z3) {
                ValueAnimator valueAnimator = a0Var.i;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    a0Var.i.cancel();
                }
                a0Var.d = i;
                a0Var.e = f;
                a0Var.b();
            }
            ValueAnimator valueAnimator2 = this.J;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.J.cancel();
            }
            if (l(a0Var.f128784h)) {
                scrollTo(g(i, f), 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        t(viewPager, z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b0(@NonNull Context context, AttributeSet attributeSet, int i) {
        PorterDuff.Mode mode;
        int resourceId;
        Drawable drawable;
        int i2 = R;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.f128791c = true;
        this.d = new ArrayList();
        this.f = new RectF();
        this.u = Integer.MAX_VALUE;
        this.H = new ArrayList();
        this.Q = new Pools$SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        a0 a0Var = new a0(this, context2);
        this.f128792g = a0Var;
        super.addView(a0Var, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.TabLayout, i, i2, R.styleable.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(colorDrawable.getColor()));
            materialShapeDrawable.initializeElevationOverlay(context2);
            materialShapeDrawable.setElevation(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, -1);
        if (a0Var.f128780a != dimensionPixelSize) {
            a0Var.f128780a = dimensionPixelSize;
            ViewCompat.postInvalidateOnAnimation(a0Var);
        }
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.TabLayout_tabIndicatorColor, 0);
        Paint paint = a0Var.f128781b;
        if (paint.getColor() != color) {
            paint.setColor(color);
            ViewCompat.postInvalidateOnAnimation(a0Var);
        }
        int i3 = R.styleable.TabLayout_tabIndicator;
        setSelectedTabIndicator((!typedArrayObtainStyledAttributes.hasValue(i3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i3, 0)) == 0 || (drawable = AppCompatResources.getDrawable(context2, resourceId)) == null) ? typedArrayObtainStyledAttributes.getDrawable(i3) : drawable);
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.k = dimensionPixelSize2;
        this.f128794j = dimensionPixelSize2;
        this.i = dimensionPixelSize2;
        this.f128793h = dimensionPixelSize2;
        this.f128793h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, dimensionPixelSize2);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, dimensionPixelSize2);
        this.f128794j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, dimensionPixelSize2);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, dimensionPixelSize2);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabTextAppearance, R.style.TextAppearance_Design_Tab);
        this.f128795l = resourceId2;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId2, R$styleable.TextAppearance);
        try {
            this.f128800r = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
            this.f128796m = j(context2, typedArrayObtainStyledAttributes2, R$styleable.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TabLayout_tabTextColor)) {
                this.f128796m = j(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabTextColor);
            }
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TabLayout_tabSelectedTextColor)) {
                this.f128796m = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayObtainStyledAttributes.getColor(R.styleable.TabLayout_tabSelectedTextColor, 0), this.f128796m.getDefaultColor()});
            }
            this.f128797n = j(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabIconTint);
            int i5 = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIconTintMode, -1);
            if (i5 == 3) {
                mode = PorterDuff.Mode.SRC_OVER;
            } else if (i5 == 5) {
                mode = PorterDuff.Mode.SRC_IN;
            } else if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                    default:
                        mode = null;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
            this.f128799q = mode;
            this.o = j(context2, typedArrayObtainStyledAttributes, R.styleable.TabLayout_tabRippleColor);
            this.A = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
            this.f128803w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
            this.f128802t = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabBackground, 0);
            this.f128805y = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
            this.C = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabMode, 1);
            this.z = typedArrayObtainStyledAttributes.getInt(R.styleable.TabLayout_tabGravity, 0);
            this.D = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabInlineLabel, false);
            this.F = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TabLayout_tabUnboundedRipple, false);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f128801s = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f128804x = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            f();
        } catch (Throwable th10) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th10;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i}));
    }
}
