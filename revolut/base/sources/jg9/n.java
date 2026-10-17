package jg9;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f173954a;

    public n(Address value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173954a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f173954a, ((n) obj2).f173954a);
    }

    public final int hashCode() {
        return this.f173954a.hashCode();
    }
}
