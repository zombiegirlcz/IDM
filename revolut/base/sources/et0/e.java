package et0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.chat.WaveformSeekBarView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f129019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f129020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Animator f129021c;
    public final ImageView d;
    public final Context e;
    public final ResourceImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f129022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f129023h;

    public e(WaveformSeekBarView waveformView, ImageView dotView, Animator dotViewPulseAnimator, ImageView binView) {
        Intrinsics.checkNotNullParameter(waveformView, "waveformView");
        Intrinsics.checkNotNullParameter(dotView, "dotView");
        Intrinsics.checkNotNullParameter(dotViewPulseAnimator, "dotViewPulseAnimator");
        Intrinsics.checkNotNullParameter(binView, "binView");
        this.f129019a = waveformView;
        this.f129020b = dotView;
        this.f129021c = dotViewPulseAnimator;
        this.d = binView;
        this.e = binView.getContext();
        this.f = new ResourceImage(R$drawable.uikit_icn_24_delete_anim, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        Intrinsics.checkNotNullExpressionValue(binView.getContext(), "getContext(...)");
        this.f129022g = kli.a.k(r10, 6.0f);
        Intrinsics.checkNotNullExpressionValue(binView.getContext(), "getContext(...)");
        this.f129023h = kli.a.k(r10, 14.0f);
    }

    public static AnimatorSet c(Animator... animatorArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether((Animator[]) Arrays.copyOf(animatorArr, animatorArr.length));
        return animatorSet;
    }

    public final ValueAnimator a() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(1250L);
        valueAnimatorOfFloat.setStartDelay(300L);
        b bVar = new b(valueAnimatorOfFloat, this, 0);
        valueAnimatorOfFloat.addListener(bVar);
        valueAnimatorOfFloat.addUpdateListener(bVar);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator b(View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-this.f129023h, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setStartDelay(200L);
        valueAnimatorOfFloat.setInterpolator(jq0.r.f177392a);
        c cVar = new c(valueAnimatorOfFloat, view, view, 0);
        valueAnimatorOfFloat.addListener(cVar);
        valueAnimatorOfFloat.addUpdateListener(cVar);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }
}
