package q4k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.q;
import wkm.l;
import yhm.o;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BankTransferData f242185w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f5j.a f242186x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, BankTransferData bankTransferData, f5j.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f242185w = bankTransferData;
        this.f242186x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f242185w, this.f242186x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        f4h.a aVar2 = this.v.f242193m;
        TransferFlowType.Default r110 = TransferFlowType.Default.f92257b;
        l lVarN = aVar2.n(this.f242185w, this.f242186x, f0.f322471a, h0.f322473a);
        this.u = 1;
        Object objX = q.x(lVarN, this);
        return objX == aVar ? aVar : objX;
    }
}
