package chj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimContractMetadata;
import dej.r1;
import dfj.k4;
import dfj.t3;
import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 extends gim.i implements Function1 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ dj0.d C;
    public final /* synthetic */ EsimContractMetadata D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ String F;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f24262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f24263x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Instant f24264y;
    public final /* synthetic */ r1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(u0 u0Var, dej.e eVar, Instant instant, r1 r1Var, String str, String str2, dj0.d dVar, EsimContractMetadata esimContractMetadata, boolean z, String str3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f24262w = u0Var;
        this.f24263x = eVar;
        this.f24264y = instant;
        this.z = r1Var;
        this.A = str;
        this.B = str2;
        this.C = dVar;
        this.D = esimContractMetadata;
        this.E = z;
        this.F = str3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j0(this.f24262w, (dej.e) this.f24263x, this.f24264y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, continuation, 0);
            case 1:
                return new j0(this.f24262w, (dej.e) this.f24263x, this.f24264y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, continuation, 1);
            default:
                return new j0(this.f24262w, this.f24264y, this.A, this.B, this.z, this.C, this.E, this.D, this.F, (PaymentMethod) this.f24263x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
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
                this.f24262w.getClass();
                nii.c0 c0VarN3 = u0.n3(false);
                u0 u0Var = this.f24262w;
                Instant instant = this.f24264y;
                h0 h0Var = new h0(u0Var, (dej.e) this.f24263x, instant, 0);
                e0 e0Var = new e0(u0Var, 1);
                i0 i0Var = new i0(this.z, u0Var, instant, this.A, this.B, this.C, this.D, this.E, this.F, null);
                this.v = 1;
                Object objU = n14.k.U(u0Var, c0VarN3, e0Var, h0Var, i0Var, this);
                return objU == aVar ? aVar : objU;
            case 1:
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
                tji.f fVarQ2 = this.f24262w.q2();
                j0 j0Var = new j0(this.f24262w, (dej.e) this.f24263x, this.f24264y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, null, 0);
                this.v = 1;
                Object objB0 = zh9.u0.b0(fVarQ2, "ESIM_CHECKOUT_MAIN_BUTTON_LOADING_TAG", j0Var, this);
                return objB0 == aVar2 ? aVar2 : objB0;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u0 u0Var2 = this.f24262w;
                t3 t3Var = u0Var2.f24310n;
                k0 k0VarI3 = u0.i3(u0Var2, (PaymentMethod) this.f24263x, null);
                this.v = 1;
                Object objE = ((k4) t3Var).e(this.f24264y, this.A, this.B, this.z, this.C, this.E, this.D, this.F, k0VarI3, this);
                return objE == aVar3 ? aVar3 : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(u0 u0Var, Instant instant, String str, String str2, r1 r1Var, dj0.d dVar, boolean z, EsimContractMetadata esimContractMetadata, String str3, PaymentMethod paymentMethod, Continuation continuation) {
        super(1, continuation);
        this.u = 2;
        this.f24262w = u0Var;
        this.f24264y = instant;
        this.A = str;
        this.B = str2;
        this.z = r1Var;
        this.C = dVar;
        this.E = z;
        this.D = esimContractMetadata;
        this.F = str3;
        this.f24263x = paymentMethod;
    }
}
