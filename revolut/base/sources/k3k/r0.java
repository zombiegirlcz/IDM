package k3k;

import ael.u0;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 extends gim.i implements Function1 {
    public final /* synthetic */ AccountId A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ k1j.a D;
    public RemittanceTransferData u;
    public FundingSource v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f180786w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xi0.b f180787x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f180788y;
    public final /* synthetic */ t0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, AccountId accountId, String str, String str2, k1j.a aVar, Continuation continuation) {
        super(1, continuation);
        this.z = t0Var;
        this.A = accountId;
        this.B = str;
        this.C = str2;
        this.D = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r0(this.z, this.A, this.B, this.C, this.D, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RemittanceTransferData remittanceTransferDataA2;
        Object objB;
        Object objE;
        xi0.b bVar;
        xi0.b bVar2;
        FundingSource fundingSource;
        r0 r0Var = this;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = r0Var.f180788y;
        t0 t0Var = r0Var.z;
        if (i == 0) {
            yhm.o.b(obj2);
            remittanceTransferDataA2 = t0Var.A2();
            o3k.g gVar = t0Var.f180793q;
            r0Var.u = remittanceTransferDataA2;
            r0Var.f180788y = 1;
            objB = gVar.b(r0Var.A, r0Var.B, r0Var.C, r0Var.D, r0Var);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xi0.b bVar3 = r0Var.f180787x;
            xi0.b bVar4 = r0Var.f180786w;
            FundingSource fundingSource2 = r0Var.v;
            yhm.o.b(obj2);
            bVar = bVar3;
            bVar2 = bVar4;
            fundingSource = fundingSource2;
            objE = obj2;
            t0Var.B2(new u0(t0Var, fundingSource, bVar, bVar2, r0Var.A, (RemittanceRouteId) objE, 4));
            return Unit.f186387a;
        }
        RemittanceTransferData remittanceTransferData = r0Var.u;
        yhm.o.b(obj2);
        remittanceTransferDataA2 = remittanceTransferData;
        objB = obj2;
        FundingSource fundingSource3 = (FundingSource) objB;
        xi0.b bVar5 = fundingSource3.f92241b;
        xi0.b.Companion.getClass();
        xi0.b bVarA = xi0.a.a(r0Var.C);
        o3k.g gVar2 = t0Var.f180793q;
        long j2 = remittanceTransferDataA2.f102049a;
        kq2.c cVar = remittanceTransferDataA2.k;
        RemittanceRouteId remittanceRouteId = remittanceTransferDataA2.f102054j;
        String strP = czi.c.p(fundingSource3);
        r0Var.u = null;
        r0Var.v = fundingSource3;
        r0Var.f180786w = bVar5;
        r0Var.f180787x = bVarA;
        r0Var.f180788y = 2;
        objE = gVar2.e(bVarA, bVar5, j2, cVar, remittanceRouteId, r0Var.A, strP, r0Var);
        r0Var = r0Var;
        if (objE != aVar) {
            bVar = bVarA;
            bVar2 = bVar5;
            fundingSource = fundingSource3;
            t0Var.B2(new u0(t0Var, fundingSource, bVar, bVar2, r0Var.A, (RemittanceRouteId) objE, 4));
            return Unit.f186387a;
        }
        return aVar;
    }
}
