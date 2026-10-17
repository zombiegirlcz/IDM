package lq0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.transition.RevTransitionUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f199164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f199165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f199166c;
    public final float d;
    public final ViewGroup e;

    public g(int i, float f, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f199164a = view;
        this.f199165b = f;
        this.f199166c = i;
        this.d = i == 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        ViewParent parent = view.getParent();
        this.e = parent instanceof ViewGroup ? (ViewGroup) parent : null;
    }

    @Override // lq0.b
    public final void a(float f) {
        RevTransitionUtils.INSTANCE.setTransitionAlpha(this.f199164a, AnimationUtils.lerp(this.f199165b, this.d, f));
    }

    @Override // lq0.b
    public final void b(dcl.q sideEffectHelper) {
        Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
        RevTransitionUtils revTransitionUtils = RevTransitionUtils.INSTANCE;
        View view = this.f199164a;
        revTransitionUtils.setTransitionAlpha(view, 1.0f);
        RevTransitionUtils.setTransitionVisibility(view, this.f199166c);
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.invalidate();
            sideEffectHelper.getClass();
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        }
    }

    @Override // lq0.b
    public final void c(dcl.q sideEffectHelper) {
        Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
        RevTransitionUtils revTransitionUtils = RevTransitionUtils.INSTANCE;
        float f = this.f199165b;
        View view = this.f199164a;
        revTransitionUtils.setTransitionAlpha(view, f);
        RevTransitionUtils.setTransitionVisibility(view, 0);
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.invalidate();
            sideEffectHelper.getClass();
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        }
    }
}
