package wj8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298008a;

    public i(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f298008a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f298008a, ((i) obj2).f298008a);
    }

    public final int hashCode() {
        return this.f298008a.hashCode();
    }
}
