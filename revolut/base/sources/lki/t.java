package lki;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends b {
    @Override // lki.b
    public final Animator a(View view, View view2, boolean z) {
        return new AnimatorSet();
    }

    @Override // lki.b
    public final void c(View view, a animation) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(animation, "animation");
        animation.invoke();
    }

    @Override // lki.b, lki.x
    public final void e(View view, View view2, boolean z, z transitionListener) {
        Intrinsics.checkNotNullParameter(transitionListener, "transitionListener");
        transitionListener.o();
        transitionListener.p();
        transitionListener.r();
        transitionListener.q();
    }
}
