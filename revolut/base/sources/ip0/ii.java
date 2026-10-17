package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx0.c6 f164695b;

    public ii(String listId, mx0.c6 item) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f164694a = listId;
        this.f164695b = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ii)) {
            return false;
        }
        ii iiVar = (ii) obj2;
        return Intrinsics.f(this.f164694a, iiVar.f164694a) && Intrinsics.f(this.f164695b, iiVar.f164695b);
    }

    public final int hashCode() {
        return this.f164695b.hashCode() + (this.f164694a.hashCode() * 31);
    }
}
