package chj;

import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f24251w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ EsimDataPlan f24252x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ dej.k f24253y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(u0 u0Var, EsimDataPlan esimDataPlan, dej.k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f24251w = u0Var;
        this.f24252x = esimDataPlan;
        this.f24253y = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0(this.f24251w, this.f24252x, this.f24253y, continuation, 0);
            default:
                return new g0(this.f24251w, this.f24252x, this.f24253y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g0) create(continuation)).invokeSuspend(Unit.f186387a);
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
                this.f24251w.getClass();
                nii.c0 c0VarN3 = u0.n3(false);
                u0 u0Var = this.f24251w;
                a3b.i iVar = new a3b.i(u0Var, this.f24252x, 4);
                e0 e0Var = new e0(u0Var, 0);
                f0 f0Var = new f0(u0Var, this.f24253y, null);
                this.v = 1;
                Object objU = n14.k.U(u0Var, c0VarN3, e0Var, iVar, f0Var, this);
                return objU == aVar ? aVar : objU;
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
                u0 u0Var2 = this.f24251w;
                tji.f fVarQ2 = u0Var2.q2();
                g0 g0Var = new g0(u0Var2, this.f24252x, this.f24253y, null, 0);
                this.v = 1;
                Object objB0 = zh9.u0.b0(fVarQ2, "ESIM_CHECKOUT_MAIN_BUTTON_LOADING_TAG", g0Var, this);
                return objB0 == aVar2 ? aVar2 : objB0;
        }
    }
}
