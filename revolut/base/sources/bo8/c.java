package bo8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17307a;

    public c(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f17307a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f17307a, ((c) obj2).f17307a);
    }

    public final int hashCode() {
        return this.f17307a.hashCode();
    }
}
