package l2d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kkf.z7;
import klf.a3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kx4.f0;
import skm.e0;
import skm.p0;
import vkm.q;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class n implements efd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4d.i f191787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f191788b;

    public n(b4d.i alertsItemsRepository, Set interactors) {
        Intrinsics.checkNotNullParameter(alertsItemsRepository, "alertsItemsRepository");
        Intrinsics.checkNotNullParameter(interactors, "interactors");
        this.f191787a = alertsItemsRepository;
        Set set = interactors;
        int iB = q0.b(w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((u3d.b) obj2).a(), obj2);
        }
        this.f191788b = linkedHashMap;
    }

    public final List a(FavouritesAssetTypeKey typeKey) {
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        u3d.b bVar = (u3d.b) this.f191788b.get(typeKey);
        if (bVar != null) {
            return bVar.d();
        }
        throw new IllegalStateException(j6.a.q("Interactor not found for typeKey=", typeKey.f86866a));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final go.g b(List assetTypeKeys) {
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        List list = assetTypeKeys;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list) {
            linkedHashMap.put(obj2, (Integer) this.f191787a.f12307g.get(((FavouritesAssetTypeKey) obj2).f86866a));
        }
        return new go.g(zi0.c.P(linkedHashMap, false, null, 3), 2);
    }

    public final r c(mgd.g queryParams, boolean z) {
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        return rd0.e.c(d(queryParams, z, w4l.i.f294643c), kotlin.coroutines.g.f186406a);
    }

    public final wkm.l d(mgd.g gVar, boolean z, w4l.k kVar) {
        List listC = gVar.c();
        ArrayList arrayList = new ArrayList(w.t(listC, 10));
        Iterator it8 = listC.iterator();
        while (true) {
            Continuation continuation = null;
            if (!it8.hasNext()) {
                return q.Q(q.Q(q.q(new z7(new j23.b((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 4), gVar, 17)), new a9j.m((Continuation) null, this, z, kVar)), new a3(continuation, this, 17));
            }
            FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) it8.next();
            u3d.b bVar = (u3d.b) this.f191788b.get(favouritesAssetTypeKey);
            arrayList.add(bVar == null ? new go.g(null, 2) : new h(bVar.isAvailable(), favouritesAssetTypeKey, 0));
        }
    }

    public final j23.b e(Map assetTypeKeyToItems, boolean z) {
        Flow z7Var;
        Intrinsics.checkNotNullParameter(assetTypeKeyToItems, "assetTypeKeyToItems");
        Set<Map.Entry> setEntrySet = assetTypeKeyToItems.entrySet();
        ArrayList arrayList = new ArrayList(w.t(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) entry.getKey();
            List list = (List) entry.getValue();
            u3d.b bVar = (u3d.b) this.f191788b.get(favouritesAssetTypeKey);
            if (bVar == null) {
                z7Var = new go.g(new Pair(favouritesAssetTypeKey, new Data(r0.g(), null, false, 6, null)), 2);
            } else {
                r rVarDistinctUntilChanged = bVar.b(list, z).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                z7Var = new z7(new f0(rd0.e.b(rVarDistinctUntilChanged), 7), favouritesAssetTypeKey, 18);
            }
            arrayList.add(z7Var);
        }
        return new j23.b((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 5);
    }

    public final Object f(String str, FavouritesAssetTypeKey favouritesAssetTypeKey, mgd.f fVar, gim.i iVar) throws Throwable {
        a1a.c cVar = new a1a.c(favouritesAssetTypeKey, fVar, this.f191787a, str, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, cVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
