package wte;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299934a;

    public d(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f299934a = institutionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f299934a, ((d) obj2).f299934a);
    }

    public final int hashCode() {
        return this.f299934a.hashCode();
    }
}
