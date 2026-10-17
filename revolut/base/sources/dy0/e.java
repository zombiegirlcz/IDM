package dy0;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.core.ui_kit.views.slider_layout.SlidingDimmerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements m0 {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f120966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f120967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f120968c;
    public final c d;
    public SlidingDimmerView e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f120969g;

    public e(i0 config, c mode, int i) {
        boolean z = (i & 2) != 0;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f120966a = config;
        this.f120967b = z;
        this.f120968c = true;
        this.d = mode;
    }

    @Override // dy0.m0
    public final void a(View view, SliderLayout parent, r state) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        SlidingDimmerView slidingDimmerView = this.e;
        if (slidingDimmerView != null) {
            this.e = null;
            float f = state == r.SHOWN ? 1.0f : 0.0f;
            slidingDimmerView.setDimmingAlpha$ui_kit_components_release(f);
            slidingDimmerView.setVisibility(f == BitmapDescriptorFactory.HUE_RED ? 4 : 0);
            slidingDimmerView.setHighlightTarget(null);
        }
    }

    @Override // dy0.m0
    public final void c(View view, SliderLayout parent, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    @Override // dy0.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r7, com.revolut.core.ui_kit.views.slider_layout.SliderLayout r8, dy0.r r9) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r8 = "targetState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r8)
            android.view.ViewParent r8 = r7.getParent()
            boolean r0 = r8 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L1b
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L1c
        L1b:
            r8 = r1
        L1c:
            if (r8 != 0) goto L1f
            goto L6e
        L1f:
            int r0 = r8.getChildCount()
            r2 = 0
            r3 = r2
        L25:
            if (r3 >= r0) goto L36
            android.view.View r4 = r8.getChildAt(r3)
            kotlin.jvm.internal.Intrinsics.h(r4)
            boolean r5 = r4 instanceof com.revolut.core.ui_kit.views.slider_layout.SlidingDimmerView
            if (r5 == 0) goto L33
            goto L37
        L33:
            int r3 = r3 + 1
            goto L25
        L36:
            r4 = r1
        L37:
            boolean r0 = r4 instanceof com.revolut.core.ui_kit.views.slider_layout.SlidingDimmerView
            if (r0 == 0) goto L3e
            com.revolut.core.ui_kit.views.slider_layout.SlidingDimmerView r4 = (com.revolut.core.ui_kit.views.slider_layout.SlidingDimmerView) r4
            goto L3f
        L3e:
            r4 = r1
        L3f:
            r6.e = r4
            if (r4 != 0) goto L48
            java.lang.String r0 = "Trying to animate dimming but dimming view is not found"
            r6.b.D(r0)
        L48:
            int[] r0 = dy0.d.f120965a
            dy0.c r3 = r6.d
            int r3 = r3.ordinal()
            r0 = r0[r3]
            r3 = 1
            if (r0 == r3) goto L60
            r4 = 2
            if (r0 != r4) goto L62
            lji.c r0 = ksj.b.l(r7)
            if (r0 == 0) goto L60
            r0 = r3
            goto L68
        L60:
            r0 = r2
            goto L68
        L62:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L68:
            r6.f120969g = r0
            com.revolut.core.ui_kit.views.slider_layout.SlidingDimmerView r0 = r6.e
            if (r0 != 0) goto L6f
        L6e:
            return
        L6f:
            int r4 = r8.indexOfChild(r0)
            int r5 = r8.indexOfChild(r7)
            int r5 = r5 - r3
            if (r4 == r5) goto L84
            r8.removeView(r0)
            int r7 = r8.indexOfChild(r7)
            r8.addView(r0, r7)
        L84:
            boolean r7 = r6.f120969g
            if (r7 != 0) goto L89
            goto L8b
        L89:
            r2 = 8
        L8b:
            r0.setVisibility(r2)
            int r7 = r0.getVisibility()
            r8 = 0
            if (r7 != 0) goto Lad
            dy0.r r7 = dy0.r.SHOWN
            if (r9 != r7) goto L9a
            goto L9c
        L9a:
            r8 = 1065353216(0x3f800000, float:1.0)
        L9c:
            r0.setDimmingAlpha$ui_kit_components_release(r8)
            int r7 = r6.f
            if (r7 == 0) goto La7
            r0.setCustomDimmerBackground(r7)
            return
        La7:
            boolean r7 = r6.f120968c
            r0.setDimmerBackground(r7)
            return
        Lad:
            r0.setDimmingAlpha$ui_kit_components_release(r8)
            r6.e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dy0.e.d(android.view.View, com.revolut.core.ui_kit.views.slider_layout.SliderLayout, dy0.r):void");
    }

    @Override // dy0.m0
    public final void e(View view, SliderLayout parent, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.f120967b) {
            f = jq0.a.d(f, 0.6f);
        }
        SlidingDimmerView slidingDimmerView = this.e;
        if (slidingDimmerView != null) {
            slidingDimmerView.setDimmingAlpha$ui_kit_components_release(f);
        }
    }

    @Override // dy0.m0
    public final i0 getConfig() {
        return this.f120966a;
    }
}
