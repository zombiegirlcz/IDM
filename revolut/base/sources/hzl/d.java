package hzl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157255b;

    public d(String pinCode, String phone) {
        Intrinsics.checkNotNullParameter(pinCode, "pinCode");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f157254a = pinCode;
        this.f157255b = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f157254a, dVar.f157254a) && Intrinsics.f(this.f157255b, dVar.f157255b);
    }

    public final int hashCode() {
        return this.f157255b.hashCode() + (this.f157254a.hashCode() * 31);
    }
}
