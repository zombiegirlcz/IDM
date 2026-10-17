package k3k;

import com.revolut.feature.transfer.models.quotes.TransferAvailabilityReason;
import com.revolut.feature.wallets.api.module.WalletLimit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ yof.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f180771w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(yof.b bVar, t0 t0Var, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f180771w = t0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i0(this.v, this.f180771w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t0 t0Var = this.f180771w;
        s5k.a aVar = t0Var.B;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            yqi.b bVar = this.v.f315673b;
            if (bVar instanceof i1l.l) {
                ((s5k.d) aVar).e3(((i1l.l) bVar).f157654a);
                return Unit.f186387a;
            }
            if (bVar instanceof i1l.k) {
                WalletLimit.CounterLimit counterLimit = ((i1l.k) bVar).f157653a.f154820a;
                if (counterLimit != null) {
                    ((s5k.d) aVar).d3(counterLimit);
                } else {
                    r6.b.r("Limits for UAE must contain daily limit");
                }
                return Unit.f186387a;
            }
            if (bVar instanceof i1l.g) {
                i1l.g gVar = (i1l.g) bVar;
                ((s5k.d) aVar).b3(gVar.f157649a, gVar.f157650b);
                return Unit.f186387a;
            }
            if (bVar instanceof i1l.i) {
                TransferAvailabilityReason transferAvailabilityReason = ((i1l.i) bVar).f157652a;
                if (transferAvailabilityReason == null) {
                    return null;
                }
                ((s5k.d) aVar).c3(transferAvailabilityReason);
                return Unit.f186387a;
            }
            n5k.b bVar2 = t0Var.A;
            n60.a aVar3 = t0Var.F;
            this.u = 2;
            if (((n5k.p) bVar2).k3(aVar3, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i == 1) {
                yhm.o.b(obj2);
                e3k.d dVar = t0Var.z2().f180807b;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                if (!(dVar instanceof e3k.b)) {
                    throw null;
                }
                ((e3k.b) dVar).f122337b.e.contains(kq2.o.DIRECT_DEBIT_TOPUP);
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
