package kd8;

import com.revolut.feature.checkout.impl.resume.flow.ResumeCheckoutFlowContract$Step;
import com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.onboarding.impl.verifyaccount.flow.VerifyAccountPromptFlowContract$Step;
import com.revolut.feature.onboarding.impl.verifyaccount.screen.VerifyAccountPromptScreen;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182822a;

    public /* synthetic */ f(int i) {
        this.f182822a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f182822a) {
            case 0:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                throw new IllegalStateException("Can't show consent prompt. Consents prompts eligibility is null");
            case 1:
                Throwable error = (Throwable) obj2;
                lf8.a aVar = (lf8.a) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar == null) {
                    return error;
                }
                return null;
            case 2:
                Throwable error2 = (Throwable) obj2;
                psg.a aVar2 = (psg.a) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (aVar2 == null) {
                    return error2;
                }
                return null;
            case 3:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                throw new IllegalStateException("Can't show consent prompt. Consents track is null");
            case 4:
                Throwable error3 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 5:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                throw new IllegalStateException("Can't show consent prompt. Profile is null");
            case 6:
                Throwable error4 = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (juniorBankingProfile == null) {
                    return error4;
                }
                return null;
            case 7:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                throw new IllegalStateException("Junior profile not found for given juniorId");
            case 8:
                Throwable error5 = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile2 = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (juniorBankingProfile2 == null) {
                    return error5;
                }
                return null;
            case 9:
                Throwable error6 = (Throwable) obj2;
                xc8.g gVar = (xc8.g) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (gVar == null) {
                    return error6;
                }
                return null;
            case 10:
                yki.l FlowCoordinator = (yki.l) obj2;
                VerifyAccountPromptFlowContract$Step step = (VerifyAccountPromptFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof VerifyAccountPromptFlowContract$Step.VerifyAccountPrompt) {
                    return new VerifyAccountPromptScreen(((VerifyAccountPromptFlowContract$Step.VerifyAccountPrompt) step).f78596a);
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                Intrinsics.checkNotNullParameter((ng6.b) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((OutboundPaymentBreakdown) obj3, "<unused var>");
                return Unit.f186387a;
            case 12:
                Throwable th10 = (Throwable) obj2;
                if (((com.revolut.domain.models.topup.methods.b) obj3) == null) {
                    return th10;
                }
                return null;
            case 13:
                Throwable error7 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list2 == null) {
                    return error7;
                }
                return null;
            case 14:
                Throwable th11 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue() || th11 == null) {
                    return null;
                }
                return zhm.u.c(rdh.b.PRIVATE_MARKETS_RISK_WARNING);
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 16:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 17:
                Throwable error8 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (pair == null) {
                    return error8;
                }
                return null;
            case 18:
                Throwable error9 = (Throwable) obj2;
                dda.a aVar3 = (dda.a) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (aVar3 == null) {
                    return error9;
                }
                return null;
            case 19:
                return Unit.f186387a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                ResumeCheckoutFlowContract$Step step2 = (ResumeCheckoutFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, ResumeCheckoutFlowContract$Step.Checkout.f65837a)) {
                    throw new NotImplementedError("An operation is not implemented: OBTU-7065: Use CheckoutFlow after full migration");
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 25:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new kk9.k(null, (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null)), null, null);
            case 26:
                Throwable error10 = (Throwable) obj2;
                String str = (String) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (str == null) {
                    return error10;
                }
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 28:
                Throwable error11 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (list3 == null) {
                    return error11;
                }
                return null;
            default:
                Throwable error12 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (list4 == null) {
                    return error12;
                }
                return null;
        }
    }
}
