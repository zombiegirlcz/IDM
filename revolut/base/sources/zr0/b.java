package zr0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.transition.RevTransitionUtils;
import com.google.android.material.animation.AnimationUtils;
import dcl.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements lq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f324519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f324520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f324521c;
    public final int d;
    public final int e;
    public final ViewGroup f;

    public b(View view, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f324519a = view;
        this.f324520b = i;
        this.f324521c = i2;
        this.d = i3;
        this.e = i5;
        ViewParent parent = view.getParent();
        this.f = parent instanceof ViewGroup ? (ViewGroup) parent : null;
    }

    @Override // lq0.b
    public final void a(float f) {
        int iLerp = AnimationUtils.lerp(this.f324520b, this.d, f);
        int iLerp2 = AnimationUtils.lerp(this.f324521c, this.e, f);
        View view = this.f324519a;
        RevTransitionUtils.setLeftTopRightBottom(view, view.getLeft(), view.getTop(), view.getLeft() + iLerp, view.getTop() + iLerp2);
    }

    @Override // lq0.b
    public final void b(q sideEffectHelper) {
        Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            sideEffectHelper.getClass();
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        }
    }

    @Override // lq0.b
    public final void c(q sideEffectHelper) {
        Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            sideEffectHelper.getClass();
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        }
    }
}
