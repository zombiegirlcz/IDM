package e9d;

import com.revolut.feature.shared.help_centre.api.faq.model.TransactionTroubleshooterFilter;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f123969w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z zVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f123969w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f123969w, continuation, 0);
            case 1:
                return new x(this.f123969w, continuation, 1);
            default:
                return new x(this.f123969w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        List list;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    z zVar = this.f123969w;
                    lde.m mVar = zVar.f123973q;
                    TransactionTroubleshooterFilter transactionTroubleshooterFilter = zVar.f123972p.f86351c;
                    if (transactionTroubleshooterFilter instanceof TransactionTroubleshooterFilter.None) {
                        list = null;
                    } else {
                        if (!(transactionTroubleshooterFilter instanceof TransactionTroubleshooterFilter.Cards)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        list = ((TransactionTroubleshooterFilter.Cards) transactionTroubleshooterFilter).f86142a;
                    }
                    this.v = 1;
                    Object objEmit = mVar.e.emit(new lde.l(list), this);
                    if (objEmit != aVar) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
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
                z zVar2 = this.f123969w;
                y yVar = new y(zVar2, null, 0);
                this.v = 1;
                Object objP2 = zVar2.p2(this, yVar);
                return objP2 == aVar2 ? aVar2 : objP2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z zVar3 = this.f123969w;
                y yVar2 = new y(zVar3, null, 1);
                this.v = 1;
                Object objP22 = zVar3.p2(this, yVar2);
                return objP22 == aVar3 ? aVar3 : objP22;
        }
    }
}
