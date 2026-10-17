package c1;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.GraphicsLayerBlockForEnterExit;
import androidx.compose.animation.core.Transition;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements GraphicsLayerBlockForEnterExit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition.DeferredAnimation f20302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition.DeferredAnimation f20303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Transition f20304c;
    public final /* synthetic */ EnterTransition d;
    public final /* synthetic */ ExitTransition e;
    public final /* synthetic */ Transition.DeferredAnimation f;

    public /* synthetic */ a(Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition transition, EnterTransition enterTransition, ExitTransition exitTransition, Transition.DeferredAnimation deferredAnimation3) {
        this.f20302a = deferredAnimation;
        this.f20303b = deferredAnimation2;
        this.f20304c = transition;
        this.d = enterTransition;
        this.e = exitTransition;
        this.f = deferredAnimation3;
    }
}
