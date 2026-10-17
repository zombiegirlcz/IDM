package vge;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SlotContext f289063a = new SlotContext(akd.s.HOME);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f289064b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vkm.j2 f289065c = vkm.q.c(null);
    public final vkm.j2 d = vkm.q.c(null);

    public final uf0.b a(Set spaceIdentifiers) {
        Intrinsics.checkNotNullParameter(spaceIdentifiers, "spaceIdentifiers");
        Set<Pair> set = spaceIdentifiers;
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        for (Pair pair : set) {
            ProductSpaceIdentifier productSpaceIdentifier = (ProductSpaceIdentifier) pair.f186385a;
            pie.s sVar = (pie.s) pair.f186386b;
            arrayList.add(new v0b.b(b(new v2(productSpaceIdentifier, sVar.a())), sVar, 7));
        }
        return new uf0.b((Flow[]) zhm.d0.d1(arrayList).toArray(new Flow[0]), 9);
    }

    public final MutableStateFlow b(v2 v2Var) {
        ConcurrentHashMap concurrentHashMap = this.f289064b;
        Object objC = concurrentHashMap.get(v2Var);
        if (objC == null) {
            objC = vkm.q.c(zhm.f0.f322471a);
            concurrentHashMap.putIfAbsent(v2Var, objC);
        }
        return (MutableStateFlow) objC;
    }
}
