package yj8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314436a;

    public d(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f314436a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f314436a, ((d) obj2).f314436a);
    }

    public final int hashCode() {
        return this.f314436a.hashCode();
    }
}
