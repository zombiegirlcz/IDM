package kq0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.j;
import ap0.m;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import jq0.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends e {

    @NotNull
    private static final C1064a Companion = new C1064a();

    /* JADX INFO: renamed from: kq0.a$a, reason: collision with other inner class name */
    public static final class C1064a {
        private C1064a() {
        }
    }

    public final void a(View view, View view2) {
        float[] values = {view.getRotationY(), 90.0f};
        Intrinsics.checkNotNullParameter(values, "values");
        ValueAnimator duration = ValueAnimator.ofFloat(Arrays.copyOf(values, 2)).setDuration(250L);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        int i = 12;
        duration.addUpdateListener(new m(view, i));
        float[] values2 = {-90.0f, BitmapDescriptorFactory.HUE_RED};
        Intrinsics.checkNotNullParameter(values2, "values");
        ValueAnimator duration2 = ValueAnimator.ofFloat(Arrays.copyOf(values2, 2)).setDuration(250L);
        Intrinsics.checkNotNullExpressionValue(duration2, "setDuration(...)");
        duration2.addUpdateListener(new m(view2, i));
        float[] values3 = {1.0f, 0.9f, 1.0f};
        Intrinsics.checkNotNullParameter(values3, "values");
        ValueAnimator duration3 = ValueAnimator.ofFloat(Arrays.copyOf(values3, 3)).setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(duration3, "setDuration(...)");
        duration3.addUpdateListener(new j(view, view2));
        duration.addListener(new c(this, view, view2, 1));
        duration.addListener(new c(this, view2, view, 0));
        Animator[] animators = {duration, duration2};
        Intrinsics.checkNotNullParameter(animators, "animators");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially((Animator[]) Arrays.copyOf(animators, 2));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(animatorSet, duration3);
        b bVar = new b(animatorSet2);
        animatorSet2.addListener(new d(this, bVar, view, view2, 1));
        animatorSet2.addListener(new d(this, bVar, view, view2, 0));
        animatorSet2.start();
    }

    public final void b(ConstraintLayout frontView, ConstraintLayout backView) {
        Intrinsics.checkNotNullParameter(frontView, "frontView");
        Intrinsics.checkNotNullParameter(backView, "backView");
        Object tag2 = frontView.getTag();
        b bVar = tag2 instanceof b ? (b) tag2 : null;
        if (bVar != null) {
            bVar.f188283a.end();
        }
        Object tag3 = backView.getTag();
        b bVar2 = tag3 instanceof b ? (b) tag3 : null;
        if (bVar2 != null) {
            bVar2.f188283a.end();
        }
        frontView.setRotationY(BitmapDescriptorFactory.HUE_RED);
        backView.setRotationY(BitmapDescriptorFactory.HUE_RED);
        frontView.setScaleX(1.0f);
        backView.setScaleX(1.0f);
    }

    public final void c(ConstraintLayout frontView, ConstraintLayout backView) {
        Animator animatorA;
        Intrinsics.checkNotNullParameter(frontView, "frontView");
        Intrinsics.checkNotNullParameter(backView, "backView");
        Intrinsics.checkNotNullParameter(frontView, "frontView");
        Intrinsics.checkNotNullParameter(backView, "backView");
        Object tag2 = frontView.getTag();
        b bVar = tag2 instanceof b ? (b) tag2 : null;
        Object tag3 = backView.getTag();
        b bVar2 = tag3 instanceof b ? (b) tag3 : null;
        if (bVar == null || bVar2 == null) {
            View[] views = {frontView, backView};
            Intrinsics.checkNotNullParameter(views, "views");
            for (int i = 0; i < 2; i++) {
                Object tag4 = views[i].getTag();
                jq0.d dVar = tag4 instanceof jq0.d ? (jq0.d) tag4 : null;
                if (dVar != null && (animatorA = dVar.a()) != null) {
                    animatorA.cancel();
                }
            }
            View[] views2 = {frontView, backView};
            Intrinsics.checkNotNullParameter(views2, "views");
            float f = 20000.0f * views2[0].getResources().getDisplayMetrics().density;
            for (int i2 = 0; i2 < 2; i2++) {
                views2[i2].setCameraDistance(f);
            }
            if (frontView.getVisibility() == 0) {
                a(frontView, backView);
            } else {
                a(backView, frontView);
            }
        }
    }
}
