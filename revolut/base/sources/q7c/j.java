package q7c;

import com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import k7c.f0;
import k7c.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import l6c.b;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements b6c.a {

    @NotNull
    public static final h Companion = new h();
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7c.b f242818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f242819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f242820c;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        d = kotlin.time.c.g(5, pkm.e.MINUTES);
    }

    public j(y7c.b paymentMethodsRepository, g0 paymentsRepository, zcc.b savePaymentForMapper, CoroutineScope appScope) {
        Intrinsics.checkNotNullParameter(paymentMethodsRepository, "paymentMethodsRepository");
        Intrinsics.checkNotNullParameter(paymentsRepository, "paymentsRepository");
        Intrinsics.checkNotNullParameter(savePaymentForMapper, "savePaymentForMapper");
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        this.f242818a = paymentMethodsRepository;
        this.f242819b = paymentsRepository;
        this.f242820c = appScope;
    }

    public final Object a(AcceptPaymentParams acceptPaymentParams, String str, String str2, o8c.b bVar) {
        g0 g0Var = this.f242819b;
        g0Var.getClass();
        i4g.d dVar = new i4g.d(25, g0Var, acceptPaymentParams, str, str2, null);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, dVar, bVar);
    }

    public final Object b(String str, gim.c cVar) throws Throwable {
        g0 g0Var = this.f242819b;
        g0Var.getClass();
        f0 f0Var = new f0(g0Var, str, null, 0);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, f0Var, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final Flow c(PaymentInitiationParams params, String str) {
        Intrinsics.checkNotNullParameter(params, "params");
        return vkm.q.q(new v1(new mp6.j(21, this, params, str, (Continuation) null)));
    }

    public final Object d(PaymentInitiationParams paymentInitiationParams, String str, gim.c cVar) {
        PaymentMethod paymentMethod = paymentInitiationParams.f84327b;
        s7c.a aVar = new s7c.a(paymentMethod, paymentInitiationParams.f84328c, zcc.b.a(paymentInitiationParams.d, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.e(paymentMethod)), str, paymentInitiationParams.f84329g, paymentInitiationParams.f84330h, paymentInitiationParams.i, paymentInitiationParams.e, paymentInitiationParams.f, paymentInitiationParams.f84331j, paymentInitiationParams.k);
        String str2 = paymentInitiationParams.f84326a;
        g0 g0Var = this.f242819b;
        g0Var.getClass();
        k0g.b bVar = new k0g.b(g0Var, str2, aVar, (Continuation) null, 18);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, bVar, cVar);
    }

    public final v1 e(String paymentToken) {
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        return vkm.q.R(vkm.q.q(zi0.c.L(this.f242819b.a(paymentToken), b.C1094b.f192385a, d)), new i(3, 0, null));
    }

    public final v1 f(String paymentToken) {
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        return vkm.q.R(vkm.q.q(zi0.c.L(this.f242819b.a(paymentToken), b.C1094b.f192385a, d)), new i(3, 1, null));
    }
}
