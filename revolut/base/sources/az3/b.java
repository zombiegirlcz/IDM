package az3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11387a;

    public b(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f11387a = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f11387a, ((b) obj2).f11387a);
    }

    public final int hashCode() {
        return this.f11387a.hashCode();
    }
}
