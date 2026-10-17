package mh2;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$Destination;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType;
import j49.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import li2.f;
import lr.l;
import oz1.j;
import uw1.c;
import vkm.q;
import vkm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements dh2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f205373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f205374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t12.c f205375c;

    public b(c apmFeatureChecker, j interactor, t12.c mapper) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f205373a = apmFeatureChecker;
        this.f205374b = interactor;
        this.f205375c = mapper;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        return (obj2 instanceof ApmPaymentAuthorisationPendingAction) && ((ApmPaymentAuthorisationPendingAction) obj2).B3() == ApmPaymentAuthorisationPaymentMethod.WERO;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return q.Q(new v1(new l(this, null)), new f(null, this, 28));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        Object obj2 = tVar.f54722b.f51596l;
        ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = obj2 instanceof ApmPaymentAuthorisationPendingAction ? (ApmPaymentAuthorisationPendingAction) obj2 : null;
        return (apmPaymentAuthorisationPendingAction != null && Intrinsics.f(tVar.f54721a, ActionWidgetDelegate.a.c.f51609a)) ? new j49.b(new WeroNavigation$Destination(new WeroNavigation$StartType.Pay.PendingAction(apmPaymentAuthorisationPendingAction.getF61991a()))) : j49.c.f171322a;
    }
}
