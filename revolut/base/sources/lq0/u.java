package lq0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.transition.RevTransitionUtils;
import com.google.android.material.animation.AnimationUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f199182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f199183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f199184c;
    public final ViewGroup d;

    public u(View view, Rect from, Rect to6) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f199182a = view;
        this.f199183b = from;
        this.f199184c = to6;
        ViewParent parent = view.getParent();
        this.d = parent instanceof ViewGroup ? (ViewGroup) parent : null;
    }

    @Override // lq0.b
    public final void a(float f) {
        Rect rect = this.f199183b;
        int i = rect.left;
        Rect rect2 = this.f199184c;
        int iLerp = AnimationUtils.lerp(i, rect2.left, f);
        int iLerp2 = AnimationUtils.lerp(rect.right, rect2.right, f);
        RevTransitionUtils.setLeftTopRightBottom(this.f199182a, iLerp, AnimationUtils.lerp(rect.top, rect2.top, f), iLerp2, AnimationUtils.lerp(rect.bottom, rect2.bottom, f));
    }

    @Override // lq0.b
    public final void b(dcl.q sideEffectHelper) {
        Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            sideEffectHelper.getClass();
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        }
    }

    @Override // lq0.b
    public final void c(dcl.q sideEffectHelper) {
        Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            sideEffectHelper.getClass();
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        }
    }
}
