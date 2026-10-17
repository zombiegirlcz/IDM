package ny5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f220667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f220668c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.b f220669a;

    static {
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        f220667b = zhm.u.c(xi0.b.S);
        aVar.getClass();
        xi0.b bVar = xi0.b.H;
        aVar.getClass();
        xi0.b bVar2 = xi0.b.J;
        aVar.getClass();
        xi0.b bVar3 = xi0.b.I;
        aVar.getClass();
        xi0.b bVar4 = xi0.b.G;
        aVar.getClass();
        f220668c = zhm.v.k(bVar, bVar2, bVar3, bVar4, xi0.b.K);
    }

    public c(t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f220669a = currenciesLocalization;
    }

    public final ArrayList a(List currencies, List predefinedOrder) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(predefinedOrder, "predefinedOrder");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : predefinedOrder) {
            if (currencies.contains((xi0.b) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList<xi0.b> arrayList2 = new ArrayList();
        for (Object obj3 : currencies) {
            if (!predefinedOrder.contains((xi0.b) obj3)) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        for (xi0.b bVar : arrayList2) {
            arrayList3.add(new Pair(bVar, this.f220669a.a(bVar)));
        }
        List listP0 = d0.P0(arrayList3, new b());
        ArrayList arrayList4 = new ArrayList(zhm.w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList4.add((xi0.b) ((Pair) it8.next()).f186385a);
        }
        return d0.E0(arrayList4, arrayList);
    }
}
