package kn8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186030a;

    public b(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f186030a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f186030a, ((b) obj2).f186030a);
    }

    public final int hashCode() {
        return this.f186030a.hashCode();
    }
}
