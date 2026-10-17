package wc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296336a;

    public d(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f296336a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f296336a, ((d) obj2).f296336a);
    }

    public final int hashCode() {
        return this.f296336a.hashCode();
    }
}
