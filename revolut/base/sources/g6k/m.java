package g6k;

import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferRequestApprovalData.MoneyRequestApproval f140998w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, TransferRequestApprovalData.MoneyRequestApproval moneyRequestApproval, Continuation continuation) {
        super(1, continuation);
        this.v = rVar;
        this.f140998w = moneyRequestApproval;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f140998w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        ufm.i iVarB = ((vtf.f) this.v.f141006l).b(this.f140998w);
        this.u = 1;
        Object objB = nim.a.b(iVarB, this);
        return objB == aVar ? aVar : objB;
    }
}
