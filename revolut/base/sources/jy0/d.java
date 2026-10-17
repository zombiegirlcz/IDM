package jy0;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import dy0.m0;
import iv0.s;
import ix0.i1;
import kotlin.jvm.internal.Intrinsics;
import mx0.wb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements p {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Interpolator f179258c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f179259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HomeOverlayConfig f179260b;

    static {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.34f, 0.78f, 0.52f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(...)");
        f179258c = interpolatorCreate;
    }

    public d(o state, HomeOverlayConfig homeOverlayConfig) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f179259a = state;
        this.f179260b = homeOverlayConfig;
    }

    @Override // jy0.p
    public final void a(float f, TimeInterpolator easing, m animation) {
        float interpolation;
        float interpolation2;
        float interpolation3;
        float interpolation4;
        boolean z = animation.f;
        View view = animation.f179272c;
        Intrinsics.checkNotNullParameter(easing, "easing");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Interpolator interpolator = f179258c;
        HomeOverlayConfig homeOverlayConfig = this.f179260b;
        if (homeOverlayConfig == null || !homeOverlayConfig.f59655a) {
            s sVarI = m.i(view);
            if (z) {
                interpolation = 1 - easing.getInterpolation(f);
            } else {
                m0.Companion.getClass();
                interpolation = interpolator.getInterpolation(jq0.a.d(f, 0.95f));
            }
            float f4 = interpolation;
            float interpolation5 = z ? 1 - easing.getInterpolation(f) : easing.getInterpolation(f);
            c(interpolation5, f4, z ? 1 - easing.getInterpolation(jq0.a.c(f, 0.3f)) : easing.getInterpolation(jq0.a.d(f, 0.2f)), easing, f, animation);
            b(interpolation5, f4, animation);
            animation.a(interpolation5, sVarI, 0.95f);
            return;
        }
        s sVarI2 = m.i(view);
        if (z) {
            interpolation2 = 1 - easing.getInterpolation(f);
        } else {
            m0.Companion.getClass();
            interpolation2 = interpolator.getInterpolation(jq0.a.d(f, 0.95f));
        }
        float f5 = interpolation2;
        if (z) {
            interpolation3 = 1 - easing.getInterpolation(f);
        } else {
            m0.Companion.getClass();
            interpolation3 = easing.getInterpolation(jq0.a.c(f, 0.1f));
        }
        if (z) {
            interpolation4 = 1 - easing.getInterpolation(jq0.a.c(jq0.a.d(f, 0.6f), 0.3f));
        } else {
            m0.Companion.getClass();
            interpolation4 = easing.getInterpolation(jq0.a.d(jq0.a.c(f, 0.1f), 0.2f));
        }
        float f6 = interpolation4;
        float f32 = interpolation3;
        c(f32, f5, f6, easing, f, animation);
        b(f32, f5, animation);
        animation.a(f32, sVarI2, 0.95f);
    }

    public final void b(float f, float f4, m mVar) {
        o oVar = this.f179259a;
        float fB = i1.b(oVar.f179290g, oVar.f179292j, f);
        float f5 = oVar.f179291h;
        View view = mVar.f179272c;
        float width = view.getWidth();
        float f6 = oVar.f179290g;
        float f32 = ((width * f6) / 2.0f) + f5;
        float f35 = ((oVar.f179294m * f6) / 2.0f) + oVar.i;
        float f36 = oVar.k;
        float width2 = view.getWidth();
        float f37 = oVar.f179292j;
        float f41 = ((oVar.f179295n * f37) / 2.0f) + oVar.f179293l;
        float fB2 = i1.b(f32, ((width2 * f37) / 2.0f) + f36, f);
        float fB3 = i1.b(f35, f41, f4);
        float fB4 = i1.b(oVar.f179294m, oVar.f179295n, f);
        view.setTranslationX(fB2 - ((view.getWidth() * fB) / 2.0f));
        view.setTranslationY(fB3 - ((fB4 * fB) / 2.0f));
        view.setScaleX(fB);
        view.setScaleY(fB);
    }

    public final void c(float f, float f4, float f5, TimeInterpolator timeInterpolator, float f6, m mVar) {
        o oVar = this.f179259a;
        float fB = i1.b(oVar.f179287a, oVar.d, f);
        float f32 = oVar.f179288b;
        wb wbVar = mVar.d;
        float f35 = wbVar.f210089l;
        float f36 = oVar.f179287a;
        float f37 = ((f35 * f36) / 2.0f) + f32;
        float f41 = oVar.f179289c;
        float f42 = wbVar.f210090m;
        float f57 = ((f36 * f42) / 2.0f) + f41;
        float f69 = oVar.e;
        float f75 = oVar.d;
        float fB2 = i1.b(f37, ((f35 * f75) / 2.0f) + f69, f);
        float fB3 = i1.b(f57, ((f42 * f75) / 2.0f) + oVar.f, f4);
        wbVar.f210084b = fB2 - ((wbVar.f210089l * fB) / 2.0f);
        wbVar.f210083a = fB3 - ((wbVar.f210090m * fB) / 2.0f);
        wbVar.f210085c = fB;
        mVar.f179272c.setAlpha(f5);
        mVar.j(f6, f5, timeInterpolator);
    }
}
