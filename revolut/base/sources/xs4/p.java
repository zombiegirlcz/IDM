package xs4;

import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.r1;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c f308410w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f308410w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f308410w, continuation, 0);
            case 1:
                return new p(this.f308410w, continuation, 1);
            case 2:
                return new p(this.f308410w, continuation, 2);
            default:
                return new p(this.f308410w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        p pVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c cVar = this.f308410w;
                    CreditCardRepayDetailsControllerScreenContract$InputData creditCardRepayDetailsControllerScreenContract$InputData = cVar.o;
                    CreditCardRepayDetailsControllerScreenContract$InputData creditCardRepayDetailsControllerScreenContract$InputData2 = cVar.o;
                    al4.m mVar = cVar.f69489p;
                    int i2 = o.f308409a[creditCardRepayDetailsControllerScreenContract$InputData.d.ordinal()];
                    if (i2 == 1) {
                        String str = creditCardRepayDetailsControllerScreenContract$InputData2.f69478a;
                        String str2 = creditCardRepayDetailsControllerScreenContract$InputData2.f69479b;
                        this.v = 1;
                        if (((r1) mVar).q(str, str2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str3 = creditCardRepayDetailsControllerScreenContract$InputData2.f69478a;
                        String str4 = creditCardRepayDetailsControllerScreenContract$InputData2.f69479b;
                        this.v = 2;
                        if (al4.m.a(mVar, str3, str4, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c cVar2 = this.f308410w;
                    com.revolut.feature.credit.card.impl.ui.instalment.repay.details.b bVar = new com.revolut.feature.credit.card.impl.ui.instalment.repay.details.b(cVar2, null);
                    this.v = 1;
                    if (cVar2.p2(this, bVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c cVar3 = this.f308410w;
                    p pVar2 = new p(cVar3, null, 1);
                    this.v = 1;
                    if (ue8.c.f0(cVar3, pVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c cVar4 = this.f308410w;
                    lic.a aVar5 = new lic.a(cVar4, 28);
                    vkj.l lVar = new vkj.l(cVar4, 5);
                    p pVar3 = new p(cVar4, null, 2);
                    this.v = 1;
                    pVar = this;
                    obj2 = n14.k.T(cVar4, null, aVar5, lVar, pVar3, pVar);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    pVar = this;
                }
                if (((nii.h) obj2) instanceof nii.g) {
                    pVar.f308410w.C2(g.f308396a);
                }
                return Unit.f186387a;
        }
    }
}
