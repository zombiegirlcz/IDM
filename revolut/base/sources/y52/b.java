package y52;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$Destination;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType;
import j49.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oz1.j;
import uw1.c;
import vkm.q;
import vkm.v1;
import xge.f;
import y4f.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements q52.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f310979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f310980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t12.c f310981c;

    public b(c apmFeatureChecker, j interactor, t12.c mapper) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f310979a = apmFeatureChecker;
        this.f310980b = interactor;
        this.f310981c = mapper;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        return (obj2 instanceof ApmPaymentAuthorisationPendingAction) && ((ApmPaymentAuthorisationPendingAction) obj2).B3() == ApmPaymentAuthorisationPaymentMethod.IRIS;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Continuation continuation = null;
        return q.Q(new v1(new f(this, continuation, 27)), new o(continuation, this, 1));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        Object obj2 = tVar.f54722b.f51596l;
        ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = obj2 instanceof ApmPaymentAuthorisationPendingAction ? (ApmPaymentAuthorisationPendingAction) obj2 : null;
        return (apmPaymentAuthorisationPendingAction != null && Intrinsics.f(tVar.f54721a, ActionWidgetDelegate.a.c.f51609a)) ? new j49.b(new IrisNavigation$Destination(new IrisNavigation$StartType.Pay.PendingAction(apmPaymentAuthorisationPendingAction.getF61991a()), null, 2)) : j49.c.f171322a;
    }
}
