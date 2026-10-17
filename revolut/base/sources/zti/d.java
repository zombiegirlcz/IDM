package zti;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jli.g;
import k7i.i;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f325171a;

    public d(i countryNameProvider) {
        Intrinsics.checkNotNullParameter(countryNameProvider, "countryNameProvider");
        this.f325171a = countryNameProvider;
    }

    public static int b(String str, String str2) {
        int iT = d0.T(str, str2, 0, true, 2);
        if (iT != -1) {
            return iT != 0 ? 1 : 3;
        }
        return 0;
    }

    public final ArrayList a(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            bti.a aVar = (bti.a) it8.next();
            String str2 = aVar.f18582b;
            wi0.b bVar = aVar.d;
            String strE = g.e(str2);
            String strE2 = g.e(aVar.e);
            arrayList2.add(new Pair(new a(aVar, strE, strE2), Integer.valueOf(b(strE2, str) + b(this.f325171a.i(bVar), str) + b(bVar.f297794a, str) + b(aVar.f18581a, str) + b(aVar.f18583c, str) + b(strE, str))));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((Number) ((Pair) obj2).f186386b).intValue() > 0) {
                arrayList3.add(obj2);
            }
        }
        List listP0 = zhm.d0.P0(arrayList3, new c());
        ArrayList arrayList4 = new ArrayList(w.t(listP0, 10));
        Iterator it9 = listP0.iterator();
        while (it9.hasNext()) {
            arrayList4.add(((a) ((Pair) it9.next()).f186385a).f325168a);
        }
        return arrayList4;
    }
}
