package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209959a;

    public q6(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f209959a = itemId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q6) && Intrinsics.f(this.f209959a, ((q6) obj2).f209959a);
    }

    public final int hashCode() {
        return this.f209959a.hashCode() * 31;
    }
}
