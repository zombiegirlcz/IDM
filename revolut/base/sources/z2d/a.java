package z2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zfd.h;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f319057b;

    public /* synthetic */ a(int i, Set set) {
        this.f319056a = i;
        this.f319057b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        lgd.b bVar;
        Set setY0;
        switch (this.f319056a) {
            case 0:
                List keyToCategoryList = (List) obj2;
                Intrinsics.checkNotNullParameter(keyToCategoryList, "keyToCategoryList");
                List list = keyToCategoryList;
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        Pair pair = (Pair) next;
                        FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) pair.f186385a;
                        Object obj3 = pair.f186386b;
                        Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                        lgd.b bVar2 = (lgd.b) obj3;
                        if (!this.f319057b.contains(favouritesAssetTypeKey) || bVar2 == lgd.b.GENERIC_SECURITY) {
                        }
                    } else {
                        next = null;
                    }
                }
                Pair pair2 = (Pair) next;
                if (pair2 == null || (bVar = (lgd.b) pair2.f186386b) == null) {
                    bVar = lgd.b.GENERIC_SECURITY;
                }
                lgd.b bVar3 = lgd.b.GENERIC_SECURITY;
                if (bVar == bVar3) {
                    lgd.b[] elements = {bVar3, lgd.b.SECURITY};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    setY0 = d.y0(elements);
                } else {
                    lgd.b[] elements2 = {bVar, bVar3};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    setY0 = d.y0(elements2);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    Object obj5 = ((Pair) obj4).f186386b;
                    Intrinsics.checkNotNullExpressionValue(obj5, "component2(...)");
                    if (setY0.contains((lgd.b) obj5)) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    arrayList2.add((FavouritesAssetTypeKey) ((Pair) it9.next()).f186385a);
                }
                return d0.i1(arrayList2);
            default:
                h updateState = (h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return h.a(updateState, null, this.f319057b, null, null, 13);
        }
    }
}
