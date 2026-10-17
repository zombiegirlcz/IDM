package d1;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimationState f110463b;

    public /* synthetic */ d(AnimationState animationState, int i) {
        this.f110462a = i;
        this.f110463b = animationState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f110462a) {
            case 0:
                return SuspendAnimationKt.animate$lambda$4(this.f110463b);
            default:
                return SuspendAnimationKt.animate$lambda$3$0(this.f110463b);
        }
    }
}
