package kn5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186010b;

    public o(String address, String str) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f186009a = address;
        this.f186010b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f186009a, oVar.f186009a) && Intrinsics.f(this.f186010b, oVar.f186010b);
    }

    public final int hashCode() {
        int iHashCode = this.f186009a.hashCode() * 31;
        String str = this.f186010b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
