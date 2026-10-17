package hi1;

import com.revolut.feature.address.models.Address;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address.Type f152445a;

    public c() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f152445a == ((c) obj2).f152445a;
    }

    public final int hashCode() {
        Address.Type type = this.f152445a;
        if (type == null) {
            return 0;
        }
        return type.hashCode();
    }

    public c(Address.Type type) {
        this.f152445a = type;
    }
}
