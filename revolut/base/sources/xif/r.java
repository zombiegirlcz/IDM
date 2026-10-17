package xif;

import com.revolut.feature.transactions.impl.data.network.TransactionsService;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f306375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f306376x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f306375w = sVar;
        this.f306376x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f306375w, this.f306376x, continuation, 0);
            default:
                return new r(this.f306375w, this.f306376x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f306376x;
        s sVar = this.f306375w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    d0<jif.a> d0VarRetryTransaction = sVar.f306377a.retryTransaction(str);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarRetryTransaction, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ((jif.a) obj2).getId();
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    TransactionsService transactionsService = sVar.f306377a;
                    TransactionsService.Companion companion = TransactionsService.INSTANCE;
                    d0<jif.e> d0VarRevertTransaction = transactionsService.revertTransaction(str, new Object());
                    this.v = 1;
                    obj2 = nim.a.b(d0VarRevertTransaction, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ((jif.e) obj2).getTransactionId();
        }
    }
}
