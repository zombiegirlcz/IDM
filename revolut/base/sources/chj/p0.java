package chj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import dej.j1;
import dfj.k4;
import dfj.t3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends gim.i implements Function1 {
    public final /* synthetic */ PaymentMethod A;
    public final /* synthetic */ dj0.d B;
    public final /* synthetic */ j1 C;
    public final /* synthetic */ Boolean D;
    public final /* synthetic */ String E;
    public final /* synthetic */ Long F;
    public final /* synthetic */ String G;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f24286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f24287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f24288y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(u0 u0Var, PaymentMethod paymentMethod, j1 j1Var, dj0.d dVar, Boolean bool, Long l2, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        super(1, continuation);
        this.u = 0;
        this.f24286w = u0Var;
        this.f24287x = str;
        this.f24288y = str2;
        this.z = str3;
        this.B = dVar;
        this.C = j1Var;
        this.D = bool;
        this.E = str4;
        this.F = l2;
        this.G = str5;
        this.A = paymentMethod;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                String str = this.G;
                return new p0(this.f24286w, this.A, this.C, this.B, this.D, this.F, this.f24287x, this.f24288y, this.z, this.E, str, continuation);
            case 1:
                return new p0(this.f24286w, this.f24287x, this.f24288y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, continuation, 1);
            case 2:
                return new p0(this.f24286w, this.f24287x, this.f24288y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, continuation, 2);
            default:
                return new p0(this.f24286w, this.f24287x, this.f24288y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p0) create(continuation)).invokeSuspend(Unit.f186387a);
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
                u0 u0Var = this.f24286w;
                t3 t3Var = u0Var.f24310n;
                j1 j1Var = this.C;
                k0 k0VarI3 = u0.i3(u0Var, this.A, j1Var != null ? j1Var.f113568a : null);
                this.v = 1;
                Object objI = ((k4) t3Var).i(this.f24287x, this.f24288y, this.z, this.B, j1Var, this.D, this.E, this.F, this.G, k0VarI3, this);
                return objI == aVar ? aVar : objI;
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
                this.v = 1;
                Object objM3 = u0.m3(this.f24286w, this.f24287x, this.f24288y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this);
                return objM3 == aVar2 ? aVar2 : objM3;
            case 2:
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
                this.f24286w.getClass();
                nii.c0 c0VarN3 = u0.n3(false);
                u0 u0Var2 = this.f24286w;
                String str = this.f24287x;
                a3b.i iVar = new a3b.i(u0Var2, str, 5);
                e0 e0Var = new e0(u0Var2, 3);
                p0 p0Var = new p0(u0Var2, str, this.f24288y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, null, 1);
                this.v = 1;
                Object objU = n14.k.U(u0Var2, c0VarN3, e0Var, iVar, p0Var, this);
                return objU == aVar3 ? aVar3 : objU;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                tji.f fVarQ2 = this.f24286w.q2();
                p0 p0Var2 = new p0(this.f24286w, this.f24287x, this.f24288y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, null, 2);
                this.v = 1;
                Object objB0 = zh9.u0.b0(fVarQ2, "ESIM_CHECKOUT_MAIN_BUTTON_LOADING_TAG", p0Var2, this);
                return objB0 == aVar4 ? aVar4 : objB0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(u0 u0Var, String str, String str2, String str3, PaymentMethod paymentMethod, dj0.d dVar, j1 j1Var, Boolean bool, String str4, Long l2, String str5, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f24286w = u0Var;
        this.f24287x = str;
        this.f24288y = str2;
        this.z = str3;
        this.A = paymentMethod;
        this.B = dVar;
        this.C = j1Var;
        this.D = bool;
        this.E = str4;
        this.F = l2;
        this.G = str5;
    }
}
