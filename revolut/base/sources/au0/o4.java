package au0;

import android.animation.ValueAnimator;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o4 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9302b;

    public /* synthetic */ o4(int i, Function1 function1) {
        this.f9301a = i;
        this.f9302b = function1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator p0) {
        int i = this.f9301a;
        Function1 function1 = this.f9302b;
        switch (i) {
            case 0:
                SearchView.Companion companion = SearchView.INSTANCE;
                function1.invoke((Float) z9h.n.g(p0, "anim", "null cannot be cast to non-null type kotlin.Float"));
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                function1.invoke(p0);
                break;
        }
    }
}
