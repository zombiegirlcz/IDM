package com.revolut.uicomponent.slidingbottomsheet;

import a0.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.ParcelableCompat;
import androidx.core.os.ParcelableCompatCreatorCallbacks;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.revolut.uicomponent.R$dimen;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import zyl.e;
import zyl.f;

/* JADX INFO: loaded from: classes12.dex */
public class MiddleStateBottomSheetBehavior extends CoordinatorLayout.Behavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f107239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f107240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107241c;
    public boolean d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f107242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f107243h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f107244j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f107245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f107246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewDragHelper f107247n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f107248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f107249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference f107250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WeakReference f107251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f107252t;
    public VelocityTracker u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f107253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f107254x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f107255y;
    public final e z;

    public static abstract class a implements f {
        @Override // zyl.f
        public void a(View view, int i, int i2) {
        }

        @Override // zyl.f
        public void b(int i) {
        }

        @Override // zyl.f
        public void onSlide(View view, float f) {
        }
    }

    public MiddleStateBottomSheetBehavior() {
        this.f = 500;
        this.f107242g = true;
        this.k = true;
        this.f107246m = 4;
        this.f107252t = new ArrayList(2);
        this.z = new e(this);
    }

    public static View b(View view) {
        if (view instanceof NestedScrollingChild) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewB = b(viewGroup.getChildAt(i));
            if (viewB != null) {
                return viewB;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (((r10 * 0.2f) + r8) < r9) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r8, float r9, float r10, int[] r11) {
        /*
            r7 = this;
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 3
            float r3 = r7.f107239a
            r4 = 6
            if (r1 >= 0) goto L45
            float r5 = java.lang.Math.abs(r10)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L45
            float r5 = java.lang.Math.abs(r10)
            float r6 = java.lang.Math.abs(r9)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L45
            boolean r9 = r7.k
            if (r9 == 0) goto L40
            int r9 = r7.f107243h
            int r0 = r7.f
            if (r9 < r0) goto L28
            goto L3c
        L28:
            int r8 = r8.getTop()
            int r9 = r7.f
            if (r8 >= r9) goto L31
            goto L3c
        L31:
            float r8 = (float) r8
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r10 = r10 * r0
            float r10 = r10 + r8
            float r8 = (float) r9
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 >= 0) goto L40
        L3c:
            int r8 = r7.f107243h
            goto Lbf
        L40:
            int r8 = r7.f
        L42:
            r2 = r4
            goto Lbf
        L45:
            boolean r5 = r7.f107244j
            if (r5 == 0) goto L5f
            if (r1 >= 0) goto L4c
            goto L5f
        L4c:
            r8.getTop()
            int r5 = r8.getTop()
            int r6 = r7.f
            if (r5 <= r6) goto L5f
            boolean r5 = r7.f107245l
            if (r5 == 0) goto L5f
            int r8 = r7.f107249q
            r2 = 5
            goto Lbf
        L5f:
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r5 = 4
            if (r0 <= 0) goto L91
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L91
            float r10 = java.lang.Math.abs(r10)
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 <= 0) goto L91
            if (r1 < 0) goto L8e
            boolean r9 = r7.f107245l
            if (r9 == 0) goto L7f
            goto L8e
        L7f:
            r8.getTop()
            int r8 = r8.getTop()
            int r9 = r7.f
            if (r8 <= r9) goto L8e
            int r8 = r7.i
        L8c:
            r2 = r5
            goto Lbf
        L8e:
            int r8 = r7.f
            goto L42
        L91:
            int r8 = r8.getTop()
            int r9 = r7.f107243h
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            int r10 = r7.i
            int r10 = r8 - r10
            int r10 = java.lang.Math.abs(r10)
            int r0 = r7.f
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            int r0 = r7.f
            int r1 = r7.f107243h
            if (r0 <= r1) goto Lb8
            if (r8 >= r9) goto Lb8
            if (r8 >= r10) goto Lb8
            r8 = r0
            goto L42
        Lb8:
            if (r9 >= r10) goto Lbc
            r8 = r1
            goto Lbf
        Lbc:
            int r8 = r7.i
            goto L8c
        Lbf:
            r9 = 0
            r11[r9] = r8
            r8 = 1
            r11[r8] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.uicomponent.slidingbottomsheet.MiddleStateBottomSheetBehavior.a(android.view.View, float, float, int[]):void");
    }

    public final void c(int i) {
        WeakReference weakReference = this.f107250r;
        if ((weakReference != null ? (View) weakReference.get() : null) == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f107252t;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((f) arrayList.get(i2)).b(i);
            i2++;
        }
    }

    public final void d(int i) {
        if (this.f != i) {
            this.f = i;
            if (this.f107246m == 6) {
                setStateInternal(2);
                setState(6);
            }
        }
    }

    public final void dispatchOnSlide(int i) {
        float f;
        float f4;
        View view = (View) this.f107250r.get();
        if (view == null) {
            return;
        }
        int i2 = this.i;
        if (i > i2) {
            f = i2 - i;
            f4 = this.f107249q - i2;
        } else {
            f = i2 - i;
            f4 = i2 - this.f107243h;
        }
        float f5 = f / f4;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f107252t;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((f) arrayList.get(i3)).onSlide(view, f5);
            i3++;
        }
    }

    public final void e(int i, View view) {
        int i2;
        if (i == 4) {
            i2 = this.i;
        } else if (i == 3) {
            i2 = this.f107243h;
        } else if (i == 6) {
            int i3 = this.f;
            int i5 = this.f107243h;
            if (i3 > i5) {
                i2 = i3;
            } else {
                i = 3;
                i2 = i5;
            }
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(d.n("Illegal state argument: ", i));
            }
            i2 = this.f107249q;
        }
        setStateInternal(2);
        c(i);
        if (this.f107247n.smoothSlideViewTo(view, view.getLeft(), i2)) {
            ViewCompat.postOnAnimation(view, new zyl.d(this, view, i, 1));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown() || !this.f107242g) {
            this.o = true;
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.v = -1;
            VelocityTracker velocityTracker = this.u;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.u = null;
            }
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (action == 0) {
            int x3 = (int) motionEvent.getX();
            this.f107253w = (int) motionEvent.getY();
            View view2 = (View) this.f107251s.get();
            if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x3, this.f107253w)) {
                this.v = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f107254x = true;
            }
            this.o = this.v == -1 && !coordinatorLayout.isPointInChildBounds(view, x3, this.f107253w);
        } else if (action == 1 || action == 3) {
            this.f107254x = false;
            this.v = -1;
            if (this.o) {
                this.o = false;
                return false;
            }
        }
        if (this.o || !this.f107247n.shouldInterceptTouchEvent(motionEvent)) {
            View view3 = (View) this.f107251s.get();
            if (action != 2 || view3 == null || this.o || this.f107246m == 1 || coordinatorLayout.isPointInChildBounds(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(this.f107253w - motionEvent.getY()) <= this.f107247n.getTouchSlop()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        int iMax;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.onLayoutChild(view, i);
        this.f107249q = coordinatorLayout.getHeight();
        if (this.d) {
            if (this.e == 0) {
                this.e = coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.bottom_sheet_anchor_view_height);
            }
            iMax = Math.max(this.e, this.f107249q - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            iMax = this.f107241c;
        }
        int i2 = -this.f107255y;
        this.f107243h = i2;
        int iMax2 = Math.max(this.f107249q - iMax, i2);
        this.i = iMax2;
        int i3 = this.f107246m;
        if (i3 == 3) {
            ViewCompat.offsetTopAndBottom(view, this.f107243h);
        } else if (i3 == 5) {
            ViewCompat.offsetTopAndBottom(view, this.f107249q);
        } else if (i3 == 4) {
            ViewCompat.offsetTopAndBottom(view, iMax2);
        } else if (i3 == 1 || i3 == 2) {
            ViewCompat.offsetTopAndBottom(view, top - view.getTop());
        } else if (i3 == 6) {
            int i5 = this.f;
            int i6 = this.f107243h;
            if (i5 > i6) {
                ViewCompat.offsetTopAndBottom(view, i5);
            } else {
                this.f107246m = 3;
                ViewCompat.offsetTopAndBottom(view, i6);
            }
        }
        if (this.f107247n == null) {
            this.f107247n = ViewDragHelper.create(coordinatorLayout, this.z);
        }
        this.f107250r = new WeakReference(view);
        WeakReference weakReference = this.f107251s;
        if (weakReference != null && weakReference.get() != null) {
            return true;
        }
        this.f107251s = new WeakReference(b(view));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f4) {
        if (this.f107242g && view2 == this.f107251s.get()) {
            return this.f107246m != 3 || super.onNestedPreFling(coordinatorLayout, view, view2, f, f4);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        if (this.f107242g && view2 == ((View) this.f107251s.get())) {
            int top = view.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                boolean z = this.k;
                if (!z && i3 < this.f) {
                    return;
                }
                int i5 = this.f107243h;
                if (i3 >= i5 || !z) {
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(view, -i2);
                    setStateInternal(1);
                } else {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    ViewCompat.offsetTopAndBottom(view, -i6);
                    setStateInternal(3);
                }
            } else if (i2 < 0 && !ViewCompat.canScrollVertically(view2, -1)) {
                int i21 = this.i;
                if (i3 <= i21 || this.f107244j) {
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(view, -i2);
                    setStateInternal(1);
                } else {
                    int i22 = top - i21;
                    iArr[1] = i22;
                    ViewCompat.offsetTopAndBottom(view, -i22);
                    setStateInternal(4);
                }
            }
            dispatchOnSlide(view.getTop());
            this.f107248p = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, view, savedState.getSuperState());
        int i = savedState.f107256a;
        if (i == 1 || i == 2) {
            this.f107246m = 4;
        } else {
            this.f107246m = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, view), this.f107246m);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        if (this.f107242g) {
            this.f107248p = false;
            if ((i & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f107242g) {
            if (view.getTop() == this.f107243h) {
                setStateInternal(3);
                return;
            }
            if (view2 == this.f107251s.get() && this.f107248p) {
                this.u.computeCurrentVelocity(1000, this.f107240b);
                int[] iArr = new int[2];
                a(view, this.u.getXVelocity(this.v), this.u.getYVelocity(this.v), iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                if (this.f107247n.smoothSlideViewTo(view, view.getLeft(), i)) {
                    setStateInternal(2);
                    c(i2);
                    ViewCompat.postOnAnimation(view, new zyl.d(this, view, i2, 1));
                } else {
                    setStateInternal(i2);
                }
                this.f107248p = false;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown() || !this.f107242g) {
            return false;
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.f107246m == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.f107247n;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            this.v = -1;
            VelocityTracker velocityTracker = this.u;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.u = null;
            }
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.o && Math.abs(this.f107253w - motionEvent.getY()) > this.f107247n.getTouchSlop()) {
            this.f107247n.captureChildView(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.o;
    }

    public final void setPeekHeight(int i) {
        WeakReference weakReference;
        View view;
        if (i == -1) {
            if (this.d) {
                return;
            } else {
                this.d = true;
            }
        } else {
            if (!this.d && this.f107241c == i) {
                return;
            }
            this.d = false;
            this.f107241c = Math.max(0, i);
            this.i = this.f107249q - i;
        }
        if (this.f107246m != 4 || (weakReference = this.f107250r) == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.requestLayout();
    }

    public final void setState(int i) {
        if (i == this.f107246m) {
            return;
        }
        WeakReference weakReference = this.f107250r;
        if (weakReference == null) {
            if (i == 4 || i == 3 || i == 6 || i == 5) {
                this.f107246m = i;
                return;
            }
            return;
        }
        View view = (View) weakReference.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view)) {
            view.post(new zyl.d(this, view, i, 0));
        } else {
            e(i, view);
        }
    }

    public final void setStateInternal(int i) {
        int i2 = this.f107246m;
        if (i2 == i) {
            return;
        }
        this.f107246m = i;
        WeakReference weakReference = this.f107250r;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f107252t;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((f) arrayList.get(i3)).a(view, i2, i);
            i3++;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f107256a;

        public class a implements ParcelableCompatCreatorCallbacks {
            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f107256a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f107256a);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f107256a = i;
        }
    }

    public MiddleStateBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 500;
        this.f107242g = true;
        this.k = true;
        this.f107246m = 4;
        this.f107252t = new ArrayList(2);
        this.z = new e(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        setPeekHeight(-1);
        typedArrayObtainStyledAttributes.recycle();
        this.f107246m = 6;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f107240b = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f107239a = viewConfiguration.getScaledMinimumFlingVelocity();
    }
}
