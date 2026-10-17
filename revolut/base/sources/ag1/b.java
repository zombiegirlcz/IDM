package ag1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.e f4751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf1.c f4752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4753c;

    public b(qf1.e groupId, qf1.c categoryId, ArrayList itemIds) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        this.f4751a = groupId;
        this.f4752b = categoryId;
        this.f4753c = itemIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f4751a == bVar.f4751a && this.f4752b == bVar.f4752b && this.f4753c.equals(bVar.f4753c);
    }

    public final int hashCode() {
        return this.f4753c.hashCode() + ((this.f4752b.hashCode() + (this.f4751a.hashCode() * 31)) * 31);
    }
}
