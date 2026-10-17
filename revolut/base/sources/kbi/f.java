package kbi;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f182598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f182600c;
    public final boolean d;

    public f(l selection, String company, Address address, boolean z) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(company, "company");
        this.f182598a = selection;
        this.f182599b = company;
        this.f182600c = address;
        this.d = z;
    }

    public static f a(f fVar, l selection, String company, Address address, int i) {
        if ((i & 1) != 0) {
            selection = fVar.f182598a;
        }
        if ((i & 2) != 0) {
            company = fVar.f182599b;
        }
        if ((i & 4) != 0) {
            address = fVar.f182600c;
        }
        boolean z = fVar.d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(company, "company");
        return new f(selection, company, address, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f182598a, fVar.f182598a) && Intrinsics.f(this.f182599b, fVar.f182599b) && Intrinsics.f(this.f182600c, fVar.f182600c) && this.d == fVar.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f182598a.hashCode() * 31, 31, this.f182599b);
        Address address = this.f182600c;
        return Boolean.hashCode(this.d) + ((iC + (address == null ? 0 : address.hashCode())) * 31);
    }
}
