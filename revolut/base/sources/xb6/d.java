package xb6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304001a;

    public d(String charityId) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        this.f304001a = charityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f304001a, ((d) obj2).f304001a);
    }

    public final int hashCode() {
        return this.f304001a.hashCode();
    }
}
