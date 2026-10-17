package az0;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends Animatable2Compat$AnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f11287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedVectorDrawableCompat f11288b;

    public a(ImageView imageView, AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
        this.f11287a = imageView;
        this.f11288b = animatedVectorDrawableCompat;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        this.f11287a.post(new a0.a(this.f11288b, 4));
    }
}
