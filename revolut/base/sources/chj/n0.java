package chj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import dej.j1;
import dfj.k4;
import dfj.t3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 extends gim.i implements Function1 {
    public final /* synthetic */ PaymentMethod A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ EsimDataPlanOfferInfo D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ j1 F;
    public final /* synthetic */ Boolean G;
    public final /* synthetic */ dj0.d H;
    public final /* synthetic */ String I;
    public final /* synthetic */ Long J;
    public final /* synthetic */ String K;
    public final /* synthetic */ dej.c L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f24278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f24279x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f24280y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(u0 u0Var, PaymentMethod paymentMethod, j1 j1Var, String str, String str2, String str3, String str4, EsimDataPlanOfferInfo esimDataPlanOfferInfo, Boolean bool, String str5, boolean z, dj0.d dVar, String str6, Long l2, String str7, dej.c cVar, String str8, Continuation continuation) {
        super(1, continuation);
        this.f24278w = u0Var;
        this.A = paymentMethod;
        this.F = j1Var;
        this.f24279x = str;
        this.f24280y = str2;
        this.z = str3;
        this.B = str4;
        this.D = esimDataPlanOfferInfo;
        this.G = bool;
        this.C = str5;
        this.E = z;
        this.H = dVar;
        this.I = str6;
        this.J = l2;
        this.K = str7;
        this.L = cVar;
        this.M = str8;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n0(this.f24278w, this.A, this.F, this.f24279x, this.f24280y, this.z, this.B, this.D, this.G, this.C, this.E, this.H, this.I, this.J, this.K, this.L, (String) this.M, continuation);
            default:
                return new n0((EsimGiftRecipient) this.M, this.f24278w, this.f24279x, this.f24280y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        String strN;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u0 u0Var = this.f24278w;
                t3 t3Var = u0Var.f24310n;
                j1 j1Var = this.F;
                k0 k0VarI3 = u0.i3(u0Var, this.A, j1Var != null ? j1Var.f113568a : null);
                String str = (String) this.M;
                this.v = 1;
                Object objK = ((k4) t3Var).k(this.f24279x, this.f24280y, this.z, this.B, this.D, this.F, this.G, this.C, this.E, this.H, this.I, this.J, this.K, this.L, str, k0VarI3, this);
                return objK == aVar ? aVar : objK;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                EsimGiftRecipient esimGiftRecipient = (EsimGiftRecipient) this.M;
                u0 u0Var2 = this.f24278w;
                if (esimGiftRecipient != null) {
                    u0Var2.o.getClass();
                    strN = ugc.a.n(esimGiftRecipient);
                } else {
                    strN = null;
                }
                String str2 = strN;
                this.v = 1;
                Object objL3 = u0.l3(u0Var2, this.f24279x, this.f24280y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, str2, this);
                return objL3 == aVar2 ? aVar2 : objL3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(EsimGiftRecipient esimGiftRecipient, u0 u0Var, String str, String str2, String str3, PaymentMethod paymentMethod, String str4, String str5, EsimDataPlanOfferInfo esimDataPlanOfferInfo, boolean z, j1 j1Var, Boolean bool, dj0.d dVar, String str6, Long l2, String str7, dej.c cVar, Continuation continuation) {
        super(1, continuation);
        this.M = esimGiftRecipient;
        this.f24278w = u0Var;
        this.f24279x = str;
        this.f24280y = str2;
        this.z = str3;
        this.A = paymentMethod;
        this.B = str4;
        this.C = str5;
        this.D = esimDataPlanOfferInfo;
        this.E = z;
        this.F = j1Var;
        this.G = bool;
        this.H = dVar;
        this.I = str6;
        this.J = l2;
        this.K = str7;
        this.L = cVar;
    }
}
