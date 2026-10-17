package cge;

import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import qfe.l;
import qfe.m;
import vkm.v1;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rge.b f23961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.a f23962b;

    public k(rge.b registry, r10.a spaceContentOrdering) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(spaceContentOrdering, "spaceContentOrdering");
        this.f23961a = registry;
        this.f23962b = spaceContentOrdering;
    }

    @Override // qfe.m
    public final Flow a(sfe.a loadingMode, l filterType) {
        Intrinsics.checkNotNullParameter(loadingMode, "loadingMode");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        return new v1(new j(this, loadingMode, filterType, null));
    }

    public final List b(List list) {
        List list2 = list;
        ArrayList spaces = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            r10.a aVar = this.f23962b;
            if (!zHasNext) {
                Intrinsics.checkNotNullParameter(spaces, "spaces");
                return d0.P0(spaces, new ihe.c(aVar, 0));
            }
            SpaceContentModel spaceContentModel = (SpaceContentModel) it8.next();
            List subspaces = spaceContentModel.f89558c;
            Intrinsics.checkNotNullParameter(subspaces, "subspaces");
            spaces.add(SpaceContentModel.a(spaceContentModel, d0.P0(subspaces, new ihe.c(aVar, 1))));
        }
    }
}
