package l25;

import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f191645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f191646x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.v = uVar;
        this.f191645w = str;
        this.f191646x = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, this.f191645w, this.f191646x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        u uVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = u.e3(uVar, this.f191645w, this);
            if (obj2 == aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        ll4.t tVar = (ll4.t) obj2;
        if (tVar == null) {
            return uVar.A2(new TransferDestination.NewTransfer(y0.b(WhoToTransferFilter.Accounts.f79984a), new TransferDestinationParcel(new TransferMoneyPocket(null, new SourceAccount.Pocket(this.f191646x, io3.l.CREDIT, null, 4), 1)), g3a.e.BALANCE_TRANSFER_CREDIT_CARD));
        }
        x xVar = uVar.f191657y;
        String str = tVar.f196534b;
        Boolean bool = Boolean.FALSE;
        this.u = 2;
        Object objX1 = lg0.b.x1(xVar, str, null, bool, this, 2);
        return objX1 == aVar ? aVar : objX1;
    }
}
