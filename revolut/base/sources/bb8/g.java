package bb8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14188b;

    public g(String updatedFirstName, String updatedLastName) {
        Intrinsics.checkNotNullParameter(updatedFirstName, "updatedFirstName");
        Intrinsics.checkNotNullParameter(updatedLastName, "updatedLastName");
        this.f14187a = updatedFirstName;
        this.f14188b = updatedLastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f14187a, gVar.f14187a) && Intrinsics.f(this.f14188b, gVar.f14188b);
    }

    public final int hashCode() {
        return this.f14188b.hashCode() + (this.f14187a.hashCode() * 31);
    }
}
