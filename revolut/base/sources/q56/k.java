package q56;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f242305c;
    public final boolean d;

    public k(String address, String label, j addressValidation, boolean z) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(addressValidation, "addressValidation");
        this.f242303a = address;
        this.f242304b = label;
        this.f242305c = addressValidation;
        this.d = z;
    }

    public static k a(k kVar, String address, String label, j addressValidation, boolean z, int i) {
        if ((i & 1) != 0) {
            address = kVar.f242303a;
        }
        if ((i & 2) != 0) {
            label = kVar.f242304b;
        }
        if ((i & 4) != 0) {
            addressValidation = kVar.f242305c;
        }
        if ((i & 8) != 0) {
            z = kVar.d;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(addressValidation, "addressValidation");
        return new k(address, label, addressValidation, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f242303a, kVar.f242303a) && Intrinsics.f(this.f242304b, kVar.f242304b) && Intrinsics.f(this.f242305c, kVar.f242305c) && this.d == kVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f242305c.hashCode() + p.a.c(this.f242303a.hashCode() * 31, 31, this.f242304b)) * 31);
    }
}
