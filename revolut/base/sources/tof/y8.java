package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f273183a;

    public y8(Set cryptoAddressIds) {
        Intrinsics.checkNotNullParameter(cryptoAddressIds, "cryptoAddressIds");
        this.f273183a = cryptoAddressIds;
    }

    public final Set a() {
        return this.f273183a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y8) && Intrinsics.f(this.f273183a, ((y8) obj2).f273183a);
    }

    public final int hashCode() {
        return this.f273183a.hashCode();
    }
}
