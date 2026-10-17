package rgf;

import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class z {
    public static final Set a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            List list2 = ((SpaceContentModel) it8.next()).f89558c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                List<SubSpaceAccountItem> f = ((SubSpaceContentModel) it9.next()).getF();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(f, 10));
                for (SubSpaceAccountItem subSpaceAccountItem : f) {
                    arrayList3.add(new ProductAccountDescriptor$Value.Main(subSpaceAccountItem.f89560b.getF89504c(), subSpaceAccountItem.f89559a.f89553a));
                }
                zhm.a0.x(arrayList3, arrayList2);
            }
            zhm.a0.x(arrayList2, arrayList);
        }
        return zhm.d0.i1(arrayList);
    }
}
