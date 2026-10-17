package chj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsService;
import dej.a3;
import dej.j1;
import dej.j3;
import dej.t1;
import kfj.m2;
import kfj.q3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nfj.e2;
import nfj.s2;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ Boolean C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dj0.d f24304w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j1 f24305x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Long f24306y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, PaymentMethod paymentMethod, j1 j1Var, dj0.d dVar, Boolean bool, Long l2, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        super(2, continuation);
        this.F = u0Var;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.G = paymentMethod;
        this.f24304w = dVar;
        this.f24305x = j1Var;
        this.C = bool;
        this.D = str4;
        this.f24306y = l2;
        this.E = str5;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t0((u0) this.F, (PaymentMethod) this.G, this.f24305x, this.f24304w, this.C, this.f24306y, this.z, this.A, this.B, this.D, this.E, continuation);
            default:
                return new t0((s2) this.G, this.f24304w, this.f24305x, this.f24306y, this.z, this.A, this.B, this.C, this.D, this.E, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objU;
        Object objPostResubscription;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    u0 u0Var = (u0) this.F;
                    p0 p0Var = new p0(u0Var, this.z, this.A, this.B, (PaymentMethod) this.G, this.f24304w, this.f24305x, this.C, this.D, this.f24306y, this.E, null, 3);
                    this.v = 1;
                    objU = do3.q.u(u0Var, p0Var, this);
                    if (objU == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objU = obj2;
                }
                u0.j3((u0) this.F, (nii.h) objU);
                return Unit.f186387a;
            default:
                s2 s2Var = (s2) this.G;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    EsimSubscriptionsService esimSubscriptionsService = s2Var.f215038a;
                    dj0.d dVar = this.f24304w;
                    jo3.a aVarP = dVar != null ? mo3.a.p(dVar) : null;
                    j1 j1Var = this.f24305x;
                    m2 m2Var = j1Var != null ? new m2(j1Var.f113568a, mo3.a.p(j1Var.f113569b), ksj.b.K(j1Var.f113570c)) : null;
                    lfj.r rVar = new lfj.r(this.A, this.B, m2Var, this.C, aVarP, ffj.a.a(this.f24306y, this.z));
                    this.F = s2Var;
                    this.v = 1;
                    objPostResubscription = esimSubscriptionsService.postResubscription(this.D, rVar, this.E, this);
                    if (objPostResubscription == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s2Var = (s2) this.F;
                    yhm.o.b(obj2);
                    objPostResubscription = obj2;
                }
                Response response = (Response) objPostResubscription;
                nd8.i iVar = new nd8.i(19);
                s2Var.getClass();
                e2 e2VarE = s2.e(response, iVar);
                Object objBody = response.body();
                if (objBody == null) {
                    throw new HttpException(response);
                }
                t1 t1VarD = ofj.p.d((q3) objBody);
                if (t1VarD.f113651b != j3.FAILED) {
                    return new a3(t1VarD, e2VarE.f214939a, e2VarE.f214940b);
                }
                throw new IllegalStateException("Subscription purchase state is FAILED");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(s2 s2Var, dj0.d dVar, j1 j1Var, Long l2, String str, String str2, String str3, Boolean bool, String str4, String str5, Continuation continuation) {
        super(2, continuation);
        this.G = s2Var;
        this.f24304w = dVar;
        this.f24305x = j1Var;
        this.f24306y = l2;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = bool;
        this.D = str4;
        this.E = str5;
    }
}
