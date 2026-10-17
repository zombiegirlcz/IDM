package dq0;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import jq0.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackgroundWallpaperView f116902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f116903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f116904c;
    public final SpringAnimation d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BackgroundWallpaperView view, float f) {
        super(WindowInsetsCompat.Type.systemBars(), WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullParameter(view, "view");
        this.f116902a = view;
        this.f116903b = f;
        SpringAnimation springAnimation = new SpringAnimation(view, DynamicAnimation.TRANSLATION_Y);
        SpringForce springForce = new SpringForce();
        springForce.setStiffness(30.0f);
        springForce.setDampingRatio(a.b.a(12.0f, 30.0f));
        springAnimation.setSpring(springForce);
        this.d = springAnimation;
    }

    @Override // dq0.b
    public final void a() {
    }

    @Override // dq0.b
    public final void b() {
    }

    @Override // dq0.b
    public final void c(Insets diff, float f) {
        Intrinsics.checkNotNullParameter(diff, "diff");
    }

    @Override // dq0.b
    public final void d() {
        float f = this.f116904c ? -this.f116903b : BitmapDescriptorFactory.HUE_RED;
        if (this.f116902a.getTranslationY() == f) {
            return;
        }
        this.d.animateToFinalPosition(f);
    }

    @Override // dq0.b, androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.f116904c = insets.getInsets(WindowInsetsCompat.Type.ime()).bottom > 0;
        super.onApplyWindowInsets(v, insets);
        return insets;
    }
}
