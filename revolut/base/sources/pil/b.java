package pil;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f236618b;

    public b(String product, Set skippedSteps) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(skippedSteps, "skippedSteps");
        this.f236617a = product;
        this.f236618b = skippedSteps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f236617a, bVar.f236617a) && Intrinsics.f(this.f236618b, bVar.f236618b);
    }

    public final int hashCode() {
        return this.f236618b.hashCode() + (this.f236617a.hashCode() * 31);
    }
}
