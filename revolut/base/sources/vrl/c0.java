package vrl;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f291618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f291619c;

    public /* synthetic */ c0(d0 d0Var, List list, int i) {
        this.f291617a = i;
        this.f291618b = d0Var;
        this.f291619c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List convertedSourcePockets = (List) obj2;
        switch (this.f291617a) {
            case 0:
                Intrinsics.checkNotNullParameter(convertedSourcePockets, "convertedSourcePockets");
                List list = convertedSourcePockets;
                int iB = zhm.q0.b(zhm.w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list) {
                    linkedHashMap.put(((SourcePocket) obj3).getF91780a(), obj3);
                }
                List<xdf.i> list2 = this.f291619c;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (xdf.i iVar : list2) {
                    ArrayList groups = this.f291618b.c(linkedHashMap, iVar.f304438b);
                    Clause title = iVar.f304437a;
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(groups, "groups");
                    arrayList.add(new xdf.i(title, groups));
                }
                return arrayList;
            default:
                Intrinsics.checkNotNullParameter(convertedSourcePockets, "convertedSourcePockets");
                List list3 = convertedSourcePockets;
                int iB2 = zhm.q0.b(zhm.w.t(list3, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                for (Object obj4 : list3) {
                    linkedHashMap2.put(((SourcePocket) obj4).getF91780a(), obj4);
                }
                return this.f291618b.c(linkedHashMap2, this.f291619c);
        }
    }
}
