package dz7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f121268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f121269b;

    public c(List pets, dj0.d totalAmount) {
        Intrinsics.checkNotNullParameter(pets, "pets");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f121268a = pets;
        this.f121269b = totalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f121268a, cVar.f121268a) && Intrinsics.f(this.f121269b, cVar.f121269b);
    }

    public final int hashCode() {
        return this.f121269b.hashCode() + (this.f121268a.hashCode() * 31);
    }
}
