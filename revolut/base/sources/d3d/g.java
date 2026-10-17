package d3d;

import ag1.k;
import ard.c0;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem;
import h4d.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.q;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f111093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3d.c f111094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f111095c;

    public g(h converterRepository, u3d.c prefillDataProvider, Set interactors) {
        Intrinsics.checkNotNullParameter(converterRepository, "converterRepository");
        Intrinsics.checkNotNullParameter(prefillDataProvider, "prefillDataProvider");
        Intrinsics.checkNotNullParameter(interactors, "interactors");
        this.f111093a = converterRepository;
        this.f111094b = prefillDataProvider;
        Set set = interactors;
        int iB = q0.b(w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((u3d.b) obj2).a(), obj2);
        }
        this.f111095c = linkedHashMap;
    }

    public static final c0 a(g gVar, z3d.c cVar, List list, boolean z) {
        gVar.getClass();
        ArrayList arrayListF0 = d0.F0(cVar, list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayListF0) {
            FavouritesAssetTypeKey favouritesAssetTypeKey = ((z3d.c) obj2).f319248a;
            Object arrayList = linkedHashMap.get(favouritesAssetTypeKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(favouritesAssetTypeKey, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            FavouritesAssetTypeKey favouritesAssetTypeKey2 = (FavouritesAssetTypeKey) entry.getKey();
            List list2 = (List) entry.getValue();
            u3d.b bVar = (u3d.b) gVar.f111095c.get(favouritesAssetTypeKey2);
            arrayList2.add(bVar != null ? q.Q(bVar.isAvailable(), new d(null, gVar, bVar, list2, cVar, z, favouritesAssetTypeKey2)) : new go.g(new b(favouritesAssetTypeKey2, false, new Data(null, new IllegalStateException(j6.a.q("provide interactor for assetTypeKey=", favouritesAssetTypeKey2.f86866a)), false, 1, null), new Data(null, new IllegalStateException(j6.a.q("provide interactor for assetTypeKey=", favouritesAssetTypeKey2.f86866a)), false, 1, null)), 2));
        }
        return new c0(new k((Flow[]) d0.d1(arrayList2).toArray(new Flow[0]), 12), gVar, cVar, list, 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
    
        if (r11 != r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[PHI: r12
      0x0099: PHI (r12v13 java.lang.Object) = (r12v12 java.lang.Object), (r12v1 java.lang.Object) binds: [B:34:0x0096, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[LOOP:0: B:37:0x00aa->B:39:0x00b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(d3d.g r11, gim.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3d.g.b(d3d.g, gim.c):java.lang.Object");
    }

    public static SharedConverterItem d(z3d.c cVar, Data data, dj0.d dVar) {
        List list;
        Object next;
        xi0.b bVar = cVar.f319249b.f115083b;
        FavouritesAssetTypeKey favouritesAssetTypeKey = cVar.f319248a;
        String str = null;
        if (data != null && (list = (List) data.getContent()) != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(bVar.f306286a, ((u3d.a) next).f276920a)) {
                    break;
                }
            }
            u3d.a aVar = (u3d.a) next;
            if (aVar != null) {
                str = aVar.f276922c;
            }
        }
        return new SharedConverterItem(favouritesAssetTypeKey, bVar, str, dVar);
    }

    public final Object c(SharedConverterItem sharedConverterItem, gim.c cVar) throws Throwable {
        h4d.f fVar = new h4d.f(this.f111093a, ifk.b.J(sharedConverterItem), null, 2);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, fVar, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
