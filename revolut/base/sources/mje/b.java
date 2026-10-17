package mje;

import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import vim.f;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f205976a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        IntRange intRangeU = t61.a.u((Function0) obj2, "it", 1, 3, 1);
        ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
        f it8 = intRangeU.iterator();
        while (it8.f289625c) {
            arrayList.add(new SplitAccountsItemGroup.LoadingItem(a0.d.n("LOADING_STATE_ID_", it8.nextInt()), true, true));
        }
        return new SplitAccountsItemGroup.LoadingGroup(arrayList);
    }
}
