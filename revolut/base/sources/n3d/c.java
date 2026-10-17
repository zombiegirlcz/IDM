package n3d;

import aii.u;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import go.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f211981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f211982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f211983c;

    public c(Set footerDelegates, b footerComparator) {
        Intrinsics.checkNotNullParameter(footerDelegates, "footerDelegates");
        Intrinsics.checkNotNullParameter(footerComparator, "footerComparator");
        this.f211981a = footerComparator;
        y1d.b.Companion.getClass();
        FavouritesAssetTypeKey[] elements = {y1d.a.f, y1d.a.f310360g, y1d.a.f310361h, y1d.a.i, y1d.a.f310362j};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f211982b = kotlin.collections.d.y0(elements);
        Set set = footerDelegates;
        int iB = q0.b(w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((x3d.b) obj2).a(), obj2);
        }
        this.f211983c = linkedHashMap;
    }

    public final u a(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Iterator it8 = this.f211983c.values().iterator();
        while (it8.hasNext()) {
            u uVarC = ((x3d.b) it8.next()).c(clickData);
            if (uVarC != null) {
                return uVarC;
            }
        }
        return null;
    }

    public final Flow b(Set typeKeys) {
        Intrinsics.checkNotNullParameter(typeKeys, "typeKeys");
        List listP0 = d0.P0(c(typeKeys), this.f211981a);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            x3d.b bVar = (x3d.b) this.f211983c.get((FavouritesAssetTypeKey) it8.next());
            Flow flowB = bVar != null ? bVar.b() : null;
            if (flowB != null) {
                arrayList.add(flowB);
            }
        }
        List listN = c6d.b.N(arrayList);
        return listN == null ? new g(f0.f322471a, 2) : new j23.b((Flow[]) d0.d1(listN).toArray(new Flow[0]), 10);
    }

    public final Set c(Set set) {
        y1d.b.Companion.getClass();
        boolean zContains = set.contains(y1d.a.e);
        Set set2 = this.f211982b;
        if (zContains) {
            return a1.k(set, set2);
        }
        Set set3 = set2;
        return !d0.h0(set3, set).isEmpty() ? a1.m(a1.k(set, set3), y1d.a.f) : set;
    }
}
