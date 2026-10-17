package chj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import dej.b3;
import dej.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.t1;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 extends gim.i implements Function1 {
    public final /* synthetic */ String A;
    public final /* synthetic */ EsimGiftRecipient B;
    public final /* synthetic */ dej.c C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ PaymentMethod G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ j1 K;
    public final /* synthetic */ Boolean L;
    public final /* synthetic */ dj0.d M;
    public final /* synthetic */ String N;
    public final /* synthetic */ Long O;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f24296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ EsimDataPlanOfferInfo f24297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l71.d f24298y;
    public final /* synthetic */ dej.m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(u0 u0Var, EsimDataPlanOfferInfo esimDataPlanOfferInfo, l71.d dVar, dej.m mVar, String str, EsimGiftRecipient esimGiftRecipient, dej.c cVar, String str2, String str3, String str4, PaymentMethod paymentMethod, String str5, String str6, boolean z, j1 j1Var, Boolean bool, dj0.d dVar2, String str7, Long l2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f24296w = u0Var;
        this.f24297x = esimDataPlanOfferInfo;
        this.f24298y = dVar;
        this.z = mVar;
        this.A = str;
        this.B = esimGiftRecipient;
        this.C = cVar;
        this.D = str2;
        this.E = str3;
        this.F = str4;
        this.G = paymentMethod;
        this.H = str5;
        this.I = str6;
        this.J = z;
        this.K = j1Var;
        this.L = bool;
        this.M = dVar2;
        this.N = str7;
        this.O = l2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r0(this.f24296w, this.f24297x, this.f24298y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, continuation, 0);
            default:
                return new r0(this.f24296w, this.f24297x, this.f24298y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
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
                nii.c0 c0VarN3 = u0.n3(false);
                final u0 u0Var = this.f24296w;
                final EsimDataPlanOfferInfo esimDataPlanOfferInfo = this.f24297x;
                final l71.d dVar = this.f24298y;
                final dej.m mVar = this.z;
                final String str = this.A;
                final EsimGiftRecipient esimGiftRecipient = this.B;
                final dej.c cVar = this.C;
                t1 t1Var = new t1() { // from class: chj.q0
                    @Override // nii.p1
                    public final nii.m0 a(Object obj3) {
                        b3 b3Var = (b3) obj3;
                        dej.t1 t1Var2 = b3Var.f113498a;
                        String str2 = t1Var2.f113650a;
                        EsimProfile esimProfile = b3Var.f113499b;
                        String str3 = str;
                        return u0.h3(u0Var, str2, esimProfile, esimDataPlanOfferInfo, dVar, mVar, str3, pd.b.j(str3 != null ? Boolean.valueOf(gj7.b.D(t1Var2, str3)) : null), esimGiftRecipient, cVar);
                    }
                };
                e0 e0Var = new e0(u0Var, 2);
                n0 n0Var = new n0(esimGiftRecipient, u0Var, this.D, this.E, this.F, this.G, this.H, this.I, esimDataPlanOfferInfo, this.J, this.K, this.L, this.M, this.N, this.O, str, cVar, (Continuation) null);
                this.v = 1;
                Object objS = n14.k.S(u0Var.q2(), c0VarN3, e0Var, t1Var, n0Var, this);
                return objS == aVar ? aVar : objS;
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
                u0 u0Var2 = this.f24296w;
                tji.f fVarQ2 = u0Var2.q2();
                r0 r0Var = new r0(u0Var2, this.f24297x, this.f24298y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, null, 0);
                this.v = 1;
                Object objB0 = zh9.u0.b0(fVarQ2, "ESIM_CHECKOUT_MAIN_BUTTON_LOADING_TAG", r0Var, this);
                return objB0 == aVar2 ? aVar2 : objB0;
        }
    }
}
