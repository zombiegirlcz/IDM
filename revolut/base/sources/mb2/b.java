package mb2;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.payto.api.navigation.PayToConfirmationWithPendingActionDestination;
import j49.i;
import jla.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m2f.b0;
import oz1.j;
import vkm.v1;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements i49.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f204056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f204057b;

    public b(h productCatalogueInteractor, j apmPaymentsAuthorisationsPendingActionInteractor, c payToPendingActionsMapper) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsPendingActionInteractor, "apmPaymentsAuthorisationsPendingActionInteractor");
        Intrinsics.checkNotNullParameter(payToPendingActionsMapper, "payToPendingActionsMapper");
        this.f204056a = productCatalogueInteractor;
        this.f204057b = apmPaymentsAuthorisationsPendingActionInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = obj2 instanceof ApmPaymentAuthorisationPendingAction ? (ApmPaymentAuthorisationPendingAction) obj2 : null;
        return (apmPaymentAuthorisationPendingAction != null ? apmPaymentAuthorisationPendingAction.B3() : null) == ApmPaymentAuthorisationPaymentMethod.PAY_TO;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new v1(new b0(this, (Continuation) null, 13));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
            Object obj2 = tVar.f54722b.f51596l;
            ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = obj2 instanceof ApmPaymentAuthorisationPendingAction ? (ApmPaymentAuthorisationPendingAction) obj2 : null;
            if (apmPaymentAuthorisationPendingAction != null) {
                return new j49.b(new PayToConfirmationWithPendingActionDestination(apmPaymentAuthorisationPendingAction));
            }
        } else if (!Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a) && !Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a) && !Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a) && !(aVar instanceof com.revolut.core.ui_kit.delegates.h)) {
            throw new NoWhenBranchMatchedException();
        }
        return j49.c.f171322a;
    }
}
