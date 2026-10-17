package cie;

import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24536c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ x0(boolean z, boolean z3, boolean z4, int i) {
        this.f24534a = i;
        this.f24535b = z;
        this.f24536c = z3;
        this.d = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        switch (this.f24534a) {
            case 0:
                TabAccountsScreenContract$State tabAccountsScreenContract$State = (TabAccountsScreenContract$State) obj2;
                String[] elements = {this.f24536c ? "analytics_menu_item" : null, this.d ? "cards_menu_item" : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return TabAccountsScreenContract$State.a(tabAccountsScreenContract$State, null, kotlin.collections.d.L(elements), null, null, null, null, null, null, null, null, null, false, null, this.f24535b, null, null, null, null, null, false, false, null, 4186109);
            default:
                u3a.i iVar = (u3a.i) obj2;
                Intrinsics.checkNotNullParameter(iVar, "<destruct>");
                List list = iVar.f276849a;
                zm3.b bVar = iVar.f276850b;
                List list2 = iVar.f276851c;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(((u3a.e) it8.next()).f276838a.f323362g);
                }
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList6.add(((u3a.e) it9.next()).f276839b);
                }
                boolean z = this.f24535b;
                if (z) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (!arrayList5.contains(((zm3.j) obj3).f323362g)) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = zhm.f0.f322471a;
                }
                if (z) {
                    List list3 = bVar.f323334c;
                    if (this.f24536c) {
                        arrayList2 = new ArrayList();
                        for (Object obj4 : list3) {
                            zm3.a aVar = (zm3.a) obj4;
                            zm3.l lVar = aVar instanceof zm3.l ? (zm3.l) aVar : null;
                            if (!zhm.d0.T(arrayList5, lVar != null ? lVar.N0() : null)) {
                                arrayList2.add(obj4);
                            }
                        }
                    } else {
                        arrayList2 = new ArrayList();
                        for (Object obj5 : list3) {
                            if (!hx7.q.M((zm3.a) obj5)) {
                                arrayList2.add(obj5);
                            }
                        }
                    }
                } else {
                    arrayList2 = zhm.f0.f322471a;
                }
                if (this.d) {
                    List list4 = bVar.d;
                    arrayList3 = new ArrayList();
                    for (Object obj6 : list4) {
                        if (!zhm.d0.T(arrayList6, hx7.q.D((zm3.a) obj6))) {
                            arrayList3.add(obj6);
                        }
                    }
                } else {
                    arrayList3 = zhm.f0.f322471a;
                }
                if (z) {
                    arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it10 = list2.iterator();
                    while (it10.hasNext()) {
                        arrayList4.add(((u3a.e) it10.next()).f276838a);
                    }
                } else {
                    arrayList4 = zhm.f0.f322471a;
                }
                return new u3a.j(arrayList2, arrayList, arrayList3, arrayList4);
        }
    }
}
