package vge;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 implements j0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tsk.t f288948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f288949b;

    public m0(tsk.t advisedDiscoverTilesRepository, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(advisedDiscoverTilesRepository, "advisedDiscoverTilesRepository");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f288948a = advisedDiscoverTilesRepository;
        this.f288949b = memoryCache;
    }

    public static ArrayList d(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            SubSpaceAccountItem subSpaceAccountItem = (SubSpaceAccountItem) obj2;
            ProductAccount productAccount = subSpaceAccountItem.f89560b;
            if (productAccount instanceof ProductAccount.ValueItem.Discover) {
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it8 = set2.iterator();
                    while (it8.hasNext()) {
                        if (Intrinsics.f(((ProductAccountId) it8.next()).f89729a, subSpaceAccountItem.f89560b.getF89504c().f89729a)) {
                        }
                    }
                }
            } else if (!(productAccount instanceof ProductAccount.PendingItem) && !(productAccount instanceof ProductAccount.ValueItem.Main)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }

    public static ArrayList e(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((SubSpaceAccountItem) it8.next()).f89560b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof ProductAccount.ValueItem.Discover) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // vge.j0
    public final Flow a(uf0.b originFlow, qfe.g mode) {
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return c(originFlow, mode, new vga.g(this, 11), new vea.b(this, 18));
    }

    @Override // vge.j0
    public final Flow b(Flow originFlow, qfe.h mode) {
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return c(originFlow, mode, new vga.g(this, 12), new vea.b(this, 19));
    }

    public final t38.e c(Flow flow, qfe.h hVar, Function1 function1, Function2 function2) {
        tsk.t tVar = this.f288948a;
        return new t38.e(flow, 24, nim.a.v(((qm.e) tVar.f274170b).f(), new wf6.p(tVar, 29)), new l0(function2, this, hVar, function1, null));
    }
}
