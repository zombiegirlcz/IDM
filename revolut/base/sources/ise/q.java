package ise;

import com.revolut.data.network.models.threedstransactions.ThreeDSUpdateDto;
import com.revolut.domain.models.transactions.DeclineReason;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.three_ds_verification.impl.ui.sceen.d f168231w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ThreeDSTransaction f168232x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar, ThreeDSTransaction threeDSTransaction, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f168231w = dVar;
        this.f168232x = threeDSTransaction;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f168231w, this.f168232x, continuation, 0);
            case 1:
                return new q(this.f168231w, this.f168232x, continuation, 1);
            default:
                return new q(this.f168231w, this.f168232x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                ThreeDSTransaction transaction = this.f168232x;
                com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar = this.f168231w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    h61.c cVar = dVar.o;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    d31.c cVar2 = cVar.f149584a;
                    mm0.e eVarA = cVar.a();
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    pfm.r rVarG0 = te0.w.g0(cVar2.f110897a.update3DSTransaction(new ThreeDSUpdateDto(transaction.f60534a, false, transaction.f60540l, eVarA != null ? d31.c.a(eVarA) : null, null, null)));
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dVar.f90431s.a(transaction.f60534a);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    h61.c cVar3 = this.f168231w.o;
                    cVar3.getClass();
                    ThreeDSTransaction transaction2 = this.f168232x;
                    Intrinsics.checkNotNullParameter(transaction2, "transaction");
                    d31.c cVar4 = cVar3.f149584a;
                    mm0.e eVarA2 = cVar3.a();
                    Intrinsics.checkNotNullParameter(transaction2, "transaction");
                    qr0.i iVar = cVar4.f110898b;
                    String transactionId = transaction2.f60534a;
                    long j2 = transaction2.f;
                    String currency = transaction2.f60537g;
                    String merchantName = transaction2.k;
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Intrinsics.checkNotNullParameter(merchantName, "merchantName");
                    String strB0 = kotlin.text.d0.b0(((bm0.a) iVar.f248595b).b(transactionId + Math.abs(j2) + currency + merchantName), 64, '0');
                    String str = transaction2.f60534a;
                    String str2 = transaction2.f60540l;
                    String strA = eVarA2 != null ? d31.c.a(eVarA2) : null;
                    List list = transaction2.f60544q;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((DeclineReason) it8.next()).d);
                    }
                    pfm.r rVarG02 = te0.w.g0(cVar4.f110897a.update3DSTransaction(new ThreeDSUpdateDto(str, true, str2, strA, strB0, arrayList)));
                    this.v = 1;
                    if (nim.a.a(rVarG02, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                ThreeDSTransaction threeDSTransaction = this.f168232x;
                com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar2 = this.f168231w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    q qVar = new q(dVar2, threeDSTransaction, null, 1);
                    this.v = 1;
                    if (do3.q.t(dVar2, qVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dVar2.f90431s.a(threeDSTransaction.f60534a);
                dVar2.C2(new l0(threeDSTransaction));
                return Unit.f186387a;
        }
    }
}
