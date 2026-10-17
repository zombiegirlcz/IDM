package ku1;

import com.revolut.feature.apm.blik.impl.ui.confirmation.BlikConfirmationScreenContract$InputData;
import com.revolut.feature.apm.blik.impl.ui.confirmation.InvalidPendingTransactionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f189621b;

    public /* synthetic */ p(e0 e0Var, int i) {
        this.f189620a = i;
        this.f189621b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws InvalidPendingTransactionState {
        c02.j jVar;
        Object next;
        switch (this.f189620a) {
            case 0:
                g1j.b outputData = (g1j.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData == null) {
                    throw new NoWhenBranchMatchedException();
                }
                j1j.d dVar = outputData.f139686a;
                e0 e0Var = this.f189621b;
                e0Var.l2(new knd.h0(e0Var, dVar.f170617a, dVar.f170619c, null, 12), new yi5.b(26));
                return Unit.f186387a;
            default:
                BlikConfirmationScreenContract$InputData blikConfirmationScreenContract$InputData = this.f189621b.f189600p;
                List list = (List) obj2;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar = rd0.c.INFO;
                Intrinsics.h(list);
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((c02.j) it8.next()).f20114a);
                }
                rd0.d.b(cVar, "APM-BLIK", "Blik Confirmation Screen: tx: " + arrayList, null, null, 16);
                if (blikConfirmationScreenContract$InputData.f61670a != null) {
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((c02.j) next).f20114a, blikConfirmationScreenContract$InputData.f61670a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    jVar = (c02.j) next;
                    if (jVar == null) {
                        throw InvalidPendingTransactionState.f61671a;
                    }
                } else {
                    jVar = (c02.j) zhm.d0.d0(list);
                    if (jVar == null) {
                        throw InvalidPendingTransactionState.f61671a;
                    }
                }
                return jVar;
        }
    }
}
