package hi1;

import cli.j;
import com.revolut.feature.address.models.Address;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address.Type f152444a;

    public b() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f152444a == ((b) obj2).f152444a;
    }

    public final int hashCode() {
        Address.Type type = this.f152444a;
        if (type == null) {
            return 0;
        }
        return type.hashCode();
    }

    public b(Address.Type type) {
        this.f152444a = type;
    }
}
