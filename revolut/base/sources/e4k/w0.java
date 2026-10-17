package e4k;

import com.revolut.feature.transfer.models.quotes.TransferAvailabilityReason;
import com.revolut.feature.wallets.api.module.WalletLimit;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class w0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ yof.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a f122643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c0 f122644x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(yof.b bVar, com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar, c0 c0Var, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f122643w = aVar;
        this.f122644x = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w0(this.v, this.f122643w, this.f122644x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar = this.f122643w;
        s5k.a aVar2 = aVar.f102087y;
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            yqi.b bVar = this.v.f315673b;
            if (bVar instanceof i1l.l) {
                ((s5k.d) aVar2).e3(((i1l.l) bVar).f157654a);
                return Unit.f186387a;
            }
            if (bVar instanceof i1l.k) {
                WalletLimit.CounterLimit counterLimit = ((i1l.k) bVar).f157653a.f154820a;
                if (counterLimit != null) {
                    ((s5k.d) aVar2).d3(counterLimit);
                } else {
                    r6.b.r("Limits for UAE must contain daily limit");
                }
                return Unit.f186387a;
            }
            if (bVar instanceof i1l.i) {
                TransferAvailabilityReason transferAvailabilityReason = ((i1l.i) bVar).f157652a;
                if (transferAvailabilityReason == null) {
                    return null;
                }
                ((s5k.d) aVar2).c3(transferAvailabilityReason);
                return Unit.f186387a;
            }
            if (bVar instanceof i1l.f) {
                ((s5k.d) aVar2).Z2();
                return Unit.f186387a;
            }
            if (bVar instanceof i1l.g) {
                i1l.g gVar = (i1l.g) bVar;
                ((s5k.d) aVar2).b3(gVar.f157649a, gVar.f157650b);
                return Unit.f186387a;
            }
            c0 c0Var = this.f122644x;
            if (c0Var instanceof b0) {
                b0 b0Var = (b0) c0Var;
                aVar.E.x(aVar.N.f(b0Var.f122575a, b0Var.f122576b, b0Var.f122577c, b0Var.d));
            } else {
                if (!(c0Var instanceof a0) && c0Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                n5k.b bVar2 = aVar.f102086x;
                n60.a aVar4 = aVar.F;
                this.u = 2;
                if (((n5k.p) bVar2).k3(aVar4, this) == aVar3) {
                    return aVar3;
                }
            }
        } else {
            if (i == 1) {
                yhm.o.b(obj2);
                kq2.a aVar5 = (kq2.a) aVar.F2().f122655a.getContent();
                if (aVar5 == null || (list = aVar5.f) == null) {
                    throw null;
                }
                list.contains(kq2.o.DIRECT_DEBIT_TOPUP);
                throw null;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
