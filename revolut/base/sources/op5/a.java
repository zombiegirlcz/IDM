package op5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227523b;

    public a(String addressId, boolean z) {
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        this.f227522a = addressId;
        this.f227523b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f227522a, aVar.f227522a) && this.f227523b == aVar.f227523b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227523b) + (this.f227522a.hashCode() * 31);
    }
}
