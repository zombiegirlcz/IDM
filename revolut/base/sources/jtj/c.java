package jtj;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IncomeSorterParams f178513b;

    public /* synthetic */ c(IncomeSorterParams incomeSorterParams, int i) {
        this.f178512a = i;
        this.f178513b = incomeSorterParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        boolean zF;
        Object next;
        boolean zF2;
        List executions = (List) obj2;
        switch (this.f178512a) {
            case 0:
                Intrinsics.checkNotNullParameter(executions, "executions");
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : executions) {
                    IncomeSorterExecution incomeSorterExecution = (IncomeSorterExecution) obj4;
                    IncomeSorterParams incomeSorterParams = this.f178513b;
                    if (incomeSorterParams instanceof IncomeSorterParams.ForId) {
                        zF = Intrinsics.f(incomeSorterExecution.f99239b, ((IncomeSorterParams.ForId) incomeSorterParams).f99245a);
                    } else {
                        if (!(incomeSorterParams instanceof IncomeSorterParams.ForTransactionId)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zF = Intrinsics.f(incomeSorterExecution.d, ((IncomeSorterParams.ForTransactionId) incomeSorterParams).f99246a);
                    }
                    if (zF) {
                        arrayList.add(obj4);
                    }
                }
                Iterator it8 = arrayList.iterator();
                if (it8.hasNext()) {
                    Object next2 = it8.next();
                    if (it8.hasNext()) {
                        long j2 = ((IncomeSorterExecution) next2).e;
                        do {
                            Object next3 = it8.next();
                            long j3 = ((IncomeSorterExecution) next3).e;
                            if (j2 < j3) {
                                next2 = next3;
                                j2 = j3;
                            }
                        } while (it8.hasNext());
                    }
                    obj3 = next2;
                } else {
                    obj3 = null;
                }
                od0.i.Companion.getClass();
                return od0.h.a((IncomeSorterExecution) obj3);
            default:
                Intrinsics.checkNotNullParameter(executions, "incomeSorters");
                od0.h hVar = od0.i.Companion;
                Iterator it9 = executions.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        IncomeSorter incomeSorter = (IncomeSorter) next;
                        IncomeSorterParams incomeSorterParams2 = this.f178513b;
                        if (incomeSorterParams2 instanceof IncomeSorterParams.ForId) {
                            zF2 = Intrinsics.f(incomeSorter.f99160a, ((IncomeSorterParams.ForId) incomeSorterParams2).f99245a);
                        } else {
                            if (!(incomeSorterParams2 instanceof IncomeSorterParams.ForTransactionId)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zF2 = Intrinsics.f(incomeSorter.f99162c, ((IncomeSorterParams.ForTransactionId) incomeSorterParams2).f99246a);
                        }
                        if (zF2) {
                        }
                    } else {
                        next = null;
                    }
                }
                hVar.getClass();
                return od0.h.a(next);
        }
    }
}
