package oz1;

import ahe.m0;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import j02.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ox5.d0;
import ox5.t0;
import skm.e0;
import skm.p0;
import vkm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vz1.g f231111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iz1.j f231112b;

    public j(vz1.g apmPaymentsAuthorisationsRepository, iz1.j apmPaymentAuthorisationsAmendmentRepository) {
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        Intrinsics.checkNotNullParameter(apmPaymentAuthorisationsAmendmentRepository, "apmPaymentAuthorisationsAmendmentRepository");
        this.f231111a = apmPaymentsAuthorisationsRepository;
        this.f231112b = apmPaymentAuthorisationsAmendmentRepository;
    }

    public final Object a(ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod, ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction, j02.f fVar, gim.c cVar) throws Throwable {
        e eVar = new e(apmPaymentAuthorisationPendingAction, this, fVar, apmPaymentAuthorisationPaymentMethod, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, eVar, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public final t38.e b(ApmPaymentAuthorisationPaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        vz1.g gVar = this.f231111a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Continuation continuation = null;
        jhi.b bVarG = mo3.a.g(gVar.f293365c.b(paymentMethod, w4l.i.f294643c), null, new d0(18), 1);
        int i = 3;
        otd.a aVar = new otd.a(i, 3, continuation);
        h0 h0Var = h0.f322473a;
        return new t38.e(new m0(rd0.e.e(bVarG, h0Var, aVar), 16), 24, rd0.e.e(new v1(new of6.d(this, paymentMethod, continuation, 11)), h0Var, new otd.a(i, 2, continuation)), new g(3, null));
    }

    public final Flow c(String id10, n type, ApmPaymentAuthorisationPaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        int i = d.f231103a[type.ordinal()];
        if (i == 1) {
            return nim.a.v(this.f231111a.b(id10), new t0(24));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return rd0.e.e(nim.a.v(new v1(new mp6.j(this, id10, paymentMethod, (Continuation) null, 12)), new t0(25)), h0.f322473a, new h(3, null));
    }

    public final Object d(ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod, ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction, gim.c cVar) throws Throwable {
        i iVar = new i(apmPaymentAuthorisationPendingAction, this, apmPaymentAuthorisationPaymentMethod, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, iVar, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
