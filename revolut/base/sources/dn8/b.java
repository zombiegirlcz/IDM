package dn8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116236b;

    public b(String requestId, String juniorId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f116235a = requestId;
        this.f116236b = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f116235a, bVar.f116235a) && Intrinsics.f(this.f116236b, bVar.f116236b);
    }

    public final int hashCode() {
        return this.f116236b.hashCode() + (this.f116235a.hashCode() * 31);
    }
}
