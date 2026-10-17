package d1;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110474a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f110475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f110476c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f110477g;

    public /* synthetic */ i(Transition transition, Transition.TransitionAnimationState transitionAnimationState, Object obj2, Object obj3, FiniteAnimationSpec finiteAnimationSpec, int i) {
        this.e = transition;
        this.f = transitionAnimationState;
        this.f110475b = obj2;
        this.f110476c = obj3;
        this.f110477g = finiteAnimationSpec;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f110474a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return TransitionKt.UpdateInitialAndTargetValues$lambda$0((Transition) this.e, (Transition.TransitionAnimationState) this.f, this.f110475b, this.f110476c, (FiniteAnimationSpec) this.f110477g, this.d, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return ComposableLambdaImpl.invoke$lambda$3((ComposableLambdaImpl) this.e, this.f110475b, this.f110476c, this.f, this.f110477g, this.d, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ i(ComposableLambdaImpl composableLambdaImpl, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = composableLambdaImpl;
        this.f110475b = obj2;
        this.f110476c = obj3;
        this.f = obj4;
        this.f110477g = obj5;
        this.d = i;
    }
}
