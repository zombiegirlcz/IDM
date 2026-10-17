package lq0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.transition.RevTransitionUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f199167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f199168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f199169c;
    public final ViewGroup d;

    public l(View view, Rect startBounds, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(startBounds, "startBounds");
        this.f199167a = view;
        this.f199168b = startBounds;
        this.f199169c = f;
        ViewParent parent = view.getParent();
        this.d = parent instanceof ViewGroup ? (ViewGroup) parent : null;
    }

    @Override // lq0.b
    public final void a(float f) {
        this.f199167a.setTranslationX(AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, this.f199169c, f));
    }

    @Override // lq0.b
    public final void b(dcl.q sideEffectHelper) {
        Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
        this.f199167a.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            sideEffectHelper.getClass();
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        }
    }

    @Override // lq0.b
    public final void c(dcl.q sideEffectHelper) {
        Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
        View view = this.f199167a;
        RevTransitionUtils.setTransitionVisibility(view, 0);
        Rect rect = this.f199168b;
        RevTransitionUtils.setLeftTopRightBottom(view, rect.left, rect.top, rect.right, rect.bottom);
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            sideEffectHelper.getClass();
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        }
    }
}
