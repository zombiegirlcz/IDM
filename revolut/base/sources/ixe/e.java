package ixe;

import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.junior_onboarding.api.JuniorOnboardingApi$Toggles;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f169550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jub.b f169551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f169552c;
    public final Object d;

    public e(gte.a featureToggleInteractor, jub.b revPointsNavBarMenuItemProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsNavBarMenuItemProvider, "revPointsNavBarMenuItemProvider");
        this.f169550a = featureToggleInteractor;
        this.f169551b = revPointsNavBarMenuItemProvider;
        final int i = 0;
        this.f169552c = w.y0(new Function0(this) { // from class: ixe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f169549b;

            {
                this.f169549b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f169549b.f169550a).c(CardsCoreApi$Toggles.CardOrderDiscountsWithRevPoints.f65558c);
                        break;
                    default:
                        zC = ((jte.d) this.f169549b.f169550a).c(JuniorOnboardingApi$Toggles.JuniorPendingKyc.f76949c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.d = w.y0(new Function0(this) { // from class: ixe.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f169549b;

            {
                this.f169549b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f169549b.f169550a).c(CardsCoreApi$Toggles.CardOrderDiscountsWithRevPoints.f65558c);
                        break;
                    default:
                        zC = ((jte.d) this.f169549b.f169550a).c(JuniorOnboardingApi$Toggles.JuniorPendingKyc.f76949c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }
}
