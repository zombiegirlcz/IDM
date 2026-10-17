package ky3;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f190616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f190618c;

    public a(b fieldState, String flowName, Address address) {
        Intrinsics.checkNotNullParameter(fieldState, "fieldState");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f190616a = fieldState;
        this.f190617b = flowName;
        this.f190618c = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f190616a == aVar.f190616a && Intrinsics.f(this.f190617b, aVar.f190617b) && Intrinsics.f(this.f190618c, aVar.f190618c);
    }

    public final int hashCode() {
        return this.f190618c.hashCode() + p.a.c(this.f190616a.hashCode() * 31, 31, this.f190617b);
    }
}
