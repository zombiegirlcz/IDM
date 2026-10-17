package kd8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v6d.a f182813b;

    public b(String juniorId, v6d.a code) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f182812a = juniorId;
        this.f182813b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f182812a, bVar.f182812a) && this.f182813b == bVar.f182813b;
    }

    public final int hashCode() {
        return this.f182813b.hashCode() + (this.f182812a.hashCode() * 31);
    }
}
