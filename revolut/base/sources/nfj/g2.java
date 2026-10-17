package nfj;

import com.revolut.retail.feature.esim.api.model.EsimContractMetadata;
import com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsService;
import dej.a3;
import dej.j3;
import java.io.Serializable;
import kfj.k3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class g2 extends gim.i implements Function2 {
    public Object A;
    public Object B;
    public Serializable C;
    public /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int u = 0;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f214949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f214950x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f214951y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(s2 s2Var, dj0.d dVar, dej.r1 r1Var, EsimContractMetadata esimContractMetadata, String str, String str2, boolean z, String str3, Continuation continuation) {
        super(2, continuation);
        this.f214951y = s2Var;
        this.z = dVar;
        this.A = r1Var;
        this.B = esimContractMetadata;
        this.C = str;
        this.D = str2;
        this.v = z;
        this.E = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g2((s2) this.f214951y, (dj0.d) this.z, (dej.r1) this.A, (EsimContractMetadata) this.B, (String) this.C, (String) this.D, this.v, (String) this.E, continuation);
            default:
                g2 g2Var = new g2((nv6.s) this.E, continuation);
                g2Var.D = obj2;
                return g2Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g2) create((vf0.x) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objPostSubscriptionChanges;
        rr6.m mVar;
        Object objA;
        rr6.g gVar;
        rr6.j jVar;
        whf.p pVar;
        od0.i iVar;
        boolean z;
        rr6.n nVar;
        switch (this.u) {
            case 0:
                s2 s2Var = (s2) this.f214951y;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f214949w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    EsimSubscriptionsService esimSubscriptionsService = s2Var.f215038a;
                    jo3.a aVarP = mo3.a.p((dj0.d) this.z);
                    dej.r1 r1Var = (dej.r1) this.A;
                    String str = r1Var != null ? r1Var.f113637a : null;
                    String str2 = r1Var != null ? r1Var.f113638b : null;
                    EsimContractMetadata esimContractMetadata = (EsimContractMetadata) this.B;
                    lfj.u uVar = new lfj.u((String) this.C, (String) this.D, this.v, null, aVarP, str, str2, null, null, ffj.a.a(esimContractMetadata != null ? esimContractMetadata.f100203b : null, esimContractMetadata != null ? esimContractMetadata.f100202a : null));
                    String str3 = (String) this.E;
                    this.f214950x = s2Var;
                    this.f214949w = 1;
                    objPostSubscriptionChanges = esimSubscriptionsService.postSubscriptionChanges(uVar, str3, this);
                    if (objPostSubscriptionChanges == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s2Var = (s2) this.f214950x;
                    yhm.o.b(obj2);
                    objPostSubscriptionChanges = obj2;
                }
                Response response = (Response) objPostSubscriptionChanges;
                nd8.i iVar2 = new nd8.i(19);
                s2Var.getClass();
                e2 e2VarE = s2.e(response, iVar2);
                Object objBody = response.body();
                if (objBody == null) {
                    throw new HttpException(response);
                }
                dej.t1 t1VarD = ofj.p.d(((k3) objBody).getSubscription());
                if (t1VarD.f113651b != j3.FAILED) {
                    return new a3(t1VarD, e2VarE.f214939a, e2VarE.f214940b);
                }
                throw new IllegalStateException("Subscription purchase state is FAILED");
            default:
                vf0.x xVar = (vf0.x) this.D;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f214949w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    rr6.j jVar2 = (rr6.j) xVar.f288487a;
                    rr6.g gVar2 = (rr6.g) xVar.f288488b;
                    mVar = (rr6.m) xVar.f288489c;
                    rr6.n nVar2 = (rr6.n) xVar.d;
                    od0.i iVar3 = (od0.i) xVar.e;
                    boolean zBooleanValue = ((Boolean) xVar.f).booleanValue();
                    whf.p pVar2 = (whf.p) xVar.f288490g;
                    et6.u0 u0Var = ((nv6.s) this.E).f219532p;
                    this.D = null;
                    this.f214950x = jVar2;
                    this.f214951y = gVar2;
                    this.z = mVar;
                    this.A = nVar2;
                    this.B = iVar3;
                    this.C = pVar2;
                    this.v = zBooleanValue;
                    this.f214949w = 1;
                    objA = u0Var.a(this);
                    if (objA == aVar2) {
                        return aVar2;
                    }
                    gVar = gVar2;
                    jVar = jVar2;
                    pVar = pVar2;
                    iVar = iVar3;
                    z = zBooleanValue;
                    nVar = nVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = this.v;
                    whf.p pVar3 = (whf.p) this.C;
                    od0.i iVar4 = (od0.i) this.B;
                    rr6.n nVar3 = (rr6.n) this.A;
                    mVar = (rr6.m) this.z;
                    rr6.g gVar3 = (rr6.g) this.f214951y;
                    rr6.j jVar3 = (rr6.j) this.f214950x;
                    yhm.o.b(obj2);
                    gVar = gVar3;
                    jVar = jVar3;
                    z = z3;
                    pVar = pVar3;
                    iVar = iVar4;
                    nVar = nVar3;
                    objA = obj2;
                }
                return new nv6.k(jVar, gVar, mVar, nVar, z, iVar, pVar, ((Boolean) objA).booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(nv6.s sVar, Continuation continuation) {
        super(2, continuation);
        this.E = sVar;
    }
}
