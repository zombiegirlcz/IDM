package mo8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207562a;

    public e(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f207562a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f207562a, ((e) obj2).f207562a);
    }

    public final int hashCode() {
        return this.f207562a.hashCode();
    }
}
