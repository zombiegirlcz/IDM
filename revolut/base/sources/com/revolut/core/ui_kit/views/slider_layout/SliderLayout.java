package com.revolut.core.ui_kit.views.slider_layout;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.ViewGroupUtils;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import au0.b5;
import au0.m1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import com.revolut.kompot.common.view.ControllerContainerSliderLayout;
import dy0.h0;
import dy0.i;
import dy0.i0;
import dy0.j0;
import dy0.k0;
import dy0.l0;
import dy0.m;
import dy0.m0;
import dy0.n0;
import dy0.o;
import dy0.r;
import dy0.s;
import dy0.t;
import dy0.u;
import h30.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public class SliderLayout extends FrameLayout {

    @NotNull
    public static final a Companion = new a();
    public final Rect A;
    public final ArrayList B;
    public final ArrayList C;
    public final ArrayList D;
    public Set E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f59656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f59657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f59658c;
    public d d;
    public i e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SlidingSpec f59659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.revolut.core.ui_kit.views.slider_layout.a f59660h;
    public final GestureDetector i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f59661j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SpringAnimation f59662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f59663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ValueAnimator f59664n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f59665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f59666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f59667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f59668s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public WeakReference f59669t;
    public final Set u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f59670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f59671x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f59672y;
    public final b z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/slider_layout/SliderLayout$SlidingSpec;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SlidingSpec implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SlidingSpec> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f59673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f59674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o f59675c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SlidingSpec(o.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SlidingSpec[i];
            }
        }

        public SlidingSpec(o direction, boolean z) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.f59673a = direction;
            this.f59674b = z;
        }

        public static SlidingSpec a(SlidingSpec slidingSpec, o direction) {
            boolean z = slidingSpec.f59674b;
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new SlidingSpec(direction, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SlidingSpec)) {
                return false;
            }
            SlidingSpec slidingSpec = (SlidingSpec) obj2;
            return this.f59673a == slidingSpec.f59673a && this.f59674b == slidingSpec.f59674b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f59674b) + (this.f59673a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f59673a.name());
            dest.writeInt(this.f59674b ? 1 : 0);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public static final class b extends OnBackPressedCallback {
        public b() {
            super(false);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackPressed() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static String P(SlidingSpec slidingSpec) {
        if (slidingSpec == null) {
            return "null";
        }
        return "SlidingSpec(direction=" + slidingSpec.f59673a + ", triggeredByTouch=" + slidingSpec.f59674b + ")";
    }

    public static void R(RecyclerView recyclerView, Set set) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        View view = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()) : null;
        if (numValueOf != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(numValueOf.intValue())) != null) {
            view = viewHolderFindViewHolderForAdapterPosition.itemView;
        }
        if (view != null) {
            p(view, set, true, 2);
        }
    }

    public static final float f(SliderLayout sliderLayout) {
        return sliderLayout.getVelocitySign();
    }

    public static final void g(ControllerContainerSliderLayout controllerContainerSliderLayout, o oVar) {
        h0 h0Var = controllerContainerSliderLayout.H().f120994b;
        if (h0Var != null) {
            r rVar = r.SHOWN;
            if (h0Var.c(rVar)) {
                controllerContainerSliderLayout.l(rVar, h0Var);
                return;
            }
        }
        controllerContainerSliderLayout.settleSlideView(oVar.a() * (controllerContainerSliderLayout.getSlidingViewFullOffset() / 0.15f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getAbsoluteTransitionProgress() {
        return this.o / getSlidingViewFullOffset();
    }

    private final View getContentView() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.h(childAt);
            if (!childAt.equals(this.f59661j) && !childAt.equals(this.e)) {
                return childAt;
            }
        }
        return null;
    }

    private final float getCurrentTransitionProgress() {
        return getCurrentTransitionProgressSafe();
    }

    private final float getCurrentTransitionProgressSafe() {
        if (this.f59660h == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i = s.f121021a[this.f59657b.ordinal()];
        if (i == 1) {
            return 1 - getAbsoluteTransitionProgress();
        }
        if (i == 2) {
            return getAbsoluteTransitionProgress();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r getNextState() {
        int i = s.f121021a[this.f59657b.ordinal()];
        if (i == 1) {
            return r.HIDDEN;
        }
        if (i == 2) {
            return r.SHOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final i getOrAttachSharedElementTransitionContainer() {
        i iVar = this.e;
        if (iVar != null) {
            return iVar;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        i iVar2 = new i(context, null, 6, 0);
        iVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(iVar2);
        this.e = iVar2;
        return iVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSlidingViewFullOffset() {
        l0 l0Var = K().f59679a.getConfig().f120993a;
        if (l0Var instanceof k0) {
            return (int) (getSlidingViewFullSize() * ((k0) l0Var).f121000a);
        }
        if (!(l0Var instanceof j0)) {
            throw new NoWhenBranchMatchedException();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, ((j0) l0Var).f120996a);
    }

    private final int getSlidingViewFullSize() {
        o oVar;
        SlidingSpec slidingSpec = this.f59659g;
        if (slidingSpec != null) {
            oVar = slidingSpec.f59675c;
            if (oVar == null) {
                oVar = slidingSpec.f59673a;
            }
        } else {
            oVar = null;
        }
        int i = oVar == null ? -1 : s.f121022b[oVar.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("Can't determine sliding view size before transition started");
        }
        if (i == 1) {
            return I().getHeight();
        }
        if (i == 2 || i == 3) {
            return I().getWidth();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final n0 getSlidingViewTransitionFactory() {
        d dVar = this.d;
        if (dVar != null) {
            return dVar.c0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getVelocitySign() {
        SlidingSpec slidingSpec = this.f59659g;
        if (slidingSpec == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        o oVar = slidingSpec.f59675c;
        if (oVar == null) {
            oVar = slidingSpec.f59673a;
        }
        float fA = oVar.a();
        float f = 1.0f;
        if (!N() && this.f59657b != r.HIDDEN) {
            r rVar = r.SHOWN;
            f = -1.0f;
        }
        return f * fA;
    }

    public static final float h(SliderLayout sliderLayout) {
        return -sliderLayout.getVelocitySign();
    }

    public static final void i(SliderLayout sliderLayout) {
        View contentView = sliderLayout.getContentView();
        if (contentView != null) {
            contentView.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0010, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(android.view.View r2, java.util.ArrayList r3) {
        /*
            r3.add(r2)
            android.view.ViewParent r2 = r2.getParent()
            boolean r0 = r2 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto Lf
            android.view.View r2 = (android.view.View) r2
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L20
            r3.add(r2)
            android.view.ViewParent r2 = r2.getParent()
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto Lf
            android.view.View r2 = (android.view.View) r2
            goto L10
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.slider_layout.SliderLayout.n(android.view.View, java.util.ArrayList):void");
    }

    public static void o(View view, Set set, boolean z, boolean z3) {
        if (view.getVisibility() != 0 || (view instanceof AppBarLayout) || (view instanceof NavBarWithContainerHeaderView)) {
            return;
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
            if ((layoutParams2 != null ? layoutParams2.getBehavior() : null) instanceof NavBarScrollingViewBehavior) {
                if (z3 && z(view)) {
                    return;
                }
                set.add(view);
                return;
            }
        }
        if (z && (ViewCompat.isNestedScrollingEnabled(view) || (view instanceof ViewPager))) {
            if (z3 && z(view)) {
                return;
            }
            set.add(view);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                p(childAt, set, false, 6);
            }
        }
    }

    public static /* synthetic */ void p(View view, Set set, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        o(view, set, true, z);
    }

    private final void setOngoingSlideState(m ongoingSlideState) {
        if (this.f59658c == ongoingSlideState) {
            return;
        }
        this.f59658c = ongoingSlideState;
        r state = this.f59657b;
        SlidingSpec slidingSpec = this.f59659g;
        g gVar = this.f59656a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(ongoingSlideState, "ongoingSlideState");
        Intrinsics.checkNotNullParameter(state, "state");
        gVar.f59689c = ongoingSlideState;
        f fVar = gVar.d;
        d dVar = fVar.f59684a;
        if (dVar != null) {
            gVar.f59688b.put(dVar.getId(), new e(state, slidingSpec));
            Set setKeySet = gVar.f59687a.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
            if (Intrinsics.f(d0.n0(setKeySet), dVar.getId()) || ongoingSlideState != m.NONE) {
                gVar.d = gVar.b(dVar);
            } else {
                gVar.c();
            }
            fVar = gVar.d;
        }
        x(fVar, "Handle ongoing state change");
    }

    private final void setSlidingHandler(d dVar) {
        if (Intrinsics.f(this.d, dVar)) {
            return;
        }
        this.d = dVar;
        if (isLaidOut()) {
            M();
        }
        getOrAttachSharedElementTransitionContainer();
        n0 n0VarC0 = dVar != null ? dVar.c0() : null;
        com.revolut.core.ui_kit.views.slider_layout.a aVar = this.f59660h;
        SlidingSpec slidingSpec = aVar != null ? aVar.f59680b : null;
        SlidingSpec slidingSpec2 = this.f59659g;
        if (slidingSpec == null || slidingSpec2 != null) {
            return;
        }
        if ((n0VarC0 != null ? n0VarC0.a(C(slidingSpec.f59673a), slidingSpec.f59674b) : null) == null) {
            this.f59660h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void settleSlideView(float f) {
        SlidingSpec slidingSpec = this.f59659g;
        if (slidingSpec == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        o oVar = slidingSpec.f59675c;
        if (oVar == null) {
            oVar = slidingSpec.f59673a;
        }
        boolean zN = N();
        final float f4 = BitmapDescriptorFactory.HUE_RED;
        final r rVar = zN ? (f == BitmapDescriptorFactory.HUE_RED || Math.signum(f) == oVar.a()) ? r.HIDDEN : r.SHOWN : (f == BitmapDescriptorFactory.HUE_RED || Math.signum(f) == oVar.a()) ? r.SHOWN : r.HIDDEN;
        final boolean z = rVar == this.f59657b;
        Q(rVar);
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (Math.signum(f) == oVar.a() && getAbsoluteTransitionProgress() == 1.0f && this.f59664n == null) {
            E(rVar, z);
            L();
            return;
        }
        float f5 = kotlin.ranges.f.f(Math.abs(f), getSlidingViewFullOffset() * 2.0f, getSlidingViewFullOffset() * 8.0f);
        if (z) {
            f5 *= -1;
        }
        SpringAnimation springAnimation = this.f59662l;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        final SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(this.o));
        float slidingViewFullOffset = getSlidingViewFullOffset();
        springAnimation2.setStartVelocity(f5);
        springAnimation2.setMinValue(BitmapDescriptorFactory.HUE_RED);
        springAnimation2.setMaxValue(slidingViewFullOffset);
        if (f5 > BitmapDescriptorFactory.HUE_RED) {
            f4 = slidingViewFullOffset;
        }
        SpringForce springForce = new SpringForce(f4);
        springForce.setDampingRatio(0.8f);
        springForce.setStiffness(25.0f);
        springAnimation2.setSpring(springForce);
        springAnimation2.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: dy0.k
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f6, float f32) {
                SliderLayout.a aVar = SliderLayout.Companion;
                if (f6 == f4) {
                    springAnimation2.skipToEnd();
                }
                int i = (int) f6;
                SliderLayout sliderLayout = this;
                sliderLayout.S(i);
                sliderLayout.Q(rVar);
            }
        });
        springAnimation2.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: dy0.l
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f6, float f32) {
                SliderLayout sliderLayout = this.f121001a;
                if (sliderLayout.f59664n != null) {
                    return;
                }
                if (!z3) {
                    sliderLayout.E(rVar, z);
                }
                sliderLayout.L();
            }
        });
        springAnimation2.start();
        od0.a aVar = od0.a.f224253a;
        if (od0.a.i()) {
            springAnimation2.skipToEnd();
        }
        this.f59662l = springAnimation2;
    }

    public static au0.o v(View view) {
        if (view instanceof au0.o) {
            return (au0.o) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            au0.o oVarV = v(childAt);
            if (oVarV != null) {
                return oVarV;
            }
        }
        return null;
    }

    public static void w(View view) {
        ViewCompat.setNestedScrollingEnabled(view, false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                w(childAt);
            }
        }
    }

    public static boolean z(View view) {
        RecyclerView.LayoutManager layoutManager;
        if (view instanceof ViewPager) {
            return true;
        }
        return ((view instanceof ViewPager2) && ((ViewPager2) view).getOrientation() == 0) || ((view instanceof RecyclerView) && (layoutManager = ((RecyclerView) view).getLayoutManager()) != null && layoutManager.getF53278a()) || (view instanceof FloatingBottomBarView);
    }

    public final boolean A(View view, int i, int i2) {
        Rect rect = this.A;
        ViewGroupUtils.getDescendantRect(this, view, rect);
        try {
            return rect.contains(i, i2);
        } finally {
            rect.setEmpty();
        }
    }

    public final void B(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.WARNING;
        r currentState = getCurrentState();
        String strP = P(this.f59659g);
        d dVar = this.d;
        String id10 = dVar != null ? dVar.getId() : null;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(". State=");
        sb6.append(currentState);
        sb6.append(",Spec=");
        sb6.append(strP);
        rd0.d.b(cVar, "SliderLayout", v0.a.i(sb6, ",HandlerId=", id10), null, null, 16);
    }

    public final o C(o oVar) {
        int i;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!jh.d.k(context) || (i = s.f121022b[oVar.ordinal()]) == 1) {
            return oVar;
        }
        if (i == 2) {
            return o.LEFT;
        }
        if (i == 3) {
            return o.RIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void D(boolean z) {
        ArrayList arrayList = this.D;
        if (z) {
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void E(r rVar, boolean z) {
        if (rVar == r.HIDDEN) {
            this.f59659g = null;
        }
        this.f59657b = rVar;
        M();
        B("SlidingFinished");
        int i = s.f121021a[rVar.ordinal()];
        if (i == 1) {
            q(z);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            s(z);
        }
    }

    public final void F(SlidingSpec slidingSpec, boolean z) {
        r(slidingSpec, z);
        View view = this.f59661j;
        if (view != null) {
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new u(this, z));
                return;
            }
            if (H().f120995c && z) {
                ((com.revolut.core.ui_kit_core.displayers.haptic.b) or0.u.k(this).Y()).a(new Haptic.Effect(com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT, true));
            }
            K().d(view, this, getNextState());
        }
    }

    public final void G(String handlerId) {
        Intrinsics.checkNotNullParameter(handlerId, "sliderHandlerId");
        g gVar = this.f59656a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(handlerId, "handlerId");
        x(gVar.a(handlerId, false), "Handle release ownership of " + handlerId + " ");
    }

    public final i0 H() {
        return K().f59679a.getConfig();
    }

    public final View I() {
        View view = this.f59661j;
        if (view != null) {
            return view;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final com.revolut.core.ui_kit.views.slider_layout.a K() {
        com.revolut.core.ui_kit.views.slider_layout.a aVar = this.f59660h;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void L() {
        SpringAnimation springAnimation = this.f59662l;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        ValueAnimator valueAnimator = this.f59664n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f59662l = null;
        this.f59664n = null;
        this.f59671x = Float.MIN_VALUE;
        this.f59670w = Float.MIN_VALUE;
        this.o = 0;
        this.f = false;
        this.z.setEnabled(false);
        this.f59661j = null;
        this.f59660h = null;
    }

    public final void M() {
        au0.o oVarV = v(this);
        if (oVarV != null) {
            w(oVarV);
        }
        WeakReference weakReference = this.f59669t;
        if (!Intrinsics.f(oVarV, weakReference != null ? (au0.o) weakReference.get() : null)) {
            this.f59669t = new WeakReference(oVarV);
        }
        Set nestedScrollingChildren = this.u;
        nestedScrollingChildren.clear();
        Intrinsics.checkNotNullExpressionValue(nestedScrollingChildren, "nestedScrollingChildren");
        p(this, nestedScrollingChildren, false, 6);
    }

    public final boolean N() {
        o oVar;
        if (this.f59657b != r.SHOWN) {
            return false;
        }
        SlidingSpec slidingSpec = this.f59659g;
        if (slidingSpec != null) {
            oVar = slidingSpec.f59675c;
            if (oVar == null) {
                oVar = slidingSpec.f59673a;
            }
        } else {
            oVar = null;
        }
        if (oVar != o.BOTTOM) {
            return (slidingSpec != null ? slidingSpec.f59675c : null) != null;
        }
        return true;
    }

    public final void O() {
        if (this.f59657b != r.SHOWN) {
            String name = getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, name, "Can't close slider when view is in " + getCurrentState() + " ongoingSlideState=" + this.f59658c + " slidingEnabled=" + getSlidingEnabled() + " sliderSpec=" + P(this.f59659g), null, h0Var);
            return;
        }
        if (!getSlidingEnabled()) {
            String name2 = getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, name2, "Can't close slider when sliding is disabled. Sliding transitions factory not provided", null, null, 16);
            return;
        }
        SlidingSpec slidingSpec = this.f59659g;
        if (slidingSpec == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!y(slidingSpec)) {
            throw new IllegalStateException(l.r("Can't close slider when transition is not initialised. Please ensure your slider factory returns a proper transition for direction ", P(slidingSpec)));
        }
        if (this.f59661j == null || getAbsoluteTransitionProgress() == BitmapDescriptorFactory.HUE_RED) {
            t(false);
            h0 h0Var2 = H().f120994b;
            if (h0Var2 != null) {
                r rVar = r.HIDDEN;
                if (h0Var2.c(rVar)) {
                    l(rVar, h0Var2);
                    return;
                }
            }
            settleSlideView(Math.signum(getVelocitySign()) * (getSlidingViewFullOffset() / 0.15f));
        }
    }

    public final void Q(r rVar) {
        h0 h0Var;
        if (this.f59664n == null && (h0Var = H().f120994b) != null) {
            boolean z = rVar == this.f59657b;
            boolean zC = h0Var.c(rVar);
            if (z || !zC || getAbsoluteTransitionProgress() < 0.5f) {
                return;
            }
            l(rVar, h0Var);
        }
    }

    public final void S(int i) {
        this.o = kotlin.ranges.f.g(i, 0, getSlidingViewFullOffset());
        View viewI = I();
        K().e(viewI, this, getCurrentTransitionProgress());
        ValueAnimator valueAnimator = this.f59664n;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            K().c(viewI, this, getCurrentTransitionProgress());
        }
        getCurrentTransitionProgress();
        ArrayList arrayList = this.D;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        if (ev10.getAction() == 1 || ev10.getAction() == 3) {
            this.E = null;
        }
        return super.dispatchTouchEvent(ev10);
    }

    @NotNull
    public final r getCurrentState() {
        return this.f59657b;
    }

    public final String getOwnerId() {
        d dVar = this.f59656a.d.f59684a;
        if (dVar != null) {
            return dVar.getId();
        }
        return null;
    }

    @NotNull
    public final i getSharedElementTransitionContainer() {
        return getOrAttachSharedElementTransitionContainer();
    }

    public final boolean getSlideByTouchStarted() {
        return this.f;
    }

    public final boolean getSlidingEnabled() {
        return getSlidingViewTransitionFactory() != null;
    }

    public final o getSwipeDirection$ui_kit_components_release() {
        SlidingSpec slidingSpec = this.f59659g;
        if (slidingSpec == null) {
            return null;
        }
        o oVar = slidingSpec.f59675c;
        return oVar == null ? slidingSpec.f59673a : oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.revolut.core.ui_kit.views.slider_layout.d r9) {
        /*
            r8 = this;
            java.lang.String r0 = "slidingHandler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.revolut.core.ui_kit.views.slider_layout.SliderLayout$SlidingSpec r1 = r9.D0()
            r2 = 0
            if (r1 == 0) goto L17
            dy0.o r3 = r1.f59673a
            dy0.o r3 = r8.C(r3)
            com.revolut.core.ui_kit.views.slider_layout.SliderLayout$SlidingSpec r1 = com.revolut.core.ui_kit.views.slider_layout.SliderLayout.SlidingSpec.a(r1, r3)
            goto L18
        L17:
            r1 = r2
        L18:
            com.revolut.core.ui_kit.views.slider_layout.g r3 = r8.f59656a
            java.util.LinkedHashMap r4 = r3.f59688b
            java.util.LinkedHashMap r5 = r3.f59687a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = r9.getId()
            dy0.z r6 = r9.getType()
            int[] r7 = dy0.b0.f120963a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            r7 = 1
            if (r6 == r7) goto L44
            r7 = 2
            if (r6 != r7) goto L3e
            java.lang.Object r5 = r5.put(r0, r9)
            com.revolut.core.ui_kit.views.slider_layout.d r5 = (com.revolut.core.ui_kit.views.slider_layout.d) r5
            goto L59
        L3e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L44:
            java.lang.Object r6 = r5.remove(r0)
            com.revolut.core.ui_kit.views.slider_layout.d r6 = (com.revolut.core.ui_kit.views.slider_layout.d) r6
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r5)
            r5.clear()
            r5.put(r0, r9)
            r5.putAll(r7)
            r5 = r6
        L59:
            boolean r6 = r4.containsKey(r0)
            if (r6 != 0) goto L6b
            com.revolut.core.ui_kit.views.slider_layout.e r6 = new com.revolut.core.ui_kit.views.slider_layout.e
            dy0.r r7 = r9.getInitialState()
            r6.<init>(r7, r1)
            r4.put(r0, r6)
        L6b:
            com.revolut.core.ui_kit.views.slider_layout.f r0 = r3.d
            com.revolut.core.ui_kit.views.slider_layout.d r0 = r0.f59684a
            if (r0 == 0) goto L95
            java.lang.String r0 = r9.getId()
            com.revolut.core.ui_kit.views.slider_layout.f r1 = r3.d
            com.revolut.core.ui_kit.views.slider_layout.d r1 = r1.f59684a
            if (r1 == 0) goto L7f
            java.lang.String r2 = r1.getId()
        L7f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            if (r0 != 0) goto L95
            dy0.m r0 = r3.f59689c
            dy0.m r1 = dy0.m.NONE
            if (r0 != r1) goto L9b
            if (r5 != 0) goto L9b
            dy0.z r0 = r9.getType()
            dy0.z r1 = dy0.z.ROOT_SLIDER
            if (r0 == r1) goto L9b
        L95:
            com.revolut.core.ui_kit.views.slider_layout.f r0 = r3.b(r9)
            r3.d = r0
        L9b:
            com.revolut.core.ui_kit.views.slider_layout.f r0 = r3.d
            java.lang.String r9 = r9.getId()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Handle acquire ownership of "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " "
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r8.x(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.slider_layout.SliderLayout.k(com.revolut.core.ui_kit.views.slider_layout.d):void");
    }

    public final void l(r rVar, h0 h0Var) {
        ValueAnimator valueAnimatorOfFloat = rVar == r.SHOWN ? ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f) : ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f59663m = getCurrentTransitionProgress();
        valueAnimatorOfFloat.setDuration(h0Var.a(rVar));
        valueAnimatorOfFloat.setInterpolator(h0Var.b(rVar));
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 10));
        valueAnimatorOfFloat.addListener(new t(this, rVar, 0));
        valueAnimatorOfFloat.start();
        this.f59664n = valueAnimatorOfFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e A[EDGE_INSN: B:88:0x011e->B:74:0x011e BREAK  A[LOOP:1: B:45:0x00a9->B:90:0x00a9], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m(boolean r12) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.slider_layout.SliderLayout.m(boolean):android.view.View");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityM = kli.a.m(context);
        AppCompatActivity appCompatActivity = activityM instanceof AppCompatActivity ? (AppCompatActivity) activityM : null;
        if (appCompatActivity == null || (onBackPressedDispatcher = appCompatActivity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.addCallback(this.z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z.remove();
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0162, code lost:
    
        if (y(r8) != false) goto L101;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.slider_layout.SliderLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        if (this.d != null) {
            M();
        }
        super.onLayout(z, i, i2, i3, i5);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [ix0.a2, java.lang.Object] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev10) {
        m1 m1Var;
        Intrinsics.checkNotNullParameter(ev10, "ev");
        if (!getSlidingEnabled()) {
            return super.onTouchEvent(ev10);
        }
        if (ev10.getAction() != 0) {
            if (this.f59662l == null && this.f59664n == null && this.f59666q != -1) {
                boolean zOnTouchEvent = this.i.onTouchEvent(ev10);
                if (ev10.getAction() == 1 || ev10.getAction() == 3) {
                    if (!zOnTouchEvent && this.f) {
                        if (this.f59661j == null) {
                            B("Update sliding view when it is null");
                        }
                        View viewI = I();
                        ?? r56 = this.v;
                        if (r56 != 0) {
                            r56.cancel();
                        }
                        if (!ViewCompat.isLaidOut(viewI) || viewI.isLayoutRequested()) {
                            m1Var = new m1(viewI, this, this, 2);
                            viewI.addOnLayoutChangeListener(m1Var);
                        } else {
                            this.v = null;
                            if (getAbsoluteTransitionProgress() < 0.25f) {
                                settleSlideView(-getVelocitySign());
                            } else {
                                settleSlideView(getVelocitySign());
                            }
                            m1Var = null;
                        }
                        this.v = m1Var;
                    }
                    if (!this.f && this.v == null) {
                        this.f59660h = null;
                    }
                }
            }
            if (ev10.getAction() == 3 || ev10.getAction() == 1) {
                this.f59665p = -1;
                this.f59666q = -1;
                this.f = false;
                return true;
            }
        }
        return true;
    }

    public void q(boolean z) {
        com.revolut.core.ui_kit.views.slider_layout.a aVar = this.f59660h;
        if (aVar != null) {
            aVar.a(I(), this, r.SHOWN);
        }
        setOngoingSlideState(m.NONE);
        this.z.setEnabled(false);
        D(z);
    }

    public void r(SlidingSpec slidingSpec, boolean z) {
        Intrinsics.checkNotNullParameter(slidingSpec, "slidingSpec");
        setOngoingSlideState(m.IN);
        if (z) {
            SlidingSpec slidingSpecA = SlidingSpec.a(slidingSpec, C(slidingSpec.f59673a));
            d dVar = this.d;
            if (dVar != null) {
                dVar.A(slidingSpecA);
            }
        }
        this.z.setEnabled(true);
        d dVar2 = this.d;
        View viewR0 = dVar2 != null ? dVar2.r0() : null;
        this.f59661j = viewR0;
        if (viewR0 == null) {
            return;
        }
        ArrayList arrayList = this.D;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public void s(boolean z) {
        com.revolut.core.ui_kit.views.slider_layout.a aVar = this.f59660h;
        if (aVar != null) {
            aVar.a(I(), this, r.HIDDEN);
        }
        setOngoingSlideState(m.NONE);
        this.z.setEnabled(false);
        D(z);
    }

    public void t(boolean z) {
        d dVar;
        d dVar2 = this.d;
        this.f59661j = dVar2 != null ? dVar2.r0() : null;
        if (z && (dVar = this.d) != null) {
            dVar.D();
        }
        setOngoingSlideState(m.OUT);
        com.revolut.core.ui_kit.views.slider_layout.a aVar = this.f59660h;
        if (aVar != null) {
            aVar.d(I(), this, getNextState());
        }
        this.z.setEnabled(true);
        if (this.f59661j == null) {
            return;
        }
        ArrayList arrayList = this.D;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void u(String handlerId) {
        Intrinsics.checkNotNullParameter(handlerId, "sliderHandlerId");
        g gVar = this.f59656a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(handlerId, "handlerId");
        x(gVar.a(handlerId, true), "Handle dispose ownership of ".concat(handlerId));
    }

    public final void x(f fVar, String str) {
        setSlidingHandler(fVar.f59684a);
        r rVar = fVar.f59685b;
        SlidingSpec slidingSpec = fVar.f59686c;
        this.f59657b = rVar;
        this.f59659g = slidingSpec;
        B(str);
    }

    public final boolean y(SlidingSpec slidingSpec) {
        m0 m0VarA;
        com.revolut.core.ui_kit.views.slider_layout.a aVar = this.f59660h;
        if (aVar != null && Intrinsics.f(aVar.f59680b, slidingSpec)) {
            return true;
        }
        o oVarC = C(slidingSpec.f59673a);
        n0 slidingViewTransitionFactory = getSlidingViewTransitionFactory();
        if (slidingViewTransitionFactory == null || (m0VarA = slidingViewTransitionFactory.a(oVarC, slidingSpec.f59674b)) == null) {
            return false;
        }
        this.f59660h = new com.revolut.core.ui_kit.views.slider_layout.a(slidingSpec, m0VarA);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59656a = new g();
        this.f59657b = r.HIDDEN;
        this.f59658c = m.NONE;
        this.k = kli.a.k(context, 200.0f);
        this.f59665p = -1;
        this.f59666q = -1;
        this.u = Collections.newSetFromMap(new WeakHashMap());
        this.f59670w = Float.MIN_VALUE;
        this.f59671x = Float.MIN_VALUE;
        this.f59672y = Float.MIN_VALUE;
        this.z = new b(false);
        this.A = new Rect();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.i = new GestureDetector(context, new com.revolut.core.ui_kit.views.slider_layout.b(this));
    }

    public /* synthetic */ SliderLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
