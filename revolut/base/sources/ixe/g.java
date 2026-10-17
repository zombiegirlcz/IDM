package ixe;

import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.junior_onboarding.api.JuniorOnboardingApi$Toggles;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f169555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f169556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f169557c;

    public g(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f169555a = featureToggleInteractor;
        final int i = 0;
        this.f169556b = w.y0(new Function0(this) { // from class: ixe.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f169554b;

            {
                this.f169554b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f169554b.f169555a).c(CardsCoreApi$Toggles.CardOrderDiscountsWithRevPoints.f65558c);
                        break;
                    default:
                        zC = ((jte.d) this.f169554b.f169555a).c(JuniorOnboardingApi$Toggles.JuniorPendingKyc.f76949c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.f169557c = w.y0(new Function0(this) { // from class: ixe.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f169554b;

            {
                this.f169554b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f169554b.f169555a).c(CardsCoreApi$Toggles.CardOrderDiscountsWithRevPoints.f65558c);
                        break;
                    default:
                        zC = ((jte.d) this.f169554b.f169555a).c(JuniorOnboardingApi$Toggles.JuniorPendingKyc.f76949c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }
}
