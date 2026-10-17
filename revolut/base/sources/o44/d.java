package o44;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f221991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f221992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f221993c;

    public d(List addresses, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        this.f221991a = addresses;
        this.f221992b = z;
        this.f221993c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f221991a, dVar.f221991a) && this.f221992b == dVar.f221992b && this.f221993c == dVar.f221993c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221993c) + j6.a.c(this.f221991a.hashCode() * 31, 31, this.f221992b);
    }
}
