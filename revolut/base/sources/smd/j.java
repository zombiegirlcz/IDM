package smd;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f264423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f264424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f264425c;

    public j(Data data, Map allocationUpdates, Map locallyCreatedCategories) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(allocationUpdates, "allocationUpdates");
        Intrinsics.checkNotNullParameter(locallyCreatedCategories, "locallyCreatedCategories");
        this.f264423a = data;
        this.f264424b = allocationUpdates;
        this.f264425c = locallyCreatedCategories;
    }

    public static j a(Data data, Map allocationUpdates, Map locallyCreatedCategories) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(allocationUpdates, "allocationUpdates");
        Intrinsics.checkNotNullParameter(locallyCreatedCategories, "locallyCreatedCategories");
        return new j(data, allocationUpdates, locallyCreatedCategories);
    }

    public static /* synthetic */ j c(j jVar, Data data, Map map, int i) {
        if ((i & 2) != 0) {
            map = jVar.f264424b;
        }
        Map map2 = jVar.f264425c;
        jVar.getClass();
        return a(data, map, map2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f264423a, jVar.f264423a) && Intrinsics.f(this.f264424b, jVar.f264424b) && Intrinsics.f(this.f264425c, jVar.f264425c);
    }

    public final int hashCode() {
        return this.f264425c.hashCode() + p.a.e(this.f264423a.hashCode() * 31, 31, this.f264424b);
    }
}
