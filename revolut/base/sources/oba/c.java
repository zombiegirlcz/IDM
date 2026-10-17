package oba;

import cli.j;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f223905a;

    public c(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f223905a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f223905a, ((c) obj2).f223905a);
    }

    public final int hashCode() {
        return this.f223905a.hashCode();
    }
}
