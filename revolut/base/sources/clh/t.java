package clh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25010a;

    public t(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f25010a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f25010a, ((t) obj2).f25010a);
    }

    public final int hashCode() {
        return this.f25010a.hashCode();
    }
}
