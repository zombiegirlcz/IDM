package jb7;

import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import j87.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {
    public static SpaceContentModel b(SpaceContentModel spaceContentModel, Function1 function1) {
        SubSpaceContentModel subSpaceContentModelC;
        List list = spaceContentModel.f89558c;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                if (arrayList.isEmpty()) {
                    return null;
                }
                return SpaceContentModel.a(spaceContentModel, arrayList);
            }
            SubSpaceContentModel subSpaceContentModel = (SubSpaceContentModel) it8.next();
            if (subSpaceContentModel instanceof SubSpaceContentModel.FlatSubSpaceContentModel) {
                SubSpaceContentModel.FlatSubSpaceContentModel flatSubSpaceContentModel = (SubSpaceContentModel.FlatSubSpaceContentModel) subSpaceContentModel;
                List list2 = flatSubSpaceContentModel.f89563c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((Boolean) function1.invoke(obj2)).booleanValue()) {
                        arrayList2.add(obj2);
                    }
                }
                subSpaceContentModelC = SubSpaceContentModel.FlatSubSpaceContentModel.c(flatSubSpaceContentModel, arrayList2);
            } else {
                if (!(subSpaceContentModel instanceof SubSpaceContentModel.GroupedSubSpaceContentModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                SubSpaceContentModel.GroupedSubSpaceContentModel groupedSubSpaceContentModel = (SubSpaceContentModel.GroupedSubSpaceContentModel) subSpaceContentModel;
                List list3 = groupedSubSpaceContentModel.f;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list3) {
                    if (((Boolean) function1.invoke(obj3)).booleanValue()) {
                        arrayList3.add(obj3);
                    }
                }
                subSpaceContentModelC = SubSpaceContentModel.GroupedSubSpaceContentModel.c(groupedSubSpaceContentModel, false, arrayList3, 15);
            }
            SubSpaceContentModel subSpaceContentModel2 = subSpaceContentModelC.getF().isEmpty() ? null : subSpaceContentModelC;
            if (subSpaceContentModel2 != null) {
                arrayList.add(subSpaceContentModel2);
            }
        }
    }

    public final ArrayList a(List spaces) {
        Intrinsics.checkNotNullParameter(spaces, "spaces");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = spaces.iterator();
        while (it8.hasNext()) {
            SpaceContentModel spaceContentModelB = b((SpaceContentModel) it8.next(), new m(this, 13));
            if (spaceContentModelB != null) {
                arrayList.add(spaceContentModelB);
            }
        }
        return arrayList;
    }
}
