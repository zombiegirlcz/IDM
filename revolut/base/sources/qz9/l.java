package qz9;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import tof.u9;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f250431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatTransferRecipient f250432c;

    public /* synthetic */ l(n nVar, ChatTransferRecipient chatTransferRecipient, int i) {
        this.f250430a = i;
        this.f250431b = nVar;
        this.f250432c = chatTransferRecipient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f250430a) {
            case 0:
                m data = (m) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return this.f250431b.a(this.f250432c, data, null);
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                m mVar = (m) pair.f186385a;
                Long l2 = (Long) ((od0.i) pair.f186386b).g();
                n nVar = this.f250431b;
                return com.revolut.domain.interactors.transactions.a.d(nVar.f250435a, nVar.a(this.f250432c, mVar, l2), mVar.f250434b, null, TransactionsSort.STARTED_DATE_ASC, new TransactionContext(new Priority.HIGH("Payments - Chat"), null, 2), 4);
            default:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                od0.i iVar = (od0.i) pair2.f186385a;
                od0.i iVar2 = (od0.i) pair2.f186386b;
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {this.f250431b.b(this.f250432c), new u9(false), iVar.g(), iVar2.g()};
                cVar.getClass();
                return i7.c.a(i7VarArr);
        }
    }
}
