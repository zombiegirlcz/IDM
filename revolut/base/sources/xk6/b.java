package xk6;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.external_accounts.api.PseFeatureApi$Toggles$PseAuthorisation;
import com.revolut.feature.external_accounts.api.navigation.PseNavigation$Destination$AuthorisationRequest;
import com.revolut.feature.external_accounts.api.navigation.PseNavigation$Destination$VerificationCode;
import go.g;
import i49.c;
import j49.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oz1.j;
import wyd.f;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f306610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f306611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t12.c f306612c;

    public b(gte.a featureToggleInteractor, j interactor, t12.c mapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f306610a = featureToggleInteractor;
        this.f306611b = interactor;
        this.f306612c = mapper;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        return (obj2 instanceof ApmPaymentAuthorisationPendingAction) && ((ApmPaymentAuthorisationPendingAction) obj2).B3() == ApmPaymentAuthorisationPaymentMethod.PSE;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f306610a.a(PseFeatureApi$Toggles$PseAuthorisation.f72209c) ? new g(f0.f322471a, 2) : new f(this.f306611b.b(ApmPaymentAuthorisationPaymentMethod.PSE), this, 5);
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        Object obj2 = tVar.f54722b.f51596l;
        ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = obj2 instanceof ApmPaymentAuthorisationPendingAction ? (ApmPaymentAuthorisationPendingAction) obj2 : null;
        if (apmPaymentAuthorisationPendingAction == null || !Intrinsics.f(tVar.f54721a, ActionWidgetDelegate.a.c.f51609a)) {
            return j49.c.f171322a;
        }
        String str = apmPaymentAuthorisationPendingAction.getF61991a().f61992a;
        PaymentMethodDetails.Pse pseA = uk6.a.a(apmPaymentAuthorisationPendingAction);
        PaymentMethodDetails.Pse.ExecutionType executionType = pseA != null ? pseA.f : null;
        return new j49.b(((PaymentMethodDetails.Pse.ExecutionType.Otp) (executionType instanceof PaymentMethodDetails.Pse.ExecutionType.Otp ? executionType : null)) != null ? new PseNavigation$Destination$VerificationCode(str) : new PseNavigation$Destination$AuthorisationRequest(str));
    }
}
