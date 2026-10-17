package uwe;

import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$InputData;
import exe.p;
import kotlin.jvm.internal.Intrinsics;
import nyb.k;
import qwe.s;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutFlowContract$InputData f283641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final twe.a f283642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f283643c;
    public final sh3.a d;
    public final zwe.a e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mt8.d f283644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q89.e f283645h;
    public final rwe.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f283646j;
    public final k k;

    public g(CheckoutFlowContract$InputData inputData, twe.a checkoutTargetMapper, p checkoutOrderDelegate, sh3.a checkoutInteractor, zwe.a postActivationInteractor, n walletInteractor, mt8.d kycInteractor, q89.e onboardingInteractor, ixe.a checkoutCardPlanMapper, rwe.a checkoutSelectedExtraTopUpAmountDelegate, s checkoutSelectedLoyaltyQuoteDelegate, k revPointsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(checkoutTargetMapper, "checkoutTargetMapper");
        Intrinsics.checkNotNullParameter(checkoutOrderDelegate, "checkoutOrderDelegate");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(postActivationInteractor, "postActivationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(checkoutCardPlanMapper, "checkoutCardPlanMapper");
        Intrinsics.checkNotNullParameter(checkoutSelectedExtraTopUpAmountDelegate, "checkoutSelectedExtraTopUpAmountDelegate");
        Intrinsics.checkNotNullParameter(checkoutSelectedLoyaltyQuoteDelegate, "checkoutSelectedLoyaltyQuoteDelegate");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        this.f283641a = inputData;
        this.f283642b = checkoutTargetMapper;
        this.f283643c = checkoutOrderDelegate;
        this.d = checkoutInteractor;
        this.e = postActivationInteractor;
        this.f = walletInteractor;
        this.f283644g = kycInteractor;
        this.f283645h = onboardingInteractor;
        this.i = checkoutSelectedExtraTopUpAmountDelegate;
        this.f283646j = checkoutSelectedLoyaltyQuoteDelegate;
        this.k = revPointsInteractor;
    }
}
