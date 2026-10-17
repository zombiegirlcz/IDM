package mfa;

import com.revolut.feature.post_activation.api.PostActivationApi$Toggles$PostActivationSteps;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f204967a;

    public b(ix5.b legacyStrategy, ix5.b stepsStrategy, gte.a featureToggleInteractor) {
        a aVar;
        Intrinsics.checkNotNullParameter(legacyStrategy, "legacyStrategy");
        Intrinsics.checkNotNullParameter(stepsStrategy, "stepsStrategy");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        if (((jte.d) featureToggleInteractor).c(PostActivationApi$Toggles$PostActivationSteps.f80932c)) {
            Object obj2 = stepsStrategy.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            aVar = (a) obj2;
        } else {
            Object obj3 = legacyStrategy.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            aVar = (a) obj3;
        }
        this.f204967a = aVar;
    }

    @Override // mfa.a
    public final Object a(Continuation continuation) {
        return this.f204967a.a(continuation);
    }

    @Override // mfa.a
    public final Object b(boolean z, gim.c cVar) {
        return this.f204967a.b(z, cVar);
    }

    @Override // mfa.a
    public final Object c(rfa.e eVar) {
        return this.f204967a.c(eVar);
    }

    @Override // mfa.a
    public final void d() {
        this.f204967a.d();
    }

    @Override // mfa.a
    public final Object e(rfa.e eVar) {
        return this.f204967a.e(eVar);
    }

    @Override // mfa.a
    public final Object f(Continuation continuation) {
        return this.f204967a.f(continuation);
    }
}
