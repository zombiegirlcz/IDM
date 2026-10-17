package d1;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition f110473b;

    public /* synthetic */ h(Transition transition, int i) {
        this.f110472a = i;
        this.f110473b = transition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f110472a) {
            case 0:
                return TransitionKt.rememberTransition$lambda$2$0(this.f110473b, (DisposableEffectScope) obj2);
            default:
                return TransitionKt.updateTransition$lambda$1$0(this.f110473b, (DisposableEffectScope) obj2);
        }
    }
}
