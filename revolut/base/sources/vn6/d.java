package vn6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290760b;

    public d(String rawValue, String iban) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Intrinsics.checkNotNullParameter(iban, "iban");
        this.f290759a = rawValue;
        this.f290760b = iban;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f290759a, dVar.f290759a) && Intrinsics.f(this.f290760b, dVar.f290760b);
    }

    public final int hashCode() {
        return this.f290760b.hashCode() + (this.f290759a.hashCode() * 31);
    }
}
