package mt0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.collection.ArrayMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import kotlin.jvm.internal.Intrinsics;
import mx0.n6;
import mx0.r6;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class v {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FloatingBottomBarView f208733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f208734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f208735c;
    public final n6 d;
    public final s e;
    public final mm7.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n6 f208736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ks0.l f208737h;
    public final ks0.l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Interpolator f208738j;
    public r6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f208739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f208740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f208741n;
    public ValueAnimator o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ny0.u f208742p;

    public v(FloatingBottomBarView bottomBarView, LinearLayout content, ShadowLayout shadowLayout, n6 bottomInsetViewProvider, s mode, mm7.h onCompressedStateChanged, n6 onGeometryChanged) {
        Intrinsics.checkNotNullParameter(bottomBarView, "bottomBarView");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(shadowLayout, "shadowLayout");
        Intrinsics.checkNotNullParameter(bottomInsetViewProvider, "bottomInsetViewProvider");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(onCompressedStateChanged, "onCompressedStateChanged");
        Intrinsics.checkNotNullParameter(onGeometryChanged, "onGeometryChanged");
        this.f208733a = bottomBarView;
        this.f208734b = content;
        this.f208735c = shadowLayout;
        this.d = bottomInsetViewProvider;
        this.e = mode;
        this.f = onCompressedStateChanged;
        this.f208736g = onGeometryChanged;
        ks0.l.Companion.getClass();
        this.f208737h = ks0.j.a(bottomBarView);
        this.i = ks0.j.a(shadowLayout);
        this.f208738j = jq0.r.f177395g;
        this.k = r6.VISIBILITY;
        this.f208739l = true;
        ny0.u.Companion.getClass();
        this.f208742p = ny0.r.a(bottomBarView);
    }

    public final boolean a() {
        ks0.l lVarA;
        Float fC;
        View view = this.d.f209856b.f58577l;
        if (view != null) {
            ks0.l.Companion.getClass();
            lVarA = ks0.j.a(view);
        } else {
            lVarA = null;
        }
        if (!this.f208739l || this.f208734b.getVisibility() != 0) {
            return true;
        }
        Float fC2 = this.f208737h.c("SCROLL_ANIMATION_TOKEN");
        if ((fC2 != null ? fC2.floatValue() : 0.0f) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        Float fC3 = this.i.c("SCROLL_ANIMATION_TOKEN");
        if ((fC3 != null ? fC3.floatValue() : 0.0f) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        if (((lVarA == null || (fC = lVarA.c("SCROLL_ANIMATION_TOKEN")) == null) ? 0.0f : fC.floatValue()) == BitmapDescriptorFactory.HUE_RED) {
            return (view != null ? view.getAlpha() : 1.0f) != 1.0f;
        }
        return true;
    }

    public final void b() {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        View view = this.d.f209856b.f58577l;
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f208739l = true;
        ny0.u uVar = this.f208742p;
        uVar.getClass();
        Intrinsics.checkNotNullParameter("SCROLL_CONTAINER_VISIBILITY_TOKEN", "requestToken");
        ArrayMap arrayMap = uVar.d;
        if (arrayMap.containsKey("SCROLL_CONTAINER_VISIBILITY_TOKEN")) {
            arrayMap.remove("SCROLL_CONTAINER_VISIBILITY_TOKEN");
            uVar.a();
        }
        this.f208734b.setVisibility(0);
        ks0.l.d(this.f208737h, "SCROLL_ANIMATION_TOKEN", fValueOf2, null, null, 26);
        ks0.l.d(this.i, "SCROLL_ANIMATION_TOKEN", fValueOf2, fValueOf, fValueOf, 2);
        if (view != null) {
            ks0.l.Companion.getClass();
            ks0.l.d(ks0.j.a(view), "SCROLL_ANIMATION_TOKEN", fValueOf2, null, null, 26);
            view.setAlpha(1.0f);
        }
        this.f208736g.invoke();
    }

    public final void c(boolean z, boolean z3) {
        if (this.f208740m == z) {
            return;
        }
        this.f208740m = z;
        this.f.invoke(Boolean.valueOf(z));
        float f = z ? 0.86f : 1.0f;
        s sVar = s.FLOATING;
        s sVar2 = this.e;
        if (sVar2 != sVar) {
            return;
        }
        if (sVar2 == sVar) {
            View view = this.f208735c;
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight());
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ks0.l lVar = this.i;
        Float fB = lVar.b("SCROLL_ANIMATION_TOKEN");
        float fFloatValue = fB != null ? fB.floatValue() : 1.0f;
        Float fC = lVar.c("SCROLL_ANIMATION_TOKEN");
        if (!z3) {
            ks0.l.d(this.i, "SCROLL_ANIMATION_TOKEN", fC, Float.valueOf(f), Float.valueOf(f), 2);
            this.f208736g.invoke();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(this.f208738j);
        valueAnimatorOfFloat.addUpdateListener(new androidx.core.view.j(this, fC, 19));
        valueAnimatorOfFloat.start();
        this.o = valueAnimatorOfFloat;
    }
}
