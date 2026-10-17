package ox0;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.Arrays;
import jq0.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class t {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f230502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollapsingActionButton f230503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FormsActionButton f230504c;
    public final LargeActionButton d;
    public final boolean e;
    public final os2.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f230505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Image f230506h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f230507j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f230508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AnimatorSet f230509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SpringAnimation f230510n;
    public u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f230511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f230512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.b f230513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f230514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o6.a f230515t;
    public SpringAnimation u;

    public t(Context context, CollapsingActionButton hostView, FormsActionButton formsActionButton, LargeActionButton largeActionButton, boolean z, os2.a onCollapsedStateChanged) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(formsActionButton, "formsActionButton");
        Intrinsics.checkNotNullParameter(largeActionButton, "largeActionButton");
        Intrinsics.checkNotNullParameter(onCollapsedStateChanged, "onCollapsedStateChanged");
        this.f230502a = context;
        this.f230503b = hostView;
        this.f230504c = formsActionButton;
        this.d = largeActionButton;
        this.e = z;
        this.f = onCollapsedStateChanged;
        this.f230505g = -1.0f;
        yhm.k kVar = yhm.k.NONE;
        final int i = 0;
        this.f230507j = yhm.j.c(kVar, new Function0(this) { // from class: ox0.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f230499b;

            {
                this.f230499b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ValueAnimator valueAnimator = new ValueAnimator();
                        t tVar = this.f230499b;
                        valueAnimator.addUpdateListener(new p(tVar, 4));
                        valueAnimator.addListener(new s(tVar, 1));
                        valueAnimator.setDuration(200L);
                        return valueAnimator;
                    case 1:
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        valueAnimator2.addUpdateListener(new p(this.f230499b, 3));
                        valueAnimator2.setDuration(150L);
                        return valueAnimator2;
                    default:
                        ValueAnimator valueAnimator3 = new ValueAnimator();
                        valueAnimator3.addUpdateListener(new p(this.f230499b, 0));
                        return valueAnimator3;
                }
            }
        });
        final int i2 = 1;
        this.k = yhm.j.c(kVar, new Function0(this) { // from class: ox0.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f230499b;

            {
                this.f230499b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ValueAnimator valueAnimator = new ValueAnimator();
                        t tVar = this.f230499b;
                        valueAnimator.addUpdateListener(new p(tVar, 4));
                        valueAnimator.addListener(new s(tVar, 1));
                        valueAnimator.setDuration(200L);
                        return valueAnimator;
                    case 1:
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        valueAnimator2.addUpdateListener(new p(this.f230499b, 3));
                        valueAnimator2.setDuration(150L);
                        return valueAnimator2;
                    default:
                        ValueAnimator valueAnimator3 = new ValueAnimator();
                        valueAnimator3.addUpdateListener(new p(this.f230499b, 0));
                        return valueAnimator3;
                }
            }
        });
        final int i3 = 2;
        this.f230508l = yhm.j.c(kVar, new Function0(this) { // from class: ox0.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f230499b;

            {
                this.f230499b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ValueAnimator valueAnimator = new ValueAnimator();
                        t tVar = this.f230499b;
                        valueAnimator.addUpdateListener(new p(tVar, 4));
                        valueAnimator.addListener(new s(tVar, 1));
                        valueAnimator.setDuration(200L);
                        return valueAnimator;
                    case 1:
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        valueAnimator2.addUpdateListener(new p(this.f230499b, 3));
                        valueAnimator2.setDuration(150L);
                        return valueAnimator2;
                    default:
                        ValueAnimator valueAnimator3 = new ValueAnimator();
                        valueAnimator3.addUpdateListener(new p(this.f230499b, 0));
                        return valueAnimator3;
                }
            }
        });
        this.f230512q = true;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f230513r = bVarE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(boolean z, boolean z3) {
        u uVar;
        this.f230511p = z;
        this.f230513r.onNext(Boolean.valueOf(z));
        this.f.invoke();
        ?? r06 = this.k;
        ?? r110 = this.f230507j;
        if (!z3 || !jq0.a.a(this.f230502a)) {
            h();
            ((ValueAnimator) r110.getValue()).cancel();
            ((ValueAnimator) r06.getValue()).cancel();
            j().cancel();
            b(z);
            if (!m() || (uVar = this.o) == null) {
                return;
            }
            TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ((om4.d0) uVar).f226551b;
            int i = TwinVerticalButton.f59013w;
            twinVerticalButton.t0();
            return;
        }
        boolean zM = m();
        LargeActionButton largeActionButton = this.d;
        int i2 = 1;
        if (!zM) {
            float[] fArr = z ? new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f} : new float[]{1.0f, BitmapDescriptorFactory.HUE_RED};
            ((ValueAnimator) r110.getValue()).setFloatValues(Arrays.copyOf(fArr, fArr.length));
            ((ValueAnimator) r06.getValue()).setFloatValues(Arrays.copyOf(fArr, fArr.length));
            j().setFloatValues(Arrays.copyOf(fArr, fArr.length));
            largeActionButton.setBackgroundDrawableLockedBoundsEnabled$ui_kit_components_release(true);
            ((ValueAnimator) r110.getValue()).start();
            ((ValueAnimator) r06.getValue()).start();
            if (this.f230511p) {
                j().setStartDelay(150L);
                j().setDuration(50L);
            } else {
                j().setStartDelay(0L);
            }
            j().start();
            return;
        }
        u uVar2 = this.o;
        if (uVar2 != null) {
            TwinVerticalButton.i0((TwinVerticalButton) ((om4.d0) uVar2).f226551b);
        }
        float[] fArr2 = z ? new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f} : new float[]{1.0f, BitmapDescriptorFactory.HUE_RED};
        h();
        largeActionButton.setVisibility(0);
        largeActionButton.setBackgroundDrawableLockedBoundsEnabled$ui_kit_components_release(true);
        SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(fArr2[0]));
        SpringForce springForce = new SpringForce(fArr2[1]);
        springForce.setStiffness(80.0f);
        springForce.setDampingRatio(a.b.a(14.0f, 80.0f));
        springAnimation.setSpring(springForce);
        springAnimation.setStartValue(fArr2[0]);
        springAnimation.setMinimumVisibleChange(0.001f);
        springAnimation.addUpdateListener(new o(this, 0));
        springAnimation.addEndListener(new jq0.l(this, i2));
        this.f230510n = springAnimation;
        long j2 = this.f230511p ? 0L : 150L;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr2[0], fArr2[1]);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(jq0.r.f177393b);
        valueAnimatorOfFloat.addUpdateListener(new p(this, 1));
        Unit unit = Unit.f186387a;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr2[0], fArr2[1]);
        valueAnimatorOfFloat2.setStartDelay(j2);
        valueAnimatorOfFloat2.setDuration(150L);
        valueAnimatorOfFloat2.setInterpolator(jq0.r.f177392a);
        valueAnimatorOfFloat2.addUpdateListener(new p(this, 2));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new s(this, 0));
        animatorSet.start();
        this.f230509m = animatorSet;
        SpringAnimation springAnimation2 = this.f230510n;
        if (springAnimation2 != null) {
            springAnimation2.start();
        }
    }

    public final void b(boolean z) {
        float f = z ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        LargeActionButton largeActionButton = this.d;
        largeActionButton.setBackgroundDrawableLockedBoundsEnabled$ui_kit_components_release(true);
        if (m()) {
            e(f);
        } else {
            d(f);
        }
        largeActionButton.setBackgroundDrawableLockedBoundsEnabled$ui_kit_components_release(false);
        float f4 = 1.0f - f;
        largeActionButton.setTextAlpha$ui_kit_components_release(f4);
        largeActionButton.setImageAlpha$ui_kit_components_release(f4);
        c(f);
    }

    public final void c(float f) {
        FormsActionButton formsActionButton = this.f230504c;
        formsActionButton.setAlpha(f);
        formsActionButton.setVisibility((f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) == 0 ? 4 : 0);
    }

    public final void d(float f) {
        FormsActionButton formsActionButton = this.f230504c;
        float f4 = 2;
        float height = formsActionButton.getHeight() / f4;
        float f5 = this.f230505g;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        LargeActionButton largeActionButton = this.d;
        if (f5 < BitmapDescriptorFactory.HUE_RED) {
            this.f230505g = kli.a.k(this.f230502a, largeActionButton.getCornersRadius());
        }
        float fA = this.f230505g;
        if (f != BitmapDescriptorFactory.HUE_RED && f != 1.0f) {
            fA = j6.a.a(height, fA, f, fA);
        }
        float width = (r1 - formsActionButton.getWidth()) * f;
        float height2 = ((formsActionButton.getHeight() - largeActionButton.getHeight()) * f) / f4;
        largeActionButton.setBackgroundDrawableBounds$ui_kit_components_release((int) width, (int) (-height2), largeActionButton.getWidth(), (int) (largeActionButton.getHeight() + height2));
        largeActionButton.setBackgroundCornerRadius$ui_kit_components_release(fA);
        largeActionButton.setVisibility(f == 1.0f ? 4 : 0);
        boolean z = f == BitmapDescriptorFactory.HUE_RED;
        if (largeActionButton.f56559g == z) {
            return;
        }
        largeActionButton.f56559g = z;
        Context context = largeActionButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, largeActionButton.shadowElevation);
        if (largeActionButton.f56559g) {
            f6 = iK;
        }
        largeActionButton.setElevation(f6);
    }

    public final void e(float f) {
        FormsActionButton formsActionButton = this.f230504c;
        float f4 = 2;
        float height = formsActionButton.getHeight() / f4;
        float f5 = this.f230505g;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        LargeActionButton largeActionButton = this.d;
        if (f5 < BitmapDescriptorFactory.HUE_RED) {
            this.f230505g = kli.a.k(this.f230502a, largeActionButton.getCornersRadius());
        }
        float f32 = this.f230505g;
        float fA = j6.a.a(height, f32, f, f32);
        float width = ((largeActionButton.getWidth() - formsActionButton.getWidth()) / 2.0f) * f;
        float height2 = ((formsActionButton.getHeight() - largeActionButton.getHeight()) * f) / f4;
        largeActionButton.setBackgroundDrawableBounds$ui_kit_components_release((int) width, (int) (-height2), (int) (largeActionButton.getWidth() - width), (int) (largeActionButton.getHeight() + height2));
        largeActionButton.setBackgroundCornerRadius$ui_kit_components_release(fA);
        largeActionButton.setVisibility(f == 1.0f ? 4 : 0);
        boolean z = f == BitmapDescriptorFactory.HUE_RED;
        if (largeActionButton.f56559g == z) {
            return;
        }
        largeActionButton.f56559g = z;
        Context context = largeActionButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, largeActionButton.shadowElevation);
        if (largeActionButton.f56559g) {
            f6 = iK;
        }
        largeActionButton.setElevation(f6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void f() {
        u uVar;
        ((ValueAnimator) this.f230507j.getValue()).cancel();
        ((ValueAnimator) this.k.getValue()).cancel();
        j().cancel();
        g();
        h();
        b(this.f230511p);
        if (!m() || (uVar = this.o) == null) {
            return;
        }
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ((om4.d0) uVar).f226551b;
        int i = TwinVerticalButton.f59013w;
        twinVerticalButton.t0();
    }

    public final void g() {
        o6.a aVar = this.f230515t;
        if (aVar != null) {
            this.f230503b.removeCallbacks(aVar);
        }
        this.f230515t = null;
        SpringAnimation springAnimation = this.u;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        this.u = null;
        FormsActionButton formsActionButton = this.f230504c;
        formsActionButton.setScaleX(1.0f);
        formsActionButton.setScaleY(1.0f);
        formsActionButton.setAlpha(1.0f);
    }

    public final void h() {
        AnimatorSet animatorSet = this.f230509m;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f230509m = null;
        SpringAnimation springAnimation = this.f230510n;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        this.f230510n = null;
        u uVar = this.o;
        if (uVar != null) {
            TwinVerticalButton.g0((TwinVerticalButton) ((om4.d0) uVar).f226551b);
        }
    }

    public final boolean i() {
        return this.f230511p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ValueAnimator j() {
        return (ValueAnimator) this.f230508l.getValue();
    }

    public final boolean k() {
        return this.f230511p;
    }

    public final boolean l() {
        return this.f230512q;
    }

    public final boolean m() {
        return this.e && h.a(this.f230506h);
    }

    public final ihm.b n() {
        return this.f230513r;
    }

    public final void o() {
        this.f230514s = true;
        a(true, false);
        boolean zA = jq0.a.a(this.f230502a);
        FormsActionButton formsActionButton = this.f230504c;
        if (!zA) {
            if (m()) {
                formsActionButton.i(false);
            }
        } else {
            formsActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
            o6.a aVar = new o6.a(this, 4);
            this.f230515t = aVar;
            this.f230503b.postDelayed(aVar, 300L);
        }
    }

    public final void p(boolean z, boolean z3) {
        if (!m()) {
            if (this.f230512q && this.f230511p != z) {
                this.f230511p = z;
                a(z, z3);
                return;
            }
            return;
        }
        if (this.f230512q && this.f230511p != z) {
            g();
            if (z) {
                this.f230511p = true;
                a(true, z3);
            } else {
                this.f230511p = false;
                a(false, z3);
            }
        }
    }

    public final void q(boolean z) {
        this.i = true;
        if (!m()) {
            if (this.f230512q == z) {
                return;
            }
            this.f230512q = z;
            if (z || !this.f230511p) {
                return;
            }
            this.f230511p = false;
            a(false, false);
            return;
        }
        if (this.f230512q != z) {
            this.f230512q = z;
            if (!z && this.f230511p) {
                g();
                this.f230511p = false;
                a(false, false);
            }
        }
        if (!this.f230512q || this.f230514s) {
            return;
        }
        o();
    }

    public final void r(Image image) {
        boolean zM = m();
        this.f230506h = image;
        if (zM != m()) {
            g();
            if (this.f230511p) {
                b(true);
            }
        }
        boolean zM2 = m();
        FormsActionButton formsActionButton = this.f230504c;
        if (!zM2 || !this.f230512q || !this.f230514s || jq0.a.a(this.f230502a)) {
            formsActionButton.setImage(image);
        } else if (m()) {
            formsActionButton.i(false);
        }
        if (m() && this.i && this.f230512q && !this.f230511p && !this.f230514s) {
            o();
        }
    }

    public final void s(u uVar) {
        this.o = uVar;
    }
}
