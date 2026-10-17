package jtj;

import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.ReadablePartial;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f178511b;

    public /* synthetic */ b(k kVar, int i) {
        this.f178510a = i;
        this.f178511b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f178510a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                yzi.b[] elements = {yzi.b.DEFERRED, yzi.b.IN_REVIEW};
                Intrinsics.checkNotNullParameter(elements, "elements");
                Set setY0 = kotlin.collections.d.y0(elements);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    IncomeSorterExecution incomeSorterExecution = (IncomeSorterExecution) obj3;
                    String str = incomeSorterExecution.f99238a;
                    yzi.b bVar = incomeSorterExecution.f99240c;
                    if (!list2.contains(str)) {
                        l80.e eVar = this.f178511b.e;
                        if (((l80.f) eVar).g().minusMonths(1).toLocalDate().compareTo((ReadablePartial) new DateTime(incomeSorterExecution.e).toLocalDate()) <= 0) {
                            if (!setY0.contains(bVar)) {
                                if (bVar == yzi.b.FAILED) {
                                    ArrayList arrayList2 = incomeSorterExecution.f;
                                    if (!arrayList2.isEmpty()) {
                                        Iterator it8 = arrayList2.iterator();
                                        while (it8.hasNext()) {
                                            if (((IncomeSorterExecutionDestination) it8.next()).f99244c == yzi.c.FAILED) {
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                            arrayList.add(obj3);
                        }
                    }
                }
                return d0.P0(arrayList, new i());
            default:
                String walletId = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                return (List) v1.c.s("INCOME_SORTER_EXECUTIONS_KEY", walletId, this.f178511b.f178520c);
        }
    }
}
