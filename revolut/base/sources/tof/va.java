package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class va extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f273121a;

    public va(Set pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f273121a = pocketId;
    }

    public final Set a() {
        return this.f273121a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof va) && Intrinsics.f(this.f273121a, ((va) obj2).f273121a);
    }

    public final int hashCode() {
        return this.f273121a.hashCode();
    }
}
