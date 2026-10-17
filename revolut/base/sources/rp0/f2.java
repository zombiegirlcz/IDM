package rp0;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import au0.l5;
import com.google.android.material.animation.DrawableAlphaProperty;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f2 implements m0 {

    @NotNull
    private static final e2 Companion = new e2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f256079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorDrawable f256080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f256081c;
    public final ViewGroup d;
    public ObjectAnimator e;
    public goi.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public gu0.a f256082g;

    public f2(Activity activity, ColorDrawable overlayDrawable, long j2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(overlayDrawable, "overlayDrawable");
        this.f256079a = activity;
        this.f256080b = overlayDrawable;
        this.f256081c = j2;
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        this.d = (ViewGroup) decorView;
    }

    @Override // rp0.m0
    public final void a() {
        gu0.a aVar = this.f256082g;
        if (aVar != null) {
            aVar.cancel();
        }
        this.f256079a.unregisterComponentCallbacks(this.f);
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f256080b, (Property<ColorDrawable, Integer>) DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 255, 0);
        objectAnimatorOfInt.setDuration(this.f256081c);
        objectAnimatorOfInt.addListener(new l5(this, 21));
        objectAnimatorOfInt.start();
    }

    @Override // rp0.m0
    public final void b() {
        ViewGroup viewGroup = this.d;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        ColorDrawable colorDrawable = this.f256080b;
        colorDrawable.setBounds(0, 0, width, height);
        viewGroup.getOverlay().add(colorDrawable);
        goi.a aVar = new goi.a(this, 1);
        this.f = aVar;
        this.f256079a.registerComponentCallbacks(aVar);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(colorDrawable, (Property<ColorDrawable, Integer>) DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 0, 255);
        this.e = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(this.f256081c);
        objectAnimatorOfInt.start();
    }
}
