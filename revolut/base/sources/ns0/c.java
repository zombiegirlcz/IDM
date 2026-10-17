package ns0;

import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedNumbersView f218679b;

    public /* synthetic */ c(AnimatedNumbersView animatedNumbersView, int i) {
        this.f218678a = i;
        this.f218679b = animatedNumbersView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f218678a;
        AnimatedNumbersView animatedNumbersView = this.f218679b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj2;
                AnimatedNumbersView.a aVar = AnimatedNumbersView.Companion;
                Intrinsics.h(bool);
                animatedNumbersView.L = bool.booleanValue();
                animatedNumbersView.o();
                break;
            default:
                h01.c cVar = (h01.c) obj2;
                if (animatedNumbersView.J != cVar) {
                    animatedNumbersView.J = cVar;
                    animatedNumbersView.m(animatedNumbersView.f56496b);
                }
                break;
        }
        return Unit.f186387a;
    }
}
