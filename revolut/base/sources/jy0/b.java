package jy0;

import android.animation.TimeInterpolator;
import android.view.View;
import iv0.s;
import ix0.i1;
import kotlin.jvm.internal.Intrinsics;
import mx0.wb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f179257a;

    public b(o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f179257a = state;
    }

    @Override // jy0.p
    public final void a(float f, TimeInterpolator easing, m animation) {
        float interpolation;
        float f4;
        float interpolation2;
        Intrinsics.checkNotNullParameter(easing, "easing");
        Intrinsics.checkNotNullParameter(animation, "animation");
        View view = animation.f179272c;
        wb wbVar = animation.d;
        s sVarI = m.i(view);
        float interpolation3 = easing.getInterpolation(f);
        boolean z = animation.f;
        if (z) {
            interpolation3 = 1 - interpolation3;
        }
        if (z && wbVar.f210089l > view.getWidth() / 2) {
            f4 = 1;
            interpolation2 = easing.getInterpolation(jq0.a.d(f, 0.5f));
        } else {
            if (!z) {
                interpolation = easing.getInterpolation(jq0.a.d(f, 0.2f));
                o oVar = this.f179257a;
                wbVar.f210084b = i1.c(interpolation3, oVar.f179288b, oVar.e);
                wbVar.f210083a = i1.c(interpolation3, oVar.f179289c, oVar.f);
                wbVar.f210085c = i1.b(oVar.f179287a, oVar.d, interpolation3);
                view.setAlpha(interpolation);
                animation.j(f, interpolation, easing);
                view.setTranslationX(i1.b(oVar.f179291h, oVar.k, interpolation3));
                view.setTranslationY(i1.b(oVar.i, oVar.f179293l, interpolation3));
                float fB = i1.b(oVar.f179290g, oVar.f179292j, interpolation3);
                view.setScaleX(fB);
                view.setScaleY(fB);
                animation.a(interpolation3, sVarI, 0.9f);
            }
            f4 = 1;
            interpolation2 = easing.getInterpolation(jq0.a.c(f, 0.3f));
        }
        interpolation = f4 - interpolation2;
        o oVar2 = this.f179257a;
        wbVar.f210084b = i1.c(interpolation3, oVar2.f179288b, oVar2.e);
        wbVar.f210083a = i1.c(interpolation3, oVar2.f179289c, oVar2.f);
        wbVar.f210085c = i1.b(oVar2.f179287a, oVar2.d, interpolation3);
        view.setAlpha(interpolation);
        animation.j(f, interpolation, easing);
        view.setTranslationX(i1.b(oVar2.f179291h, oVar2.k, interpolation3));
        view.setTranslationY(i1.b(oVar2.i, oVar2.f179293l, interpolation3));
        float fB2 = i1.b(oVar2.f179290g, oVar2.f179292j, interpolation3);
        view.setScaleX(fB2);
        view.setScaleY(fB2);
        animation.a(interpolation3, sVarI, 0.9f);
    }
}
