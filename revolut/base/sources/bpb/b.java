package bpb;

import aed.o;
import com.revolut.domain.models.transactions.SavingsDirection;
import com.revolut.domain.models.transactions.SavingsTransactionLeg;
import efm.r;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k71.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pcd.q;
import tof.a3;
import ypg.f;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17570b;

    public /* synthetic */ b(d dVar, int i) {
        this.f17569a = i;
        this.f17570b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f17569a) {
            case 0:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                if (!transactions.isEmpty()) {
                    List list = transactions;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            if (k.z((a3) it8.next())) {
                            }
                        }
                    }
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (k.y1((a3) next, SavingsDirection.TOPUP, SavingsTransactionLeg.ALL)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    a3 a3Var = (a3) next;
                    if (a3Var != null) {
                        d dVar = this.f17570b;
                        f fVar = dVar.f17573c;
                        String transactionId = a3Var.f272581b;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        o oVar = (o) fVar.f315870a;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        r rVarW = nim.a.w(oVar.o.f(transactionId, true), new b(dVar, 1));
                        if (rVarW != null) {
                            return rVarW;
                        }
                    }
                    return zi0.c.j(Boolean.FALSE);
                }
                return zi0.c.j(Boolean.FALSE);
            default:
                q transactionMoneyBoxExtra = (q) obj2;
                Intrinsics.checkNotNullParameter(transactionMoneyBoxExtra, "transactionMoneyBoxExtra");
                LocalDateTime date = ((l80.f) this.f17570b.d).f();
                transactionMoneyBoxExtra.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                LocalDateTime localDateTime = transactionMoneyBoxExtra.f234878a;
                return Boolean.valueOf(localDateTime != null ? localDateTime.isAfter(date) : true);
        }
    }
}
