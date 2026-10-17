package dod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116539b;

    public c(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f116539b = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f116539b, ((c) obj2).f116539b);
    }

    public final int hashCode() {
        return this.f116539b.hashCode();
    }
}
