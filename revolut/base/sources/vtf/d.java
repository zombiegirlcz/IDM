package vtf;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import do3.n;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ TransferRequestApprovalData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f292110w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f292111x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TransferRequestApprovalData transferRequestApprovalData, f fVar, n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = transferRequestApprovalData;
        this.f292110w = fVar;
        this.f292111x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f292110w, this.f292111x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean zBooleanValue;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            TransferRequestApprovalData transferRequestApprovalData = this.v;
            if (transferRequestApprovalData instanceof TransferRequestApprovalData.GroupBillsApproval) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            if (!(transferRequestApprovalData instanceof TransferRequestApprovalData.MoneyRequestApproval)) {
                throw new NoWhenBranchMatchedException();
            }
            MoneyRequest moneyRequest = ((TransferRequestApprovalData.MoneyRequestApproval) transferRequestApprovalData).f92452b;
            n nVar = this.f292111x;
            Intrinsics.h(nVar);
            this.u = 1;
            obj2 = f.a(this.f292110w, moneyRequest, nVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        zBooleanValue = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }
}
