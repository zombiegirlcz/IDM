package hs0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.transition.FadeProvider;
import com.google.android.material.transition.ScaleProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends Visibility {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FadeProvider f154853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScaleProvider f154854b;

    public static final class a {
        private a() {
        }
    }

    public d() {
        this(0);
    }

    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup sceneRoot, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        Animator animatorCreateAppear = this.f154853a.createAppear(sceneRoot, view);
        Animator animatorCreateAppear2 = this.f154854b.createAppear(sceneRoot, view);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorCreateAppear, animatorCreateAppear2);
        return animatorSet;
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup sceneRoot, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        Animator animatorCreateDisappear = this.f154853a.createDisappear(sceneRoot, view);
        Animator animatorCreateDisappear2 = this.f154854b.createDisappear(sceneRoot, view);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorCreateDisappear, animatorCreateDisappear2);
        return animatorSet;
    }

    public d(float f, float f4) {
        this.f154853a = new FadeProvider();
        ScaleProvider scaleProvider = new ScaleProvider();
        this.f154854b = scaleProvider;
        scaleProvider.setIncomingStartScale(f);
        scaleProvider.setOutgoingEndScale(f4);
    }

    public /* synthetic */ d(int i) {
        this(0.1f, BitmapDescriptorFactory.HUE_RED);
    }
}
