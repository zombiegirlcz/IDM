package nal;

import efm.d0;
import i9g.f0;
import k50.b2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import pfm.t;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f213932w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.shared.feature.suspicious_transaction.impl.flow.a f213933x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f213933x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f213933x, continuation, 0);
            default:
                return new j(this.f213933x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String transactionId;
        String transactionId2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f213932w;
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar2 = this.f213933x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    transactionId = aVar2.B.f104999a;
                    pal.a aVar3 = (pal.a) aVar2.f105004y;
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    ial.f fVar = (ial.f) aVar3.f234578a;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    t tVarL = fVar.f160059a.cancelSuspiciousTransactionViaDialog(transactionId).l(new i1i.a(fVar, 1));
                    Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                    r rVarG0 = w.g0(tVarL);
                    this.v = transactionId;
                    this.f213932w = 1;
                    if (nim.a.a(rVarG0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    transactionId = this.v;
                    yhm.o.b(obj2);
                }
                b2 b2Var = new b2(2, aVar2, com.revolut.shared.feature.suspicious_transaction.impl.flow.a.class, "onTransactionCanceled", "onTransactionCanceled(Ljava/lang/String;Lcom/revolut/core/model/money/Money;)V", 0, 9);
                this.v = null;
                this.f213932w = 2;
                if (com.revolut.shared.feature.suspicious_transaction.impl.flow.a.P2(aVar2, transactionId, b2Var, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f213932w;
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar5 = this.f213933x;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    transactionId2 = aVar5.B.f104999a;
                    pal.a aVar6 = (pal.a) aVar5.f105004y;
                    aVar6.getClass();
                    Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                    ial.f fVar2 = (ial.f) aVar6.f234578a;
                    fVar2.getClass();
                    Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                    d0<ral.n> d0VarConfirmSuspiciousTransactionViaDialog = fVar2.f160059a.confirmSuspiciousTransactionViaDialog(transactionId2, null);
                    f0 f0Var = new f0(26, new ial.a(fVar2, 2));
                    d0VarConfirmSuspiciousTransactionViaDialog.getClass();
                    ufm.i iVar = new ufm.i(d0VarConfirmSuspiciousTransactionViaDialog, f0Var, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    ufm.n nVarI0 = w.i0(iVar);
                    this.v = transactionId2;
                    this.f213932w = 1;
                    if (nim.a.b(nVarI0, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    transactionId2 = this.v;
                    yhm.o.b(obj2);
                }
                b2 b2Var2 = new b2(2, aVar5, com.revolut.shared.feature.suspicious_transaction.impl.flow.a.class, "onTransactionConfirmed", "onTransactionConfirmed(Ljava/lang/String;Lcom/revolut/core/model/money/Money;)V", 0, 10);
                this.v = null;
                this.f213932w = 2;
                if (com.revolut.shared.feature.suspicious_transaction.impl.flow.a.P2(aVar5, transactionId2, b2Var2, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f186387a;
        }
    }
}
