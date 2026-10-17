package m2j;

import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f202020a = new d();

    private d() {
    }

    public static List a(List list, BalancesInteractor$InputData inputData) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        m2g.c getCurrency = new m2g.c(1);
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(getCurrency, "getCurrency");
        Set set = inputData.d;
        Set set2 = inputData.e;
        if (set.isEmpty() && set2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String str = (String) getCurrency.invoke(obj2);
            boolean z = set.isEmpty() || set.contains(str);
            boolean zContains = set2.contains(str);
            if (z && !zContains) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
