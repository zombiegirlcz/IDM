package kbb;

import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function3 {
    public /* synthetic */ List u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f182557w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, Continuation continuation) {
        super(3, continuation);
        this.f182557w = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        i iVar = new i(this.f182557w, (Continuation) obj4);
        iVar.u = (List) obj2;
        iVar.v = (List) obj3;
        return iVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List items = this.u;
        List order = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(order, "order");
        if (items.isEmpty()) {
            return f0.f322471a;
        }
        if (order.isEmpty()) {
            return items;
        }
        ArrayList arrayList = new ArrayList();
        int size = items.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj3 = items.get(i2);
            if (!((FloatingBottomBarView.Item) obj3).d) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayListF1 = d0.f1(arrayList);
        ArrayList arrayList2 = new ArrayList(arrayListF1.size());
        int size2 = order.size();
        for (int i3 = 0; i3 < size2; i3++) {
            String str = (String) order.get(i3);
            int size3 = arrayListF1.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    i5 = -1;
                    break;
                }
                if (Intrinsics.f(((FloatingBottomBarView.Item) arrayListF1.get(i5)).f58588a, str)) {
                    break;
                }
                i5++;
            }
            if (i5 != -1) {
                arrayList2.add(arrayListF1.remove(i5));
            }
        }
        int size4 = arrayListF1.size();
        for (int i6 = 0; i6 < size4; i6++) {
            FloatingBottomBarView.Item item = (FloatingBottomBarView.Item) arrayListF1.get(i6);
            int size5 = arrayList.size();
            int i21 = 0;
            while (true) {
                if (i21 >= size5) {
                    i21 = -1;
                    break;
                }
                if (Intrinsics.f(((FloatingBottomBarView.Item) arrayList.get(i21)).f58588a, item.f58588a)) {
                    break;
                }
                i21++;
            }
            int size6 = arrayList2.size();
            if (i21 > size6) {
                i21 = size6;
            }
            arrayList2.add(i21, item);
        }
        List<FloatingBottomBarView.Item> list = items;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        for (FloatingBottomBarView.Item item2 : list) {
            if (!item2.d) {
                Object obj4 = arrayList2.get(i);
                Intrinsics.h(obj4);
                i++;
                item2 = (FloatingBottomBarView.Item) obj4;
            }
            arrayList3.add(item2);
        }
        return arrayList3;
    }
}
