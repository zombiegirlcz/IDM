package mn6;

import com.revolut.data.network.models.openbanking.AuthorizationRequestDto;
import com.revolut.data.network.models.openbanking.penny_verification.AccountInformationServiceUrlResponseDto;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$InputData;
import efm.d0;
import in6.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vf0.q;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ k A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f207374w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ExternalInstitution f207375x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ho3.a f207376y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, ExternalInstitution externalInstitution, ho3.a aVar, String str, k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f207374w = jVar;
        this.f207375x = externalInstitution;
        this.f207376y = aVar;
        this.z = str;
        this.A = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f207374w, this.f207375x, this.f207376y, this.z, this.A, continuation, 0);
            default:
                return new g(this.f207374w, this.f207375x, this.f207376y, this.z, this.A, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                j jVar = this.f207374w;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    oe6.a aVar2 = jVar.f207383l;
                    String institutionId = this.f207375x.f66107a;
                    ho3.a aVar3 = this.f207376y;
                    String str = aVar3 != null ? aVar3.f154218a : null;
                    PennyTopUpFlowContract$InputData pennyTopUpFlowContract$InputData = jVar.o;
                    String workflowId = pennyTopUpFlowContract$InputData.d;
                    String workflowStepId = pennyTopUpFlowContract$InputData.e;
                    xg6.j jVar2 = (xg6.j) aVar2;
                    jVar2.getClass();
                    Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                    Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                    Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
                    w21.o oVar = (w21.o) jVar2.f305582a;
                    Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                    Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                    Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
                    d0<AccountInformationServiceUrlResponseDto> accountInformationServiceAuthorisationUrl = oVar.f293931a.getAccountInformationServiceAuthorisationUrl(new AuthorizationRequestDto(institutionId, str, workflowStepId, null, Boolean.FALSE, null, null, null, 232, null));
                    w21.h hVar = w21.h.f;
                    q qVar = new q(17);
                    accountInformationServiceAuthorisationUrl.getClass();
                    ufm.f fVar = new ufm.f(new ufm.i(accountInformationServiceAuthorisationUrl, qVar, 1), new vz4.c(new sc7.b((Object) oVar, (Object) institutionId, (Object) str, (Object) workflowId, 25), 15), 3);
                    Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                    objB = nim.a.b(w.i0(fVar), this);
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                return n.j2(jVar, jVar.L2(jVar.f207384m.b(this.z)), null, new f(this.f207374w, this.z, (String) objB, this.A, null), 3);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar3 = this.f207374w;
                g gVar = new g(jVar3, this.f207375x, this.f207376y, this.z, this.A, null, 0);
                this.v = 1;
                Object objB2 = pu7.a.B(jVar3.e, "requestAuthorisationLink", gVar, this);
                return objB2 == aVar4 ? aVar4 : objB2;
        }
    }
}
