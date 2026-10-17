package hi1;

import com.revolut.feature.address.models.Address;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address.Type f152447a;

    public f(Address.Type type) {
        this.f152447a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f152447a == ((f) obj2).f152447a;
    }

    public final int hashCode() {
        Address.Type type = this.f152447a;
        if (type == null) {
            return 0;
        }
        return type.hashCode();
    }
}
