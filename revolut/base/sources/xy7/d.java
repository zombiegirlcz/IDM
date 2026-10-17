package xy7;

import com.revolut.feature.address.models.Address;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f309626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f309627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f309628c;

    public d(c pricing, Address newAddress, List pets) {
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(newAddress, "newAddress");
        Intrinsics.checkNotNullParameter(pets, "pets");
        this.f309626a = pricing;
        this.f309627b = newAddress;
        this.f309628c = pets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f309626a == dVar.f309626a && Intrinsics.f(this.f309627b, dVar.f309627b) && Intrinsics.f(this.f309628c, dVar.f309628c);
    }

    public final int hashCode() {
        return this.f309628c.hashCode() + ((this.f309627b.hashCode() + (this.f309626a.hashCode() * 31)) * 31);
    }
}
