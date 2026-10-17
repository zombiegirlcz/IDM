package d1;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition f110468b;

    public /* synthetic */ f(Transition transition, int i) {
        this.f110467a = i;
        this.f110468b = transition;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f110467a) {
            case 0:
                return Boolean.valueOf(Transition.animateTo$lambda$0$0(this.f110468b));
            default:
                return Long.valueOf(this.f110468b.calculateTotalDurationNanos());
        }
    }
}
